package com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$mTencentLocationListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.location.k;
import android.view.View;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import org.greenrobot.eventbus.a;
import yz6.f;
import yz6.i;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$b;
import yz6.f$c;
import brd.t;
import g6b.c;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import u5b.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import q87.c;
import f07.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import k6b.g;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import rvb.k;
import rvb.k$a;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import rvb.b;
import rvb.n;
import b6b.r;
import rvb.f;
import rvb.c;
import wkd.b;
import x5b.a;
import j6b.q0;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import j6b.r0;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$d;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$e;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$a;
import q96.d;
import lrb.a;
import java.lang.Float;
import tkd.b;
import tkd.d;
import g07.a;
import yz6.g$a;
import yz6.g;
import yz6.h;
import com.kwai.framework.location.model.LocationCityInfo;
import k3d.a;
import com.yxcorp.gifshow.map.PhotoSource;
import yz6.k$a;
import yz6.k;
import xl8.b;
import java.lang.Boolean;
import b6b.q;
import android.widget.Button;
import com.yxcorp.gifshow.util.w0;
import g6b.a;
import g6b.e;
import m56.g;
import com.yxcorp.gifshow.map.map.utils.MapUtils;

public final class MyLocationPresenter extends PresenterV2	// class@001cc5
{
    public a A;
    public i p;
    public f q;
    public Button r;
    public c s;
    public b t;
    public b u;
    public b v;
    public boolean w;
    public e x;
    public boolean y;
    public final p z;

    public void MyLocationPresenter(){
       super();
       this.w = true;
       this.z = s.c(new MyLocationPresenter$mTencentLocationListener$2(this));
    }
    public void E8(){
       MyLocationPresenter ts;
       MyLocationPresenter myLocationPr = MyLocationPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, myLocationPr, "4")) {
          return;
       }
       int i = 0;
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, myLocationPr, "8")) {
          if (k.d("default")) {
             View[] viewArray = new View[b];
             MyLocationPresenter tr = this.r;
             if (tr == null) {
                a.S("mMyLocationView");
             }
             viewArray[i] = tr;
             n.Z(i, viewArray);
          }else {
             int i2 = 8;
             View[] viewArray1 = new View[b];
             MyLocationPresenter tr1 = this.r;
             if (tr1 == null) {
                a.S("mMyLocationView");
             }
             viewArray1[i] = tr1;
             n.Z(i2, viewArray1);
          }
       }
       a.d().p(this);
       MyLocationPresenter tp = this.p;
       f map = (tp != null)? tp.getMap(): objArray;
       this.q = map;
       if (map != null) {
          map.E(b);
       }
       tp = this.q;
       if (tp != null) {
          tp.x(new MyLocationPresenter$b(this));
       }
       tp = this.s;
       if (tp != null) {
          t ot = tp.a();
          if (ot != null) {
             b uob = ot.subscribe(new MyLocationPresenter$c(this), Functions.e);
             if (uob != null) {
                this.X7(uob);
             }
          }
       }
       tp = this.s;
       if (tp != null) {
          c f = tp.f;
          if (f != null) {
             Object[] objArray1 = new Object[i];
             a.c.w("MyLocationPresenter", "¡¾MapCenterChange¡¿initMapCenter = "+f.toString()+" , IsLocation = "+f.mIsLocation+" , mIsRequestIpLocation = "+f.mIsRequestIpLocation, objArray1);
             MapCenterInfo mCurrentCent = f.mCurrentCenterLatLng;
             b b1 = mCurrentCent.b;
             int i1 = 0;
             if (mCurrentCent.a - i1 && b1 - i1) {
                ts = this.s;
                if (ts != null) {
                   ts.c(f, "ENTER");
                }
             }else {
                f.mCurrentCenterLatLng = new b(0x404145fd7a13c255, 0x405b3bdf0d413123);
                String str = (TextUtils.x(f.mDefaultTitle))? a1.p(R.string.arg_RES_7f103c33): f.mDefaultTitle;
                f.mDefaultTitle = str;
                f.mMapZoomLevel = 5.00f;
                ts = this.s;
                if (ts != null) {
                   ts.c(f, "ENTER");
                }
             }
             this.P8();
             if (f.mIsRequestIpLocation != null) {
                if (!PatchProxy.applyVoid(objArray, objArray, g.class, "9") && LocalConfigKeyHelper.b()) {
                   n.f(k.f, objArray, objArray, 6, objArray).f(r.d);
                }
                if (!PatchProxy.applyVoid(objArray, this, myLocationPr, "11")) {
                   this.X7(b.a(0x42d90323).getLocation().doOnNext(q0.b).subscribeOn(d.c).map(new e()).observeOn(d.a).subscribe(new r0(this), Functions.e));
                }
             }
          }
       }
       myLocationPr = this.r;
       if (myLocationPr == null) {
          a.S("mMyLocationView");
       }
       m1.a(myLocationPr, new MyLocationPresenter$d(this), R.id.btn_mylocation);
       myLocationPr = this.s;
       if (myLocationPr != null) {
          t ot1 = PatchProxy.apply(objArray, myLocationPr, c.class, "3");
          if (ot1 != PatchProxyResult.class) {
          }else {
             ot1 = myLocationPr.x.hide();
          }
          if (ot1 != null) {
             b uob1 = ot1.subscribe(new MyLocationPresenter$e(this), Functions.e);
             if (uob1 != null) {
                this.X7(uob1);
             }
          }
       }
    label_01a5 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MyLocationPresenter.class, "10")) {
          return;
       }
       a.d().t(this);
       return;
    }
    public final void P8(){
       MyLocationPresenter myLocationPr = MyLocationPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, myLocationPr, "5")) {
          return;
       }
       if (k.d("default")) {
          MyLocationPresenter$a uoa = PatchProxy.apply(objArray, this, myLocationPr, "1");
          if (uoa == PatchProxyResult.class) {
             uoa = this.z.getValue();
          }
          a.l(false, "KSLocalPhotoMap", "KSLocalPhotoMap", uoa);
       }
       return;
    }
    public final void R8(b p0,float p1){
       MyLocationPresenter myLocationPr = MyLocationPresenter.class;
       if (PatchProxy.isSupport(myLocationPr) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, myLocationPr, "6")) {
          return;
       }
       g og = d.a(-115370941).Gr().a(p0.a, p0.b).d(p1).build();
       a.o(og, "PluginManager.get\(KMapPl¡­om\(zoom\)\n        .build\(\)");
       h oh = d.a(-115370941).S30(og);
       a.o(oh, "PluginManager.get\(KMapPl¡­.newMapStatus\(mMapStatus\)");
       MyLocationPresenter tq = this.q;
       if (tq != null) {
          tq.y(oh);
       }
       return;
    }
    public final void S8(LocationCityInfo p0){
       MapCenterInfo obj;
       String str;
       MyLocationPresenter myLocationPr = MyLocationPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, myLocationPr, "13")) {
          return;
       }
       MyLocationPresenter ts = this.s;
       if (ts != null) {
          c f = ts.f;
          if (f != null) {
             b uob = a.a(new b(p0.mLatitude, p0.mLongitude));
             if (uob != null) {
                f.mIsLocationWhenAuthorized = false;
                f.mCurrentCenterLatLng = uob;
                f.mSource = PhotoSource.FROM_LOCATION;
                p0 = p0.mAccuracy;
                if (!PatchProxy.isSupport(myLocationPr) || !PatchProxy.applyVoidTwoRefs(uob, Float.valueOf(p0), this, myLocationPr, "7")) {
                   k ok = d.a(-115370941).fD().c(p0).b(100.00f).a(uob.a).e(uob.b).build();
                   myLocationPr = this.q;
                   if (myLocationPr != null) {
                      myLocationPr.F(ok);
                   }
                }
                MyLocationPresenter ts1 = this.s;
                if (ts1 != null) {
                   c f1 = ts1.f;
                   if (f1 != null) {
                      if (f1.mIsLocation == null) {
                         myLocationPr = this.v;
                         if (myLocationPr == null) {
                            a.S("mMapLocationButtonClick");
                         }
                         obj = myLocationPr.a();
                         a.o(obj, "mMapLocationButtonClick.value");
                         if (!obj.booleanValue()) {
                         label_00b2 :
                            ts1 = this.u;
                            if (ts1 == null) {
                               a.S("mMapLocationUpdate");
                            }
                            ts1.d(uob);
                            View[] viewArray = new View[1];
                            myLocationPr = this.r;
                            if (myLocationPr == null) {
                               a.S("mMyLocationView");
                            }
                            viewArray[0] = myLocationPr;
                            n.Z(false, viewArray);
                         }
                      }
                      obj = (f1.mIsLocation != null && !TextUtils.x(f.mDefaultTitle))? f.mDefaultTitle: "";
                      f.mDefaultTitle = obj;
                      this.R8(uob, q.d.b());
                      f1.mIsLocation = false;
                      goto label_00b2 ;
                   }else {
                      goto label_00b2 ;
                   }
                }else {
                   goto label_00b2 ;
                }
             }
             Object[] objArray = new Object[false];
             a.c.w("MyLocationPresenter", "¡¾local onSuccess¡¿ MapCenterInfo ="+f, objArray);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyLocationPresenter.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.btn_mylocation);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.btn_mylocation\)");
       this.r = p0;
       if (p0 == null) {
          a.S("mMyLocationView");
       }
       w0.a(p0, 0x3f000000);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyLocationPresenter.class, "2")) {
          return;
       }
       this.A = this.r8("PHOTO_MAP_MAP_FEED_DATA_MANAGER");
       this.t = this.r8("PHOTO_MAP_DATA_REFRESH");
       c uoc = this.r8("PHOTO_MAP_MAP_PAGE_STATE");
       this.s = uoc;
       this.p = uoc.a;
       this.x = this.r8("PHOTO_MAP_MY_ROLE_ANIMATION_MANAGER");
       Object obj = this.r8("PHOTO_MAP_MAP_LOCATION_UPDATE");
       a.o(obj, "inject\(PhotoMapAccessId.MAP_LOCATION_UPDATE\)");
       this.u = obj;
       obj = this.r8("PHOTO_MAP_MAP_LOCATION_BUTTON_CLICK");
       a.o(obj, "inject\(PhotoMapAccessId.MAP_LOCATION_BUTTON_CLICK\)");
       this.v = obj;
       return;
    }
    public final void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyLocationPresenter.class, "9")) {
          return;
       }
       if (MapUtils.a.b()) {
          View[] viewArray = new View[1];
          MyLocationPresenter tr = this.r;
          if (tr == null) {
             a.S("mMyLocationView");
          }
          viewArray[0] = tr;
          n.Z(0, viewArray);
       }
       return;
    }
}
