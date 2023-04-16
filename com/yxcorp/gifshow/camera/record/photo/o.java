package com.yxcorp.gifshow.camera.record.photo.o;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.photo.p;
import java.io.File;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.yxcorp.gifshow.camera.record.photo.o$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.g;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import ce9.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public class o implements View$OnClickListener	// class@000ef4
{
    public final File b;
    public final p c;

    public void o(p p0,File p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(this.c.a, "sendImageBtn", objArray);
       o tc = this.c;
       p c = tc.c;
       if (TakePictureType.LIVE_ENTRY == c || TakePictureType.LIVE_PLAY == c) {
          p d = tc.d;
          if (d instanceof TakePictureFragment) {
             d.ph();
          }
          g og = new g(this.b, this.c.f.b().G2().isFrontCamera(), this.c.f.c(FilterConfig.class), this.c.f.d(l.i).a, this.c.c, false);
          RxBus.f.b(v7);
          return;
       }else {
          Void[] voidArray = new Void[i];
          new o$a(this, this.c.d()).c(voidArray);
          return;
       }
    }
}
