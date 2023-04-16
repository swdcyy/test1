package com.kwai.roampanel.panel.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import z1.a;
import im7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.kwai.roampanel.panel.b;
import ik0.a;
import android.os.Bundle;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import tw5.d;
import java.io.Serializable;
import lrb.a;
import com.yxcorp.gifshow.nearby.model.FestivalIcon;
import java.lang.reflect.Type;
import fm7.b;
import com.kwai.roampanel.krn.bridge.RecentCitiesParams;
import java.util.List;
import com.kwai.roampanel.utils.RecentDataHelper;
import uw5.b;
import com.kwai.roampanel.model.RoamCityResponse;
import nm7.a;
import com.kwai.framework.location.k;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import mm7.i;
import android.content.DialogInterface$OnKeyListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import hm7.a;
import brd.t;
import t45.d;
import brd.z;
import mm7.j;
import erd.g;
import crd.b;
import mrd.a;
import uw5.c;

public class c extends PresenterV2	// class@0013db
{
    public final Fragment p;
    public final c q;
    public final a r;
    public d s;
    public c t;
    public a u;
    public b v;
    public final a w;

    public void c(Fragment p0,c p1,a p2){
       super();
       this.w = new a();
       this.p = p0;
       this.q = p1;
       this.r = p2;
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          KwaiRnFragment kwaiRnFragme = new KwaiRnFragment();
          kwaiRnFragme.setCloseHandler(new b(this));
          Bundle uBundle = new Bundle();
          LaunchModel$b uob = new LaunchModel$b();
          uob.i("KwaiNearbyRoamPanel");
          uob.j("RoamPanelHome");
          boolean b = false;
          uob.f("enableBackBtnHandler", b);
          c ts = this.s;
          CityInfo uCityInfo = (ts != null)? ts.d(): objArray;
          if (uCityInfo != null) {
             uob.d("currentSelectedCity", uCityInfo);
          }
          uCityInfo = a.h();
          if (uCityInfo != null) {
             uob.d("currentLocationCity", uCityInfo);
          }
          uob.f("enableShowHometown", b);
          FestivalIcon uFestivalIco = b.a(FestivalIcon.class);
          if (uFestivalIco != null) {
             uob.d("festivalIcon", uFestivalIco);
          }
          uob.d("recentCities", new RecentCitiesParams(RecentDataHelper.b()));
          uob.f("showMapIcon", this.v.b);
          RoamCityResponse roamCityResp = a.c();
          if (roamCityResp != null) {
             uob.d("roamCityData", roamCityResp);
          }
          if (k.c("default") && a.b()) {
             b = true;
          }
          uob.f("haveLocationPermission", b);
          uob.f("enableKrnDataRequest", true);
          uob.e("containerSource", "RoamPanelKrnPresenter");
          uBundle.putParcelable("rn_launch_model", uob.h());
          kwaiRnFragme.setArguments(uBundle);
          e uoe = this.q.beginTransaction();
          uoe.v(R.id.roampanel_krn_container, kwaiRnFragme);
          uoe.m();
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          uoc = this.p;
          if (uoc instanceof DialogFragment) {
             Dialog dialog = uoc.getDialog();
             if (dialog != null) {
                dialog.setOnKeyListener(new i(this));
             }
          }
       }
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new j(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.u = this.r8("nearby_roam_panel_action_behavior");
       this.s = this.t8("local_current_city");
       this.v = this.r8("nearby_roam_panel_ROAM_PANEL_CONFIG");
       this.t = this.r8("nearby_roam_panel_ROAM_PANEL_CREATE_BUILDER");
       return;
    }
}
