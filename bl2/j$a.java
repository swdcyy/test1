package bl2.j$a;
import bl2.j;
import android.view.View;
import java.lang.Object;
import ekd.m1;
import android.widget.TextView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;

public class j$a	// class@000412
{
    public final View a;
    public final View b;
    public final TextView c;
    public final j d;

    public void j$a(j p0,View p1){
       this.d = p0;
       super();
       this.a = p1;
       this.b = m1.f(p1, 0x7f0a264a);
       this.c = m1.f(p1, 0x7f0a2649);
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
}
