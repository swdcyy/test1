package com.kuaishou.live.core.show.liveslidesquare.search.d;
import k51.c;
import java.lang.String;
import lnc.a1;
import mb2.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import android.widget.LinearLayout;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import mb2.e;
import qy5.b;
import mb2.f;
import oy5.b;
import com.kuaishou.live.core.show.liveslidesquare.search.b;
import oy5.c;
import com.kwai.feature.component.entry.view.SearchBarEntryView;
import mb2.g;
import mb2.h;
import mb2.i;
import oy5.d;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import kp3.e;
import va1.i0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import mb2.c;
import erd.g;
import crd.b;
import lnc.b9;
import oy5.i;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import pb2.u;
import java.util.Objects;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import com.google.gson.JsonObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import uy5.b;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarTabContainerFragment;
import androidx.lifecycle.MutableLiveData;

public class d extends c	// class@000c9d
{
    public e p;
    public LiveSquareSideBarTabContainerFragment q;
    public MutableLiveData r;
    public SearchSwitcherEntryView s;
    public String t;
    public b u;
    public boolean v;
    public final Observer w;
    public static String sLivePresenterClassName = "LiveSquareSideBarTopSearchEntranceV2Presenter";
    public static final String x;

    static {
       d.x = a1.p(0x7f102c97);
    }
    public void d(){
       super();
       this.w = new b(this);
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
          b.P(LiveLogTag.LIVE_SQUARE.appendTag("LiveSquareSideBarTopSearchEntranceV2Presenter"), "bindSearchBarLayout");
          SearchSwitcherEntryView searchSwitch = this.getActivity().findViewById(R.id.live_slide_square_side_bar_search_switch_layout);
          this.s = searchSwitch;
          searchSwitch.setVisibility(0);
          this.s.setPlaceHolder(a1.p(R.string.arg_RES_7f102c97));
          b uob = new b();
          uob.g(KwaiRadiusStyles.FULL);
          uob.v(a1.a(R.color.arg_RES_7f060202));
          this.s.setBackground(uob.a());
          this.s.setSearchEntryLayoutConfig(new e(this));
          this.s.setSearchActionCallback(new f(this));
          this.s.setSearchEntryRequestCallback(new b(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
          b.P(LiveLogTag.LIVE_SQUARE.appendTag("LiveSquareSideBarTopSearchEntranceV2Presenter"), "bindSearchBarLayout");
          SearchBarEntryView searchBarEnt = this.getActivity().findViewById(R.id.live_slide_square_side_bar_search_right_button);
          searchBarEnt.setVisibility(0);
          searchBarEnt.a(new g(this));
          searchBarEnt.setSearchActionCallback(new h(this));
          searchBarEnt.setSearchInterceptCallback(new i(this));
       }
       this.r.observeForever(this.w);
       this.p = i0.c(this.getActivity());
       this.X7(this.q.m().subscribe(new c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.r.removeObserver(this.w);
       b9.a(this.u);
       this.v = false;
       d ts = this.s;
       if (ts != null) {
          ts.e();
       }
       return;
    }
    public i P8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ClientContent$ContentPackage obj = PatchProxy.apply(objArray, this, d.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       u ou = u.c(this.getActivity());
       Objects.requireNonNull(ou);
       Object[] objArray1 = PatchProxy.apply(objArray, ou, u.class, "13");
       if (objArray1 != patchProxyRe) {
       }else if(ou.a()){
          objArray = ou.i;
       }
       objArray1 = objArray;
       if (objArray1 != null) {
          obj.photoPackage = w1.f(objArray1);
          obj.liveStreamPackage = x.e(objArray1, 0);
       }
       i oi = new i();
       JsonObject jsonObject = new JsonObject();
       if (!TextUtils.equals(a1.p(0x7f102c97), this.s.getCurrentWordShowMsg())) {
          if (TextUtils.isEmpty(this.s.getCurrentWordShowMsg())) {
             b.c("LiveSquareSideBarTopSearchEntranceV2Presenter", "searchGuideLayout current word : "+this.s.getCurrentWordShowMsg());
          }
          jsonObject.c0("query_name", this.s.getCurrentWordShowMsg());
       }
       oi.c = jsonObject;
       oi.b = this.q;
       oi.e = obj;
       return oi;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       d ts = this.s;
       if (ts != null) {
          ts.e();
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       d ts = this.s;
       if (ts != null && ts.l == null) {
          ts.k(0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.r8("LIVE_SQUARE_SIDE_BAR_OPEN_STATUS_LIVE_DATA");
       return;
    }
}
