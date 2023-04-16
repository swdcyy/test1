package ii9.e;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import eg9.b;
import ii9.c;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tg9.b;
import ii9.b;
import android.view.View$OnClickListener;
import android.content.Context;
import com.yxcorp.utility.n;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import cw9.c;
import sm6.b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import ii9.d;
import erd.g;
import crd.b;
import eoc.f;

public class e extends d	// class@002836
{
    public View n;
    public boolean o;

    public void e(CameraPageType p0,b p1){
       super(p0, p1);
       this.o = false;
       this.d.n(b.class, new c(this));
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.k(p0);
       this.n = p0.findViewById(0x7f0a05b3);
       this.d.j().addView(this.n);
       this.n.setOnClickListener(new b(this));
       b.x(this.n, (n.A(this.e) + c.b(a.b().getResources(), R.dimen.arg_RES_7f07109f)));
       if (PostExperimentUtils.n()) {
          this.Y1(f.a(PanelShowEvent.class, new d(this)));
       }
       return;
    }
}
