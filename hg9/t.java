package hg9.t;
import com.yxcorp.gifshow.camera.record.photo.m;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.photo.h;

public final class t extends m	// class@002678
{

    public void t(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
    }
    public BaseMultiTakePictureController i2(){
       Object obj = PatchProxy.apply(null, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d tc = this.c;
       a.o(tc, "mPageType");
       d td = this.d;
       a.o(td, "mCallerContext");
       m tC = this.C;
       a.o(tC, "pictureCapture");
       return new MultiTakePictureController(tc, td, tC);
    }
}
