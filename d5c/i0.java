package d5c.i0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import d5c.g0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.util.o;
import s1c.r;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import lnc.a1;
import z5c.y1;
import k2b.f3;
import lnc.i3;
import k2b.e0;
import o07.o;

public class i0 implements PopupInterface$h	// class@0020f9
{
    public final g0 b;

    public void i0(g0 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = r.a.edit();
       uEditor.putLong("last_show_guide_bubble_version", o.l());
       g.a(uEditor);
       g0 s = this.b.s;
       String str = a1.p(R.string.arg_RES_7f100245);
       if (!PatchProxy.applyVoidTwoRefs(s, str, null, y1.class, "135")) {
          f3 uof3 = f3.l("", "GUIDE_TOAST");
          i3 oi3 = i3.f();
          oi3.d("text", str);
          uof3.m(oi3.e());
          uof3.h(s);
       }
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
