package ced.b0;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jkd.c;
import java.lang.Object;
import om6.f;
import nm6.d;
import com.yxcorp.gifshow.entity.QPhoto;

public final class b0 implements g	// class@00053e
{
    public final m b;
    public final GifshowActivity c;
    public final c d;

    public void b0(m p0,GifshowActivity p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d uod = new d();
       uod.p(true);
       uod.m(true);
       uod.l(this.d);
       p0.Qh(this.c, this.b.B, uod);
    }
}
