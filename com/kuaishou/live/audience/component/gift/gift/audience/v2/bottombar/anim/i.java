package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import uw1.m;
import android.view.View;
import t02.a0;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.o;
import java.lang.Object;
import gz0.d;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qm1.d;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import m91.b;
import h47.b;
import j47.d;
import crd.b;
import lnc.b9;
import java.util.Objects;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k;
import gz0.a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import mk1.d0;
import jk1.f;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnDismissListener;
import jk1.c;
import hf3.a;
import p91.m;
import lf3.g;
import e93.f;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.d;
import lnc.c3$a;
import lnc.c3;

public class i	// class@000b0c
{
    public final m a;
    public final View b;
    public final a0 c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final o f;
    public LiveAudienceBottomBarGiftAnimationManger g;
    public k h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public b m;
    public d n;
    public b o;
    public final b p;
    public final d0 q;
    public final c r;

    public void i(m p0,View p1,a0 p2,MutableLiveData p3,MutableLiveData p4,o p5){
       super();
       this.k = false;
       this.l = false;
       this.p = new d(this);
       this.q = new i$a(this);
       this.r = new i$b(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public boolean a(){
       boolean b = (this.i == null && (this.k == null && (this.l == null && this.j == null)))? true: false;
       return b;
    }
    public void b(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "4")) {
          return;
       }
       if (p0) {
          i tn = this.n;
          if (tn != null) {
             tn.e();
          }
       }
       Object[] objArray = null;
       i oi1 = 1;
       if (!PatchProxy.applyVoid(objArray, this, oi, "6")) {
          a[] uoaArray1 = new a[oi1];
          uoaArray1[0] = AudienceBizRelation.BOTTOM_BAR_SHOP;
          this.c.Y0.G5(this.p, uoaArray1);
       }
       a0 t1 = this.c.t1;
       if (t1 != null) {
          i tm = this.m;
          if (tm != null) {
             t1.H8(tm);
          }
       }
       this.k = false;
       this.l = false;
       this.i = false;
       b9.a(this.o);
       oi = this.n;
       if (oi != null) {
          oi.h();
          this.n = objArray;
       }
       oi = this.h;
       if (oi != null) {
          Objects.requireNonNull(oi);
          if (!PatchProxy.applyVoid(objArray, oi, k.class, "2")) {
             a[] uoaArray = new a[oi1];
             uoaArray[0] = AudienceBizRelation.ALIPAY_RECHARGE_ACTIVITY;
             oi.d.Y0.G5(oi.m, uoaArray);
             oi.g.removeObserver(oi.l);
             oi.e();
          }
          this.h = objArray;
       }
       this.j = false;
       this.c.x1.G9(this.q);
       oi = this.g;
       if (oi != null) {
          Objects.requireNonNull(oi);
          if (!PatchProxy.applyVoid(objArray, oi, LiveAudienceBottomBarGiftAnimationManger.class, "15")) {
             LiveAudienceBottomBarGiftAnimationManger u = oi.u;
             if (u != null) {
                u.g(oi.v);
                oi.u.m5(oi.w);
             }
             oi.d.x1.ii(oi.A);
             oi.d.Z2.u().o(510, oi.x);
             b9.a(oi.k);
             oi.k = objArray;
             oi.d();
             oi.i();
             f.g(oi);
             oi.n = false;
             oi.j = false;
             oi.o = false;
             oi.p = false;
             oi.q = false;
          }
          this.g = objArray;
       }
       c3.c(this.f, d.a);
       return;
    }
}
