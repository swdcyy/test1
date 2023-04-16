package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge$b;
import s59.b;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import s59.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import a59.f;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Long;
import g59.p;

public final class RegisterProgressListenerBridge$b implements b	// class@00181b
{
    public final RegisterProgressListenerBridge a;

    public void RegisterProgressListenerBridge$b(RegisterProgressListenerBridge p0){
       this.a = p0;
       super();
    }
    public void a(DownloadTask p0){
       a.a(this, p0);
    }
    public String getKey(){
       PhotoAdvertisement obj = PatchProxy.apply(null, this, RegisterProgressListenerBridge$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.B(this.a.f.e());
       if (obj != null) {
          obj = obj.mUrl;
          if (obj != null) {
          label_0025 :
             return obj;
          }
       }
       String str = "";
       goto label_0025 ;
    }
    public void onCancel(){
       a.b(this);
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, RegisterProgressListenerBridge$b.class, "4")) {
          return;
       }
       this.a.i(5);
       return;
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, RegisterProgressListenerBridge$b.class, "7")) {
          return;
       }
       this.a.i(4);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, RegisterProgressListenerBridge$b.class, "5")) {
          return;
       }
       this.a.i(3);
       return;
    }
    public void onProgress(long p0,long p1){
       RegisterProgressListenerBridge$b uob = RegisterProgressListenerBridge$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uob, "3")) {
          return;
       }
       this.a.c = p.a(p0, p1);
       this.a.i(2);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, RegisterProgressListenerBridge$b.class, "6")) {
          return;
       }
       this.a.i(2);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, RegisterProgressListenerBridge$b.class, "2")) {
          return;
       }
       this.a.i(2);
       return;
    }
}
