package com.kwai.performance.stability.crash.monitor.internal.JavaCrashHandler$a;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$ExceptionType;
import java.lang.Enum;

public final class JavaCrashHandler$a	// class@0011e4
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ExceptionHandler$ExceptionType.values().length];
       ointArray[ExceptionHandler$ExceptionType.CRASH.ordinal()] = 1;
       ointArray[ExceptionHandler$ExceptionType.FAKE_EXCEPTION.ordinal()] = 2;
       ointArray[ExceptionHandler$ExceptionType.FAKE_EXCEPTION_RANDOM.ordinal()] = 3;
       ointArray[ExceptionHandler$ExceptionType.KNOWN_EXCEPTION.ordinal()] = 4;
       JavaCrashHandler$a.a = ointArray;
    }
}
