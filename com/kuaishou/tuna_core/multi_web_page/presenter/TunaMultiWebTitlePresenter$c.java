package com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter$c;
import android.view.View$OnClickListener;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo$TabInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo$ButtonInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import java.util.Map;
import agc.a;
import com.kuaishou.tuna_core.multi_web_page.logger.TunaMultiWebLoggerHelper;
import g05.b;
import com.kuaishou.tuna_core.multi_web_page.logger.TunaMultiWebLoggerHelper$logRuleButtonClick$1;
import msd.l;
import g05.b$a;

public final class TunaMultiWebTitlePresenter$c implements View$OnClickListener	// class@0010f8
{
    public final TunaMultiWebTitlePresenter b;
    public final TunaMultiWebConfigInfo$TabInfo c;

    public void TunaMultiWebTitlePresenter$c(TunaMultiWebTitlePresenter p0,TunaMultiWebConfigInfo$TabInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       boolean b;
       TunaMultiWebTitlePresenter tunaMultiWeb = TunaMultiWebTitlePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaMultiWebTitlePresenter$c.class, "1")) {
          return;
       }
       TunaMultiWebTitlePresenter$c tb = this.b;
       TunaMultiWebConfigInfo$TabInfo buttonInfo = this.c.buttonInfo;
       String str = "tabInfo.buttonInfo";
       a.o(buttonInfo, str);
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(buttonInfo, tb, tunaMultiWeb, "7")) {
          Activity activity = tb.getActivity();
          if (activity != null) {
             a.o(activity, "activity");
             int i = 1;
             if (!(activity.isFinishing() ^ i)) {
                activity = null;
             }
             if (activity != null) {
                TunaMultiWebConfigInfo$ButtonInfo scheme = buttonInfo.scheme;
                if (scheme != null) {
                   String str1 = (scheme.length() > 0)? 1: null;
                   if (!str1) {
                      scheme = null;
                   }
                   if (scheme != null) {
                      Uri obj = PatchProxy.applyOneRefs(scheme, tb, tunaMultiWeb, "8");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                         try{
                            obj = Uri.parse(scheme);
                            a.o(obj, "uri");
                            if (!a.g(obj.getScheme(), "http") && !a.g(obj.getScheme(), "https")) {
                               i = 0;
                            }
                         }catch(java.lang.Exception e0){
                         }
                         b = i;
                      }
                      if (b) {
                         Context context = tb.getContext();
                         a.m(context);
                         c.i(tb.getContext(), KwaiYodaWebViewActivity.G3(context, scheme).a());
                      }else {
                         a.a(activity, scheme, null);
                      }
                   }
                }
             }
          }
       }
    label_00a2 :
       tb = this.b;
       buttonInfo = this.c.buttonInfo;
       a.o(buttonInfo, str);
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(buttonInfo, tb, tunaMultiWeb, "9")) {
          TunaMultiWebLoggerHelper tunaMultiWeb1 = tb.P8();
          if (tunaMultiWeb1 != null && !PatchProxy.applyVoidOneRefs(buttonInfo, tunaMultiWeb1, TunaMultiWebLoggerHelper.class, "3")) {
             b.a.a("RULE_BUTTON", new TunaMultiWebLoggerHelper$logRuleButtonClick$1(tunaMultiWeb1.a()));
          }
       }
       return;
    }
}
