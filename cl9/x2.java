package cl9.x2;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import cl9.y2;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o07.o;

public class x2 implements PopupInterface$h	// class@00067e
{
    public final y2 b;

    public void x2(y2 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x2.class, "1")) {
          return;
       }
       x2 tb = this.b;
       Objects.requireNonNull(tb);
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
