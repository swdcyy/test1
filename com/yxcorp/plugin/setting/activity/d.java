package com.yxcorp.plugin.setting.activity.d;
import wgc.o;
import com.yxcorp.plugin.setting.activity.LanguageSettingsActivity;
import java.lang.Object;
import xgc.e;
import com.yxcorp.gifshow.model.SelectOption;
import android.view.View;
import java.util.Objects;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang$b;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qe6.d;
import org.greenrobot.eventbus.a;
import eda.i;
import com.kwai.yoda.event.d;
import nyc.b;
import java.util.Locale;
import lnc.f4;
import yz7.e;
import com.kwai.yoda.bridge.YodaBaseWebView;
import o56.a;
import android.content.Context;
import android.app.Application;
import tkd.b;
import tkd.d;
import nu5.b;
import ad5.b;
import ad5.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import b66.k;
import os5.l;
import ls6.a;
import wkd.b;
import com.kwai.user.base.intimate.b;
import crd.b;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import c97.d;
import h97.g;
import com.kwai.chat.kwailink.client.c0;
import java.util.concurrent.ScheduledExecutorService;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.client.k;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Runnable;
import java.lang.CharSequence;
import e17.i;

public final class d implements o	// class@000820
{
    public final LanguageSettingsActivity a;

    public void d(LanguageSettingsActivity p0){
       this.a = p0;
    }
    public final void a(e p0,SelectOption p1,View p2){
       String str1;
       d ta = this.a;
       Objects.requireNonNull(ta);
       DynamicMultiLang d = DynamicMultiLang.d;
       DynamicMultiLang$b uob = d.b();
       if (p1.mValue == true) {
       }else if(d.a()){
          if (uob != null) {
             if (uob.b()) {
                uob.c(null);
             }else {
                uob.a();
             }
          }
       }
       String str = null;
    label_002c :
       if (str) {
          p0.i = true;
          p2.findViewById(R.id.entry_checkout).setSelected(true);
          SelectOption mValue = p1.mValue;
          LanguageSettingsActivity languageSett = LanguageSettingsActivity.class;
          if (!PatchProxy.isSupport(languageSett) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mValue), ta, languageSett, "2")) {
             d.h(mValue, true);
             a.d().k(new i());
             d.f().c(null, "sysLanguageChanged", e.f(new b(d.a(f4.a()))));
             f4.c(a.B.getApplicationContext(), d.d(f4.a()));
             d.a(0x304f5b72).cg(a.B);
             RequestTiming dEFAULT = RequestTiming.DEFAULT;
             d.a(0x630bc993).d1().e(dEFAULT);
             k.a(dEFAULT);
             d.a(-1492894991).N50(dEFAULT);
             d.a(-1492894991).N00(dEFAULT);
             a.d().k(new a());
             b.a(0x40193068).d();
             IMClientAppInfo iMClientAppI = f.e().b();
             iMClientAppI.B(d.a().b().getLanguage());
             c0 uoc0 = f.e().g();
             Objects.requireNonNull(uoc0);
             if (!PatchProxy.applyVoidOneRefs(iMClientAppI, uoc0, c0.class, "66")) {
                b.c().execute(new k(iMClientAppI));
             }
          }
       }else if(p1.mValue == 2){
          str1 = "語言包正在下載，請稍後";
       }else {
          str1 = "Downloading language packs";
       }
       i.d(R.style.arg_RES_7f11066a, str1);
       return;
       str = 1;
       goto label_002c ;
    }
}
