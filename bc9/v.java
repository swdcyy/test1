package bc9.v;
import android.view.View$OnClickListener;
import bc9.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.j;
import cc9.a;
import java.util.ArrayList;
import java.util.List;
import nsd.u;
import sa6.a;

public final class v implements View$OnClickListener	// class@000407
{
    public final l b;

    public void v(l p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, v.class, "1")) {
          return;
       }
       j oj = this.b.g2().g();
       a z = this.b.g2().z;
       if (z == null) {
          z = new ArrayList();
       }
       z = new a("", "", false, z, true, true, 4, null);
       oj.w0(v0);
       PatchProxy.onMethodExit(v.class, "1");
       return;
    }
}
