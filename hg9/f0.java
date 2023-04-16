package hg9.f0;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.photo.m$b;
import java.io.File;
import android.graphics.Bitmap;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.photo.p;
import j8c.a;
import q87.c;
import kuaishou.perf.page.impl.d;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.base.b;
import android.widget.ImageView;

public final class f0 implements Runnable	// class@002659
{
    public final m$b b;
    public final File c;
    public final Bitmap d;
    public final int e;

    public void f0(m$b p0,File p1,Bitmap p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       m a;
       f0 tc = this.c;
       f0 td = this.d;
       f0 te = this.e;
       m$b b = this.b.b;
       Objects.requireNonNull(b);
       if (PatchProxy.isSupport(m.class) && (!PatchProxy.applyVoidThreeRefs(tc, td, Integer.valueOf(te), b, m.class, "26") && b.D.i())) {
          Object[] objArray = new Object[0];
          a.D().w("TakePictureController", "onPictureTakeBitmapSuccess", objArray);
          d.d("postPhotoToEditorMonitor").h("clickToTakeSuccess");
          d.d("postPhotoToEditorMonitor").g("takeSuccessToDoBackground");
          a = b.A;
          if (a != null) {
             a.dismiss();
             b.A = null;
          }
          p.a(b.d);
          b.D.j(tc, td, te);
          m t = b.t;
          if (t != null) {
             t.setImageBitmap(td);
          }
       }
    label_006c :
       return;
    }
}
