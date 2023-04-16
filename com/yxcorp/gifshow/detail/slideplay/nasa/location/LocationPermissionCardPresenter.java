package com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$2;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$b;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$c;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LocationPermissionFeed;
import tl8.d;
import android.widget.TextView;
import android.widget.ImageView;
import q96.d;
import o96.u;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$a;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.LocationPermissionMeta;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class LocationPermissionCardPresenter extends PresenterV2	// class@00174e
{
    public boolean A;
    public boolean B;
    public View$OnClickListener C;
    public LocationPermissionFeed D;
    public final LifecycleObserver E;
    public final d F;
    public final b$a G;
    public final a H;
    public PhotoDetailParam p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public ImageView w;
    public Button x;
    public View y;
    public String z;

    public void LocationPermissionCardPresenter(){
       super();
       this.E = new LocationPermissionCardPresenter$2(this);
       this.F = new LocationPermissionCardPresenter$b(this);
       this.G = new LocationPermissionCardPresenter$c(this);
       this.H = new LocationPermissionCardPresenter$d(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, LocationPermissionCardPresenter.class, "3")) {
          return;
       }
       this.q.getLifecycle().addObserver(this.E);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.r = slidePlayVie;
       slidePlayVie.P(this.q, this.H);
       this.D = this.p.mPhoto.getEntity().a(LocationPermissionFeed.class);
       String str = "8";
       if (!PatchProxy.applyVoidWithListener(objArray, this, LocationPermissionCardPresenter.class, str)) {
          this.u.setText(R.string.arg_RES_7f100eda);
          this.v.setText(R.string.arg_RES_7f100ed7);
          this.w.setImageResource(R.drawable.arg_RES_7f080a50);
          PatchProxy.onMethodExit(LocationPermissionCardPresenter.class, str);
       }
       this.z = "app_selection";
       this.R8(this.P8());
       u.i(this.F, this.z);
       this.x.setOnClickListener(new LocationPermissionCardPresenter$a(this));
       PatchProxy.onMethodExit(LocationPermissionCardPresenter.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, LocationPermissionCardPresenter.class, "6")) {
          return;
       }
       LocationPermissionCardPresenter tr = this.r;
       if (tr != null) {
          tr.D(this.q, this.H);
       }
       this.q.getLifecycle().removeObserver(this.E);
       PatchProxy.onMethodExit(LocationPermissionCardPresenter.class, "6");
       return;
    }
    public boolean P8(){
       LocationPermissionCardPresenter locationPerm = LocationPermissionCardPresenter.class;
       Object obj = PatchProxy.applyWithListener(null, this, locationPerm, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(locationPerm, "4");
       return u.a("app_selection", "app_selection", "");
    }
    public void R8(boolean p0){
       if (PatchProxy.isSupport2(LocationPermissionCardPresenter.class, "9") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, LocationPermissionCardPresenter.class, "9")) {
          return;
       }
       if (p0) {
          this.x.setBackgroundResource(R.drawable.arg_RES_7f0819ce);
          this.x.setText(R.string.arg_RES_7f100ed4);
          this.x.setEnabled(false);
       }else {
          this.x.setBackgroundResource(R.drawable.arg_RES_7f0819cd);
          if (this.D.mLocationPermissionMeta.mIsTextSystemPermissible != null) {
             this.x.setText(R.string.arg_RES_7f100ed6);
          }else {
             this.x.setText(R.string.arg_RES_7f100ed5);
          }
          this.x.setEnabled(true);
       }
       this.B = p0;
       PatchProxy.onMethodExit(LocationPermissionCardPresenter.class, "9");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LocationPermissionCardPresenter.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3f5c);
       this.t = m1.f(p0, 0x7f0a3f6f);
       this.u = m1.f(p0, 0x7f0a0670);
       this.v = m1.f(p0, 0x7f0a066f);
       this.w = m1.f(p0, 0x7f0a0669);
       this.x = m1.f(p0, 0x7f0a0663);
       this.y = m1.f(p0, 0x7f0a2952);
       PatchProxy.onMethodExit(LocationPermissionCardPresenter.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, LocationPermissionCardPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(PhotoDetailParam.class);
       this.q = this.q8(BaseFragment.class);
       PatchProxy.onMethodExit(LocationPermissionCardPresenter.class, "1");
       return;
    }
}
