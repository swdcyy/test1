package com.kuaishou.live.core.basic.activity.LiveShellActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.HashMap;
import android.content.Context;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import java.lang.StringBuilder;
import java.lang.System;
import com.kuaishou.live.core.basic.activity.n0;
import java.util.Map;
import android.content.Intent;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import erd.c;
import m02.s1;
import e17.i;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public class LiveShellActivity extends GifshowActivity	// class@001824
{
    public static String y = "INTENT_KEY_FOR_TASK_ID";
    public static final Map z;

    static {
       LiveShellActivity.z = new HashMap();
    }
    public void LiveShellActivity(){
       super();
    }
    public static void u3(Context p0,Runnable p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LiveShellActivity.class, "2")) {
          return;
       }
       if (LivePluginManager.c()) {
          p1.run();
       }else {
          String str = p2+"_"+System.currentTimeMillis();
          LiveShellActivity.z.put(str, new n0(p2, p1));
          Intent intent = new Intent(p0, LiveShellActivity.class);
          intent.putExtra(LiveShellActivity.y, str);
          if (p0 instanceof Activity) {
             p0.startActivityForResult(intent, -1);
          }else {
             p0.startActivity(intent);
          }
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveShellActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       int i;
       String stringExtra;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShellActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       try{
          i = 0;
          stringExtra = intent.getStringExtra(LiveShellActivity.y);
          LiveShellActivity.z.remove(stringExtra).a(this, new s1(this));
       }catch(java.lang.Exception e5){
          i.a(R.style.arg_RES_7f11066a, 0x7f101e5e);
          b.I(LiveLogTag.LIVE_PLUGIN, "LivePlayShellActivity, "+stringExtra, e5);
          this.finish();
          this.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
       }
       return;
    }
}
