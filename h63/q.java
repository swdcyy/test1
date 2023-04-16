package h63.q;
import ok.h;
import h63.y;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import u37.d;
import u37.e;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import y43.a;
import java.lang.String;
import brd.t;
import cjd.e;
import erd.o;
import h63.v;
import sfc.a;
import erd.g;
import crd.b;

public final class q implements h	// class@002c97
{
    public final y b;

    public void q(y p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       v ov = new v(tb);
       return e.b().b(tb.q.Q().getLiveStreamId()).map(new e()).subscribe(ov, new a());
    }
}
