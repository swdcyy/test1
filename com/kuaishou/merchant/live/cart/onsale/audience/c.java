package com.kuaishou.merchant.live.cart.onsale.audience.c;
import y8c.g;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import k34.r;
import a9c.e;
import java.util.ArrayList;
import java.util.HashMap;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import a44.d;
import g9c.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import im8.c;
import com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent$a;
import java.util.List;
import r34.c;
import java.util.Collection;
import s34.a;
import java.lang.Number;
import java.util.Map;
import android.view.ViewGroup;
import android.os.SystemClock;
import java.util.Objects;
import p34.a;
import com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import v34.b;
import java.util.Set;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import java.util.Iterator;
import k34.q;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;
import androidx.recyclerview.widget.RecyclerView;

public class c extends g	// class@00192c
{
    public long w;
    public a x;
    public final List y;
    public final Map z;

    public void c(a p0){
       super(new r());
       this.y = new ArrayList();
       this.z = new HashMap();
       this.r1(p0);
    }
    public void c(a p0,boolean p1){
       super();
       this.y = new ArrayList();
       this.z = new HashMap();
       this.r1(p0);
    }
    public ArrayList a1(int p0,f p1){
       ArrayList obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(this.x);
       d uod = this.x.b();
       BaseCartComponent$a obj1 = this.N0(p0);
       if (obj1 instanceof ComponentInfo) {
          obj.add(new c("LIVE_CART_COMPONENT_INFO", obj1));
          if (obj1.getData() != null) {
             obj.add(obj1.getData());
          }
          if (p1 instanceof BaseCartComponent$a) {
             obj1 = p1.f;
             obj.addAll(obj1.a());
             if (obj1 instanceof a) {
                uod.a = obj1.l();
             }
          }
       }
    label_0065 :
       obj.add(new c("LIVE_CART_CONFIG", uod));
       return obj;
    }
    public int f0(int p0){
       String obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Object obj1 = this.N0(p0);
       if (obj1 instanceof ComponentInfo) {
          obj = obj1.getName();
          int i = this.y.indexOf(obj);
          if (i < 0) {
             this.y.add(obj);
             i = this.y.size() - 1;
             this.z.put(Integer.valueOf((i + 0x186a0)), obj1);
          }
          return (i + 0x186a0);
       }else {
          return -1;
       }
    }
    public f h1(ViewGroup p0,int p1){
       a obj;
       View obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, c.class, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.w - null <= 0) {
          this.w = SystemClock.elapsedRealtime();
       }
       if (p1 >= 0x186a0) {
          ComponentInfo uComponentIn = this.z.get(Integer.valueOf(p1));
          if (uComponentIn != null) {
             obj = this.x.q;
             Objects.requireNonNull(obj);
             BaseCartComponent uBaseCartCom = PatchProxy.applyTwoRefs(p0, uComponentIn, obj, a.class, str);
             if (uBaseCartCom != patchProxyRe) {
             }else if(!uComponentIn.getViewType()){
                uBaseCartCom = obj.b(uComponentIn.getName());
             }else if(!TextUtils.x(uComponentIn.getRenderUrl())){
                uBaseCartCom = new b();
                if (!TextUtils.x(uComponentIn.getDowngradeName()) && !uBaseCartCom.h(p0, uComponentIn)) {
                   BaseCartComponent uBaseCartCom1 = obj.b(uComponentIn.getDowngradeName());
                   if (uBaseCartCom1 != null) {
                      uBaseCartCom1.c = true;
                      obj.a.add(uComponentIn.getName());
                      uBaseCartCom = uBaseCartCom1;
                   }
                }
             }else {
                uBaseCartCom = null;
             }
             if (uBaseCartCom != null) {
                BaseCartComponent$a uoa = PatchProxy.applyTwoRefs(p0, uComponentIn, uBaseCartCom, BaseCartComponent.class, "12");
                if (uoa != patchProxyRe) {
                }else {
                   uBaseCartCom.a = p0;
                   uBaseCartCom.b = uComponentIn;
                   uoa = new BaseCartComponent$a(uBaseCartCom);
                   if (!uBaseCartCom.h(p0, uComponentIn)) {
                      uoa.setIsRecyclable(false);
                   }
                }
                if (uBaseCartCom.c != null) {
                   MerchantCartLogBiz lIVE_AUDIENC = MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE;
                   String str1 = "LiveAudienceGoodAdapter";
                   a.t(lIVE_AUDIENC, str1, "onCreatePresenterHolder, downgrade component", "name", uComponentIn.getName());
                   uoa.setIsRecyclable(false);
                   if (!PatchProxy.applyVoid(null, this, c.class, "4")) {
                      a.s(lIVE_AUDIENC, str1, "downgradeComponentData");
                      Iterator iterator = this.Q0().iterator();
                      while (iterator.hasNext()) {
                         obj1 = iterator.next();
                         if (obj1 instanceof ComponentInfo) {
                            this.x.q.a(obj1);
                         }
                      }
                      k1.p(new q(this), this);
                   }
                }
                return uoa;
             }
          }
       }
       obj1 = new View(p0.getContext());
       obj1.setLayoutParams(new ViewGroup$LayoutParams(-1, false));
       return new f(obj1, new PresenterV2());
    }
    public final void r1(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.x = p0;
       this.n1("ADAPTER", this);
       this.y.clear();
       this.z.clear();
       return;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       super.z0(p0);
       k1.n(this);
       return;
    }
}
