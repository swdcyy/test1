package mg.z1;
import erd.g;
import com.kwai.feature.post.api.feature.bridge.JsMagicPreloadParams;
import java.lang.Object;
import ixc.c;
import z3b.a;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.String;

public final class z1 implements g	// class@002683
{
    public final JsMagicPreloadParams b;

    public void z1(JsMagicPreloadParams p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z1 tb = this.b;
       p0.H0().j("record", "taken_in_resource", tb.mMagicFaceId, tb.mChildMagicFaceId, MagicBusinessId.VIDEO);
    }
}
