package com.kwai.plugin.dva.install.f;
import gj7.b$a;
import com.kwai.plugin.dva.install.e;
import com.kwai.plugin.dva.install.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;

public class f extends b$a	// class@00135f
{
    public final e$b a;
    public final e b;

    public void f(e p0,e$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       f ta = this.a;
       if (ta != null) {
          ta.d();
       }
       return;
    }
    public void onCancel(){
    }
    public void onFail(int p0,String p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, f.class, "2")) {
          return;
       }
       f ta = this.a;
       if (ta != null) {
          ta.onFailed(p0, p1);
       }
       return;
    }
    public void onProgress(float p0){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, f.class, "3")) {
          return;
       }
       f ta = this.a;
       if (ta != null) {
          ta.onProgress(p0);
       }
       return;
    }
    public void onStart(){
    }
}
