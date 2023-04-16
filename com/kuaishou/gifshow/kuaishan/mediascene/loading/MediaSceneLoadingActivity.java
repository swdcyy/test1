package com.kuaishou.gifshow.kuaishan.mediascene.loading.MediaSceneLoadingActivity;
import com.yxcorp.gifshow.SingleFragmentPostActivity;
import com.kuaishou.gifshow.kuaishan.mediascene.loading.MediaSceneLoadingActivity$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import z80.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Activity;
import z80.a;
import q87.c;
import g26.d;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import lnc.c7;
import e17.i;
import lnc.d7;
import java.io.Serializable;
import ekd.j0;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import com.kuaishou.gifshow.kuaishan.mediascene.loading.MediaSceneLoadingFragment;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.mediascene.loading.MediaSceneLoadingFragment$a;
import android.os.Bundle;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.utility.RomUtils;
import qka.a;
import android.os.Build$VERSION;
import android.view.Window;
import qka.b;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import b90.d;
import z80.b;
import k2b.e0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.util.g;

public final class MediaSceneLoadingActivity extends SingleFragmentPostActivity	// class@001a82
{
    public String O;
    public MediaSceneLaunchParams P;
    public MediaSceneLoadingFragment Q;
    public static final MediaSceneLoadingActivity$a R;

    static {
       MediaSceneLoadingActivity.R = new MediaSceneLoadingActivity$a(null);
    }
    public void MediaSceneLoadingActivity(){
       super();
    }
    public Fragment G3(){
       String obj1;
       String str2;
       boolean b;
       Serializable serializable;
       Serializable serializable1;
       String str3;
       MediaSceneLoadingFragment$a p;
       MediaSceneLoadingActivity tP;
       MediaSceneLoadingFragment mediaSceneLo;
       Bundle uBundle;
       q oq = q.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       Intent obj = PatchProxy.apply(objArray, this, MediaSceneLoadingActivity.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       if (q.d(this.getIntent())) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          String str1 = "MediaSceneLoadingActivity";
          a.D().w(str1, "launch by scheme", objArray1);
          if (d.b()) {
             try{
                obj = this.getIntent();
                obj1 = PatchProxy.applyOneRefs(obj, objArray, oq, "4");
                str2 = "sceneType";
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else if(q.d(obj) && obj != null){
                   Uri data1 = obj.getData();
                   if (data1 != null) {
                      String str4 = x0.a(data1, str2);
                      if (!TextUtils.x(str4) && Integer.parseInt(str4) == 2) {
                         b = true;
                      }
                   }
                }
                b = false;
             }catch(java.lang.NumberFormatException e0){
             }
                if (!b) {
                   try{
                      obj = this.getIntent();
                      if (!PatchProxy.applyVoidTwoRefs(this, obj, objArray, oq, str)) {
                         a.p(this, "activity");
                         if (q.d(obj) && obj != null) {
                            Uri data = obj.getData();
                            if (data != null) {
                               a uoa = a.D();
                               obj1 = "parse mediaScene scheme : "+data;
                               Object[] objArray3 = new Object[i];
                               str1 = "MediaSceneSchemerParser";
                               uoa.w(str1, obj1, objArray3);
                               a.o(data, "uri");
                               c7.a.c(data, obj);
                               str = x0.a(data, str2);
                               if (TextUtils.x(str)) {
                                  q.a.b(this, str2);
                               }else {
                                  a.o(str, str2);
                                  q.a.c(this, data, str, obj);
                               }
                            }
                         }
                      }
                   }catch(java.lang.NumberFormatException e0){
                      q.a.b(this, str2);
                   }
                }
          }
          Object[] objArray2 = new Object[i];
          a.D().w(str1, "launch by scheme: kuaishan is not support", objArray2);
          i.a(R.style.arg_RES_7f11066a, 0x7f104fb7);
          this.finish();
          return new Fragment();
       }
    }
    public int M(){
       return 1;
    }
    public boolean X2(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MediaSceneLoadingActivity.class, "4")) {
          return;
       }
       super.finish();
       if (RomUtils.n() && (a.a() && Build$VERSION.SDK_INT < 28)) {
          b.b(this.getWindow());
       }
    label_0028 :
       this.overridePendingTransition(R.anim.arg_RES_7f010049, 0x7f010049);
       MediaSceneLoadingActivity tQ = this.Q;
       if (tQ != null) {
          tQ.d0();
       }
       return;
    }
    public String getPageParams(){
       MediaSceneLoadingActivity obj = PatchProxy.apply(null, this, MediaSceneLoadingActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.P;
       boolean b = false;
       MediaSceneLaunchParams mSceneType = (obj != null)? obj.mSceneType: null;
       String str = (mSceneType > null)? "videoSceneType="+mSceneType: "";
       MediaSceneLoadingActivity tO = this.O;
       if (tO == null || !tO.length()) {
          b = true;
       }
       if (b) {
          return str;
       }else if(TextUtils.x(str)){
          str = "task_id="+this.O;
       }else {
          str = str+"&"+"task_id="+this.O;
       }
       return str;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MediaSceneLoadingActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public String o(){
       return "USUAL_PLACE_LOADING";
    }
    public void onBackPressed(){
       Object[] objArray = null;
       String str = "6";
       if (PatchProxy.applyVoid(objArray, this, MediaSceneLoadingActivity.class, str)) {
          return;
       }
       if (this.I3() instanceof MediaSceneLoadingFragment) {
          Fragment uFragment = this.I3();
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.mediascene.loading.MediaSceneLoadingFragment");
          if (!PatchProxy.applyVoid(objArray, uFragment, MediaSceneLoadingFragment.class, str)) {
             MediaSceneLoadingFragment l = uFragment.l;
             if (l != null && !PatchProxy.applyVoid(objArray, l, d.class, "4")) {
                b.a.a(l.p);
                l.D(true);
             }
          }
       }else {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaSceneLoadingActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       b.a(this.getWindow());
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MediaSceneLoadingActivity.class, "3")) {
          return;
       }
       super.onResume();
       b.a(this.getWindow());
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       MediaSceneLoadingActivity mediaSceneLo = MediaSceneLoadingActivity.class;
       if (PatchProxy.isSupport(mediaSceneLo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mediaSceneLo, "5")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       b.a(this.getWindow());
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, MediaSceneLoadingActivity.class, "7")) {
          return;
       }
       super.y3();
       g.A(this.getWindow(), 0xff000000);
       return;
    }
}
