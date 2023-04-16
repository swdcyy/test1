package com.kuaishou.gifshow.kuaishan.ui.preview.aicut_preview.AICutPostPreviewActivity;
import com.yxcorp.gifshow.activity.BasePostActivity;
import java.util.UUID;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.utility.RomUtils;
import qka.a;
import android.os.Build$VERSION;
import android.view.Window;
import android.app.Activity;
import qka.b;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import c16.c;
import e17.i;
import com.kuaishou.gifshow.kuaishan.ui.preview.aicut_preview.AICutPostPreviewFragment;
import androidx.fragment.app.e;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.activity.login.PostLoginActivity;
import wh5.c;
import android.content.Intent;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import s90.k;
import com.kuaishou.gifshow.kuaishan.ui.preview.aicut_preview.AICutSchemeParams;
import android.net.Uri;
import lnc.c7;
import ekd.x0;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Long;
import zsd.t;
import lnc.d7;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.feature.post.api.util.g;

public final class AICutPostPreviewActivity extends BasePostActivity	// class@001ae2
{
    public final String O;
    public String P;

    public void AICutPostPreviewActivity(){
       super();
       this.O = "AICutPostPreviewActivity";
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       this.P = str;
    }
    public String B3(){
       return "AICUT";
    }
    public final Fragment G3(){
       Object obj = PatchProxy.apply(null, this, AICutPostPreviewActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSupportFragmentManager().findFragmentById(0x7f0a01c6);
    }
    public int M(){
       return 1;
    }
    public boolean X2(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewActivity.class, "6")) {
          return;
       }
       super.finish();
       if (RomUtils.n() && (a.a() && Build$VERSION.SDK_INT < 28)) {
          b.b(this.getWindow());
       }
    label_0028 :
       return;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, AICutPostPreviewActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+this.P;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AICutPostPreviewActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://kuaishan/preview";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public String o(){
       return "AICUT_PREVIEW";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewActivity.class, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w(this.O, "onBackPressed: "+this.G3(), objArray);
       if (this.G3() instanceof BaseTemplatePreviewFragment) {
          Fragment uFragment = this.G3();
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment");
          if (uFragment.onBackPressed()) {
             Object[] objArray1 = new Object[i];
             e.D().w(this.O, "onBackPressed: process by BaseTemplatePreviewFragment", objArray1);
             return;
          }
       }
       super.onBackPressed();
       return;
    }
    public void onCreate(Bundle p0){
       boolean b;
       Object[] objArray1;
       Object obj1;
       Long longx;
       long l;
       AICutSchemeParams uAICutScheme;
       String str = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AICutPostPreviewActivity uAICutPostPr = AICutPostPreviewActivity.class;
       String str1 = "1";
       if (PatchProxy.applyVoidOneRefs(p0, str, uAICutPostPr, str1)) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       e.D().w(str.O, "onCreate: ", objArray);
       int i = 0x7f11066a;
       if (!c.c()) {
          i.a(i, R.string.arg_RES_7f100144);
          this.finish();
          return;
       }else {
          str.setContentView(R.layout.arg_RES_7f0d00a4);
          AICutPostPreviewFragment uAICutPostPr1 = new AICutPostPreviewFragment();
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.aicut_preview_fragment_container, uAICutPostPr1);
          uoe.m();
          b.a(this.getWindow());
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (!mE.isLogined()) {
             PostLoginActivity.u3(this);
             return;
          }else if(!c.g()){
             i.a(i, R.string.arg_RES_7f10054d);
             this.finish();
             return;
          }else {
             String str2 = j0.f(this.getIntent(), "photo_task_id");
             if (!TextUtils.x(str2)) {
                a.m(str2);
                str.P = str2;
             }
             if (k.a(this.getIntent())) {
                Intent intent = this.getIntent();
                MusicType musicType = null;
                Bundle obj = PatchProxy.applyOneRefs(intent, musicType, k.class, str1);
                if (obj != patchProxyRe) {
                   musicType = obj;
                }else if(k.a(intent) && intent != null){
                   Uri data = intent.getData();
                   if (data != null) {
                      Object[] objArray2 = new Object[0];
                      e.D().w("AICutPreviewSchemerParser", "parse aicut scheme : "+data, objArray2);
                      a.o(data, "uri");
                      c7.a.c(data, intent);
                      str1 = x0.a(data, "themeId");
                      if (str1 == null) {
                         str1 = "";
                      }
                      str2 = str1;
                      String str3 = x0.a(data, "musicId");
                      str1 = x0.a(data, "musicType");
                      String str4 = x0.a(data, "disableSliding");
                      boolean b1 = (str4 != null)? Boolean.parseBoolean(str4): false;
                      if (str1 != null) {
                         try{
                            musicType = MusicType.valueOf(Integer.parseInt(str1));
                         }catch(java.lang.NumberFormatException e0){
                            PostUtils.D("AICutPreviewSchemerParser", "Invalid musicType from scheme", e0);
                         }
                      }
                   }
                }
                obj = PatchProxy.applyOneRefs(musicType, str, uAICutPostPr, "8");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(musicType != null && musicType.getStyleId() > 0){
                   b = true;
                }else {
                   b = false;
                }
                if (!b) {
                   objArray1 = new Object[0];
                   e.D().A(str.O, "onCreate: invalid aiCutSchemeParams", objArray1);
                   this.finish();
                   return;
                }else {
                   Intent intent1 = this.getIntent();
                   a.o(intent1, "intent");
                   d7.a.h(intent1);
                   obj = new Bundle();
                   SerializableHook.putSerializable(obj, "KEY_AICUT_SCHEME_PARAMS", musicType);
                   uAICutPostPr1.setArguments(obj);
                   return;
                }
             }else {
                objArray1 = new Object[0];
                e.D().A(str.O, "onCreate: page was not launched by aicut scheme", objArray1);
                this.finish();
                return;
             }
          }
       }
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewActivity.class, "3")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       e.D().w(this.O, "onResume: ", objArray);
       b.a(this.getWindow());
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       AICutPostPreviewActivity uAICutPostPr = AICutPostPreviewActivity.class;
       if (PatchProxy.isSupport(uAICutPostPr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAICutPostPr, "4")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       Object[] objArray = new Object[0];
       e.D().w(this.O, "onWindowFocusChanged "+p0, objArray);
       if (p0) {
          b.a(this.getWindow());
       }
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewActivity.class, "2")) {
          return;
       }
       super.y3();
       g.A(this.getWindow(), 0xff000000);
       return;
    }
    public String z4(){
       return "AICutPreviewPage";
    }
}
