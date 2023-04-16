package com.kuaishou.live.effect.engine.render.LiveEffectRenderManager$a;
import pz2.e;
import com.kuaishou.live.effect.engine.render.LiveEffectRenderManager;
import az2.a;
import zy2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pz2.c;
import e93.f;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import cz2.b;
import kotlin.jvm.internal.a;
import cz2.a;
import pz2.d;
import pz2.i;
import java.util.Map;
import pz2.j;
import com.kuaishou.live.effect.engine.render.LiveEffectRenderManager$a$a;
import java.lang.Runnable;

public final class LiveEffectRenderManager$a implements e	// class@001b02
{
    public final Object a;
    public final LiveEffectRenderManager b;
    public final a c;
    public final a d;

    public void LiveEffectRenderManager$a(LiveEffectRenderManager p0,a p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
       this.a = new Object();
    }
    public void a(){
       LiveEffectRenderManager f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveEffectRenderManager$a.class, "2")) {
          return;
       }
       c uoc = this.d.H();
       if (uoc != null) {
          f.g(this.a);
          int i = uoc.p();
          if (i != 1) {
             if (i != 2) {
                b.T(this.b.c, "[clearEffect]", "RenderType", "not support", "renderingEffectTask", uoc);
             }else {
                b.T(this.b.c, "[clearEffect]", "RenderType", "STREAM_MERGE", "renderingEffectTask", uoc);
             }
          }else {
             b.T(this.b.c, "[clearEffect]", "RenderType", "LOCAL_RENDER", "renderingEffectTask", uoc);
             f = this.b.f;
             Objects.requireNonNull(f);
             if (!PatchProxy.applyVoid(objArray, f, b.class, "4")) {
                b l = f.l;
                if (l == null) {
                   a.S("localRenderer");
                }
                l.a();
             }
          }
       }
       return;
    }
    public void b(c p0,String p1){
       String str = "5";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveEffectRenderManager$a.class, str)) {
          return;
       }
       String str1 = "effectTask";
       a.p(p0, str1);
       LiveEffectRenderManager f = this.b.f;
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, f, b.class, str)) {
          a.p(p0, str1);
          b l = f.l;
          if (l == null) {
             a.S("localRenderer");
          }
          l.C0(p0, p1);
       }
       return;
    }
    public boolean c(){
       return d.b(this);
    }
    public c d(){
       return d.a(this);
    }
    public void e(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectRenderManager$a.class, "3")) {
          return;
       }
       LiveEffectRenderManager$a tb = this.b;
       tb.d = p0;
       tb.f.k = p0;
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectRenderManager$a.class, "4")) {
          return;
       }
       b.P(this.b.c, "[ILiveEffectRenderer][sendStreamRenderMessage]");
       return;
    }
    public void g(int p0,int p1,Map p2,j p3){
       d.f(this, p0, p1, p2, p3);
    }
    public void n5(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectRenderManager$a.class, "1")) {
          return;
       }
       a.p(p0, "task");
       b.S(this.b.c, "[effectRender][executeEffectTask]", "task", p0);
       f.g(this.a);
       f.k("executeEffectTask", new LiveEffectRenderManager$a$a(this, p0), this.a, this.c.a);
       return;
    }
    public void pause(){
       d.c(this);
    }
    public void release(){
       d.d(this);
    }
    public void resume(){
       d.e(this);
    }
}
