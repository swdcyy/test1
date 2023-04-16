package com.kwai.performance.stability.crash.monitor.excluded.a;
import sg7.d;
import sg7.b;
import java.lang.Exception;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.CharSequence;
import com.kwai.performance.stability.crash.monitor.util.g;
import java.lang.Integer;
import sg7.c;

public class a extends d	// class@000e1b
{
    public int f;
    public Handler g;
    public Handler$Callback h;
    public static final int i;

    public void a(b p0){
       super(p0);
       this.f = 134;
    }
    public boolean b(Exception p0){
       boolean b = true;
       if (p0.getMessage() != null) {
          int i = (("RemoteServiceException").equals(p0.getClass().getSimpleName()) || (("ForegroundServiceDidNotStartInTimeException").equals(p0.getClass().getSimpleName()) && (p0.getMessage() != null && ((p0.getMessage()).contains("Bad notification") || (p0.getMessage()).contains("startForegroundService")))))? 1: 0;
          if (i) {
          label_004d :
             return b;
          }
       }
       b = false;
       goto label_004d ;
    }
    public void d(){
       if (this.a()) {
          return;
       }
       try{
          int i = g.g(Class.forName("android.app.ActivityThread$H"), "SCHEDULE_CRASH").intValue();
          if (i > 0) {
             this.f = i;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this.h = new c(this);
       return;
    }
}
