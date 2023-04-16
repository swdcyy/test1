package mr1.b$d;
import androidx.lifecycle.Observer;
import mr1.b;
import j83.b;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.l;
import lr1.b;
import androidx.lifecycle.LiveData;
import mr1.c;
import z0.a;
import androidx.lifecycle.Transformations;
import android.view.View;
import msd.p;

public final class b$d implements Observer	// class@0031f1
{
    public final b b;
    public final b c;
    public final ViewGroup d;

    public void b$d(b p0,b p1,ViewGroup p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
       }else {
          a.o(p0, "isVideoStream");
          if (p0.booleanValue()) {
             p0 = this.b;
             b d = p0.d;
             if (d != null) {
                a.m(d);
                p0.j.invoke(d);
                p0.d = null;
             }
          }else {
             p0 = this.b;
             if (p0.a != null && p0.d == null) {
                LiveData liveData = Transformations.map(this.c.d(), new c());
                a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
                p0.d = new b(liveData);
                View view = this.d.findViewById(R.id.live_audience_multi_line_audio_state_container);
                a.o(view, "rootView.findViewById\(R.¡­ne_audio_state_container\)");
                b d1 = this.b.d;
                a.m(d1);
                this.b.i.invoke(view, d1);
             }
          }
       }
       return;
    }
}
