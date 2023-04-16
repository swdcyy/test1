package com.kwai.framework.debuglog.h$a;
import t87.c;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.debuglog.h;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.StringBuilder;
import com.kwai.logger.KwaiLog;
import qkd.b;
import java.io.IOException;

public class h$a implements c	// class@001513
{
    public final File a;

    public void h$a(File p0){
       this.a = p0;
       super();
    }
    public void c(int p0,String p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       h.a.set(false);
       Object[] objArray = new Object[false];
       KwaiLog.b("DebugLoggerUploader", "onFailure error:"+p0+"_"+p1, objArray);
       h$a ta = this.a;
       if (ta != null) {
          try{
             b.p(ta);
          }catch(java.io.IOException e4){
             e4.printStackTrace();
          }
       }
    }
    public void onProgress(double p0){
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "2")) {
          return;
       }
       h.a.set(false);
       Object[] objArray = new Object[false];
       KwaiLog.b("DebugLoggerUploader", "onSuccess:"+p0, objArray);
       h$a ta = this.a;
       if (ta != null) {
          try{
             b.p(ta);
          }catch(java.io.IOException e4){
             e4.printStackTrace();
          }
       }
    }
}
