package com.yxcorp.gifshow.push.oppo.OppoRouterActivity;
import com.kwai.android.common.bean.ActivityChannelProvider;
import android.app.Activity;
import com.kwai.android.common.bean.Channel;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import com.google.gson.JsonObject;
import android.os.Bundle;
import java.util.Set;
import java.util.Iterator;
import kotlin.Result;
import com.google.gson.JsonElement;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import com.kwai.android.register.Processor;
import qrd.l1;
import qrd.j0;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import com.yxcorp.gifshow.push.oppo.OppoRouterActivity$onCreate$3;
import msd.a;
import com.kwai.android.common.utils.PushSDKInitUtilKt;

public final class OppoRouterActivity extends Activity implements ActivityChannelProvider	// class@001699
{

    public void OppoRouterActivity(){
       super();
    }
    public Channel getChannel(){
       return Channel.OPPO;
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final void jump(Intent p0){
       if (p0 == null) {
          PushLogcat.e$default(PushLogcat.INSTANCE, "KwaiPushSDK", "Intent is null.", null, 4, null);
          return;
       }else {
          JsonObject jsonObject = new JsonObject();
          Bundle extras = p0.getExtras();
          if (extras != null) {
             Iterator iterator = extras.keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                Object obj = extras.get(str);
                if (obj != null) {
                   jsonObject.c0(str, obj.toString());
                }
             }
          }
          String str1 = jsonObject.toString();
          a.o(str1, "pushJson.toString\(\)");
          Pair[] pairArray = new Pair[0];
          Processor.clickNotification(str1, Channel.OPPO, pairArray);
          str1 = Result.constructor-impl(l1.a);
          Throwable throwable = Result.exceptionOrNull-impl(str1);
          if (throwable != null) {
             PushLogger.a().h(jsonObject.toString(), throwable, Channel.OPPO);
          }
          return;
       }
    }
    public void onCreate(Bundle p0){
       Intent intent = this.getIntent();
       intent = (intent != null)? intent.putExtra("kwai_add_stack_list", false): null;
       Object obj = Result.constructor-impl(intent);
       Result.exceptionOrNull-impl(obj);
       super.onCreate(p0);
       PushSDKInitUtilKt.requirePushInit(new OppoRouterActivity$onCreate$3(this));
       return;
    }
}
