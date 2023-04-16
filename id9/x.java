package id9.x;
import erd.g;
import id9.z;
import java.lang.Object;
import mc9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.music.Music;
import hd9.o;

public final class x implements g	// class@0027fe
{
    public final z b;

    public void x(z p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z.class, "9")) {
       }else {
          a c = p0.c;
          if (c == 2 || c == 7) {
             tb.x = p0.a;
             tb.y = p0.b.getAbsolutePath();
             tb.w = o.a(tb.x);
             tb.i2();
          }
       }
       return;
    }
}
