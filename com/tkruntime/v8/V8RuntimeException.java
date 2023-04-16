package com.tkruntime.v8.V8RuntimeException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class V8RuntimeException extends RuntimeException	// class@000fc9
{

    public void V8RuntimeException(){
       super();
    }
    public void V8RuntimeException(String p0){
       super(p0);
    }
    public static String getMessage(Throwable p0){
       StringWriter obj = PatchProxy.applyOneRefs(p0, null, V8RuntimeException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StringWriter();
       p0.printStackTrace(new PrintWriter(obj));
       return obj.toString();
    }
}
