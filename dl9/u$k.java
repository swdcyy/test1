package dl9.u$k;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import dl9.u;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import ek9.l1;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Integer;
import android.os.SystemClock;

public final class u$k implements PopupInterface$h	// class@001fb5
{
    public final u b;

    public void u$k(u p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$k.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       SharedPreferences$Editor uEditor = l1.a.edit();
       uEditor.putBoolean("hasShownCommentThumbsDownGuideBubble", true);
       g.a(uEditor);
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       u$k ok = u$k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ok, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.c(this, p0, p1);
       p0.E = SystemClock.elapsedRealtime();
       return;
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
