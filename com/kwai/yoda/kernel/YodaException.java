package com.kwai.yoda.kernel.YodaException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class YodaException extends Exception	// class@00127c
{
    public final String message;
    public final int resultCode;

    public void YodaException(int p0,String p1){
       a.q(p1, "message");
       super(p1);
       this.resultCode = p0;
       this.message = p1;
    }
    public String getMessage(){
       return this.message;
    }
    public final int getResultCode(){
       return this.resultCode;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, YodaException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "YodaException ["+this.resultCode+"] - "+this.getMessage()+" - "+this.getCause();
    }
}
