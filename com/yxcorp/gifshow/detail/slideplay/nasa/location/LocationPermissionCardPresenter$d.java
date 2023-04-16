package com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$d;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kuaishou.android.model.feed.LocationPermissionFeed;
import com.kuaishou.android.model.mix.LocationPermissionMeta;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.framework.location.k;
import android.widget.TextView;

public class LocationPermissionCardPresenter$d extends a	// class@00174d
{
    public final LocationPermissionCardPresenter b;

    public void LocationPermissionCardPresenter$d(LocationPermissionCardPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       this.b.A = false;
    }
    public void i2(){
       boolean b1;
       LocationPermissionCardPresenter locationPerm = LocationPermissionCardPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, LocationPermissionCardPresenter$d.class, "1")) {
          return;
       }
       LocationPermissionCardPresenter$d tb = this.b;
       boolean b = true;
       tb.A = b;
       Objects.requireNonNull(tb);
       String str = "10";
       if (!PatchProxy.applyVoidWithListener(objArray, tb, locationPerm, str)) {
          String str1 = "12";
          if (!PatchProxy.applyVoidWithListener(objArray, tb, locationPerm, str1)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LOCAL_PERMISSION_POPUP";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.p.mPhoto.mEntity);
             u1.D0(null, null, 3, uElementPack, uContentPack, null);
             PatchProxy.onMethodExit(locationPerm, str1);
          }
          str1 = "11";
          SharedPreferences$Editor obj = PatchProxy.applyWithListener(objArray, tb, locationPerm, str1);
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else {
             b1 = a.t().d("enableMultipleShowLocationCard", false);
             PatchProxy.onMethodExit(locationPerm, str1);
          }
          if (!b1) {
             obj = e.a.edit();
             obj.putBoolean("location_permission_card_shown", b);
             g.a(obj);
          }
          PatchProxy.onMethodExit(locationPerm, str);
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(objArray, tb, locationPerm, "7")) {
          LocationPermissionFeed mLocationPer = tb.D.mLocationPermissionMeta;
          if (mLocationPer.mHasSetTitle == null) {
             mLocationPer.mIsTextSystemPermissible = k.e(a.b());
             tb.D.mLocationPermissionMeta.mHasSetTitle = b;
          }
          if (tb.D.mLocationPermissionMeta.mIsTextSystemPermissible != null) {
             tb.s.setText(R.string.arg_RES_7f104a8d);
             tb.t.setText(R.string.arg_RES_7f100ede);
          }else {
             tb.s.setText(R.string.arg_RES_7f104a8c);
             tb.t.setText(R.string.arg_RES_7f100edd);
          }
          PatchProxy.onMethodExit(locationPerm, "7");
       }
       LocationPermissionCardPresenter$d tb1 = this.b;
       tb1.R8(tb1.P8());
       PatchProxy.onMethodExit(LocationPermissionCardPresenter$d.class, "1");
       return;
    }
}
