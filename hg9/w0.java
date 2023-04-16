package hg9.w0;
import n3d.a;
import com.yxcorp.gifshow.camera.record.photo.p;
import java.io.File;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.g;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Class;
import ce9.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.yxcorp.gifshow.camera.record.photo.p$d;

public final class w0 implements a	// class@00267d
{
    public final p b;
    public final File c;

    public void w0(p p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       w0 tb = this.b;
       w0 tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 != 258) {
       }else if(p1 == -1){
          p d = tb.d;
          if (d instanceof TakePictureFragment) {
             d.ph();
          }
          g og = new g(tc, tb.f.b().G2().isFrontCamera(), tb.f.c(FilterConfig.class), tb.f.d(l.i).a, tb.c, true);
          RxBus.f.b(d instanceof TakePictureFragment);
       }else if(!p1){
          tb.e.K0();
       }
       return;
    }
}
