package ghd.r;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import sgd.a;
import java.lang.Integer;
import o07.o;

public class r implements PopupInterface$h	// class@000f39
{
    public final GifshowActivity b;
    public final PopupInterface$h c;

    public void r(GifshowActivity p0,PopupInterface$h p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       a.g("", this.b);
       return;
    }
    public void H(c p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, or, "2")) {
          return;
       }
       or = this.c;
       if (or != null) {
          or.H(p0, p1);
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
