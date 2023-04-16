package hl9.p;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.comment.utils.b;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o07.o;
import k2b.e0;
import java.lang.Integer;

public class p implements PopupInterface$h	// class@0026da
{
    public final int b;
    public final String c;
    public final b d;

    public void p(b p0,int p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       o.e(this, p0);
       b.g(true);
       b.f(this.d.a, this.b, this.c);
       return;
    }
    public void H(c p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "2")) {
          return;
       }
       o.b(this, p0, p1);
       b.g(false);
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
