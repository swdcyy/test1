package bpb.g;
import erd.g;
import com.yxcorp.gifshow.music.cloudmusic.local.d;
import brd.v;
import java.lang.Object;
import java.lang.Boolean;
import erd.r;
import java.util.List;
import voc.a0;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.music.cloudmusic.local.response.LocalMusicResponse;
import brd.g;

public final class g implements g	// class@000425
{
    public final d b;
    public final v c;

    public void g(d p0,v p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tc = this.c;
       p0 = this.b.r.d(null);
       if (!q.f(p0)) {
          p0.add(d.s);
       }
       tc.onNext(new LocalMusicResponse(p0));
       tc.onComplete();
       return;
    }
}
