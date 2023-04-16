package com.yxcorp.gifshow.ad.AdNonActionbarProcess;
import com.yxcorp.gifshow.ad.AdProcess;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$a;
import nsd.u;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nx8.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import java.lang.Number;
import nx8.g;
import com.yxcorp.gifshow.ad.AdMainProcess;
import java.lang.Boolean;
import mxb.c;
import java.util.Objects;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import v19.c;
import androidx.lifecycle.ViewModel;
import io.reactivex.subjects.PublishSubject;
import v19.g;
import tw.j;
import iz.a;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$d;
import com.yxcorp.gifshow.ad.AdProcess$c;
import nx8.f;
import yx.j0;
import com.kwai.framework.abtest.f;
import lnc.ga;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$tryFlowAwardVideo$1;
import java.lang.Integer;
import msd.a;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$tryFlowAwardVideo$2;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$tryFlowAwardVideo$3;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$tryFlowAwardVideo$4;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$tryFlowAwardVideo$5;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$process$3;
import tkd.b;
import tkd.d;
import nl9.d;
import nx8.c;
import msd.l;
import z1.a;
import lnc.a1;
import u07.t$a;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$b;
import u07.u;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$c;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import mxb.j0;
import mxb.i0;
import mxb.j;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$e;
import erd.g;

public final class AdNonActionbarProcess extends AdProcess	// class@0014dd
{
    public int k;
    public AdDataWrapper$AdLogParamAppender l;
    public boolean m;
    public boolean n;
    public AdMainProcess o;
    public static final AdNonActionbarProcess$a p;

    static {
       AdNonActionbarProcess.p = new AdNonActionbarProcess$a(null);
    }
    public void AdNonActionbarProcess(Activity p0,AdDataWrapper p1){
       a.p(p0, "activity");
       a.p(p1, "adDataWrapper");
       super(p0, p1);
       this.n = true;
       this.p(true);
    }
    public l h(){
       Object[] objArray = null;
       AdNonActionbarProcess obj = PatchProxy.apply(objArray, this, AdNonActionbarProcess.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj != null) {
          objArray = obj.h();
       }
       return objArray;
    }
    public int m(){
       boolean b1;
       Object[] obj2;
       boolean b2;
       ga oga;
       c a;
       boolean b3;
       AdProcessUtils uAdProcessUt = AdProcessUtils.class;
       AdNonActionbarProcess uAdNonAction = AdNonActionbarProcess.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdMainProcess obj = PatchProxy.apply(objArray, this, uAdNonAction, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       this.l();
       obj = g.a.a(this.c(), this.d());
       this.o = obj;
       boolean b = true;
       obj.p(b);
       Activity uActivity = this.c();
       AdDataWrapper uAdDataWrapp = this.d();
       String obj1 = PatchProxy.applyTwoRefs(uActivity, uAdDataWrapp, objArray, uAdProcessUt, "10");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          a.p(uActivity, "activity");
          obj1 = "adDataWrapper";
          a.p(uAdDataWrapp, obj1);
          a = c.a;
          Objects.requireNonNull(a);
          Object obj5 = PatchProxy.applyOneRefs(uAdDataWrapp, a, c.class, "50");
          if (obj5 != patchProxyRe) {
             b3 = obj5.booleanValue();
          }else {
             a.p(uAdDataWrapp, obj1);
             BaseFeed photo2 = uAdDataWrapp.getPhoto();
             b3 = (photo2 != null)? a.e(new QPhoto(photo2)): false;
          }
          if (b3) {
             BaseFeed photo1 = uAdDataWrapp.getPhoto();
             if (photo1 != null) {
                if (!uActivity instanceof FragmentActivity) {
                   uActivity = objArray;
                }
                if (uActivity != null) {
                   ViewModelProviders.of(uActivity).get(c.class).o0().onNext(new QPhoto(photo1));
                }
                b1 = true;
             }
          }
          b1 = false;
       }
       if (b1) {
          return 22;
       }else if(!j.B(this.d().getConversionType())){
          if (c.c(this.d().getPhoto())) {
             if (a.c()) {
                obj.A();
             }else {
                obj.z();
             }
          }else if(c.a(this.d().getPhoto())){
             obj.y();
          }
          obj.q(new AdNonActionbarProcess$d(this));
          return obj.m();
       }else {
          int i = 3;
          if (this.m != null) {
             obj2 = PatchProxy.applyOneRefs(obj, this, uAdNonAction, "5");
             if (obj2 != patchProxyRe) {
                i = obj2.intValue();
             }else if(AdProcessUtils.p(this.c(), this.d(), objArray, 4, objArray)){
                if (obj.u()) {
                   i = 5;
                }else if(obj.s()){
                   i = this.y(this.d());
                }else if(obj.v()){
                   i = 7;
                }else if(f.f(this.c(), this.d())){
                   i = this.y(this.d());
                }else {
                   obj2 = new Object[0];
                   j0.c("AdBaseNonActBarProcess", "download type ad, nothing to do for slide", obj2);
                   i = -2;
                }
             }
             return i;
          }else {
             BaseFeed photo = this.d().getPhoto();
             ga obj3 = PatchProxy.applyOneRefs(photo, objArray, uAdProcessUt, "22");
             if (obj3 != patchProxyRe) {
                b2 = obj3.booleanValue();
             }else if(c.R(photo) && f.a("awardVideoNonActionBarPriorityStore")){
                oga = 0;
             }
             b2 = b;
             oga = 6;
             if (b2) {
                obj3 = PatchProxy.applyOneRefs(obj, this, uAdNonAction, "3");
                if (obj3 != patchProxyRe) {
                }else {
                   obj3 = new ga();
                   obj3.a(new AdNonActionbarProcess$tryFlowAwardVideo$1(this, obj), Integer.valueOf(7));
                   obj3.a(new AdNonActionbarProcess$tryFlowAwardVideo$2(this), Integer.valueOf(this.y(this.d())));
                   obj3.a(new AdNonActionbarProcess$tryFlowAwardVideo$3(obj), Integer.valueOf(5));
                   obj3.a(new AdNonActionbarProcess$tryFlowAwardVideo$4(obj), Integer.valueOf(oga));
                   obj3.a(new AdNonActionbarProcess$tryFlowAwardVideo$5(obj), Integer.valueOf(-2));
                }
                if (obj3.a == null) {
                   obj2 = objArray;
                }
                if (obj3 != null) {
                   if (obj3.a == null) {
                      objArray = new Object[0];
                      j0.l("TryFlow", "try action has not been success", objArray);
                   }
                   objArray = obj3.b;
                }
                if (objArray != null) {
                   return objArray.intValue();
                }
             }else if(AdProcessUtils.p(this.c(), this.d(), objArray, 4, objArray)){
                return i;
             }else if(obj.u()){
                return 5;
             }else if(obj.s()){
                return this.y(this.d());
             }else if(obj.v()){
                return 7;
             }else if(f.f(this.c(), this.d())){
                return this.y(this.d());
             }else if(obj.t()){
                return oga;
             }else if(obj.w()){
                return -2;
             }
             AdNonActionbarProcess$process$3 oprocess$3 = new AdNonActionbarProcess$process$3(this);
             Object obj4 = PatchProxy.applyOneRefs(oprocess$3, this, uAdNonAction, "9");
             b2 = (obj4 != patchProxyRe)? obj4.booleanValue(): d.a(0x4bd38ddd).l30(this.c(), this.d(), new c(oprocess$3));
             if (b2) {
                return -1;
             }else {
                return this.x(obj);
             }
          }
       }
    }
    public final int x(AdMainProcess p0){
       t$a obj = PatchProxy.applyOneRefs(p0, this, AdNonActionbarProcess.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!a1.i(this.c())) {
          return 0;
       }
       obj = new t$a(this.c());
       obj.W0(R.string.arg_RES_7f10076a);
       obj.S0(R.string.arg_RES_7f100a73);
       obj.Q0(R.string.cancel);
       obj.u0(new AdNonActionbarProcess$b(this, p0));
       obj.J(new AdNonActionbarProcess$c(this));
       t ot = f.e(obj).b0();
       ot.X(true);
       ot.Z();
       i0.a().b(this.d().getAdLogWrapper(), 653);
       return 17;
    }
    public final int y(AdDataWrapper p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, AdNonActionbarProcess.class, "6");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       BaseFeed photo = p0.getPhoto();
       Object obj1 = null;
       obj = PatchProxy.applyOneRefs(photo, obj1, c.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(photo != null){
          obj1 = photo.get("AD");
       }
       if (obj1 != null) {
          PhotoAdvertisement mAdData = obj1.mAdData;
          if (mAdData != null) {
             PhotoAdvertisement$AdData mH5ControlIn = mAdData.mH5ControlInfo;
             if (mH5ControlIn != null) {
                b = mH5ControlIn.mIsDownloadLandingPageMould;
             }
          }
       }
       b = null;
       if (b != null) {
          return 16;
       }else {
          return 15;
       }
    }
    public final void z(AdDataWrapper p0,int p1){
       AdNonActionbarProcess uAdNonAction = AdNonActionbarProcess.class;
       if (PatchProxy.isSupport(uAdNonAction) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAdNonAction, "8")) {
          return;
       }
       int i = 3;
       int i1 = 2;
       int i2 = 0;
       if (p1 != 1) {
          if (p1 != i1) {
             if (p1 != i) {
                Object[] objArray = new Object[i2];
                j0.f("AdBaseNonActBarProcess", "confirm download dialog is canceled by cancelType: "+p1, objArray);
                i = 0;
             label_003d :
                if (i2) {
                   i0.a().p(654, p0.getAdLogWrapper()).d(new AdNonActionbarProcess$e(i)).a();
                }
                return;
             }else {
                i = 1;
             }
          }else {
             i = 2;
          }
       }
       i2 = 1;
       goto label_003d ;
    }
}
