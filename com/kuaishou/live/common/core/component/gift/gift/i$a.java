package com.kuaishou.live.common.core.component.gift.gift.i$a;
import ik1.b0;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import bm1.b;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import android.widget.LinearLayout;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import va1.a0;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$k;
import android.widget.RelativeLayout;
import com.kuaishou.live.common.core.component.gift.DrawingGiftDisplayView;
import java.lang.Integer;
import java.util.BitSet;
import lm1.h;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import ik1.p;
import java.lang.Runnable;
import ekd.k1;
import hx1.a;
import hx1.c;
import rl1.i;
import lp3.c;
import lp3.i;
import sl1.a;
import com.kuaishou.live.common.core.component.gift.gift.c;
import com.kuaishou.live.common.core.component.gift.gift.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collections;
import cp1.w;
import ik1.q;
import java.util.Set;

public class i$a implements b0	// class@0012a4
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i$a.class, "7")) {
          return;
       }
       i$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, i.class, "23")) {
          ta.r.setVisibility(0);
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i$a.class, "8")) {
          return;
       }
       i$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, i.class, "22")) {
          ta.r.setVisibility(4);
       }
       return;
    }
    public List c(){
       return this.a.s;
    }
    public int d(boolean p0){
       i obj;
       int i;
       b b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "12");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = this.a.D;
       Objects.requireNonNull(obj);
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), obj, uob, "13");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          label_0049 :
             return i;
          }
       }
       b = obj.b;
       GiftAnimContainerView x = b.x;
       if (p0) {
          b.x = 0;
       }
       i = x;
       goto label_0049 ;
    }
    public boolean e(){
       return this.a.u;
    }
    public int f(boolean p0){
       i obj;
       int i;
       b b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "13");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = this.a.D;
       Objects.requireNonNull(obj);
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), obj, uob, "14");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          label_0049 :
             return i;
          }
       }
       b = obj.b;
       GiftAnimContainerView y = b.y;
       if (p0) {
          b.y = 0;
       }
       i = y;
       goto label_0049 ;
    }
    public void g(){
       b b;
       int i;
       if (PatchProxy.applyVoid(null, this, i$a.class, "5")) {
          return;
       }
       i$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, i.class, "21")) {
          i d = ta.D;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoid(null, d, b.class, "11")) {
             b = d.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(null, b, GiftAnimContainerView.class, "19")) {
                boolean b1 = false;
                i = 0;
                boolean b2 = true;
                while (i < b.getChildCount()) {
                   GiftAnimItemView childAt = b.getChildAt(i);
                   if (!a0.h(childAt.getGiftMessage(), b2)) {
                      b.m(childAt).c();
                      b.v(childAt);
                      childAt.clearAnimation();
                   }
                   i = i + 1;
                }
                GiftAnimContainerView l = b.l;
                if (l != null && (b.o != null && !a0.h(l.getGiftMessage(), b2))) {
                   b.o = b1;
                   GiftAnimContainerView k = b.k;
                   if (k != null) {
                      k.a();
                   }
                   b.l = null;
                }
             }
          }
       }
       return;
    }
    public void h(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.a.z.clear(p0);
       if (!this.a.z.cardinality()) {
          this.a.D.c(false);
       }
       return;
    }
    public void i(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "10")) {
          return;
       }
       i d = this.a.D;
       Objects.requireNonNull(d);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), d, uob, "5")) {
          d.f.set(p0);
       }
       return;
    }
    public void j(boolean p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "9")) {
          return;
       }
       this.a.D.g = p0;
       return;
    }
    public void k(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "17")) {
          return;
       }
       if (!this.a.V8(p0)) {
          return;
       }
       k1.p(new p(this, p0.b()), "LiveGiftFeedBasePresenter");
       this.a.X8(p0, 1, "[LiveGiftFeedBasePresenter][mockSelfSendBroadcastGiftEffect]addEffectTask success");
       return;
    }
    public void l(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       i$a ta = this.a;
       Objects.requireNonNull(ta);
       i oi = i.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, oi, "24")) {
          c.a(p0.b(), ta.J);
          if (p0.b().getClass().equals(GiftMessage.class) && !PatchProxy.applyVoidOneRefs(p0, ta, oi, "25")) {
             if (TextUtils.n(k0.b(ta.F.a(i.class).y6(p0.b().mGiftId), c.a, d.a).or(""), QCurrentUser.me().getId())) {
                p0.b().mIsNaming = true;
             }
             b.c0(LiveLogTag.GIFT, "slot append naming info", "isNaming", Boolean.valueOf(p0.b().mIsNaming));
          }
          ta.a9();
          ta.P8(Collections.singletonList(ta.R8(p0)));
       }
       return;
    }
    public void m(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "14")) {
          return;
       }
       this.a.A.add(p0);
       return;
    }
    public void n(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "16")) {
          return;
       }
       if (!this.a.W8(p0)) {
          return;
       }
       k1.p(new q(this, p0.b()), "LiveGiftFeedBasePresenter");
       this.a.X8(p0, 1, "[LiveGiftFeedBasePresenter][mockSelfSendNormalGiftEffect]addEffectTask success");
       return;
    }
    public void o(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "15")) {
          return;
       }
       this.a.A.remove(p0);
       return;
    }
    public void p(boolean p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoa, oi, "20")) {
          uoa.w = p0;
          i d = uoa.D;
          Objects.requireNonNull(d);
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), d, uob, "9")) {
             d.b.setDisableDrawingGiftSlotAnimation(p0);
          }
       }
       return;
    }
    public boolean q(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.M.add(p0);
    }
    public void r(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.z.set(p0);
       this.a.D.c(true);
       return;
    }
    public void s(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "6")) {
          return;
       }
       i$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, i.class, "26")) {
          c.a(p0.b(), ta.J);
          ta.a9();
          ta.P8(Collections.singletonList(ta.R8(p0)));
       }
       return;
    }
    public void t(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "11")) {
          return;
       }
       i d = this.a.D;
       Objects.requireNonNull(d);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), d, uob, "6")) {
          d.f.clear(p0);
       }
       return;
    }
    public boolean u(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.M.contains(p0);
    }
}
