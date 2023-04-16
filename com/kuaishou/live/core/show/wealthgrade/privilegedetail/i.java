package com.kuaishou.live.core.show.wealthgrade.privilegedetail.i;
import im8.g;
import k51.c;
import qm2.p;
import qm2.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm2.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import hm2.k;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.wealthgrade.LiveWealthGradWebViewFragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import qm2.s;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import uxc.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import qm2.r;
import uxc.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.View;
import android.widget.TextView;
import qm2.n;
import android.view.View$OnClickListener;
import qm2.o;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.k;
import java.util.Map;
import java.util.HashMap;

public class i extends c implements g	// class@001273
{
    public String p;
    public int q;
    public a r;
    public Observer s;
    public i$a t;
    public static String sLivePresenterClassName = "LiveWealthGradeDetailUpgradePresenter";

    public void i(){
       super();
       this.s = new p(this);
       this.t = new q(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i tr = this.r;
       tr.b.observe(tr.d, this.s);
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, i.class, str)) {
          return;
       }
       a c = this.r.c;
       if (c != null) {
          i tq = this.q;
          ClientContent$LiveStreamPackage liveStreamPa = c.Z2.a();
          k ok = k.class;
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tq), liveStreamPa, objArray, ok, str)) {
             k.e(tq, liveStreamPa, "UP_LEVEL_ENTRANCE", 1);
          }
       }
       GifshowActivity activity = this.getActivity();
       if (activity != null && !TextUtils.x(this.p)) {
          LiveWealthGradWebViewFragment liveWealthGr = new LiveWealthGradWebViewFragment();
          liveWealthGr.setArguments(KwaiYodaWebViewActivity.G3(activity, this.p).k(activity.getUrl()).d("KEY_ACTIONBAR_BACKGROUND_COLOR", R.color.arg_RES_7f061d74).e("KEY_THEME", "5").a().getExtras());
          liveWealthGr.kh(new s(liveWealthGr));
          liveWealthGr.gh(new r(liveWealthGr));
          c = this.r.d;
          if (c != null && c.getParentFragment() != null) {
             e uoe = this.r.d.getParentFragment().getChildFragmentManager().beginTransaction();
             uoe.z(R.anim.arg_RES_7f010054, 0x7f010055, R.anim.arg_RES_7f010053, 0x7f010056);
             uoe.j(objArray);
             uoe.f(R.id.live_bottom_dialog_container_root, liveWealthGr);
             uoe.m();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       p0.findViewById(R.id.live_wealth_grade_detail_upgrade_text).setOnClickListener(new n(this));
       p0.findViewById(R.id.live_wealth_grade_detail_upgrade_skip_icon).setOnClickListener(new o(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new k());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.r = this.q8(a.class);
       return;
    }
}
