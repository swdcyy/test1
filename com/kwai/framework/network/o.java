package com.kwai.framework.network.o;
import mjd.c;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.network.RetrofitInitModule;
import ta6.c;
import q87.c;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class o implements c	// class@001808
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public final void Log(int p0,String p1,String p2){
       x s = RetrofitInitModule.s;
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
