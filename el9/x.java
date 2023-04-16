package el9.x;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.comment.presenter.global.f;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pk9.e;
import o07.o;

public class x implements PopupInterface$h	// class@002205
{
    public final QComment b;
    public final f c;

    public void x(f p0,QComment p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       x tc = this.c;
       tc.z = this.b;
       tc.x.c();
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
