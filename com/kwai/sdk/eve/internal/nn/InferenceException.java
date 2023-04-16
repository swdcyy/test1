package com.kwai.sdk.eve.internal.nn.InferenceException;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class InferenceException extends Exception	// class@001575
{

    public void InferenceException(Throwable p0){
       a.p(p0, "cause");
       super(p0);
    }
}
