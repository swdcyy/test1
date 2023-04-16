package eb2.d;
import k51.c;
import eb2.d$a;
import eb2.d$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import f12.d;
import f12.c;
import androidx.viewpager.widget.ViewPager$i;
import eb2.b;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;
import tq5.c;
import cb2.w;
import android.view.View;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pm8.a;
import android.content.SharedPreferences;
import lnc.a1;
import android.content.SharedPreferences$Editor;
import oe6.g;
import eb2.c;
import java.lang.Runnable;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import com.kuaishou.live.core.basic.activity.x;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import p91.m;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;

public class d extends c	// class@0026da
{
    public w p;
    public LiveSlidePlayService q;
    public m r;
    public boolean s;
    public c t;
    public x u;
    public LiveBizParam v;
    public LivePlayFragment w;
    public d x;
    public final c y;
    public final ViewPager$i z;
    public static String sLivePresenterClassName = "LiveWatchGuidePresenter";

    public void d(){
       super();
       this.y = new d$a(this);
       this.z = new d$b(this);
    }
    public void E8(){
       boolean b;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       d uod1 = c.b(activity);
       this.x = uod1;
       uod1.i(this.z);
       this.t.Ci(new b(this), AudienceQuitLiveCheckOrder.LIVE_SLIDE_GUIDE);
       this.p = new w(this.m8());
       this.q.P4(this.y);
       Object obj = PatchProxy.apply(objArray, this, uod, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!a.a.getBoolean("liveWatchFullscreenGuideDisabled", false) && this.P8()){
          b = true;
       }else {
          b = false;
       }
       if (b && !PatchProxy.applyVoid(objArray, this, uod, "6")) {
          uod = this.p;
          if (uod != null) {
             uod.e(a1.p(R.string.arg_RES_7f102f4f), 5000);
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("liveWatchFullscreenGuideDisabled", true);
             g.a(uEditor);
             LivePlayLogger.logWithDelay(new c(this));
          }
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          return;
       }
       this.p = objArray;
       this.q.d5(this.y);
       this.x.g(this.z);
       this.s = false;
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.u.a()) {
          return false;
       }
       if (n.n(this.getContext()) > 0) {
          return false;
       }
       if (this.v.mHasShownLiveSlideGuide != null) {
          return false;
       }
       if (this.x.f() <= 1) {
          return false;
       }
       if (this.s != null) {
          return false;
       }
       return true;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.r = this.t8("LIVE_BASIC_CONTEXT");
       this.t = this.r8("LIVE_QUIT_LIVE_SERVICE");
       this.u = this.r8("LIVE_FRAGMENT_SERVICE");
       this.w = this.t8("LIVE_FRAGMENT");
       this.v = this.q8(LiveBizParam.class);
       return;
    }
}
