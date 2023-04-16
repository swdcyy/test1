package com.kuaishou.tuna_core.plugin.n$b;
import com.kwai.plugin.dva.work.c$c;
import com.kuaishou.tuna_core.plugin.n$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sj7.d;

public final class n$b implements c$c	// class@001123
{
    public final n$a a;
    public final String b;

    public void n$b(n$a p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$b.class, "2")) {
          return;
       }
       n$b ta = this.a;
       if (ta != null) {
          ta.onFailed(this.b);
       }
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$b.class, "1")) {
       }else {
          p0 = this.a;
          if (p0 != null) {
             p0.onSuccess(this.b);
          }
       }
       return;
    }
}
