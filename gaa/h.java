package gaa.h;
import erd.g;
import gaa.s;
import voc.i;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import java.io.File;
import java.lang.String;
import com.yxcorp.gifshow.media.util.c;
import java.lang.Integer;

public final class h implements g	// class@002435
{
    public final s b;
    public final long c;
    public final long d;
    public final i e;

    public void h(s p0,long p1,long p2,i p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       Objects.requireNonNull(tb);
       Pair first = p0.first;
       if (first != null) {
          tb.i = (tc <= 0)? (long)c.i(first.getPath()) - td: tc;
          tb.j = first.getAbsolutePath();
       }
       te.g("DOWNLOAD_MUSIC_TASK", p0.second.intValue(), 7);
       return;
    }
}
