package i21.b;
import hka.b;
import i21.c;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fe3.a;

public final class b implements b	// class@00280a
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b ta = this.a;
       c e = ta.e;
       if (e != null) {
          a.m(e);
          ta.d(e);
       }
       return;
    }
}
