package com.kwai.live.gzone.accompanyplay.audience.v0;
import f37.b0;
import k37.g1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyEntranceHide;
import com.kwai.live.gzone.accompanyplay.audience.v0$a;
import lf3.g;
import hf3.a;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.audience.v0$b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k37.j1;
import com.kwai.live.gzone.accompanyplay.audience.k0$e;
import mq5.h;
import mq5.b;
import java.lang.Integer;
import android.app.Activity;
import lnc.a1;
import u07.t$a;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.live.gzone.accompanyplay.audience.v0$c;
import k37.h1;
import u07.u;
import z1.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserOrderInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fq5.b;

public class v0 extends b0	// class@000bc0
{
    public e q;
    public e r;
    public String s;
    public b t;
    public a u;
    public b v;
    public k0$g w;
    public h x;
    public boolean y;

    public void v0(){
       super();
       this.x = new g1(this);
       this.y = false;
    }
    public void E8(){
       boolean b = PatchProxy.applyVoid(null, this, v0.class, "2");
       if (b) {
          return;
       }
       v0 tu = this.u;
       tu.u0(741, SCGzoneAccompanyEntranceHide.class, new v0$a(this));
       b uob = this.w.n().subscribe(new v0$b(this));
       this.X7(uob);
       tu = this.w;
       tu.x(new j1(this));
       tu = this.v;
       tu.Km(this.x);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       boolean b = PatchProxy.applyVoid(objArray, this, v0.class, "11");
       if (b) {
          return;
       }
       super.J8();
       this.q = objArray;
       this.r = objArray;
       this.y = false;
       v0 tv = this.v;
       tv.le(this.x);
       return;
    }
    public boolean S8(int p0){
       if (p0 != 1 && (p0 != 2 && (p0 != 3 && (p0 != 4 && (p0 != 5 && p0 != 7))))) {
          return false;
       }
       return 1;
    }
    public final void V8(int p0){
       v0 ov0 = v0.class;
       if (PatchProxy.isSupport(ov0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov0, "8")) {
          return;
       }
       if (!a1.i(this.getActivity())) {
          return;
       }
       t$a uoa = new t$a(this.getActivity());
       uoa.W0(p0);
       uoa.S0(R.string.arg_RES_7f103a83);
       t$a uoa1 = f.e(uoa);
       this.P8(uoa1.Y(PopupInterface.a));
       return;
    }
    public final void W8(int p0){
       v0 ov0 = v0.class;
       if (PatchProxy.isSupport(ov0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov0, "9")) {
          return;
       }
       boolean b = a1.i(this.getActivity());
       if (!b) {
          return;
       }
       if (this.y == null) {
          this.V8(p0);
          return;
       }else {
          t$a uoa = new t$a(this.getActivity());
          uoa.W0(p0);
          uoa.S0(R.string.arg_RES_7f103a83);
          t$a uoa1 = f.e(uoa);
          this.P8(uoa1.Y(new v0$c(this)));
          return;
       }
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "6")) {
          return;
       }
       t$a uoa = new t$a(this.getActivity());
       uoa.W0(R.string.arg_RES_7f102343);
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa = f.e(uoa);
       uoa.u0(new h1(this));
       this.P8(uoa.Y(PopupInterface.a));
       return;
    }
    public void Y8(String p0,int p1){
       v0 ov0 = v0.class;
       if (PatchProxy.isSupport(ov0)) {
          ov0 = PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ov0, "3");
          if (ov0) {
             return;
          }
       }
       ov0 = this.q;
       if (ov0 != null) {
          boolean b = TextUtils.equals(ov0.a, p0);
          if (b) {
             if (this.q.b.intValue() != p1) {
                this.q = new e(p0, Integer.valueOf(p1));
                if (p1 == 10 && (this.r == null && this.w.q())) {
                   this.V8(R.string.arg_RES_7f102330);
                   this.s = p0;
                }
             }
             return;
          }
       }
       this.q = new e(p0, Integer.valueOf(p1));
       return;
    }
    public boolean Z8(LiveGzoneAccompanyUserOrderInfo p0,String p1){
       v0 ov0 = v0.class;
       v0 obj = PatchProxy.applyTwoRefs(p0, p1, this, ov0, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       boolean b = false;
       if (obj == null || !TextUtils.equals(obj.a, p0.mOrderId)) {
          LiveGzoneAccompanyUserOrderInfo mOrderId = p0.mOrderId;
          this.r = new e(mOrderId, Integer.valueOf(p0.mOrderStatus));
          return b;
       }else if(this.r.b.intValue() != p0.mOrderStatus){
          this.r = new e(p0.mOrderId, Integer.valueOf(p0.mOrderStatus));
          if (this.S8(this.r.b.intValue())) {
             p0 = p0.mOrderStatus;
             if (PatchProxy.isSupport(ov0)) {
                ov0 = PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ov0, "5");
                if (!ov0) {
                   switch (p0){
                       case 21:
                         if (this.y != null) {
                            this.W8(R.string.arg_RES_7f102373);
                         }else {
                            this.W8(R.string.arg_RES_7f102376);
                         }
                         break;
                       case 22:
                         if (this.y != null) {
                            this.W8(R.string.arg_RES_7f102374);
                         }else {
                            this.W8(R.string.arg_RES_7f102375);
                         }
                         break;
                       case 23:
                         this.W8(R.string.arg_RES_7f102314);
                         break;
                       case 24:
                         this.X8();
                         this.s = p1;
                         break;
                       default:
                   }
                }
             }else {
                goto label_0068 ;
             }
             return true;
          }
       }
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "1")) {
          return;
       }
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.r8("LIVE_LONG_CONNECTION");
       this.v = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.w = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       return;
    }
}
