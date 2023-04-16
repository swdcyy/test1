package com.kuaishou.live.lite.like.b;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.like.c;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import td3.o;
import wb3.c;
import wb3.d;
import ok.o;
import jo1.a;
import com.kuaishou.live.lite.like.b$a;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import android.view.View;
import ha1.b;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import android.view.ViewGroup;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$b;
import brd.t;
import wb3.a;
import com.kuaishou.live.lite.like.a;
import erd.g;
import crd.b;

public class b extends ViewController	// class@0009ed
{
    public final LiveLiteGestureService j;
    public final c k;
    public final o l;
    public final c m;
    public final d n;
    public final a o;
    public final o p;
    public b q;
    public final LiveLiteGestureService$b r;

    public void b(c p0,LiveLiteGestureService p1,o p2,c p3,d p4,o p5){
       super();
       this.o = new a();
       this.r = new b$a(this);
       this.j = p1;
       this.k = p0;
       this.l = p2;
       this.p = p5;
       this.m = p3;
       this.n = p4;
    }
    public void A(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_LIKE, "doubleTap doLike");
       if (this.p.apply(null)) {
          return;
       }
       this.k.b(1);
       this.o.b(p0.getRawX(), p0.getRawY(), 1);
       this.m.a();
       this.n.a();
       this.k.a();
       return;
    }
    public void F2(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       View view = b.e(this.D2(), R.layout.live_lite_like_effect_container_layout);
       view.setTag(d.a, LayoutViewType.FullscreenLikeEffect.name());
       this.R2(view);
       this.o.e(this.A2(R.id.live_like_effect_container));
       this.j.d(this.r);
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          this.q = this.l.W().subscribe(new a(this), a.b);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.j.c(this.r);
       b tk = this.k;
       if (tk != null) {
          tk.c();
       }
       tk = this.q;
       if (tk != null) {
          tk.dispose();
       }
       return;
    }
}
