package com.yxcorp.gifshow.activity.policy.PostPolicyAlbumActivity;
import com.yxcorp.gifshow.activity.BasePostActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.os.Parcelable;
import ekd.j0;
import android.content.ComponentName;
import android.net.Uri;
import gq.a;
import q87.c;
import tkd.b;
import tkd.d;
import om6.j;
import om6.k;
import j46.a;
import iw8.a;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class PostPolicyAlbumActivity extends BasePostActivity	// class@00135b
{
    public Intent O;
    public static final int P;

    public void PostPolicyAlbumActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PostPolicyAlbumActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       Intent intent1;
       Bundle extras;
       PostPolicyAlbumActivity postPolicyAl = PostPolicyAlbumActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, postPolicyAl, "2")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, postPolicyAl, "3")) {
          intent1 = j0.d(this.getIntent(), "source_intent");
          if (intent1 != null) {
             Intent intent2 = new Intent();
             this.O = intent2;
             intent2.setComponent(intent1.getComponent());
             this.O.setData(intent1.getData());
             extras = intent1.getExtras();
             if (extras != null) {
                this.O.replaceExtras(extras);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, postPolicyAl, "4")) {
          Object[] objArray1 = new Object[0];
          a.D().w("PostPolicyAlbumActivity", "jumpAlbum", objArray1);
          Intent intent = d.a(0x2538349d).nt(this);
          intent1 = this.getIntent();
          if (intent1 != null) {
             extras = intent1.getExtras();
             if (extras != null) {
                intent.putExtras(extras);
             }
          }
          a.a.a(intent);
          this.t1(intent, 4196, new a(this));
          this.overridePendingTransition(R.anim.arg_RES_7f010017, 0);
       }
       return;
    }
}
