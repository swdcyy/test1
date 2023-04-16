package com.yxcorp.gifshow.video.EditorSdk2InternalErrorExceptionWrapper;
import java.lang.Exception;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class EditorSdk2InternalErrorExceptionWrapper extends Exception	// class@001680
{

    public void EditorSdk2InternalErrorExceptionWrapper(String p0){
       super("Editor SDK encountered an internal error: "+p0);
    }
    public void EditorSdk2InternalErrorExceptionWrapper(String p0,Throwable p1){
       super(p0, p1);
    }
    public void EditorSdk2InternalErrorExceptionWrapper(Throwable p0){
       super("Editor SDK encountered an internal error", p0);
    }
}
