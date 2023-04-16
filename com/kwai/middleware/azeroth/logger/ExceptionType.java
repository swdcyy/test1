package com.kwai.middleware.azeroth.logger.ExceptionType;
import java.lang.annotation.Annotation;

public interface abstract ExceptionType implements Annotation	// class@000efc
{
    public static final int ABNORMAL_EXIT = 8;
    public static final int ANR = 3;
    public static final int CRASH = 1;
    public static final int DEAD_LOOP = 14;
    public static final int EXCEPTION = 2;
    public static final int FD_STACKS = 11;
    public static final int FLUTTER_EXCEPTION = 6;
    public static final int LONG_BLOCK = 13;
    public static final int MEMORY_MONITOR = 10;
    public static final int METRICS_DIAGNOSTIC_PAYLOAD = 16;
    public static final int NATIVE_CRASH = 4;
    public static final int NATIVE_LEAK = 9;
    public static final int OOM = 5;
    public static final int OOM_STACKS = 7;
    public static final int SYSTEM_EXIT_STAT = 15;
    public static final int THREAD_STACKS = 12;
    public static final int UNKNOWN_TYPE;

}
