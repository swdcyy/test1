package com.kwai.live.gzone.accompanyplay.audience.k0$f;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.audience.k0;
import java.lang.Object;
import o37.a;
import java.lang.Boolean;
import brd.w;
import java.lang.String;
import u07.t;
import android.view.View;
import j37.d;
import j37.c;
import brd.t;
import cjd.e;
import erd.o;
import brd.x;
import k37.l0;
import k37.m0;
import erd.g;
import crd.b;
import fq5.b;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceAccompanyFleetInfo;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.live.gzone.accompanyplay.audience.k0$f$a;
import sfc.a;
import com.kwai.live.gzone.accompanyplay.audience.q;
import com.kwai.live.gzone.accompanyplay.audience.k0$h;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import k37.q1;
import com.kwai.live.gzone.accompanyplay.audience.b1$a;
import com.kwai.live.gzone.accompanyplay.audience.b1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import k37.p0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.live.gzone.accompanyplay.audience.u$b;
import mrd.c;
import java.lang.Long;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAudienceAccompanyState;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading;
import ekd.k1;
import jk1.e;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyPanelStyle;
import k37.a0;
import lnc.i3;
import k37.a0$a;
import java.lang.Enum;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySettingInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyRequirement;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserOrderInfo;
import java.lang.Number;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k37.i0;
import u07.u;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyCreateOrderResponse;
import java.util.List;
import g37.e;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import com.yxcorp.utility.SystemUtil;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.live.gzone.accompanyplay.audience.l0;
import k37.p1;
import com.kwai.live.gzone.accompanyplay.audience.k0$e;
import erd.a;
import k37.n0;
import k37.o0;

public class k0$f implements k0$g	// class@000b8f
{
    public final k0 a;

    public void k0$f(k0 p0){
       this.a = p0;
       super();
    }
    public static w E(k0$f p0,a p1,Boolean p2){
       return p0.H(p1, p2);
    }
    public static void F(k0$f p0,String p1,t p2,View p3){
       p0.G(p1, p2, p3);
    }
    private void G(String p0,t p1,View p2){
       this.a.X7(c.b().l(p0).map(new e()).compose(this.u()).subscribe(new l0(this), new m0(this)));
    }
    private w H(a p0,Boolean p1){
       if (p1.booleanValue()) {
          return c.b().h(this.a.p.getLiveStreamId(), p0.mFleetInfo.mAccompanyId);
       }
       return t.error(new Exception("参数未初始化"));
    }
    public void A(String p0){
       this.a.A = p0;
    }
    public void B(int p0){
       k0$f uof = k0$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "14")) {
          return;
       }
       uof = this.a;
       if (uof.A != null) {
          uof.X7(c.b().i(this.a.A, p0).map(new e()).compose(this.u()).subscribe(new k0$f$a(this), new a()));
       }
       return;
    }
    public k0$h C(q p0){
       k0$f obj = PatchProxy.applyOneRefs(p0, this, k0$f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       obj.E = p0;
       k0 z = obj.z;
       if (z == null || p0 == null) {
          return null;
       }
       Objects.requireNonNull(z);
       if (!PatchProxy.applyVoidOneRefs(p0, z, q1.class, "2")) {
          z.f = p0;
       }
       return new k0$h(this.a);
    }
    public t D(boolean p0){
       a obj;
       k0$f uof = k0$f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uof, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.x.h();
       if (obj != null) {
          if (p0) {
             return this.a.P8(obj.mGameInfo.mGameId).flatMap(new p0(this, obj));
          }else {
             return c.b().h(this.a.p.getLiveStreamId(), obj.mFleetInfo.mAccompanyId);
          }
       }else {
          return t.error(new Exception("参数未初始化"));
       }
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, k0$f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p.a();
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0$f.class, "27")) {
          return;
       }
       this.a.q.b(p0);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, k0$f.class, "25")) {
          return;
       }
       k0 e = this.a.E;
       if (e != null) {
          e.c();
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, k0$f.class, "23")) {
          return;
       }
       k0 e = this.a.E;
       if (e != null) {
          e.d();
       }
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0$f.class, "22")) {
          return;
       }
       k0 e = this.a.E;
       if (e != null) {
          e.e(p0);
       }
       return;
    }
    public c f(){
       Object obj = PatchProxy.apply(null, this, k0$f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.E.f();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, k0$f.class, "17")) {
          return;
       }
       this.a.q.g();
       return;
    }
    public void h(long p0){
       k0$f uof = k0$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "19")) {
          return;
       }
       this.a.X8(p0);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, k0$f.class, "2")) {
          return;
       }
       this.a.R8();
       return;
    }
    public LiveGzoneAudienceAccompanyState j(){
       Object obj = PatchProxy.apply(null, this, k0$f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.z.u();
    }
    public void k(long p0,LiveGzoneAccompanyLoading p1){
       k0$f uof = k0$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uof, "8")) {
          return;
       }
       uof = this.a;
       long l = 0;
       if (p0 - l > 0) {
          l = k1.k(p0);
       }
       uof.W8(l, p1);
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, k0$f.class, "3")) {
          return;
       }
       this.a.t.Vg(-1);
       return;
    }
    public void l(LiveGzoneAccompanyPanelStyle p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, k0$f.class, "24")) {
          return;
       }
       k0$f ta = this.a;
       if (ta.I != p0) {
          a uoa = ta.x.h();
          if (uoa != null) {
             ClientContent$LiveStreamPackage liveStreamPa = this.a.p.a();
             if (!PatchProxy.applyVoidThreeRefs(p0, liveStreamPa, uoa, null, a0.class, "34")) {
                i3 oi3 = a0.a(uoa);
                switch (a0$a.a[p0.ordinal()]){
                    case 2:
                      str = "AUDIENCE_COMPLETE_ORDER_PANEL";
                      break;
                    case 3:
                      str = "BEFORE_ABOARD_PANEL";
                      break;
                    case 4:
                      str = "FLEET_IN_PROCESS_PANEL";
                      break;
                    case 5:
                      str = "PREPARE_ABOARD_PANEL";
                      break;
                    case 6:
                      str = "QUEUE_SUCCESS_PANEL";
                      break;
                    case 7:
                      str = "WAITING_START_PANEL";
                      break;
                    default:
                }
                oi3.d("aboard_require", uoa.mFleetInfo.mSettingInfo.mRequirement.mDisplay);
                a0.k(str, oi3.e(), liveStreamPa, uoa);
             }
          }
          this.a.I = p0;
       }
       return;
    }
    public void m(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k0$f.class, "15")) {
          return;
       }
       a uoa = this.a.x.h();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.C.a();
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, uoa, objArray, a0.class, "16")) {
          i3 oi3 = a0.a(uoa);
          a mUserOrderIn = uoa.mUserOrderInfo;
          LiveGzoneAccompanyUserOrderInfo mOrderStatus = (mUserOrderIn != null)? mUserOrderIn.mOrderStatus: -1;
          oi3.c("order_status", Integer.valueOf(mOrderStatus));
          a0.e("CANCEL_ABOARD", oi3.e(), liveStreamPa, uoa);
       }
       if (uoa != null) {
          uoa = uoa.mUserOrderInfo;
          if (uoa != null) {
             LiveGzoneAccompanyUserOrderInfo mOrderId = uoa.mOrderId;
             if (mOrderId != null) {
                t$a uoa1 = new t$a(this.a.getActivity());
                uoa1.W0(R.string.arg_RES_7f102328);
                uoa1.Q0(R.string.arg_RES_7f102327);
                uoa1.S0(R.string.arg_RES_7f1023c9);
                uoa1.t0(new i0(this, mOrderId));
                t$a uoa2 = f.e(uoa1);
                uoa2.Y(PopupInterface.a);
             }
          }
       }
       return;
    }
    public t n(){
       Object obj = PatchProxy.apply(null, this, k0$f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.x.hide();
    }
    public void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0$f.class, "13")) {
          return;
       }
       UserInfo userInfo = new UserInfo();
       userInfo.mId = p0;
       this.a.p.w0(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, 42, false, 137);
       return;
    }
    public String p(){
       return this.a.A;
    }
    public boolean q(){
       boolean b = (this.a.E != null)? true: false;
       return b;
    }
    public void r(LiveGzoneAccompanyCreateOrderResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0$f.class, "20")) {
          return;
       }
       a uoa = this.a.x.h();
       if (uoa != null) {
          uoa.mUserOrderInfo = p0.mUserOrderInfo;
       }
       if (uoa != null && p0.mUserOrderInfo.mOrderStatus == 20) {
          e.d(uoa.mFleetInfo.mOnBoardMembers);
       }
       this.a.S8(uoa);
       return;
    }
    public boolean s(Throwable p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k0$f obj = PatchProxy.applyOneRefs(p0, this, k0$f.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, k0.class, "13");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(p0 instanceof KwaiException){
          if (!obj.q.h(p0.mErrorCode, p0.mErrorMessage)) {
             if (!TextUtils.x(p0.mErrorMessage)) {
                k0 e = obj.E;
                if (e != null) {
                   e.l(p0.mErrorMessage);
                }else {
                   i.d(R.style.arg_RES_7f110668, p0.mErrorMessage);
                }
             }
          }
          b = true;
       }else if(SystemUtil.I()){
          i.d(R.style.arg_RES_7f110668, "服务器错误,请开发排查");
       }else {
          ExceptionHandler.handleException(obj.getContext(), p0);
       }
       b.I(LiveLogTag.GZONE, "handleException", p0);
       b = false;
       return b;
    }
    public a t(){
       Object obj = PatchProxy.apply(null, this, k0$f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.x.h();
    }
    public x u(){
       Object obj = PatchProxy.apply(null, this, k0$f.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l0(this);
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, k0$f.class, "1")) {
          return;
       }
       this.a.Y8();
       return;
    }
    public p1 w(){
       return this.a.J;
    }
    public void x(k0$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0$f.class, "18")) {
          return;
       }
       this.a.H.add(p0);
       return;
    }
    public void y(long p0,LiveGzoneAccompanyLoading p1){
       k0$f uof = k0$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uof, "9")) {
          return;
       }
       this.a.W8(p0, p1);
       return;
    }
    public void z(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k0$f.class, "26")) {
          return;
       }
       this.a.X7(c.b().m(this.a.p.getLiveStreamId(), p0).compose(this.u()).doOnComplete(p1).map(new e()).subscribe(new n0(this), new o0(this)));
       return;
    }
}
