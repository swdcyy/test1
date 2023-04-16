package com.kwai.yoda.function.tool.LaunchAppFunction;
import ay7.a;
import com.kwai.yoda.function.tool.LaunchAppFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import org.json.JSONObject;
import android.net.Uri;
import android.content.Intent;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import com.kwai.yoda.function.tool.LaunchAppFunction$LaunchAppResultParams;
import com.kwai.yoda.bridge.YodaException;
import java.lang.Exception;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.a;
import nsd.r0;
import java.util.Arrays;

public final class LaunchAppFunction extends a	// class@00121d
{
    public static final LaunchAppFunction$a d;

    static {
       LaunchAppFunction.d = new LaunchAppFunction$a(null);
    }
    public void LaunchAppFunction(){
       super();
    }
    public String c(){
       return "launchApp";
    }
    public String d(){
       return "tool";
    }
    public boolean g(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       Intent intent;
       LaunchAppFunction$LaunchAppResultParams launchAppRes;
       Context uContext;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LaunchAppFunction.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       YodaException yodaExceptio = null;
       JSONObject jSONObject = (p1 == null || !p1.length())? 1: null;
       String str = "The Input is invalid: root params should be object.";
       if (!jSONObject) {
          try{
             jSONObject = new JSONObject(p1);
             p1 = jSONObject.optString("scheme");
             String str1 = jSONObject.optString("identifier");
             str = (p1 == null || !p1.length())? 1: 0;
             if (!str) {
                try{
                   intent = new Intent("android.intent.action.VIEW", Uri.parse(p1));
                   intent.addFlags(0x10000000);
                   Azeroth2.B.d().startActivity(intent);
                   launchAppRes = new LaunchAppFunction$LaunchAppResultParams();
                   launchAppRes.mResult = 1;
                   launchAppRes.setMLaunched(1);
                   return launchAppRes;
                }catch(java.lang.Exception e6){
                   throw new YodaException(v4, e6.getMessage());
                }
             }else if(str1 == null || !str1.length()){
                uContext = 1;
             }else {
                uContext = null;
             }
             if (!uContext) {
                Azeroth2 b = Azeroth2.B;
                intent = b.d().getPackageManager().getLaunchIntentForPackage(str1);
                if (intent != null) {
                   try{
                      a.h(intent, "Azeroth2.appContext.pack¡­tLaunchIntentForPackage\"\)");
                      b.d().startActivity(intent);
                      launchAppRes = new LaunchAppFunction$LaunchAppResultParams();
                      launchAppRes.mResult = 1;
                      launchAppRes.setMLaunched(1);
                      return launchAppRes;
                   }catch(java.lang.Exception e6){
                      throw new YodaException(v4, e6.getMessage());
                   }
                }else {
                   throw new YodaException(0x1e84b, "can not getLaunchIntentForPackage");
                }
             }else {
                Object[] objArray = new Object[]{"identifier or scheme"};
                String str2 = String.format("The Input is invalid: [%s].", Arrays.copyOf(objArray, 1));
                a.h(str2, "java.lang.String.format\(format, *args\)");
                throw new YodaException(0x1e84f, str2);
             }
          }catch(org.json.JSONException e0){
             throw new YodaException(0x1e84f, "identifier");
          }
       }else {
          throw new YodaException(0x1e84f, str);
       }
    }
}
