package com.kwai.framework.network.cronet.d;
import bo.p;
import java.lang.Object;
import java.lang.String;
import ta6.c;
import q87.c;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class d implements p	// class@000bf6
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final void Log(int p0,String p1,String p2){
       try{
          Object[] objArray = new Object[0];
          c.C().w(p1, p2, objArray);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          ExceptionHandler.handleCaughtException(e2);
       }
       return;
    }
}
