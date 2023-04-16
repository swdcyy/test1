package n1a.b;
import android.view.View$OnClickListener;
import n1a.g;
import java.lang.Object;
import android.view.View;
import k1a.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import android.widget.TextView;
import a27.c;

public final class b implements View$OnClickListener	// class@0030b3
{
    public final g b;

    public void b(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       b uob = b.class;
       g v = tb.v;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(v, obj, uob, "2")) {
       }else {
          ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.action2 = "ADD_BLOCK_KEYWORDS_BUTTON";
          b.a(v, uElementPack1);
       }
       if (!PatchProxy.applyVoid(obj, tb, g.class, "4") && tb.q.getVisibility()) {
          tb.q.setVisibility(0);
          tb.p.setVisibility(8);
          v = tb.v;
          if (!PatchProxy.applyVoidOneRefs(v, obj, uob, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ADD_BUTTON";
             b.c(v, uElementPack);
          }
          c.e(tb.r);
       }
       return;
    }
}
