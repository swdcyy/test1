package com.kuaishou.android.security.base.exception.KSException;
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

public class KSException extends Exception	// class@00069b
{
    public int a;

    public void KSException(int p0){
       this.a = p0;
    }
    public void KSException(String p0,int p1){
       this.a = p1;
    }
    public void KSException(String p0,Throwable p1,int p2){
       this.a = p2;
    }
    public void KSException(String p0,boolean p1){
       super(p0);
       if (p1) {
          int i = 0x2716;
          try{
             i = Integer.parseInt(p0);
             this.a = i;
          }catch(java.lang.NumberFormatException e0){
          }
       }
    }
    public void KSException(Throwable p0){
       super("", p0);
    }
    public void KSException(Throwable p0,int p1){
       this.a = p1;
    }
    public int getErrorCode(){
       return this.a;
    }
    public void printStackTrace(PrintStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSException.class, "1")) {
          return;
       }
       p0.println("errorno = "+this.getErrorCode());
       super.printStackTrace(p0);
       return;
    }
    public void printStackTrace(PrintWriter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSException.class, "2")) {
          return;
       }
       p0.println("errorno = "+this.getErrorCode());
       super.printStackTrace(p0);
       return;
    }
    public void setErrorCode(int p0){
       this.a = p0;
    }
}
