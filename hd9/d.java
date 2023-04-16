package hd9.d;
import z1.a;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootFragment;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;

public final class d implements a	// class@00260b
{
    public final FollowShootFragment a;

    public void d(FollowShootFragment p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       p0.a(ta, null);
    }
}
