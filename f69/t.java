package f69.t;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import f69.s;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import android.graphics.Typeface;
import lnc.a1;
import o07.o;

public class t implements PopupInterface$h	// class@0022c4
{
    public final s b;

    public void t(s p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       View view = p0.z();
       if (view != null) {
          TextView textView = view.findViewById(R.id.text);
          textView.setTypeface(Typeface.defaultFromStyle(1));
          textView.setTextColor(a1.a(R.color.arg_RES_7f0617ba));
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
