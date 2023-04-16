package ghd.s;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.f3;
import k2b.e0;
import java.lang.Integer;
import o07.o;

public class s implements PopupInterface$h	// class@000f3a
{
    public final GifshowActivity b;
    public final PopupInterface$h c;

    public void s(GifshowActivity p0,PopupInterface$h p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       f3.j("ALL_PEOPLE_TOSEE_POPUP").h(this.b);
       s tc = this.c;
       if (tc != null) {
          tc.B(p0);
       }
       return;
    }
    public void H(c p0,int p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, os, "2")) {
          return;
       }
       os = this.c;
       if (os != null) {
          os.H(p0, p1);
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
