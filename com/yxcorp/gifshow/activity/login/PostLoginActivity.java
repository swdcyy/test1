package com.yxcorp.gifshow.activity.login.PostLoginActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.content.Context;
import android.os.Parcelable;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.kwai.framework.model.user.QCurrentUser;
import ekd.j0;
import android.content.ComponentName;
import android.net.Uri;
import gq.a;
import q87.c;
import tkd.b;
import tkd.d;
import ou5.b;
import hw8.a;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;

public class PostLoginActivity extends GifshowActivity	// class@001356
{
    public Intent y;
    public static final int z;

    public void PostLoginActivity(){
       super();
    }
    public static void u3(Activity p0){
       PostLoginActivity postLoginAct = PostLoginActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, postLoginAct, "1")) {
          return;
       }
       Intent intent = new Intent(p0, postLoginAct);
       if (p0.getIntent() != null) {
          intent.putExtra("source_intent", p0.getIntent());
       }
       p0.startActivity(intent);
       p0.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PostLoginActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       PostLoginActivity postLoginAct = PostLoginActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, postLoginAct, "2")) {
          return;
       }
       super.onCreate(p0);
       if (QCurrentUser.ME.isLogined()) {
          this.finish();
          return;
       }else if(PatchProxy.applyVoid(null, this, postLoginAct, "3")){
          Intent intent = j0.d(this.getIntent(), "source_intent");
          if (intent != null) {
             Intent intent1 = new Intent();
             this.y = intent1;
             intent1.setComponent(intent.getComponent());
             this.y.setData(intent.getData());
             Bundle extras = intent.getExtras();
             if (extras != null) {
                this.y.replaceExtras(extras);
             }
          }
       }
       if (!PatchProxy.applyVoid(null, this, postLoginAct, "4")) {
          Object[] objArray = new Object[0];
          a.D().w("PostLoginActivity", "jumpToLogin", objArray);
          d.a(-1712118428).x00(this, 0, null, new a(this));
       }
       return;
    }
}
