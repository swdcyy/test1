package com.kuaishou.live.core.voiceparty.core.audience.LongConnectionUnregisterException;
import java.lang.Exception;
import ut7.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class LongConnectionUnregisterException extends Exception	// class@001391
{

    public void LongConnectionUnregisterException(e p0){
       a.p(p0, "event");
       super("send event "+p0+" after longConnection released");
    }
    public Throwable fillInStackTrace(){
       return this;
    }
}
