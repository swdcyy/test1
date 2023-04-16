package com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.kuaishou.android.model.feed.LocationPermissionFeed;
import com.kuaishou.android.model.mix.LocationPermissionMeta;
import lnc.a1;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import j6a.b;
import j6a.a;
import q96.d;
import tk7.b;
import o96.u;

public class LocationPermissionCardPresenter$a extends m	// class@00174a
{
    public final LocationPermissionCardPresenter c;

    public void LocationPermissionCardPresenter$a(LocationPermissionCardPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LocationPermissionCardPresenter$a.class, "1")) {
          return;
       }
       LocationPermissionCardPresenter$a tc = this.c;
       Objects.requireNonNull(tc);
       String str = "13";
       Object[] objArray = null;
       if (!PatchProxy.applyVoidWithListener(objArray, tc, LocationPermissionCardPresenter.class, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LOCAL_PERMISSION_POPUP";
          JsonObject jsonObject = new JsonObject();
          String str1 = "button_text";
          if (tc.D.mLocationPermissionMeta.mIsTextSystemPermissible != null) {
             jsonObject.c0(str1, a1.p(R.string.arg_RES_7f100ed6));
          }else {
             jsonObject.c0(str1, a1.p(R.string.arg_RES_7f100ed5));
          }
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tc.p.mPhoto.mEntity);
          u1.M(null, null, 1, uElementPack, uContentPack, null);
          PatchProxy.onMethodExit(LocationPermissionCardPresenter.class, str);
       }
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidWithListener(objArray, tc, LocationPermissionCardPresenter.class, "5")) {
          if (!tc.P8()) {
             LocationPermissionCardPresenter z = tc.z;
             u.p(z, "", "selection_slide_location", z, new b(tc), new a(tc));
          }
          PatchProxy.onMethodExit(LocationPermissionCardPresenter.class, "5");
       }
       PatchProxy.onMethodExit(LocationPermissionCardPresenter$a.class, "1");
       return;
    }
}
