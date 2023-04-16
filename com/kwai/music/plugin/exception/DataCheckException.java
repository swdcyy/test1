package com.kwai.music.plugin.exception.DataCheckException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class DataCheckException extends RuntimeException	// class@000f73
{
    public final String msg;

    public void DataCheckException(String p0){
       a.q(p0, "msg");
       super(p0);
       this.msg = p0;
    }
}
