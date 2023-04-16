package com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import vj1.a;
import yj1.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import xj1.a;
import gk1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import android.animation.Animator;
import fk1.a;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager$b;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.common.core.basic.degrade.LiveDegradeBiz;
import com.kuaishou.live.common.core.basic.degrade.j;
import crd.b;
import lnc.b9;
import android.widget.TextView;
import java.lang.Integer;
import th0.g;
import android.animation.AnimatorSet;
import ekd.f;
import th0.f;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager$a;
import com.kwai.robust.PatchProxyResult;
import ak1.d;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ak1.b;
import erd.g;
import a2.c0;

public class LiveGiftSlotAnimManager extends LifecycleManager	// class@001267
{
    public final a c;
    public final int d;
    public b e;
    public AnimatorSet f;
    public AnimatorSet g;
    public Animator h;
    public final a i;
    public Animator j;
    public Animator k;
    public Animator l;
    public Animator m;
    public Animator n;
    public Animator o;
    public Animator p;
    public Animator q;
    public Animator$AnimatorListener r;
    public AnimatorSet s;
    public AnimatorSet t;
    public int u;
    public LiveGiftSlotItemView v;
    public c0 w;

    public void LiveGiftSlotAnimManager(LifecycleOwner p0,int p1,a p2){
       super(p0);
       this.c = new a();
       this.d = p1;
       this.i = p2;
    }
    public final void b(LiveGiftSlotItemView p0,GiftSlotMessage p1,a p2,a p3,boolean p4){
       LiveGiftSlotAnimManager liveGiftSlot = LiveGiftSlotAnimManager.class;
       int i = 2;
       if (PatchProxy.isSupport(liveGiftSlot)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, liveGiftSlot, "14")) {
             return;
          }
       }
       a.e(this.h);
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[i]{0x3f800000,0});
       this.h = objectAnimat;
       objectAnimat.setDuration(300);
       this.h.setInterpolator(new LinearInterpolator());
       this.h.removeAllListeners();
       LiveGiftSlotAnimManager$b uob = new LiveGiftSlotAnimManager$b(this, p4, p3, p2, p1);
       this.h.addListener(v6);
       j.g(this.h, LiveDegradeBiz.GiftSlot);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveGiftSlotAnimManager.class, "9")) {
          return;
       }
       b9.a(this.e);
       return;
    }
    public final void d(LiveGiftSlotItemView p0,TextView p1,View p2,int p3,int p4){
       ObjectAnimator objectAnimat;
       LiveGiftSlotAnimManager f;
       int i = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       if (PatchProxy.isSupport(LiveGiftSlotAnimManager.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, i, LiveGiftSlotAnimManager.class, "10")) {
             return;
          }
       }
       oobject1.setScaleX(0);
       oobject1.setScaleY(0);
       oobject1.setPivotX(0);
       oobject1.setPivotY((float)p1.getMeasuredHeight());
       a.e(i.f);
       i.u = p4;
       i.v = oobject;
       i.j = f.d(p0, (float)(- p3), 0, 300, new g());
       long l = 180;
       if (i.k == null) {
          objectAnimat = ObjectAnimator.ofFloat(oobject2, View.ROTATION, new float[2]{0,0x41400000});
          i.k = objectAnimat;
          objectAnimat.setStartDelay(120);
          i.k.setDuration(l);
          i.k.setInterpolator(new f());
       }
       long l1 = 300;
       if (i.l == null) {
          objectAnimat = ObjectAnimator.ofFloat(oobject, View.ALPHA, new float[2]{0,0x3f800000});
          i.l = objectAnimat;
          objectAnimat.setDuration(l1);
          i.l.setInterpolator(new f());
          i.l.addListener(new LiveGiftSlotAnimManager$a(i));
       }
       oobject2.setPivotX((((float)p2.getWidth() * 0x3f800000) / 2.00f));
       oobject2.setPivotY((float)p2.getHeight());
       if (i.m == null) {
          objectAnimat = ObjectAnimator.ofFloat(oobject2, View.ROTATION, new float[2]{0x41400000,0});
          i.m = objectAnimat;
          objectAnimat.setStartDelay(l1);
          i.m.setDuration(200);
       }
       if (i.n == null) {
          i.n = ObjectAnimator.ofFloat(oobject1, View.SCALE_X, new float[2]{0,0x3f99999a});
          i.o = ObjectAnimator.ofFloat(oobject1, View.SCALE_Y, new float[2]{0,0x3f99999a});
          i.n.setStartDelay(l);
          i.o.setStartDelay(l);
          l = 220;
          i.n.setDuration(l);
          i.o.setDuration(l);
       }
       if (i.p == null) {
          i.p = ObjectAnimator.ofFloat(oobject1, View.SCALE_X, new float[2]{0x3f99999a,0x3f800000});
          i.q = ObjectAnimator.ofFloat(oobject1, View.SCALE_Y, new float[2]{0x3f99999a,0x3f800000});
          i.p.setStartDelay(400);
          i.q.setStartDelay(400);
          l = 100;
          i.p.setDuration(l);
          i.q.setDuration(l);
       }
       f = i.f;
       AnimatorSet uAnimatorSet = null;
       if (f != null) {
          f.removeAllListeners();
          i.f.cancel();
          i.f = uAnimatorSet;
       }
       AnimatorSet uAnimatorSet1 = new AnimatorSet();
       i.f = uAnimatorSet1;
       LiveGiftSlotAnimManager liveGiftSlot = PatchProxy.apply(uAnimatorSet, i, LiveGiftSlotAnimManager.class, "11");
       if (liveGiftSlot != PatchProxyResult.class) {
       }else if(i.r == null){
          i.r = new d(i);
       }
       liveGiftSlot = i.r;
       uAnimatorSet1.addListener(liveGiftSlot);
       Animator[] uAnimatorArr = new Animator[]{i.l,i.j,i.k,i.m,i.n,i.o,i.p,i.q};
       i.f.playTogether(uAnimatorArr);
       j.g(i.f, LiveDegradeBiz.GiftSlot);
       return;
    }
    public void e(int p0,LiveGiftSlotItemView p1){
       LiveGiftSlotAnimManager liveGiftSlot = LiveGiftSlotAnimManager.class;
       if (PatchProxy.isSupport(liveGiftSlot) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveGiftSlot, "8")) {
          return;
       }
       b9.a(this.e);
       this.e = t.interval(0, 1, TimeUnit.MILLISECONDS).take((long)p0).observeOn(d.a).subscribe(new b(this, p0, p1));
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       LiveGiftSlotAnimManager liveGiftSlot = LiveGiftSlotAnimManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveGiftSlot, "1")) {
          return;
       }
       super.onDestroy(p0);
       if (!PatchProxy.applyVoid(null, this, liveGiftSlot, "7")) {
          b9.a(this.e);
          a.e(this.f);
          a.e(this.g);
          a.e(this.h);
          a.e(this.j);
          a.e(this.k);
          a.e(this.l);
          a.e(this.m);
          a.e(this.n);
          a.e(this.o);
          a.e(this.p);
          a.e(this.q);
          liveGiftSlot = this.w;
          if (liveGiftSlot != null) {
             liveGiftSlot.b();
             this.w = null;
          }
          this.f = null;
          this.g = null;
          this.h = null;
          this.j = null;
          this.k = null;
          this.q = null;
          this.p = null;
          this.o = null;
          this.n = null;
          this.m = null;
          this.l = null;
       }
       return;
    }
}
