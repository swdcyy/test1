package com.kuaishou.live.core.voiceparty.core.audience.LongConnectionUnregisterNewException;
import java.lang.Exception;
import ut7.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class LongConnectionUnregisterNewException extends Exception	// class@001392
{

    public void LongConnectionUnregisterNewException(e p0){
       a.p(p0, "event");
       super("send event "+p0+" after longConnection released for scope manager");
    }
    public Throwable fillInStackTrace(){
       return this;
    }
}
