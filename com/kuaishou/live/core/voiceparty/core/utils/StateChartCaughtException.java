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
       super("״̬���ص����淢�����쳣���������¾���crash", p0);
    }
    public Throwable fillInStackTrace(){
       return this;
    }
}
