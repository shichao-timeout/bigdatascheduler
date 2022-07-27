package com.timeout.scheduler.task;

import java.util.Date;

/**
 * action的运行期形态，即action的实例
 */
public class Task {
    private Long id;
    private Long groupId;
    private int priority;
    private String cmd;
    private int status;
    private int type;
    private int actionType;

    private Date dataDate;
    private Date finishTime;
    private Long actionId;
    private Job job;
    private String args;
    private String argsValue;
    private String execSentence;
    private String dcId;
    private String server;
    private Integer bussType;
    private Long redoTaskId;
    private Long serverGroupId;
    private Integer retryNum;
    private Integer bussOffsetUnit;
    private Integer bussOffset;

    private Date startTime;
    private Long timeElapsed;
    private String actionName;
    // private String desc;
    private Long outputdsId;
    private Long timeout;

    private String hadoopUser;
    private Date firedTime;
    private Date monitorTime;

    private String cleaningCommand;


    private String hadoopPool;

    private Date offeredTime;


    private String matchedCode = "";
    private String matchedMsg = "";
    private String matchedSolution = "";
    private boolean isRetriable = false;

    private Integer period;

    private volatile boolean isCallbacked = false;
}
