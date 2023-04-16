package gnd.b$a;
import a17.b$b;
import msd.q;
import java.util.List;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import gnd.a;

public final class b$a implements b$b	// class@000f51
{
    public final q a;
    public final List b;

    public void b$a(q p0,List p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(c p0,View p1,int p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b$a.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       this.a.invoke(p0, p1, this.b.get(p2).b);
       return;
    }
}
