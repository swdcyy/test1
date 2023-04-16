package cl9.k2$c;
import erd.g;
import cl9.k2;
import java.lang.Object;
import nk9.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.utils.d;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class k2$c implements g	// class@000640
{
    public final k2 b;

    public void k2$c(k2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2$c.class, "1")) {
       }else {
          this.b.S8();
          if (!PatchProxy.applyVoid(null, null, d.class, "33")) {
             String b = d.b;
             g.a(n.b().edit().putInt(b, (n.b().getInt(b, 0) + 1)));
          }
       }
       return;
    }
}
