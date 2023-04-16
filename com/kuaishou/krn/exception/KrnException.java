package com.kuaishou.krn.exception.KrnException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class KrnException extends RuntimeException	// class@00086d
{

    public void KrnException(String p0){
       super(p0);
    }
    public void KrnException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void KrnException(Throwable p0){
       super(p0);
    }
    public String getMessage(){
       String obj = PatchProxy.apply(null, this, KrnException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (super.getMessage() == null || this.getCause() == null) {
          obj = super.getMessage();
          if (obj == null) {
             obj = "";
          }
       }else {
          obj = super.getMessage()+", "+this.getCause().getMessage();
       }
       return obj;
    }
}
