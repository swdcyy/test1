package com.kwai.performance.stability.crash.monitor.excluded.b$b;
import java.lang.reflect.InvocationHandler;
import java.lang.Object;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.Exception;
import com.kwai.performance.stability.crash.monitor.util.g;
import android.app.Activity;
import java.lang.Boolean;

public class b$b implements InvocationHandler	// class@0011d4
{
    public final Object b;

    public void b$b(Object p0){
       super();
       this.b = p0;
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       p0 = (Build$VERSION.SDK_INT == 28 && ("isTopOfTask").equals(p1.getName()))? 1: null;
       if (p0 || ("reportSizeConfigurations").equals(p1.getName())) {
          try{
             return p1.invoke(this.b, p2);
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
             Object[] objArray = new Object[v0];
             objArray[v1] = p2[v1];
             p2 = g.a(g.d(g.h("android.app.ActivityThread", "sCurrentActivityThread"), "mActivities"), "get", objArray);
             if (p2 != null) {
                Activity uActivity = g.d(p2, "activity");
                if (uActivity != null) {
                   uActivity.finish();
                   g.j(uActivity, "mFinished", Boolean.TRUE);
                }
             }
             if (p0) {
                return Boolean.FALSE;
             }else {
                return null;
             }
          }
       }else {
          return p1.invoke(this.b, p2);
       }
    }
}
