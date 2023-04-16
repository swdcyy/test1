package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch;
import mf5.w0;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$a;
import nsd.u;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$mToastContent$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$mTitleText$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$1;
import java.lang.Boolean;
import le5.f;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.model.SubscribeAuthorConfig;
import java.lang.reflect.Type;
import uw9.c;
import android.content.SharedPreferences;
import java.lang.System;
import kf5.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.Objects;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import k2b.e0;
import k2b.f0;
import k2b.u1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;
import wkd.b;
import psb.c;
import brd.t;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$b;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public final class OperationSubscribeSwitch extends w0	// class@001493
{
    public final QPhoto C;
    public final BaseFragment D;
    public final p E;
    public final p F;
    public final m0 G;
    public final SlidePageConfig H;
    public static final OperationSubscribeSwitch$a I;

    static {
       OperationSubscribeSwitch.I = new OperationSubscribeSwitch$a(null);
    }
    public void OperationSubscribeSwitch(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("subscribe_setting");
       this.G = p0;
       this.H = p1;
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
       this.C = mPhoto;
       this.D = p0.b;
       this.E = s.c(OperationSubscribeSwitch$mToastContent$2.INSTANCE);
       p op = s.c(OperationSubscribeSwitch$mTitleText$2.INSTANCE);
       this.F = op;
       mPhoto = PatchProxy.apply(null, this, OperationSubscribeSwitch.class, "2");
       if (mPhoto != PatchProxyResult.class) {
       }else {
          mPhoto = op.getValue();
       }
       a.o(mPhoto, "mTitleText");
       this.U(mPhoto);
       this.L(R.drawable.arg_RES_7f080b1d);
       this.R(true);
       this.Q(new OperationSubscribeSwitch$1(this));
       this.K(this.W());
       return;
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, OperationSubscribeSwitch.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (f.t() && (this.C.getUser() != null && (this.C.getUser().isFollowingOrFollowRequesting() && (c.t(SubscribeAuthorConfig.class) != null && !this.C.isMine()))))? true: false;
       return b;
    }
    public final boolean W(){
       Object obj = PatchProxy.apply(null, this, OperationSubscribeSwitch.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.E()) {
          return b;
       }
       long longx = c.a.getLong("subscribeAuthorRedDotFirstShowTime", -1);
       if (!longx - -1) {
          c.O(System.currentTimeMillis());
          return true;
       }else if(!longx - Long.MAX_VALUE){
          return b;
       }else if((System.currentTimeMillis() - longx) - 0x4d3f6400 < 0){
          b = true;
       }
       return b;
    }
    public void d(w0 p0,g p1){
       boolean b;
       OperationSubscribeSwitch operationSub = OperationSubscribeSwitch.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, operationSub, "7")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       if (!PatchProxy.applyVoid(null, this, operationSub, "8")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          operationSub = this.C;
          Objects.requireNonNull(operationSub);
          if (operationSub.mEntity != null) {
             uContentPack.photoPackage = w1.f(this.C.mEntity);
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "UPDATE_NOTICE_BTN";
          i3 oi3 = i3.f();
          a uoa1 = this.t();
          String str = "TRUE";
          String str1 = (uoa1 != null && uoa1.invoke().booleanValue() == true)? str: "FALSE";
          oi3.d("btn_type", str1);
          oi3.d("button_pos", "ON_LONG_PRESS_POPUP");
          uoa1 = this.t();
          str1 = (uoa1 == null || uoa1.invoke().booleanValue() != true)? str: "FALSE";
          oi3.d("click_type", str1);
          if (!this.W()) {
             str = "FALSE";
          }
          oi3.d("redpoint_type", str);
          uElementPack.params = oi3.e();
          u1.B(new ClickMetaData().setLogPage(f0.a(this.D, this.G.a)).setContentPackage(uContentPack).setElementPackage(uElementPack).setType(1));
       }
       c.O(Long.MAX_VALUE);
       p1.a();
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (!p0.C(uoc.a())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          return;
       }else {
          a uoa = this.t();
          if (uoa != null) {
             Boolean uBoolean = uoa.invoke();
             if (uBoolean != null) {
                b = uBoolean.booleanValue();
             label_00f7 :
                b.a(0x1e7ef171).l(this.C.getUserId(), (b ^ 0x01)).subscribe(new OperationSubscribeSwitch$b(this, b), OperationSubscribeSwitch$c.b);
                return;
             }
          }
          b = 0;
          goto label_00f7 ;
       }
    }
    public void onShow(){
       OperationSubscribeSwitch operationSub = OperationSubscribeSwitch.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, operationSub, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, operationSub, "6")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          OperationSubscribeSwitch tC = this.C;
          Objects.requireNonNull(tC);
          if (tC.mEntity != null) {
             uContentPack.photoPackage = w1.f(this.C.mEntity);
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "UPDATE_NOTICE_BTN";
          i3 oi3 = i3.f();
          a uoa = this.t();
          String str = "TRUE";
          String str1 = (uoa != null && uoa.invoke().booleanValue() == true)? str: "FALSE";
          oi3.d("btn_type", str1);
          oi3.d("button_pos", "ON_LONG_PRESS_POPUP");
          if (!this.W()) {
             str = "FALSE";
          }
          oi3.d("redpoint_type", str);
          uElementPack.params = oi3.e();
          u1.B0(new ShowMetaData().setLogPage(f0.a(this.D, this.G.a)).setContentPackage(uContentPack).setElementPackage(uElementPack).setType(3));
       }
       return;
    }
}
