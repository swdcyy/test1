package com.kwai.sdk.eve.AbortException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class AbortException extends Exception	// class@001432
{

    public void AbortException(String p0){
       a.p(p0, "reason");
       super(p0);
    }
}
