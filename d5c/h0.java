package d5c.h0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import d5c.g0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s1c.o;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import o07.o;

public class h0 implements PopupInterface$h	// class@0020f7
{
    public final g0 b;

    public void h0(g0 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = o.a.edit();
       uEditor.putBoolean(b.d("user")+"profile_top_guide_show_bubble", true);
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
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
