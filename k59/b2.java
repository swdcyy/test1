package k59.b2;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import android.content.Context;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity2;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity;
import mxb.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.System;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.lang.Throwable;
import yx.j0;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;

public class b2 extends KwaiYodaWebViewActivity$c	// class@002ac9
{
    public int j;
    public int k;
    public boolean l;
    public String m;
    public AdDataWrapper$AdLogParamAppender n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final String s;
    public static final boolean t;

    static {
       b2.t = a.t().d("uniAdWebActivity", false);
    }
    public void b2(Context p0,String p1){
       String str;
       AdYodaActivity2 uAdYodaActiv = (b2.t)? AdYodaActivity2.class: AdYodaActivity.class;
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          str = PatchProxy.applyTwoRefs(p1, Integer.valueOf(0), null, ow, "1");
          if (str != PatchProxyResult.class) {
          label_002e :
             super(p0, uAdYodaActiv, str);
             this.j = 0;
             this.k = 0;
             this.s = p1;
             return;
          }
       }
       str = p1.replace("__LANDINGTYPE__", String.valueOf(0));
       goto label_002e ;
    }
    public Intent a(){
       Intent obj = PatchProxy.apply(null, this, b2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.a();
          obj.putExtra("extra_detail_ad_position", this.j);
          obj.putExtra("KEY_EXTRA_WEB_FORM_DETAIL_WEB", this.k);
          obj.putExtra("KEY_EXTRA_DISABLE_LANDING_PAGE_DEEP_LINK", this.l);
          obj.putExtra("KEY_EXTRA_DISPLAY_PLAYABLE_POPUP", this.p);
          obj.putExtra("KEY_EXTRA_SHOULD_ADD_AVATAR_HEAD_INFO", this.q);
          obj.putExtra("KEY_EXTRA_ENABLE_OPEN_LANDING_PAGE", this.r);
          b2 tn = this.n;
          if (tn != null) {
             SerializableHook.putExtra(obj, "KEY_EXTRA_AD_LOG_APPENDER", tn);
          }
          if (!this.o - null) {
             this.o = System.currentTimeMillis();
          }
          obj.putExtra("KEY_EXTRA_AD_CLICK_TIME", this.o);
          if (!TextUtils.x(this.m)) {
             obj.putExtra("KEY_REFER", this.m);
          }
          return obj;
       }catch(java.lang.Exception e0){
          j0.b("AdYodaIntentBuilder", "parse url exception. url: "+this.s, e0);
          throw e0;
       }
    }
    public b2 l(int p0){
       this.j = p0;
       return this;
    }
    public b2 m(AdDataWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.l = p0.getDisableLandingPageDeepLink();
          this.n = p0.getAdLogParamAppender();
       }
       return this;
    }
    public b2 n(boolean p0){
       this.q = p0;
       return this;
    }
}
