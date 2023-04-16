package com.yxcorp.gifshow.camera.record.SchemeJumpPairedPhotoActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.SchemeJumpPairedPhotoActivity$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.RomUtils;
import qka.a;
import android.os.Build$VERSION;
import android.view.Window;
import android.app.Activity;
import qka.b;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import j8c.a;
import q87.c;
import android.content.Intent;
import android.net.Uri;
import qb9.z;
import qb9.a0;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.camera.record.SchemePairedPhotoVideoHelper;
import wh5.c;
import e17.i;
import jkd.c;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.s6;
import android.content.Context;
import ekd.p0;
import lnc.a1;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import qb9.i0;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.feed.g;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.l;
import erd.o;
import com.yxcorp.gifshow.camera.record.m;
import qb9.j0;
import qb9.k0;
import crd.b;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.yxcorp.gifshow.camera.record.SchemePairedPhotoVideoHelper$2;
import androidx.lifecycle.LifecycleObserver;
import qm6.b$a;
import ekd.x0;
import tkd.b;
import tkd.d;
import om6.r;
import lnc.s;
import qm6.b;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;

public class SchemeJumpPairedPhotoActivity extends GifshowActivity	// class@001c96
{
    public j y;
    public final c z;

    public void SchemeJumpPairedPhotoActivity(){
       super();
       this.z = new SchemeJumpPairedPhotoActivity$a(this);
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, SchemeJumpPairedPhotoActivity.class, "4")) {
          return;
       }
       super.finish();
       if (RomUtils.n() && (a.a() && Build$VERSION.SDK_INT < 28)) {
          b.b(this.getWindow());
       }
    label_0028 :
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SchemeJumpPairedPhotoActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       Uri this;
       boolean this1;
       String str3;
       boolean b;
       z oz1;
       PatchProxyResult patchProxyRe1;
       boolean b1;
       Object[] objArray4;
       VideoFeed this1;
       PhotoMeta photoMeta;
       t this11;
       j0 this11;
       Object obj = this;
       SchemeJumpPairedPhotoActivity schemeJumpPa = SchemeJumpPairedPhotoActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, schemeJumpPa, "1")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "SchemeJumpPairedPhotoActivity";
       a.D().w(str, "onCrete", objArray);
       obj.overridePendingTransition(i, i);
       obj.setContentView(R.layout.arg_RES_7f0d1337);
       b.a(this.getWindow());
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, obj, schemeJumpPa, "3")) {
          Intent intent = this.getIntent();
          if (intent == null || intent.getData() == null) {
             this.finish();
          }else {
             Uri data = intent.getData();
             z oz = new z();
             a0.a.b(data, oz);
             objArray = new Object[i];
             a.D().w(str, "parseScheme params = "+oz, objArray);
             SchemeJumpPairedPhotoActivity z = obj.z;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoidFourRefsWithListener(this, oz, z, data, null, SchemePairedPhotoVideoHelper.class, "1")) {
                objArray = new Object[i];
                String str1 = "SchemePairedPhotoVideoHelper";
                a.D().w(str1, "goPairedPhotoPage: uri = "+data, objArray);
                int i1 = 0x7f11066a;
                if (!c.g()) {
                   i.a(i1, R.string.arg_RES_7f10054d);
                   z.onCancel();
                   PatchProxy.onMethodExit(SchemePairedPhotoVideoHelper.class, "1");
                }else {
                   String str2 = str1;
                   this = PatchProxy.applyFourRefsWithListener(this, oz, z, data, null, SchemePairedPhotoVideoHelper.class, "11");
                   Object[] objArray2 = 1;
                   if (this != patchProxyRe) {
                      this1 = this.booleanValue();
                      str3 = str2;
                   label_015c :
                      b = this1;
                      str2 = str3;
                      oz1 = oz;
                      patchProxyRe1 = patchProxyRe;
                   }else {
                      String str5 = "11";
                      if (TextUtils.x(oz.b) || TextUtils.x(oz.a)) {
                         oz1 = oz;
                         patchProxyRe1 = patchProxyRe;
                         PatchProxy.onMethodExit(SchemePairedPhotoVideoHelper.class, str5);
                      }else {
                         z obj1 = PatchProxy.apply(objArray1, oz, z.class, "2");
                         if (obj1 != patchProxyRe) {
                            this1 = obj1.booleanValue();
                         }else if(!TextUtils.n(oz.a, "sameFrame") && (TextUtils.n(oz.a, "followShoot") || TextUtils.n(oz.a, "lipsSync"))){
                            this1 = true;
                         }else {
                            this1 = false;
                         }
                         if (!this1) {
                            PatchProxy.onMethodExit(SchemePairedPhotoVideoHelper.class, str5);
                            oz1 = oz;
                            patchProxyRe1 = patchProxyRe;
                         }else if(!s6.H() && !p0.C(this)){
                            Object[] objArray6 = new Object[i];
                            str3 = str2;
                            a.D().w(str3, "net is not connected", objArray6);
                            z.onFail(i, a1.p(R.string.arg_RES_7f1038e5));
                            i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
                            PatchProxy.onMethodExit(SchemePairedPhotoVideoHelper.class, str5);
                            obj1 = 1;
                            goto label_015c ;
                         }else {
                            str3 = str2;
                            objArray = new Object[i];
                            a.D().w(str3, "goToPairVideoPage with params:  "+oz.toString(), objArray);
                            Bundle uBundle = SchemePairedPhotoVideoHelper.a(oz, data);
                            if (s6.H() && !TextUtils.n(oz.x, "slip")) {
                               this1 = new VideoFeed();
                               photoMeta = new PhotoMeta();
                               this1.mPhotoMeta = photoMeta;
                               photoMeta.mPhotoId = oz.b;
                               this11 = t.just(new QPhoto(this1)).doOnNext(new i0(oz, uBundle));
                               objArray2 = objArray1;
                            }else {
                               Object[] this12 = PatchProxy.applyTwoRefs(obj, oz, objArray1, SchemePairedPhotoVideoHelper.class, "7");
                               if (this12 != patchProxyRe) {
                               }else if(TextUtils.x(oz.f) && TextUtils.x(oz.b)){
                                  this12 = objArray1;
                               }else {
                                  this12 = new ProgressFragment();
                                  this12.Jh(a1.p(R.string.arg_RES_7f103667));
                                  this12.setCancelable(objArray2);
                                  this12.show(this.getSupportFragmentManager(), "post_video_progress");
                                  objArray = new Object[i];
                                  a.D().s(str3, "show ProgressFragment", objArray);
                               }
                               objArray2 = this12;
                               this11 = g.e(oz.b, objArray1).observeOn(d.c).concatMap(new l(oz, uBundle)).concatMap(new m(oz, uBundle));
                            }
                            this11 = photoMeta;
                            j0 oj0 = photoMeta;
                            patchProxyRe1 = patchProxyRe;
                            str2 = str3;
                            String str6 = str5;
                            oz1 = oz;
                            Object[] objArray7 = objArray2;
                            this11 = new j0(objArray2, this, uBundle, oz, z, data);
                            b uob = this11.observeOn(d.a).subscribe(oj0, new k0(objArray7, obj, z));
                            if (!PatchProxy.applyVoidThreeRefs(this, uob, objArray7, null, SchemePairedPhotoVideoHelper.class, "5")) {
                               this.getLifecycle().addObserver(new SchemePairedPhotoVideoHelper$2(uob, objArray7));
                            }
                            PatchProxy.onMethodExit(SchemePairedPhotoVideoHelper.class, str6);
                            b = true;
                         }
                      }
                      b = false;
                   }
                   if (b) {
                      PatchProxy.onMethodExit(SchemePairedPhotoVideoHelper.class, "1");
                   }else {
                      z oz2 = oz1;
                      int i2 = 2;
                      if (oz2.y != i2) {
                         i2 = 0;
                      }
                      Object[] objArray3 = new Object[0];
                      String str4 = str2;
                      a.D().w(str4, "recordMode="+i2, objArray3);
                      b$a uoa = new b$a(obj, i2);
                      this = PatchProxy.applyOneRefs(obj, null, SchemePairedPhotoVideoHelper.class, "9");
                      if (this != patchProxyRe1) {
                         b1 = this.booleanValue();
                      }else {
                         this = this.getIntent().getData();
                         objArray4 = new Object[]{this};
                         int i3 = 0;
                         Object[] objArray5 = new Object[i3];
                         a.D().w(str4, String.format("sourceUri=%s", objArray4), objArray5);
                         str1 = (this != null && TextUtils.n("camera", x0.a(this, "ks_from")))? 1: null;
                         b1 = str1;
                      }
                      if (PatchProxy.isSupport(SchemePairedPhotoVideoHelper.class) && PatchProxy.applyVoidFourRefs(this, uoa, oz2, Boolean.valueOf(b1), null, SchemePairedPhotoVideoHelper.class, "2")) {
                      label_030e :
                         i2 = 0;
                      }else {
                         this1 = -831446984;
                         if (!d.a(this1).isAvailable()) {
                            goto label_030e ;
                         }else if(oz2.z != null && b1){
                            i2 = 0;
                            objArray = new Object[i2];
                            a.D().s(str4, "back to old CameraActivity", objArray);
                         }else {
                            i2 = 0;
                            objArray4 = new Object[i2];
                            a.D().s(str4, "jump to new CameraActivity", objArray4);
                            d.a(this1).Um(obj, uoa.f());
                         }
                      }
                      z.onFail(i2, "");
                      PatchProxy.onMethodExit(SchemePairedPhotoVideoHelper.class, "1");
                   }
                }
             }
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, SchemeJumpPairedPhotoActivity.class, "2")) {
          return;
       }
       super.onResume();
       b.a(this.getWindow());
       return;
    }
}
