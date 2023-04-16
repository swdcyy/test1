package id9.b0;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.VideoFeed;
import tl8.d;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.music.Music;
import hd9.o;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import android.view.View;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import ekd.j0;
import mc9.a;
import id9.a0;
import erd.g;
import crd.b;

public class b0 extends d0	// class@0027e7
{
    public BaseFeed o;
    public String p;

    public void b0(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, b0.class, "3")) {
          return;
       }
       if (o.a(this.o.a(VideoFeed.class)) == null && !TextUtils.x(this.p)) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10370e);
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       super.k(p0);
       this.g2();
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       super.w1(p0);
       this.o = SerializableHook.getSerializableExtra(p0, "source_photo_origin_photo");
       this.p = j0.f(p0, "source_photo_origin_file");
       this.d.l(a.class, new a0(this));
       return;
    }
}
