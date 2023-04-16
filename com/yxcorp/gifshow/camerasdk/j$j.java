package com.yxcorp.gifshow.camerasdk.j$j;
import wo4.c;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.camerasdk.videoCapture.CameraController;

public class j$j implements c	// class@001023
{
    public final j a;

    public void j$j(j p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j$j.class, "1")) {
          return;
       }
       if (this.a.o != null) {
          this.a.startPreviewImpl();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, j$j.class, "2")) {
          return;
       }
       if (this.a.o != null) {
          this.a.o.stopPreview();
       }
       return;
    }
}
