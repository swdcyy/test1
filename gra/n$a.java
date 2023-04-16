package gra.n$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import gra.n;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.Integer;

public final class n$a implements PopupInterface$h	// class@002bbd
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       this.b.W8().h();
       return;
    }
    public void H(c p0,int p1){
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       this.b.W8().i();
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
