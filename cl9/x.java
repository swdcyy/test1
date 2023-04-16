package cl9.x;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import cl9.y;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import o07.o;
import ek9.l1;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class x implements PopupInterface$h	// class@00067f
{
    public final y b;

    public void x(y p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
    }
    public void H(c p0,int p1){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ox, "1")) {
          return;
       }
       o.b(this, p0, p1);
       SharedPreferences$Editor uEditor = l1.a.edit();
       uEditor.putBoolean("imageGuideBubbleShown", true);
       g.a(uEditor);
       p0.K = null;
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
