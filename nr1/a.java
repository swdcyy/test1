package nr1.a;
import androidx.lifecycle.LifecycleOwner;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import j83.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import nr1.a$a;
import androidx.lifecycle.Observer;
import nr1.a$b;

public final class a	// class@0033ae
{
    public final LifecycleOwner a;
    public final p b;

    public void a(LifecycleOwner p0,p p1){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "updatePositionCallback");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(ViewGroup p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       a.p(p1, "widgetModel");
       View view = p0.findViewById(R.id.live_audience_multi_line_self_anchor_tag);
       a.o(view, "rootView.findViewById\(R.¡­lti_line_self_anchor_tag\)");
       p1.d().observe(this.a, new a$a(this, p0));
       p1.b().observe(this.a, new a$b(this, view));
       return;
    }
}
