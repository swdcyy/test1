package hg9.i0;
import z1.a;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;
import oc9.t;
import lnc.q;

public final class i0 implements a	// class@002661
{
    public final TakePictureFragment a;
    public final List b;

    public void i0(TakePictureFragment p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       i0 ta = this.a;
       Objects.requireNonNull(ta);
       q.a(this.b, p0.c(ta, null));
    }
}