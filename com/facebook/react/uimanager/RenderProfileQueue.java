package com.facebook.react.uimanager.RenderProfileQueue;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.uimanager.c;
import java.util.ArrayDeque;
import com.facebook.react.uimanager.RenderProfileQueue$State;
import java.util.concurrent.atomic.AtomicBoolean;
import ze.g0;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.uimanager.RenderProfileQueue$a;
import com.facebook.react.modules.core.a;
import ze.f0;

public class RenderProfileQueue extends a$a	// class@001326
{
    public final ArrayDeque c;
    public long d;
    public long e;
    public RenderProfileQueue$State f;
    public final AtomicBoolean g;
    public final c h;

    public void RenderProfileQueue(c p0){
       super();
       this.c = new ArrayDeque();
       this.d = 0;
       this.e = 30;
       this.f = RenderProfileQueue$State.PLAY;
       this.g = new AtomicBoolean(false);
       this.h = p0;
       UiThreadUtil.runOnUiThread(new g0(this));
    }
    public void a(long p0){
       RenderProfileQueue renderProfil = RenderProfileQueue.class;
       if (PatchProxy.isSupport(renderProfil) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, renderProfil, "4")) {
          return;
       }
       while (true) {
          long l = p0 - this.d;
          long l1 = this.e * 1000;
          l1 = l1 * 1000;
          renderProfil = (l - l1 >= 0)? 1: null;
          if (renderProfil && !this.c.isEmpty()) {
             renderProfil = this.f;
             RenderProfileQueue$State sTEP = RenderProfileQueue$State.STEP;
             if (renderProfil == sTEP || renderProfil == RenderProfileQueue$State.PLAY) {
                this.c.pop().run();
                this.d = p0;
                if (this.f == sTEP) {
                   this.f = RenderProfileQueue$State.STOP;
                }
             }
          }
          if (!this.c.isEmpty()) {
             a.a().b(this);
             break ;
          }
          break ;
       }
       return;
    }
    public void c(RenderProfileQueue$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderProfileQueue.class, "5")) {
          return;
       }
       if (this.c.isEmpty()) {
          a.a().b(this);
       }
       this.c.add(p0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, RenderProfileQueue.class, "2")) {
          return;
       }
       this.g.set(true);
       RenderProfileQueue tg = this.g;
       _monitor_enter(tg);
       while (this.g.get()) {
          try{
             this.g.wait();
          }catch(java.lang.InterruptedException e0){
          }
       }
       _monitor_exit(tg);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, RenderProfileQueue.class, "3")) {
          return;
       }
       this.c(new f0(this));
       return;
    }
}
