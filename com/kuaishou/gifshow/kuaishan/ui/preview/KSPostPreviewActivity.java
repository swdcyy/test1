package com.kuaishou.gifshow.kuaishan.ui.preview.KSPostPreviewActivity;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import android.app.Activity;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import w46.b;
import java.lang.System;
import lq.i;
import android.content.Context;
import com.kuaishou.android.post.PostArguments;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import a2.i0;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import cw9.c;
import l1.a;
import android.os.Bundle;
import lnc.r5;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import z1.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.utility.RomUtils;
import qka.a;
import android.os.Build$VERSION;
import android.view.Window;
import qka.b;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import ekd.j0;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$b;
import r90.k;
import lnc.a1;
import android.util.Pair;
import android.transition.Transition;
import g26.d;
import r90.s;
import e17.i;
import r90.t;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import r90.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical;
import androidx.fragment.app.e;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.activity.login.PostLoginActivity;
import wh5.c;
import android.net.Uri;
import lnc.c7;
import kotlin.jvm.internal.a;
import ekd.x0;
import android.text.TextUtils;
import lnc.d7;
import java.lang.Integer;
import com.kwai.feature.post.api.util.g;

public class KSPostPreviewActivity extends BasePostActivity	// class@001adc
{
    public t O;
    public static long P = 0x0;
    public static String Q = "kuaishan_0";
    public static String R;

    public void KSPostPreviewActivity(){
       super();
    }
    public static Intent G3(KSLaunchParams p0,Activity p1){
       long l;
       KSPostPreviewActivity kSPostPrevie = KSPostPreviewActivity.class;
       Intent obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, kSPostPrevie, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().s("KSPostPreviewActivity", "launch\(\) called with: ksLaunchParams = ["+p0+"]", objArray);
       if (TextUtils.x(p0.getTemplateId())) {
          e.D().e("KSPostPreviewActivity", "launch: ", new IllegalArgumentException("templateId is empty"));
          return obj;
       }else if((System.currentTimeMillis() - KSPostPreviewActivity.P) - 2000 < 0){
          Object[] objArray1 = new Object[i];
          e.D().t("KSPostPreviewActivity", "launch KSPostPreviewActivity too frequently", objArray1);
          return obj;
       }else if(i.h() && !i.m().B()){
          l = 1;
       }else {
          l = 0;
       }
       if (p0.isGoHomeOnComplete() && !l) {
          i = true;
       }
       p0.setGoHomeOnComplete(i);
       KSPostPreviewActivity.P = System.currentTimeMillis();
       obj = new Intent(p1, kSPostPrevie);
       KSLaunchParams mPostArgumen = p0.mPostArguments;
       if (mPostArgumen != null) {
          mPostArgumen.write(obj);
       }
       SerializableHook.putExtra(obj, "intent_ks_launch_param", p0);
       obj.putExtra("INTENT_GO_HOME_ON_POST_COMPLETE", p0.isGoHomeOnComplete());
       return obj;
    }
    public static void I3(KSLaunchParams p0,Activity p1,boolean p2){
       if (PatchProxy.isSupport(KSPostPreviewActivity.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, KSPostPreviewActivity.class, "1")) {
          return;
       }
       KSPostPreviewActivity.J3(p0, p1, p2, null);
       return;
    }
    public static void J3(KSLaunchParams p0,Activity p1,boolean p2,View p3){
       KSPostPreviewActivity kSPostPrevie = KSPostPreviewActivity.class;
       if (PatchProxy.isSupport(kSPostPrevie) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, KSPostPreviewActivity.class, "2")) {
          return;
       }
       Intent intent = KSPostPreviewActivity.G3(p0, p1);
       if (intent == null) {
          return;
       }
       if (p3 != null && p1 instanceof GifshowActivity) {
          boolean b = true;
          intent.putExtra("intent_ks_does_clicked_template_exist", b);
          if (TextUtils.x(i0.L(p3))) {
             int i = (int)((((float)p3.getWidth() * 0x3f800000) / (float)n.k(p1)) * (float)c.b(p1.getResources(), 0x7f070c5e));
             p1.r3(intent, 1006, a.b(p3, 0, (- i), p3.getMeasuredWidth(), (p3.getMeasuredHeight() + i)).d(), p3);
          }else {
             KSPostPreviewActivity.Q = i0.L(p3);
             r5 or5 = r5.b();
             Bitmap uBitmap = null;
             Bitmap obj = PatchProxy.applyOneRefs(p3, uBitmap, kSPostPrevie, "3");
             if (obj != PatchProxyResult.class) {
             }else {
                p3.setDrawingCacheEnabled(b);
                obj = p3.getDrawingCache();
                if (obj != null && !obj.isRecycled()) {
                   uBitmap = obj.copy(obj.getConfig(), obj.isMutable());
                }
                p3.setDrawingCacheEnabled(0);
                obj = uBitmap;
             }
             KSPostPreviewActivity.R = or5.c(obj);
             e[] uoeArray = new e[b];
             uoeArray[0] = new e(p3, i0.L(p3));
             p1.r3(intent, 1006, a.c(p1, uoeArray).d(), p3);
          }
       }else {
          p1.startActivityForResult(intent, 1006);
          if (p2) {
             p1.overridePendingTransition(0, 0);
             return;
          }else {
             p1.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f0100e5);
          }
       }
       return;
    }
    public String B3(){
       return "KUAISHAN";
    }
    public Fragment H3(){
       Object obj = PatchProxy.apply(null, this, KSPostPreviewActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSupportFragmentManager().findFragmentById(0x7f0a1675);
    }
    public int M(){
       return 1;
    }
    public boolean X2(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, KSPostPreviewActivity.class, "14")) {
          return;
       }
       super.finish();
       if (RomUtils.n() && (a.a() && Build$VERSION.SDK_INT < 28)) {
          b.b(this.getWindow());
       }
    label_0028 :
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KSPostPreviewActivity.class, "16");
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
       return "KUAISHAN_PREVIEW";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, KSPostPreviewActivity.class, "15")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KSPostPreviewActivity", "onBackPressed: "+this.H3(), objArray);
       if (this.H3() instanceof BaseTemplatePreviewFragment && this.H3().onBackPressed()) {
          Object[] objArray1 = new Object[i];
          e.D().w("KSPostPreviewActivity", "onBackPressed: process by KSPreviewFragmentVertical", objArray1);
          return;
       }else {
          super.onBackPressed();
          return;
       }
    }
    public void onCreate(Bundle p0){
       KSLaunchParams kSLaunchPara;
       int i;
       int i1;
       d7 a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "ksLaunchParams fetch error";
       String str1 = "KSPostPreviewActivity";
       KSPostPreviewActivity kSPostPrevie = KSPostPreviewActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, kSPostPrevie, "6")) {
          return;
       }
       Object[] objArray = null;
       try{
          kSLaunchPara = j0.e(this.getIntent(), "intent_ks_launch_param");
       }catch(java.lang.ClassCastException e6){
          e.D().e(str1, str, e6);
          kSLaunchPara = objArray;
       }
       if (kSLaunchPara == null) {
          kSLaunchPara = new KSLaunchParams$b().a();
       }
       k ok = new k();
       if (kSLaunchPara.mNeedOpenExitAnimation != null) {
          ok.c = KSPostPreviewActivity.Q;
          ok.a = a1.a(0x7f06202f);
          ok.b = a1.a(0x7f062046);
          if (!PatchProxy.applyVoidOneRefs(this, ok, k.class, "3")) {
             Pair pair = ok.a();
             if (pair != null) {
                Window window = this.getWindow();
                window.requestFeature(13);
                window.setSharedElementEnterTransition(pair.first);
                window.setSharedElementReturnTransition(pair.second);
             }
          }
       }
       Intent intent = this.getIntent();
       boolean b = true;
       if (intent != null && (d.b() && (s.a(intent) && kSLaunchPara.mNeedDiscardPrevSession != null))) {
          intent.putExtra("discard_current_post_session", b);
       }
    label_0097 :
       super.onCreate(p0);
       if (!d.b()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101bca);
          this.finish();
          return;
       }else {
          this.O = new t(this);
          this.setContentView(R.layout.arg_RES_7f0d0716);
          if (!PatchProxy.applyVoid(objArray, this, kSPostPrevie, "11")) {
             KwaiImageView kwaiImageVie = this.findViewById(R.id.kuaishan_temp_cover);
             i0.N0(kwaiImageVie, KSPostPreviewActivity.Q);
             Bitmap uBitmap = r5.b().a(KSPostPreviewActivity.R, Bitmap.class);
             if (uBitmap != null) {
                kwaiImageVie.setImageBitmap(uBitmap);
                kwaiImageVie.getViewTreeObserver().addOnGlobalLayoutListener(new j(this, kwaiImageVie, uBitmap));
             }
          }
          KSPreviewFragmentVertical kSPreviewFra = PatchProxy.applyOneRefs(kSLaunchPara, this, kSPostPrevie, "9");
          i = 0;
          if (kSPreviewFra != patchProxyRe) {
          }else {
             kSPreviewFra = new KSPreviewFragmentVertical();
             kSPreviewFra.P = j0.a(this.getIntent(), "intent_ks_does_clicked_template_exist", i);
             kSPreviewFra.I = kSLaunchPara.mNeedOpenExitAnimation;
          }
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.kuaishan_fragment_container, kSPreviewFra);
          uoe.m();
          Object[] objArray1 = new Object[i];
          e.D().w(str1, "onCreate: ", objArray1);
          b.a(this.getWindow());
          if (!QCurrentUser.ME.isLogined()) {
             PostLoginActivity.u3(this);
             return;
          }else if(!c.g()){
             i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
             this.finish();
             return;
          }else if(s.a(this.getIntent())){
             Intent intent1 = this.getIntent();
             KSLaunchParams$b obj = PatchProxy.applyOneRefs(intent1, objArray, s.class, "1");
             if (obj != patchProxyRe) {
                obj.booleanValue();
             }else if(s.a(intent1) && intent1 != null){
                Uri data = intent1.getData();
                if (data != null) {
                   objArray = new Object[i];
                   e.D().w("KSPreviewSchemerParser", "parse kuaishan scheme : "+data, objArray);
                   obj = new KSLaunchParams$b();
                   a.o(data, "uri");
                   c7.a.c(data, intent1);
                   str1 = x0.a(data, "flashTemplateId");
                   if (str1 != null) {
                      obj.h(str1);
                   }
                   str1 = x0.a(data, "flashGroupId");
                   if (str1 != null) {
                      obj.c(str1);
                   }
                   str1 = x0.a(data, "templateSrc");
                   if (str1 != null) {
                      obj.i(str1);
                   }
                   if (i.h()) {
                      i oi = i.m();
                      a.o(oi, "PostSession.current\(\)");
                      if (!oi.B()) {
                         i1 = 1;
                      label_01e4 :
                         String str2 = x0.a(data, "returnToOriginalPage");
                         boolean b1 = (str2 != null)? Boolean.parseBoolean(str2): false;
                         if (!b1) {
                            str2 = x0.a(data, "returnToWeb");
                            b1 = (str2 != null)? Boolean.parseBoolean(str2): false;
                            if (!b1 && !i1) {
                            label_0207 :
                               obj.b((i ^ 0x01));
                               str1 = x0.a(data, "needDiscardPrevSession");
                               if (str1 != null) {
                                  b = Boolean.parseBoolean(str1);
                               }
                               obj.f(b);
                               str1 = intent1.getStringExtra("photo_task_id");
                               if (str1 != null && !TextUtils.isEmpty(str1)) {
                                  obj.g(str1);
                               }
                               obj.e(Boolean.parseBoolean(x0.a(data, "allowJumpToolbox")));
                               obj.d(Boolean.parseBoolean(x0.a(data, "allowJumpToolbox")));
                               SerializableHook.putExtra(intent1, "intent_ks_launch_param", obj.a());
                            }
                         }
                      label_0206 :
                         i = 1;
                         goto label_0207 ;
                      }
                   }
                   i1 = 0;
                   goto label_01e4 ;
                }
             }
             d7.a.h(this.getIntent());
          }else if(this.D3()){
             a = d7.a;
             Intent intent2 = this.getIntent();
             try{
                a.h(intent2);
                kSLaunchPara = j0.e(this.getIntent(), "intent_ks_launch_param");
             }catch(java.lang.ClassCastException e13){
                e.D().e(str1, str, e13);
             }
             if (kSLaunchPara != null) {
                i.m().Q("camera_page_source", Integer.valueOf(kSLaunchPara.getPageSource()));
             }
          }
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KSPostPreviewActivity.class, "13")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       e.D().s("KSPostPreviewActivity", "onDestroy\(\) called", objArray);
       if (!TextUtils.x(KSPostPreviewActivity.R)) {
          r5.b().d(KSPostPreviewActivity.R);
          KSPostPreviewActivity.R = null;
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, KSPostPreviewActivity.class, "7")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       e.D().w("KSPostPreviewActivity", "onResume: ", objArray);
       b.a(this.getWindow());
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       KSPostPreviewActivity kSPostPrevie = KSPostPreviewActivity.class;
       if (PatchProxy.isSupport(kSPostPrevie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kSPostPrevie, "8")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       Object[] objArray = new Object[0];
       e.D().w("KSPostPreviewActivity", "onWindowFocusChanged "+p0, objArray);
       if (p0) {
          b.a(this.getWindow());
       }
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, KSPostPreviewActivity.class, "5")) {
          return;
       }
       super.y3();
       g.A(this.getWindow(), 0xff000000);
       return;
    }
    public String z4(){
       return "KuaiShanPreviewPage";
    }
}
