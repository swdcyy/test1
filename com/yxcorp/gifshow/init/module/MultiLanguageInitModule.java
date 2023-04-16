package com.yxcorp.gifshow.init.module.MultiLanguageInitModule;
import android.content.ComponentCallbacks2;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import oe6.e;
import qe6.d;
import o56.d;
import o56.a;
import android.content.ComponentCallbacks;
import o56.e;
import java.util.Locale;
import lnc.f4;
import l06.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.init.module.MultiLanguageInitModule$1;
import me7.b;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang;
import android.app.Application;
import android.content.Context;
import me7.d;
import org.json.JSONObject;
import k2b.u1;
import org.json.JSONException;
import android.content.res.Configuration;
import android.os.Build$VERSION;
import android.os.LocaleList;

public class MultiLanguageInitModule extends a implements ComponentCallbacks2	// class@00198f
{

    public void MultiLanguageInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, MultiLanguageInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(MultiLanguageInitModule.class, "4");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MultiLanguageInitModule.class, "2")) {
          return;
       }
       PatchProxy.onMethodExit(MultiLanguageInitModule.class, "2");
       return;
    }
    public final void l0(){
       if (PatchProxy.applyVoidWithListener(null, this, MultiLanguageInitModule.class, "6")) {
          return;
       }
       if (e.S()) {
          PatchProxy.onMethodExit(MultiLanguageInitModule.class, "6");
          return;
       }else {
          d.h(0, 0);
          PatchProxy.onMethodExit(MultiLanguageInitModule.class, "6");
          return;
       }
    }
    public void n(){
       DynamicMultiLang d;
       int b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, MultiLanguageInitModule.class, "3")) {
          return;
       }
       if (!d.i) {
          PatchProxy.onMethodExit(MultiLanguageInitModule.class, "3");
          return;
       }else {
          a.C.registerComponentCallbacks(this);
          Locale locale = f4.a();
          Locale locale1 = d.d(locale);
          Object[] objArray1 = new Object[0];
          b.C().s("MultiLanguageInitModule", "onApplicationCreate: systemLanguage-"+locale+" kwaiLanguage-"+locale1, objArray1);
          if (!PatchProxy.applyVoidWithListener(objArray, this, MultiLanguageInitModule.class, "1")) {
             b.a = new MultiLanguageInitModule$1(this);
             d = DynamicMultiLang.d;
             if (!d.d() && d.a()) {
                b = d.b(a.b(), a.m, d.c());
                try{
                   JSONObject jSONObject = new JSONObject();
                   String str = "multiLangLaunchWithLocalPackage";
                   b = (b)? 1: 0;
                   String str1 = jSONObject.put(str, b).toString();
                   Object[] objArray2 = new Object[0];
                   b.C().t("MultiLanguageInitModule", "installDynamicLanguageResource"+str1, objArray2);
                   u1.Q("multi_lang_launch_count", str1);
                }catch(org.json.JSONException e1){
                   e1.printStackTrace();
                }
             }else {
                Object[] objArray3 = new Object[0];
                b.C().t("MultiLanguageInitModule", "current language is simple chinese, or dynamic multilang not enabled", objArray3);
             }
          }
          if (d.g(locale)) {
             objArray = new Object[0];
             b.C().s("MultiLanguageInitModule", "needChangeAppLanguage", objArray);
             f4.c(a.B.getApplicationContext(), locale1);
          }else {
             this.l0();
          }
          f4.d(a.b(), locale1);
          PatchProxy.onMethodExit(MultiLanguageInitModule.class, "3");
          return;
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MultiLanguageInitModule.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().s("MultiLanguageInitModule", "onConfigurationChanged", objArray);
       if (Build$VERSION.SDK_INT >= 24) {
          f4.b(p0.getLocales().get(0));
       }else {
          f4.b(p0.locale);
       }
       this.l0();
       Locale locale = d.d(f4.a());
       f4.d(a.B, locale);
       f4.c(a.B.getApplicationContext(), locale);
       PatchProxy.onMethodExit(MultiLanguageInitModule.class, "5");
       return;
    }
    public void onLowMemory(){
    }
    public void onTrimMemory(int p0){
    }
}
