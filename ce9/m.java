package ce9.m;
import io.reactivex.g;
import s3b.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import brd.v;
import z3b.a;
import z3b.f;
import ce9.q;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicBaseConfig;

public final class m implements g	// class@0005c9
{
    public final a b;
    public final MagicEmoji$MagicFace c;

    public void m(a p0,MagicEmoji$MagicFace p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       f[] uofArray = new f[]{new q(p0)};
       this.b.H0().a("record", "taken_in_resource", this.c, uofArray);
    }
}
