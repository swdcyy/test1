package hd9.f;
import z1.a;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootFragment;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;
import oc9.t;
import lnc.q;

public final class f implements a	// class@00260f
{
    public final FollowShootFragment a;
    public final List b;

    public void f(FollowShootFragment p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       f ta = this.a;
       Objects.requireNonNull(ta);
       q.a(this.b, p0.c(ta, null));
    }
}
