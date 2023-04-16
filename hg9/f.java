package hg9.f;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.camera.record.photo.e;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import oa0.a;

public final class f implements b$c	// class@00265b
{
    public final e a;

    public void f(e p0){
       this.a = p0;
    }
    public final boolean c(){
       f ta = this.a;
       d c = ta.c;
       boolean b = (c != CameraPageType.VIDEO && (c != CameraPageType.LIVE_AVATAR && (!ta.d.k() && a.z0())))? true: false;
       return b;
    }
}
