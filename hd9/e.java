package hd9.e;
import z1.a;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootFragment;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import oc9.t;
import lnc.q;

public final class e implements a	// class@00260d
{
    public final FollowShootFragment a;
    public final List b;

    public void e(FollowShootFragment p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       q.a(this.b, p0.c(ta, RecordPModuleRegister$PModuleSubBiz.BIZ_MAGIC_MAIN));
    }
}
