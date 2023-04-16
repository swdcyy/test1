package com.kwai.plugin.dva.feature.core.receiver.a$c;
import com.kwai.plugin.dva.work.c$c;
import java.lang.String;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.plugin.dva.feature.core.receiver.a;
import qj7.d;
import sj7.d;
import com.kwai.plugin.dva.feature.core.receiver.a$a;
import android.os.Handler;

public final class a$c implements c$c	// class@001323
{
    public final String a;
    public final String b;

    public void a$c(String p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "2")) {
          return;
       }
       a a = a.a;
       d.c("receiver\("+a.b()+"\), install feature failed, f="+this.a+" error="+p0);
       a$c ta = this.a;
       a$c tb = this.b;
       String str = "";
       if (p0 != null) {
          String message = p0.getMessage();
          if (message != null) {
             str = message;
          }
       }
       a.d(ta, tb, false, str);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a.a.d(this.a, this.b, true, "");
          a$a.a.a().sendEmptyMessageDelayed(0, 2000);
       }
       return;
    }
}
