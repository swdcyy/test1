package com.yxcorp.gifshow.map.map.presenter.MapRefreshBtnPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.map.map.presenter.MapRefreshBtnPresenter$mNetworkState$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.map.map.presenter.MapRefreshBtnPresenter$a;
import android.widget.Button;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import ekd.p0;
import com.yxcorp.gifshow.map.map.presenter.MapRefreshBtnPresenter$b;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.autoplay.state.NetworkState;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.w0;
import xl8.b;
import g6b.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class MapRefreshBtnPresenter extends PresenterV2	// class@001ca6
{
    public b p;
    public b q;
    public c r;
    public Button s;
    public BaseFragment t;
    public final p u;
    public final NetworkState$a v;

    public void MapRefreshBtnPresenter(){
       super();
       this.u = s.c(MapRefreshBtnPresenter$mNetworkState$2.INSTANCE);
       this.v = new MapRefreshBtnPresenter$a(this);
    }
    public static final Button P8(MapRefreshBtnPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mRefreshBtn");
       }
       return p0;
    }
    public void E8(){
       MapRefreshBtnPresenter ts;
       if (PatchProxy.applyVoid(null, this, MapRefreshBtnPresenter.class, "4")) {
          return;
       }
       String str = "mRefreshBtn";
       if (!p0.C(this.getContext())) {
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          ts.setVisibility(8);
          return;
       }else {
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          m1.a(ts, new MapRefreshBtnPresenter$b(this), R.id.btn_refresh);
          this.R8().a(this.v);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MapRefreshBtnPresenter.class, "5")) {
          return;
       }
       this.R8().c(this.v);
       return;
    }
    public final NetworkState R8(){
       Object obj = PatchProxy.apply(null, this, MapRefreshBtnPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRefreshBtnPresenter.class, "3")) {
          return;
       }
       p0 = m1.f(p0, R.id.btn_refresh);
       a.o(p0, "ViewBindUtils.bindWidget¡­otView, R.id.btn_refresh\)");
       this.s = p0;
       if (p0 == null) {
          a.S("mRefreshBtn");
       }
       w0.a(p0, 0x3f000000);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MapRefreshBtnPresenter.class, "2")) {
          return;
       }
       this.p = this.r8("PHOTO_MAP_DATA_REFRESH");
       this.r = this.r8("PHOTO_MAP_MAP_PAGE_STATE");
       this.q = this.r8("PHOTO_MAP_MAP_TITLE_UPDATE");
       this.t = this.r8("FRAGMENT");
       return;
    }
}
