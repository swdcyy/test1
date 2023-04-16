package bc9.t;
import android.view.View$OnClickListener;
import bc9.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.assistant.a;
import e17.i;

public final class t implements View$OnClickListener	// class@000405
{
    public final l b;

    public void t(l p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, t.class, "1")) {
          return;
       }
       if (this.b.g2().y()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100235);
       }
       PatchProxy.onMethodExit(t.class, "1");
       return;
    }
}
