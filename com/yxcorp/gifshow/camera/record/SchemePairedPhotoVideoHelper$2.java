package com.yxcorp.gifshow.camera.record.SchemePairedPhotoVideoHelper$2;
import androidx.lifecycle.LifecycleObserver;
import crd.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.SchemePairedPhotoVideoHelper;

public class SchemePairedPhotoVideoHelper$2 implements LifecycleObserver	// class@001c97
{
    public final b b;
    public final ProgressFragment c;

    public void SchemePairedPhotoVideoHelper$2(b p0,ProgressFragment p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SchemePairedPhotoVideoHelper$2.class, "1")) {
          return;
       }
       if (!this.b.isDisposed()) {
          SchemePairedPhotoVideoHelper.b(this.c);
          this.b.dispose();
       }
       return;
    }
}
