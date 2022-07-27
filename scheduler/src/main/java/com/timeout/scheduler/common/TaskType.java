package com.timeout.scheduler.common;

/**
 * 当前task的类型
 */
public class TaskType {
    public static final int TYPE_NONE = 1;
    public static final int TYPE_REDO = 2;
    public static final int TYPE_COMPLETING = 3;
    public static final int TYPE_REDO_SKIPPED = 5;
    public static final int TYPE_COMPLETE_SKIPPED = 6;
}
