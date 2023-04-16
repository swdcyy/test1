package com.kwai.plugin.dva.install.e$a;
import gj7.b$a;
import com.kwai.plugin.dva.install.e;
import com.kwai.plugin.dva.install.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;

public class e$a extends b$a	// class@00135a
{
    public final e$b a;
    public final e b;

    public void e$a(e p0,e$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       this.a.d();
       return;
    }
    public void onCancel(){
    }
    public void onFail(int p0,String p1){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, e$a.class, "2")) {
          return;
       }
       this.a.onFailed(p0, p1);
       return;
    }
    public void onProgress(float p0){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, e$a.class, "3")) {
          return;
       }
       this.a.onProgress(p0);
       return;
    }
    public void onStart(){
    }
}
