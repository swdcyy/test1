package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationAutoPlaySwitch;
import mf5.w0;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationAutoPlaySwitch$a;
import nsd.u;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationAutoPlaySwitch$1;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;
import uw9.c;
import android.content.SharedPreferences;
import java.lang.System;
import java.lang.CharSequence;
import e17.i;
import kf5.g;
import lnc.a1;
import i3a.b;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz9.i;

public final class OperationAutoPlaySwitch extends w0	// class@001473
{
    public final QPhoto C;
    public final BaseFragment D;
    public final m0 E;
    public final SlidePageConfig F;
    public static final OperationAutoPlaySwitch$a G;

    static {
       OperationAutoPlaySwitch.G = new OperationAutoPlaySwitch$a(null);
    }
    public void OperationAutoPlaySwitch(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("auto_play_setting");
       this.E = p0;
       this.F = p1;
       this.C = p0.c.mPhoto;
       this.D = p0.b;
       this.T(R.string.arg_RES_7f10483d);
       this.L(R.drawable.arg_RES_7f080aed);
       this.R(true);
       this.Q(OperationAutoPlaySwitch$1.INSTANCE);
       this.K(this.W());
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, OperationAutoPlaySwitch.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (f.g() || f.m(this.E.c))? true: false;
       return b;
    }
    public final boolean W(){
       Object obj = PatchProxy.apply(null, this, OperationAutoPlaySwitch.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.E()) {
          return b;
       }
       long longx = c.a.getLong("autoPlayRedDotFirstShowTime", -1);
       if (!longx - -1) {
          c.z(System.currentTimeMillis());
          return true;
       }else if(!longx - Long.MAX_VALUE){
          return b;
       }else if((System.currentTimeMillis() - longx) - 0x4d3f6400 < 0){
          b = true;
       }
       return b;
    }
    public final void X(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationAutoPlaySwitch.class, "7")) {
          return;
       }
       i.g(R.style.arg_RES_7f11066a, p0, true, true);
       return;
    }
    public final String Y(boolean p0){
       String str = (p0)? "OPEN": "CLOSE";
       return str;
    }
    public void d(w0 p0,g p1){
       boolean b;
       String str;
       OperationAutoPlaySwitch operationAut = OperationAutoPlaySwitch.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, operationAut, "3")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       c.z(Long.MAX_VALUE);
       a uoa = this.t();
       if (uoa != null) {
          Boolean uBoolean = uoa.invoke();
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          label_0031 :
             if (!b) {
                str = a1.p(R.string.arg_RES_7f10483f);
                a.o(str, "CommonUtil.string\(R.string.slide_auto_play_on\)");
                this.X(str);
             }else {
                str = a1.p(R.string.arg_RES_7f10483e);
                a.o(str, "CommonUtil.string\(R.string.slide_auto_play_off\)");
                this.X(str);
             }
             b.l((b ^ 0x01));
             int i = b ^ 0x01;
             if (!PatchProxy.isSupport(operationAut) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), this, operationAut, "5")) {
                i3 oi3 = i3.f();
                oi3.d("btn_type", this.Y(i));
                oi3.a("is_redpoint", Boolean.valueOf(this.W()));
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "AUTO_CONTINUOU_PLAY_FUNCTION";
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = w1.f(this.C.mEntity);
                u1.M("", this.D, 1, uElementPack, uContentPack, null);
             }
             OperationAutoPlaySwitch tC = this.C;
             a.o(tC, "mPhoto");
             RxBus.f.b(new i((b ^ 0x01), tC));
             p1.a();
             return;
          }
       }
       b = false;
       goto label_0031 ;
    }
    public void onShow(){
       OperationAutoPlaySwitch operationAut = OperationAutoPlaySwitch.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, operationAut, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, operationAut, "6")) {
          i3 oi3 = i3.f();
          oi3.d("btn_type", this.Y(b.f()));
          oi3.a("is_redpoint", Boolean.valueOf(this.W()));
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AUTO_CONTINUOU_PLAY_FUNCTION";
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.C.mEntity);
          u1.D0("", this.D, 3, uElementPack, uContentPack, null);
       }
       return;
    }
}
