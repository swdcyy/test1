package com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.tab.tag.a;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagRepo;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import jb7.b;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import hh9.b;
import erd.o;
import hh9.c;
import fh9.a;
import hh9.d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.camera.record.CameraActivity;

public class CameraTabTagManager$1 implements DefaultLifecycleObserver	// class@000f52
{
    public final CameraTabTagManager b;

    public void CameraTabTagManager$1(CameraTabTagManager p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       CameraTabTagManager b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraTabTagManager$1.class, str)) {
          return;
       }
       a uoa = new a(this.b);
       CameraTabTagRepo uCameraTabTa = CameraTabTagRepo.class;
       if (!PatchProxy.applyVoidOneRefs(uoa, null, uCameraTabTa, "2")) {
          CameraTabTagRepo c = CameraTabTagRepo.c;
          Objects.requireNonNull(c);
          b uob = PatchProxy.apply(null, c, uCameraTabTa, str);
          if (uob == PatchProxyResult.class) {
             uob = CameraTabTagRepo.a.getValue();
          }
          CameraTabTagRepo.b = uob.a(CachePolicy.NETWORK_ONLY).observeOn(d.a).map(b.b).subscribe(new c(uoa), d.b);
       }
       b = this.b.b;
       if (b != null) {
          b.V3(this);
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
