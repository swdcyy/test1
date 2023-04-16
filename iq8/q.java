package iq8.q;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Method;
import android.app.Application;
import java.lang.Exception;
import java.lang.IllegalStateException;

public class q	// class@00271d
{
    public final q a;
    public static Context b;

    public void q(){
       super();
       this.a = this;
    }
    public static Context a(){
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, objArray, q.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = q.b;
       if (obj != null) {
          return obj;
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Application uApplication = Class.forName("android.app.ActivityThread").getMethod("currentApplication", uClassArray).invoke(objArray, objArray);
          if (uApplication != null) {
             q.b = uApplication;
             return uApplication;
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       try{
          Class[] uClassArray1 = new Class[i];
          Application uApplication1 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", uClassArray1).invoke(objArray, objArray);
          if (uApplication1 != null) {
             q.b = uApplication1;
             return uApplication1;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       throw new IllegalStateException("ContextHolder is not initialed, it is recommend to init with application context.");
    }
}
