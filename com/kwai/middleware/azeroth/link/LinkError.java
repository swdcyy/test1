package com.kwai.middleware.azeroth.link.LinkError;
import java.lang.Exception;
import com.kwai.middleware.azeroth.link.LinkError$a;
import nsd.u;
import java.lang.String;
import java.lang.StringBuilder;

public final class LinkError extends Exception	// class@000efb
{
    public final int errorCode;
    public final String errorMessage;
    public static final LinkError$a Companion;

    static {
       LinkError.Companion = new LinkError$a(null);
    }
    public void LinkError(){
       super(0, null, 3, null);
    }
    public void LinkError(int p0,String p1){
       super();
       this.errorCode = p0;
       this.errorMessage = p1;
    }
    public void LinkError(int p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = -1;
       }
       if (p2 & 0x02) {
          p1 = "none";
       }
       super(p0, p1);
       return;
    }
    public final int getErrorCode(){
       return this.errorCode;
    }
    public final String getErrorMessage(){
       return this.errorMessage;
    }
    public String getMessage(){
       return this.toString();
    }
    public String toString(){
       return "[Azeroth Link Error] "+this.errorCode+" - "+this.errorMessage;
    }
}
