package b19.a$a;
import jta.f;
import b19.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;

public final class a$a extends f	// class@000351
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       a p = this.a.p;
       if (p == null) {
          a.S("mContentView");
       }
       p.setPadding(0, 0, 0, (int)((float)this.a.x * p0));
       return;
    }
}
