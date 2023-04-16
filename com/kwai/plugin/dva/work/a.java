package com.kwai.plugin.dva.work.a;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.work.c;
import java.util.Map;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Long;
import com.kwai.plugin.dva.work.b;
import sj7.d;

public class a implements c$c	// class@0013a0
{
    public final c a;
    public final c b;
    public final Map c;
    public final int[] d;
    public final int e;
    public final Object f;

    public void a(c p0,c p1,Map p2,int[] p3,int p4,Object p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.b.n(this);
       if (!this.a.h()) {
          this.a.d(p0);
       }
       return;
    }
    public void onProgress(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.a.h()) {
          this.b.n(this);
       }else {
          this.c.put(Long.valueOf(this.b.f()), Float.valueOf(p0));
          this.a.m(b.a(this.c));
       }
       return;
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0 = this.d;
       p0[0] = p0[0] + 1;
       if (p0[0] == this.e) {
          this.a.r(this.f);
       }
       return;
    }
}
