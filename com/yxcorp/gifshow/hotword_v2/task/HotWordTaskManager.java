package com.yxcorp.gifshow.hotword_v2.task.HotWordTaskManager;
import java.lang.Object;
import swa.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import swa.b;
import swa.a;
import swa.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hotword_v2.task.HotWordTaskManager$enqueueTask$1;
import msd.l;
import java.util.Objects;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;

public final class HotWordTaskManager	// class@001902
{
    public b a;
    public final d b;
    public int c;

    public void HotWordTaskManager(){
       super();
       this.b = new d();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, HotWordTaskManager.class, "8")) {
          return;
       }
       this.c = 0;
       HotWordTaskManager tb = this.b;
       tb.a = 0;
       tb.b = 0;
       tb = this.a;
       if (tb != null) {
          this.e(tb);
       }
       this.a = null;
       return;
    }
    public final void b(a p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotWordTaskManager.class, "1")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "taskConfig");
       if (this.a != null) {
          return;
       }
       this.a = new b(p1, p0, new HotWordTaskManager$enqueueTask$1(this));
       HotWordTaskManager ta = this.a;
       a.m(ta);
       this.c(p1.a(), ta);
       HotWordTaskManager tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, d.class, "1")) {
          tb.a();
       }
       return;
    }
    public final void c(long p0,b p1){
       HotWordTaskManager hotWordTaskM = HotWordTaskManager.class;
       if (PatchProxy.isSupport(hotWordTaskM) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, hotWordTaskM, "2")) {
          return;
       }
       if (p0 <= 0) {
          p1.run();
       }else {
          k1.r(p1, p0);
       }
       return;
    }
    public final c d(boolean p0){
       c obj;
       HotWordTaskManager hotWordTaskM = HotWordTaskManager.class;
       if (PatchProxy.isSupport(hotWordTaskM)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, hotWordTaskM, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       hotWordTaskM = this.a;
       c uoc = null;
       if (hotWordTaskM != null) {
          int i = (hotWordTaskM.a().e() == p0)? 1: 0;
          if (!i) {
             obj = uoc;
          }
          if (hotWordTaskM != null) {
             uoc = hotWordTaskM.a();
          }
       }
       return uoc;
    }
    public final void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotWordTaskManager.class, "9")) {
          return;
       }
       k1.m(p0);
       return;
    }
}
