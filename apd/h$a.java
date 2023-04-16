package apd.h$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import apd.h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import apd.i;
import so7.b;

public class h$a implements PopupInterface$h	// class@000216
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       i j = this.b.b.j;
       if (j != null) {
          j.destroy();
          h b = this.b.b;
          b.j = null;
          b.k = null;
          b.l = null;
       }
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
