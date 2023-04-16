package dl9.b;
import com.yxcorp.gifshow.widget.m;
import dl9.c;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b extends m	// class@001f4c
{
    public final c c;
    public final TextView d;
    public final View$OnClickListener e;

    public void b(c p0,TextView p1,View$OnClickListener p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       this.e.onClick(p0);
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
