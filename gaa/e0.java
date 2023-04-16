package gaa.e0;
import erd.g;
import gaa.h0;
import voc.i;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import java.io.File;
import java.lang.String;
import com.yxcorp.gifshow.media.util.c;
import java.lang.Integer;

public final class e0 implements g	// class@00242c
{
    public final h0 b;
    public final i c;

    public void e0(h0 p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       e0 tc = this.c;
       Objects.requireNonNull(tb);
       Pair first = p0.first;
       if (first != null) {
          tb.o = (long)c.i(first.getPath()) - 0;
          tb.p = first.getAbsolutePath();
       }
       tc.g("DOWNLOAD_MUSIC_TASK", p0.second.intValue(), 7);
       return;
    }
}
