package com.kuaishou.live.common.core.component.pendant.a;
import ta1.a;
import zv1.e$d;
import lv1.c;
import java.lang.Object;
import lv1.a;
import lv1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import ekd.k1;
import zv1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveAnimationInfo;
import java.lang.Math;

public class a	// class@0016ea
{
    public final a a;
    public e$d b;
    public c c;
    public int d;
    public int e;
    public boolean f;
    public final Runnable g;
    public final Runnable h;

    public void a(a p0,e$d p1,c p2){
       super();
       this.d = -1;
       this.e = -1;
       this.f = true;
       this.g = new a(this);
       this.h = new b(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.g();
       this.c();
       return;
    }
    public long b(){
       a obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.a;
       long l = (obj == null)? System.currentTimeMillis(): obj.s();
       return l;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RIGHT_BOTTOM_ACTIVITY_WIDGET_ANIMATION, "removeAnimationTask");
       k1.m(this.h);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       k1.m(this.g);
       return;
    }
    public final void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0.getAnimationInfo() != null && (this.c.b() && this.b.d(this.c.f()))) {
          this.c.e();
          this.f = false;
          k1.r(this.g, Math.max((p0.getAnimationInfo().endShowTimeStamp - this.b()), 0));
       }
    label_0048 :
       return;
    }
    public void f(a p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "4")) {
          return;
       }
       if (p0 != null && this.c.b()) {
          LiveStreamMessages$LiveAnimationInfo animationInf = p0.getAnimationInfo();
          LiveStreamMessages$LiveAnimationInfo liveAnimatio = 1;
          if (animationInf != null && animationInf.endShowTimeStamp - this.b() > 0) {
             LiveLogTag lIVE_RIGHT_B = LiveLogTag.LIVE_RIGHT_BOTTOM_ACTIVITY_WIDGET_ANIMATION;
             b.Z(lIVE_RIGHT_B, "startAnimationTaskIfNecessary can show");
             if (!PatchProxy.applyVoidOneRefs(animationInf, this, uoa, "10")) {
                LiveStreamMessages$LiveAnimationInfo liveAnimatio1 = this.b.c();
                if (this.b.b() && (liveAnimatio1 != null && animationInf.startShowTimeStamp - liveAnimatio1.endShowTimeStamp <= 0)) {
                   this.c();
                   this.d();
                   k1.r(this.g, Math.max((animationInf.endShowTimeStamp - this.b()), 0));
                }else {
                   this.c();
                   this.f = liveAnimatio;
                   this.d();
                   this.c.c();
                   if (animationInf.endShowTimeStamp - this.b() > 0) {
                      if ((animationInf.startShowTimeStamp - this.b()) > 0) {
                         b.Z(lIVE_RIGHT_B, "startAnimationTask delay");
                         k1.r(this.h, (animationInf.startShowTimeStamp - this.b()));
                      }else {
                         this.e(this.c.f());
                      }
                   }
                }
             }
          }else {
             LiveLogTag lIVE_RIGHT_B1 = LiveLogTag.LIVE_RIGHT_BOTTOM_ACTIVITY_WIDGET_ANIMATION;
             b.Z(lIVE_RIGHT_B1, " disableWidgetItemAnimation : illegal info");
             if (this.b.b()) {
                b.Z(lIVE_RIGHT_B1, "disableWidgetItemAnimation : start loop");
                this.f = liveAnimatio;
                this.c.c();
             }
             this.a();
          }
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.b.b()) {
          this.b.a();
       }
       this.f = true;
       this.d();
       return;
    }
}
