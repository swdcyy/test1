package jd9.f$a$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import jd9.f$a;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.bubble.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import jd9.g;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Integer;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import jd9.f;
import o07.o;

public class f$a$a implements PopupInterface$h	// class@002a5f
{
    public final PostBubbleManager$c b;
    public final a c;
    public final f$a d;

    public void f$a$a(f$a p0,PostBubbleManager$c p1,a p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("LipSynchGuideController", "LipSycnhGuideDialog show", objArray);
       f$a$a tb = this.b;
       if (tb != null) {
          tb.b(this.c, p0);
       }
       this.d.b.d.m(new g(true));
       return;
    }
    public void H(c p0,int p1){
       f$a$a uoa$a = f$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa$a, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("LipSynchGuideController", "LipSycnhGuideDialog dismisss", objArray);
       uoa$a = this.b;
       if (uoa$a != null) {
          uoa$a.a(this.c, p0, p1);
       }
       this.d.b.d.b().V7().u(RecordBubbleItem.LIP_SYNCH);
       this.d.b.d.m(new g(0));
       p0.o = null;
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
