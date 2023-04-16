package com.kuaishou.security.kste.logic.event.KSTEException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Integer;
import java.io.PrintStream;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.io.PrintWriter;

public class KSTEException extends Exception	// class@000f18
{
    public int mErrorCode;

    public void KSTEException(int p0){
       this.mErrorCode = p0;
    }
    public void KSTEException(String p0,int p1){
       this.mErrorCode = p1;
    }
    public void KSTEException(String p0,Throwable p1,int p2){
       this.mErrorCode = p2;
    }
    public void KSTEException(String p0,boolean p1){
       super(p0);
       if (p1) {
          int i = 0x2716;
          try{
             i = Integer.parseInt(p0);
             this.mErrorCode = i;
          }catch(java.lang.NumberFormatException e0){
          }
       }
    }
    public void KSTEException(Throwable p0,int p1){
       this.mErrorCode = p1;
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public void printStackTrace(PrintStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSTEException.class, "1")) {
          return;
       }
       p0.println("errorno = "+this.getErrorCode());
       super.printStackTrace(p0);
       return;
    }
    public void printStackTrace(PrintWriter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSTEException.class, "2")) {
          return;
       }
       p0.println("errorno = "+this.getErrorCode());
       super.printStackTrace(p0);
       return;
    }
    public void setErrorCode(int p0){
       this.mErrorCode = p0;
    }
}
