package com.tkruntime.v8.V8ScriptExecutionException;
import com.tkruntime.v8.V8ScriptException;
import java.lang.String;
import java.lang.Throwable;

public class V8ScriptExecutionException extends V8ScriptException	// class@000fcc
{

    public void V8ScriptExecutionException(String p0,int p1,String p2,String p3,int p4,int p5,String p6){
       super(p0, p1, p2, p3, p4, p5, p6, null);
    }
    public void V8ScriptExecutionException(String p0,int p1,String p2,String p3,int p4,int p5,String p6,Throwable p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7);
    }
}
