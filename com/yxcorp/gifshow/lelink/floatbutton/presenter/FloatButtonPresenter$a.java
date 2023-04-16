package com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter$a;
import cgc.d;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cgc.d$a;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Long;
import com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import com.yxcorp.gifshow.lelink.ScreencastManager$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kuaishou.android.model.mix.VideoMeta;
import a0b.b;
import tl8.d;
import ok.h;
import tl8.e;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.player.mid.manifest.RepInterface;
import java.lang.Integer;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$a;
import zza.a;
import android.os.SystemClock;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import q87.c;

public final class FloatButtonPresenter$a implements d	// class@001a44
{
    public final FloatButtonPresenter a;

    public void FloatButtonPresenter$a(FloatButtonPresenter p0){
       this.a = p0;
       super();
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FloatButtonPresenter$a.class, "8")) {
          return;
       }
       a.p(p0, "representation");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, d$a.class, "2")) {
          a.p(p0, "representation");
       }
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(FloatButtonPresenter$a.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FloatButtonPresenter$a.class, "5");
       }
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FloatButtonPresenter$a.class, "9")) {
          return;
       }
       a.p(p0, "message");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, d$a.class, "1")) {
          a.p(p0, "message");
       }
       return;
    }
    public void f(float p0){
       if (PatchProxy.isSupport(FloatButtonPresenter$a.class)) {
          PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, FloatButtonPresenter$a.class, "10");
       }
       return;
    }
    public void g(long p0){
       if (PatchProxy.isSupport(FloatButtonPresenter$a.class)) {
          PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, FloatButtonPresenter$a.class, "7");
       }
       return;
    }
    public void onCompletion(){
       String obj1;
       String obj2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FloatButtonPresenter$a.class, "2")) {
          return;
       }
       ScreencastFloatButtonHelper b = ScreencastFloatButtonHelper.b;
       List list = b.c();
       QPhoto qPhoto = (list != null)? CollectionsKt___CollectionsKt.p2(list): objArray;
       if (qPhoto != null) {
          ScreencastManager$a a = ScreencastManager.A;
          if (a.a().d() != null) {
             ScreencastManager screencastMa = a.a();
             FloatButtonPresenter$a ta = this.a;
             Objects.requireNonNull(ta);
             CDNUrl[] obj = PatchProxy.applyOneRefs(qPhoto, ta, FloatButtonPresenter.class, "5");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else {
                obj = qPhoto.getH265VideoUrls();
                obj1 = "photo.h265VideoUrls";
                a.o(obj, obj1);
                int i = 1;
                int i1 = (!obj.length)? 1: 0;
                if (i1 ^ i) {
                   CDNUrl[] h265VideoUrl = qPhoto.getH265VideoUrls();
                   a.o(h265VideoUrl, obj1);
                   obj2 = ArraysKt___ArraysKt.ob(h265VideoUrl);
                   a.o(obj2, "photo.h265VideoUrls.first\(\)");
                   obj2 = obj2.getUrl();
                }else {
                   KwaiManifest kwaiManifest = e.h(qPhoto.mEntity, VideoMeta.class, b.b);
                   List repList = (kwaiManifest != null)? kwaiManifest.getRepList(): objArray;
                   if (repList != null) {
                      RepInterface repInterface = CollectionsKt___CollectionsKt.p2(repList);
                      if (repInterface != null) {
                         obj2 = repInterface.getUrl();
                      }
                   }
                }
                if (obj2 == null) {
                   obj2 = qPhoto.getVideoUrl();
                   a.o(obj2, "photo.videoUrl");
                }
             }
             obj1 = a.a().d();
             a.m(obj1);
             screencastMa.n(objArray, qPhoto, obj1, 0, null, null, null);
             List list1 = b.c();
             if (list1 != null) {
                list1.remove(qPhoto);
             }
             this.a.r = qPhoto;
          label_00d0 :
             a a1 = a.a;
             a1.c(FloatButtonPresenter.P8(this.a), (SystemClock.elapsedRealtime() - this.a.D));
             a1.d(FloatButtonPresenter.P8(this.a), "END");
             return;
          }
       }
       ScreencastManager.A.a().c();
       FloatButtonManager.i.a().a();
       goto label_00d0 ;
    }
    public void onDisconnect(){
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, FloatButtonPresenter$a.class, "4")) {
          return;
       }
       Context context = this.a.getContext();
       if (context != null) {
          CharSequence text = context.getText(R.string.arg_RES_7f1016f8);
          if (text != null) {
             i.e(R.style.arg_RES_7f11066a, text, 0);
          }
       }
       a a = a.a;
       a.c(FloatButtonPresenter.P8(this.a), (SystemClock.elapsedRealtime() - this.a.D));
       a.d(FloatButtonPresenter.P8(this.a), "BREAK");
       return;
    }
    public void onPause(){
       PatchProxy.applyVoid(null, this, FloatButtonPresenter$a.class, "6");
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, FloatButtonPresenter$a.class, "1")) {
          return;
       }
       this.a.D = SystemClock.elapsedRealtime();
       a.a.d(FloatButtonPresenter.P8(this.a), "START");
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, FloatButtonPresenter$a.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       KLogLelink.e.a().w(this.a.p, "onStop: exit floatbutton", objArray);
       Context context = this.a.getContext();
       if (context != null) {
          CharSequence text = context.getText(R.string.arg_RES_7f1016f8);
          if (text != null) {
             i.e(R.style.arg_RES_7f11066a, text, i);
          }
       }
       a a = a.a;
       a.c(FloatButtonPresenter.P8(this.a), (SystemClock.elapsedRealtime() - this.a.D));
       a.d(FloatButtonPresenter.P8(this.a), "BREAK");
       return;
    }
}
