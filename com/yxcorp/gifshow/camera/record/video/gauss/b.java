package com.yxcorp.gifshow.camera.record.video.gauss.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.video.gauss.HoleImageView;
import com.yxcorp.gifshow.camerasdk.q;
import lnc.a1;
import com.yxcorp.gifshow.camera.record.video.gauss.a;
import qi9.o1;
import android.graphics.Bitmap;

public class b extends d	// class@000f86
{
    public HoleImageView n;
    public Bitmap o;

    public void b(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.k(p0);
       this.n = p0.findViewById(0x7f0a0615);
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.nb(p0);
       this.h.W0(new a(this, a1.a(R.color.arg_RES_7f061c15)));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       super.onDestroyView();
       b to = this.o;
       if (to != null && !to.isRecycled()) {
          this.o.recycle();
          this.o = null;
       }
       return;
    }
}
