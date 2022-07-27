package com.timeout.scheduler.common;

/**
 * 任务状态的描述
 */
public class  TaskStatus {
    public static final int STATUS_READY = 1;
    public static final int STATUS_RUNNING = 2;
    public static final int STATUS_OK = 3;
    public static final int STATUS_FAILURE = 4;
    public static final int STATUS_REDONE = 5;

    public static final int STATUS_STOPPING = 6;
    public static final int STATUS_STOPPED = 7;
    public static final int STATUS_KILLED = 8;
    public static final int STATUS_REPAIRABLE = 9;
    public static final int STATUS_WAITINGFORRETRY = 10;
}
