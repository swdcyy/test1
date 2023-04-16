package com.kuaishou.live.core.voiceparty.core.utils.StateChartCaughtException;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class StateChartCaughtException extends Exception	// class@001476
{

    public void StateChartCaughtException(Throwable p0){
       a.p(p0, "cause");
       super("状态机回调里面发生了异常，请解决以下具体crash", p0);
    }
    public Throwable fillInStackTrace(){
       return this;
    }
}
