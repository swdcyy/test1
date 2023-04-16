package dl9.d$a;
import com.yxcorp.gifshow.widget.m;
import dl9.d;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class d$a extends m	// class@001f53
{
    public final d c;
    public final TextView d;
    public final View$OnClickListener e;

    public void d$a(d p0,TextView p1,View$OnClickListener p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       this.e.onClick(p0);
       PatchProxy.onMethodExit(d$a.class, "1");
       return;
    }
}
