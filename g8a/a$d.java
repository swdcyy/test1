package g8a.a$d;
import erd.g;
import g8a.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;

public final class a$d implements g	// class@00240c
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else if(this.b.w == null){
          a.o(p0, "it");
          if (p0.booleanValue()) {
             a.P8(this.b).setVisibility(8);
          }else {
             a.P8(this.b).setVisibility(0);
          }
       }
       return;
    }
}
