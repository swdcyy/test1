package com.yxcorp.gifshow.camera.record.log.b;
import com.kwai.camerasdk.videoCapture.CameraController$d;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import be9.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.camerasdk.q;
import android.content.Intent;

public class b extends d implements CameraController$d	// class@000e23
{
    public long n;

    public void b(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void N(long p0,long p1){
    }
    public void O(long p0){
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.k(p0);
       if (this.n > 0) {
          long l = System.currentTimeMillis();
          if (l - this.n > 0) {
             this.b2(new c(this, l));
          }
          this.n = 0;
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       super.nb(p0);
       this.h.j(this);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.h.d0(this);
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.w1(p0);
       this.n = System.currentTimeMillis();
       return;
    }
}
