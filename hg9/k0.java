package hg9.k0;
import z1.a;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import oc9.t;
import lnc.q;

public final class k0 implements a	// class@002665
{
    public final TakePictureFragment a;
    public final List b;

    public void k0(TakePictureFragment p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       k0 ta = this.a;
       Objects.requireNonNull(ta);
       q.a(this.b, p0.c(ta, RecordPModuleRegister$PModuleSubBiz.BIZ_MAGIC_FACE_GUIDE));
    }
}
