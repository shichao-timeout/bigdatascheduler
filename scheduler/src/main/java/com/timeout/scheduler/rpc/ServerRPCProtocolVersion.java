package com.timeout.scheduler.rpc;

public interface ServerRPCProtocolVersion extends ProtocolVersion{
    //agent上task结束后，上报master的回调接口
    Integer processCallback(long taskId, int taskReturnCode, boolean isRetriable, String matchedCode,
                            String matchedMsg, String matchedSolution) throws Exception;

    //保存action时刷新neo4j数据
    String refresh(String json);

    //保存DX GROUP时刷新neo4j数据
    String refreshGroup(String json);


    //DX group任务上线
    String batchOnline(String id);
    //DX group任务下线
    String batchOffline(String id);
    //单action上线
    String actionOnline(Long id);
    //单action下线
    String actionOffline(Long id);

    //停止task
    String stop(Long taskId);
    //杀死task
    String kill(Long taskId);
    //取消task
    String cancel(Long taskId);
    //重做task
    String redo(Long perviousTaskId, Boolean completeRest, Boolean isRepaired);

    //补数据
    String completeData(Long actionId, String from , String to , Boolean isSerial,  String argsValue);



    //补数据，可以设置是否补后续任务
    String completeData(Long actionId, String from, String to,
                        Boolean isSerial, String argsValue, String completeRest);

    //批量补数据，将会以此调用recoverFailedTask和revcoverLostTask
    String recover(String from, String to);

    //针对时间段内的所有失败任务，批量补数据
    String recoverFailedTask(String from, String to);

    //针对时间段内所有错过的action，批量补数据
    String revcoverLostTask(String from, String to);


    //设置CandidateRerunRatio，系统自动针对执行时间超过以往平均执行之间n倍的task进行检查，CandidateRerunRatio即为n，默认为10，可以通过此接口进行设置
    String setCandidateRerunRatio(Float ratio);

    //取得CandidateRerunRatio的当前值
    Float getCandidateRerunRatio();

    //取得可以执行hive任务的服务器
    String getHqlServers(String bussDir);
    //取得可以执行map/reduce任务的服务器
    String getShellServers(String bussDir);
    //取得neo4j中对应actionId的数据
    String getActionFromNeo4j(Long actionId);

    //取得neo4j中actionId的所有子action
    String getBehindActions(Long id);

    //取得neo4j中actionId的所有父action
    String beforeActions(Long id);

    String testDs(String json);
}
