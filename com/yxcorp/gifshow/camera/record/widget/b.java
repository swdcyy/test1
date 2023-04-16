package com.yxcorp.gifshow.camera.record.widget.b;
import p65.g;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView$a;
import java.lang.Object;
import android.graphics.Bitmap;
import java.util.Objects;
import x8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import android.graphics.Bitmap$Config;
import x6b.f;
import ki9.a;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class b implements g	// class@000fe4
{
    public final AnimCameraView a;
    public final int b;
    public final long c;
    public final AnimCameraView$a d;

    public void b(AnimCameraView p0,int p1,long p2,AnimCameraView$a p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void b(Bitmap p0){
       a uoa;
       b uob = this;
       Bitmap obj = p0;
       b a = uob.a;
       b b = uob.b;
       b c = uob.c;
       b d = uob.d;
       Objects.requireNonNull(a);
       Object[] objArray = new Object[0];
       a.D().w("AnimCameraView", "capturePreview success bitmap: "+obj, objArray);
       if (obj != null) {
          obj = obj.copy(p0.getConfig(), true);
          if (obj != null) {
             f.a(obj, 0, 0, obj.getWidth(), obj.getHeight(), 0, 250);
          }
       }else {
          uoa = 0;
       }
       uoa = new a(a, b, c, obj, d);
       a.post(objArray);
       return;
    }
}
