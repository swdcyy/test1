package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge;
import a59.e;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge$mActivityLifecycleObserver$1;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge$b;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge$a;
import java.lang.Runnable;
import t45.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import wkd.b;
import s59.s;
import s59.b;
import java.lang.Integer;
import t59.b;
import ekd.k1;
import fg6.a;
import com.google.gson.Gson;
import a59.a$a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge$c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import tw.j;
import android.content.Context;
import lnc.t3;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import g59.p;

public final class RegisterProgressListenerBridge extends e	// class@00181e
{
    public a b;
    public float c;
    public final LifecycleObserver d;
    public RegisterProgressListenerBridge$b e;
    public f f;

    public void RegisterProgressListenerBridge(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.f = p0;
       this.d = new RegisterProgressListenerBridge$mActivityLifecycleObserver$1(this);
       this.e = new RegisterProgressListenerBridge$b(this);
    }
    public String a(){
       return "registerProgressListener";
    }
    public Object c(JSONObject p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RegisterProgressListenerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       this.b = p1;
       c.a(new RegisterProgressListenerBridge$a(this));
       return this.e();
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RegisterProgressListenerBridge.class, "3")) {
          return;
       }
       Activity uActivity = this.f.b();
       if (uActivity instanceof GifshowActivity) {
          objArray = uActivity;
       }
       if (objArray != null) {
          Lifecycle lifecycle = objArray.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.d);
          }
       }
       b.a(-901401630).v(this.e);
       return;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RegisterProgressListenerBridge.class, "2")) {
          return;
       }
       Activity uActivity = this.f.b();
       if (uActivity instanceof GifshowActivity) {
          objArray = uActivity;
       }
       if (objArray != null) {
          Lifecycle lifecycle = objArray.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(this.d);
          }
       }
       b.a(-901401630).r(this.e);
       return;
    }
    public final void i(int p0){
       RegisterProgressListenerBridge registerProg = RegisterProgressListenerBridge.class;
       if (PatchProxy.isSupport(registerProg) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, registerProg, "5")) {
          return;
       }
       registerProg = this.b;
       if (registerProg != null) {
          b uob = new b();
          uob.mProgress = this.c;
          uob.mStatus = p0;
          if (k1.g()) {
             a$a.a(registerProg, a.a.q(uob), null, 2, null);
          }else {
             k1.o(new RegisterProgressListenerBridge$c(registerProg, uob));
          }
       }
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, RegisterProgressListenerBridge.class, "4")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(this.f.e());
       if (photoAdverti != null) {
          Activity uActivity = this.f.b();
          if (uActivity != null) {
             if (!j.C(photoAdverti)) {
                return;
             }else if(t3.d(uActivity, photoAdverti.mPackageName)){
                this.i(6);
                return;
             }else {
                APKDownloadTask uAPKDownload = h.n().l(photoAdverti.mUrl);
                int i = 1;
                if (uAPKDownload == null) {
                   this.i(i);
                   return;
                }else {
                   APKDownloadTask mCurrentStat = uAPKDownload.mCurrentStatus;
                   if (mCurrentStat == APKDownloadTask$DownloadStatus.COMPLETED) {
                      this.i(5);
                   }else if(mCurrentStat == APKDownloadTask$DownloadStatus.PAUSED){
                      this.c = p.a(uAPKDownload.mSoFarBytes, uAPKDownload.mTotalBytes);
                      this.i(3);
                   }else {
                      this.i(i);
                   }
                }
             }
          }
       }
       return;
    }
}
