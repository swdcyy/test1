package mg.r;
import erd.g;
import com.kwai.feature.post.api.feature.bridge.JsGetMagicFaceParams;
import f55.g;
import java.lang.Object;
import ixc.c;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.String;
import brd.t;
import mg.o;
import erd.o;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import mg.p;
import mg.q;
import crd.b;

public final class r implements g	// class@00265a
{
    public final JsGetMagicFaceParams b;
    public final g c;

    public void r(JsGetMagicFaceParams p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       r tb = this.b;
       p0.Vf(MagicBusinessId.getMagicBizId(this.b.mBizId), tb.mMagicFaceId, tb.mChildMagicFaceId).flatMap(o.b).timeout(this.b.mTimeout, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new p(this), new q(this));
    }
}
