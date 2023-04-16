package bed.e;
import erd.g;
import bed.y;
import s3b.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Objects;
import java.lang.Exception;
import om6.m;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import brd.t;
import bed.b;
import crd.b;

public final class e implements g	// class@000406
{
    public final y b;
    public final a c;
    public final SimpleMagicFace d;
    public final String e;
    public final GifshowActivity f;
    public final Music g;
    public final QPhoto h;
    public final RecordPostPlugin i;

    public void e(y p0,a p1,SimpleMagicFace p2,String p3,GifshowActivity p4,Music p5,QPhoto p6,RecordPostPlugin p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       e te = this.e;
       e tf = this.f;
       e tg = this.g;
       e th = this.h;
       e ti = this.i;
       Objects.requireNonNull(tb);
       if (!tc.h(p0)) {
          tc.i(tc.b(p0));
       }else {
          b uob = new b(tb, tf, te, td, tg, th, ti);
          y6.r(m.class).JM(td.mId, te).subscribe(v8);
       }
       return;
    }
}
