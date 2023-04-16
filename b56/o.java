package b56.o;
import z46.b$a;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.View;
import android.widget.ImageView;

public class o implements b$a	// class@00040e
{
    public final KwaiXfControlPanel a;

    public void o(KwaiXfControlPanel p0){
       this.a = p0;
       super();
    }
    public void s(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "2")) {
          return;
       }
       this.a.M.setSelected(p0);
       return;
    }
    public void t(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "1")) {
          return;
       }
       KwaiXfControlPanel n = this.a.N;
       int i = (p0)? 0x7f080663: 0x7f08065e;
       n.setImageResource(i);
       return;
    }
}
