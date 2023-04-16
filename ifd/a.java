package ifd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s99.i;
import ba9.a;
import ifd.a$a;
import android.view.View;
import ekd.m1;
import java.util.List;

public class a extends PresenterV2	// class@001000
{
    public List p;
    public i q;
    public a r;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.r.y(this.q);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.q = new a$a(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.r.A(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a30e1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("SEARCH_PLAY_CARD_LISTENERS");
       return;
    }
}
