package hd9.c;
import z1.a;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootFragment;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;

public final class c implements a	// class@002609
{
    public final FollowShootFragment a;

    public void c(FollowShootFragment p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       p0.b(ta, null);
    }
}
