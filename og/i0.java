package og.i0;
import erd.g;
import com.feature.post.bridge.util.PostVideoHelper$d;
import java.lang.Object;
import qm6.b$a;
import java.util.Objects;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import lnc.a1;
import q87.c;

public final class i0 implements g	// class@0027aa
{
    public final PostVideoHelper$d b;

    public void i0(PostVideoHelper$d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       l.D().w("PostVideoHelper", "onMusicFinishLoad diff is "+a1.o(tb.a), objArray);
       PostVideoHelper$d c = tb.c;
       if (c > 0) {
          tb.mMusicTimeCost = a1.o(c);
       }
       return;
    }
}
