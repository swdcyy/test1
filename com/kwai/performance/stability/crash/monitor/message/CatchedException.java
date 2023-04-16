package com.kwai.performance.stability.crash.monitor.message.CatchedException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.util.g;

public class CatchedException extends Exception	// class@0011f8
{
    public static final long serialVersionUID = 0x6b7c5279c622b4b2;

    public void CatchedException(){
       super();
    }
    public void CatchedException(String p0){
       super(p0);
    }
    public void CatchedException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void CatchedException(Throwable p0){
       super(p0);
    }
    public Throwable append(Throwable p0){
       Throwable throwable = p0;
       while (throwable.getCause() != null) {
          throwable = throwable.getCause();
       }
       try{
          g.j(throwable, "cause", this);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return p0;
    }
}
