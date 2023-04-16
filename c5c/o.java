package c5c.o;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import z5c.g;
import k2b.f3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import o07.o;

public class o implements PopupInterface$h	// class@00052e
{
    public final h b;

    public void o(h p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, str)) {
          return;
       }
       h t = this.b.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(null, t, g.class, str)) {
          f3 uof3 = f3.j("H5_FOLLOW_POPUP");
          uof3.d("PROFILE");
          uof3.b(b0.f(t.a));
          uof3.g();
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
