package ce9.p;
import erd.g;
import brd.v;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import android.app.Activity;
import qm6.b$a;
import ce9.r;
import brd.g;

public final class p implements g	// class@0005cc
{
    public final v b;
    public final GifshowActivity c;
    public final MagicEmoji$MagicFace d;

    public void p(v p0,GifshowActivity p1,MagicEmoji$MagicFace p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       p tb = this.b;
       tb.onNext(r.a(this.c, this.d));
       tb.onComplete();
    }
}
