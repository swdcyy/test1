package com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$ExceptionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ExceptionHandler$ExceptionType extends Enum	// class@0011df
{
    public static final ExceptionHandler$ExceptionType[] $VALUES;
    public static final ExceptionHandler$ExceptionType CRASH;
    public static final ExceptionHandler$ExceptionType FAKE_EXCEPTION;
    public static final ExceptionHandler$ExceptionType FAKE_EXCEPTION_RANDOM;
    public static final ExceptionHandler$ExceptionType KNOWN_EXCEPTION;

    public static final ExceptionHandler$ExceptionType[] $values(){
       ExceptionHandler$ExceptionType[] uExceptionTy = new ExceptionHandler$ExceptionType[]{ExceptionHandler$ExceptionType.CRASH,ExceptionHandler$ExceptionType.FAKE_EXCEPTION,ExceptionHandler$ExceptionType.FAKE_EXCEPTION_RANDOM,ExceptionHandler$ExceptionType.KNOWN_EXCEPTION};
       return uExceptionTy;
    }
    static {
       ExceptionHandler$ExceptionType.CRASH = new ExceptionHandler$ExceptionType("CRASH", 0);
       ExceptionHandler$ExceptionType.FAKE_EXCEPTION = new ExceptionHandler$ExceptionType("FAKE_EXCEPTION", 1);
       ExceptionHandler$ExceptionType.FAKE_EXCEPTION_RANDOM = new ExceptionHandler$ExceptionType("FAKE_EXCEPTION_RANDOM", 2);
       ExceptionHandler$ExceptionType.KNOWN_EXCEPTION = new ExceptionHandler$ExceptionType("KNOWN_EXCEPTION", 3);
       ExceptionHandler$ExceptionType.$VALUES = ExceptionHandler$ExceptionType.$values();
    }
    public void ExceptionHandler$ExceptionType(String p0,int p1){
       super(p0, p1);
    }
    public static ExceptionHandler$ExceptionType valueOf(String p0){
       return Enum.valueOf(ExceptionHandler$ExceptionType.class, p0);
    }
    public static ExceptionHandler$ExceptionType[] values(){
       return ExceptionHandler$ExceptionType.$VALUES.clone();
    }
}
