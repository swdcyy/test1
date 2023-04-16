package bed.g;
import erd.g;
import bed.y;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.util.Objects;
import ixc.c;
import java.lang.Class;
import lnc.pa;
import lnc.qa;
import s3b.a;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import brd.t;
import t45.d;
import brd.z;
import bed.e;
import bed.r;
import crd.b;

public final class g implements g	// class@00040a
{
    public final y b;
    public final SimpleMagicFace c;
    public final String d;
    public final GifshowActivity e;
    public final Music f;
    public final QPhoto g;

    public void g(y p0,SimpleMagicFace p1,String p2,GifshowActivity p3,Music p4,QPhoto p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       p0 = qa.r(c.class).KA();
       e uoe = new e(tb, p0, tc, this.d, this.e, this.f, this.g, p0);
       p0.s(tc, MagicBusinessId.VIDEO).observeOn(d.a).subscribe(v10, new r(p0));
    }
}
