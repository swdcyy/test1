package com.kwai.framework.initmodule.RxJavaErrorHandlerInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import ukd.a;
import e66.c;
import q87.c;
import android.app.Application;
import com.kwai.framework.initmodule.c;
import ird.a;
import java.lang.IllegalStateException;

public class RxJavaErrorHandlerInitModule extends a	// class@000b75
{
    public static final int q;

    public void RxJavaErrorHandlerInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 19;
    }
    public void n(){
       c uoc;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RxJavaErrorHandlerInitModule.class, "4")) {
          return;
       }
       if (a.a().c()) {
          String str = "RxJavaErrorHandler";
          if (!PatchProxy.applyVoid(objArray, objArray, RxJavaErrorHandlerInitModule.class, "3")) {
             int i = 0;
             try{
                Object[] objArray1 = new Object[i];
                a.b("com.uber.rxdogtag.RxDogTag", "install", objArray1);
                objArray1 = new Object[i];
                c.C().w(str, "RxDogTag is enabled", objArray1);
             }catch(java.lang.Exception e0){
                objArray = new Object[i];
                c.C().w(e0, "RxDogTag is disabled.", objArray);
             }
          }
       }
    }
}
