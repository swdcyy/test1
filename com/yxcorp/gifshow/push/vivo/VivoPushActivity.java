package com.yxcorp.gifshow.push.vivo.VivoPushActivity;
import android.app.Activity;
import android.content.Intent;
import java.lang.String;
import kotlin.Result;
import com.google.gson.JsonElement;
import com.google.gson.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import kotlin.Pair;
import qrd.r0;
import com.kwai.android.register.Processor;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import java.lang.NullPointerException;
import p45.f;
import java.lang.Enum;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.push.vivo.VivoPushActivity$onCreate$3;
import msd.a;
import com.kwai.android.common.utils.PushSDKInitUtilKt;
import com.yxcorp.gifshow.push.vivo.VivoPushActivity$onNewIntent$1;

public final class VivoPushActivity extends Activity	// class@00169c
{

    public void VivoPushActivity(){
       super();
    }
    public final void dealWithClick(){
       Intent intent;
       int i = 1;
       try{
          intent = this.getIntent();
          if (intent != null) {
             String stringExtra = intent.getStringExtra("push_content");
             if (stringExtra != null) {
                JsonElement jsonElement = c.d(stringExtra);
                a.o(jsonElement, "element");
                String str = (jsonElement.F())? jsonElement.w(): stringExtra;
                a.o(str, "json");
                Pair[] pairArray1 = new Pair[i];
                pairArray1[0] = r0.a("fromPage", "VivoPushActivity");
                Processor.clickNotification(str, Channel.VIVO, pairArray1);
                Object obj = Result.constructor-impl(l1.a);
                Throwable throwable = Result.exceptionOrNull-impl(obj);
                if (throwable != null) {
                   PushLogger.a().h(stringExtra, throwable, Channel.VIVO);
                }
                Result.box-impl(obj);
             }else {
             label_0062 :
                PushLogger.a().h(null, new NullPointerException("push content is null"), Channel.VIVO);
             }
          }else {
             goto label_0062 ;
          }
       }catch(java.lang.Exception e2){
          Pair[] pairArray = new Pair[i];
          pairArray[0] = r0.a("channel", Channel.VIVO.name());
          PushLogger.c().f("tag_error_intent_data", "intent extra get", e2, pairArray);
       }
       try{
          this.finish();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       Intent intent = this.getIntent();
       intent = (intent != null)? intent.putExtra("kwai_add_stack_list", false): null;
       Object obj = Result.constructor-impl(intent);
       Result.exceptionOrNull-impl(obj);
       super.onCreate(p0);
       PushSDKInitUtilKt.requirePushInit(new VivoPushActivity$onCreate$3(this));
       return;
    }
    public void onNewIntent(Intent p0){
       super.onNewIntent(p0);
       if (p0 != null) {
          this.setIntent(p0);
          PushSDKInitUtilKt.requirePushInit(new VivoPushActivity$onNewIntent$1(this));
       }
       return;
    }
}
