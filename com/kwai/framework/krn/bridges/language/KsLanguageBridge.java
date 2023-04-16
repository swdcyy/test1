package com.kwai.framework.krn.bridges.language.KsLanguageBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import org.greenrobot.eventbus.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import android.content.Context;
import lnc.a1;
import java.lang.Throwable;
import ek0.d;
import ls6.a;
import com.facebook.react.bridge.ReactContext;
import com.kuaishou.krn.NativeToJsKt;
import com.facebook.react.bridge.BaseJavaModule;

public class KsLanguageBridge extends KrnBridge	// class@0015b6
{

    public void KsLanguageBridge(ReactApplicationContext p0){
       super(p0);
       a.d().p(this);
    }
    public String getLanguage(){
       Object obj = PatchProxy.apply(null, this, KsLanguageBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.e()) {
          return "en";
       }
       if (a.f()) {
          return "zh-Hans";
       }
       return "zh-Hant";
    }
    public String getLocalizedString(String p0){
       try{
          ReactApplicationContext reactApplica = this.getReactApplicationContext();
          if (!TextUtils.x(p0) && reactApplica != null) {
          label_000f :
             return a1.p(reactApplica.getResources().getIdentifier(p0, "string", reactApplica.getPackageName()));
          }
       }catch(java.lang.Exception e5){
          d.c("根据key获取本地文案异常", e5);
       }
       return "";
    }
    public String getName(){
       return "KSLanguage";
    }
    public void languageChanged(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsLanguageBridge.class, "1")) {
          return;
       }
       NativeToJsKt.e(this.getReactApplicationContext(), "KSLanguageChanged", this.getLanguage());
       return;
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, KsLanguageBridge.class, "3")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       a.d().t(this);
       return;
    }
}
