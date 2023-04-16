package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k;
import gz0.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k$a;
import java.lang.reflect.Type;
import el.a;
import t02.a0;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import qm1.a;
import gz0.y;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k$b;
import gz0.w;
import gz0.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import m91.b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import fq5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import ow0.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.HashMap;
import p91.m;
import java.lang.Integer;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k$c;
import ia1.b;
import com.kuaishou.live.common.core.basic.resource.c$b;
import com.kuaishou.live.common.core.basic.resource.c;
import k2b.e0;
import z12.x;
import k2b.u1;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class k extends a	// class@000b11
{
    public long e;
    public HashMap f;
    public final MutableLiveData g;
    public boolean h;
    public final a i;
    public y j;
    public final Animator$AnimatorListener k;
    public final Observer l;
    public final b m;
    public static final Type n;

    static {
       k.n = new k$a().getType();
    }
    public void k(a0 p0,View p1,MutableLiveData p2,a p3){
       super(p0, p1);
       this.j = new y();
       this.k = new k$b(this);
       w ow = new w(this);
       this.l = ow;
       x ox = new x(this);
       this.m = ox;
       this.g = p2;
       this.i = p3;
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
       }else {
          a[] uoaArray = new a[]{AudienceBizRelation.ALIPAY_RECHARGE_ACTIVITY};
          this.d.Y0.u5(ox, uoaArray);
          p2.observeForever(ow);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.ALIPAY_RECHARGE_ACTIVITY};
       this.d.Y0.G5(this.m, uoaArray);
       this.g.removeObserver(this.l);
       this.e();
       return;
    }
    public final ClientContent$ContentPackage c(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, k.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = this.d.b().a();
       return obj;
    }
    public final ClientEvent$ElementPackage d(){
       ClientEvent$ElementPackage obj = PatchProxy.apply(null, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "LIVE_GIFT_FIRST_CHANGE_EFFECT_BUTTON";
       return obj;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "9")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       this.b.setVisibility(0);
       this.a.setBackground(objArray);
       this.c.setVisibility(8);
       this.c.f();
       this.c.clearAnimation();
       this.c.v(this.k);
       return;
    }
    public final void f(){
       boolean b;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "4")) {
          return;
       }
       if (this.g.getValue() != Boolean.TRUE) {
          return;
       }
       if (!this.d.Y0.r2(AudienceBizRelation.ALIPAY_RECHARGE_ACTIVITY)) {
          return;
       }
       if (!this.j.isValid()) {
          return;
       }
       SharedPreferences a = a.a;
       String str = "user";
       if (!DateUtils.I(a.getLong(b.d(str)+"live_audience_last_gift_recharge_anim_time", 0), System.currentTimeMillis())) {
          a.q(new HashMap());
       }
       HashMap obj = PatchProxy.apply(objArray, this, ok, "7");
       ClientEvent$ElementPackage uElementPack = null;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = a.h(k.n);
          if (obj != null) {
             String liveStreamId1 = this.d.Z2.getLiveStreamId();
             if (!obj.containsKey(liveStreamId1) || obj.get(liveStreamId1).intValue() < 1) {
                b = false;
             }
          }
          b = true;
       }
       if (b) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, ok, "5")){
          this.h = true;
          this.c.a(this.k);
          this.c.setVisibility(uElementPack);
          this.c.setProgress(0);
          this.c.clearAnimation();
          c.b(this.c, this.j, new k$c(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "11")) {
          u1.C0("", x.k(this.d.Z2), 9, this.d(), this.c());
       }
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putLong(b.d(str)+"live_audience_last_gift_recharge_anim_time", System.currentTimeMillis());
       g.a(uEditor);
       if (!PatchProxy.applyVoid(objArray, this, ok, "8")) {
          HashMap hashMap = a.h(k.n);
          if (hashMap != null) {
             String liveStreamId = this.d.Z2.getLiveStreamId();
             if (!hashMap.containsKey(liveStreamId)) {
                hashMap.put(liveStreamId, Integer.valueOf(1));
             }else {
                hashMap.put(liveStreamId, Integer.valueOf((hashMap.get(liveStreamId).intValue() + 1)));
             }
             a.q(hashMap);
          }
       }
       return;
    }
}
