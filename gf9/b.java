package gf9.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eda.w;
import gf9.a;
import erd.g;
import crd.b;
import eoc.f;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.feature.post.api.model.DownloadStatus;

public class b extends d	// class@002471
{
    public DownloadStatus n;

    public void b(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.k(p0);
       this.Y1(f.a(w.class, new a(this)));
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.w1(p0);
       this.n = SerializableHook.getSerializableExtra(p0, "EXTRA_MAGIC_FACE_DOWNLOAD_STATUS");
       return;
    }
}
