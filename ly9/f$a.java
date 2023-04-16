package ly9.f$a;
import com.yxcorp.gifshow.comment.e$b;
import ly9.f;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ly9.g;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import java.util.List;
import ek9.c1;
import com.yxcorp.gifshow.comment.e$g;
import qvb.a;
import java.lang.Throwable;

public class f$a implements e$b	// class@002eb8
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "2")) {
          return;
       }
       if (!this.b.a.equals(p0)) {
          return;
       }
       f$a tb = this.b;
       tb.j.add(e.a(p1, tb.b.a.simpleEnabled));
       return;
    }
    public void N1(QPhoto p0,QComment p1){
       c1.b(this, p0, p1);
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f$a.class, "1")) {
          return;
       }
       if (!this.b.a.equals(p0)) {
          return;
       }
       f$a tb = this.b;
       tb.c.add(tb.h, e.a(p1, tb.b.a.simpleEnabled));
       return;
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       c1.a(this, p0, p1, p2);
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       c1.f(this, p0, p1, p2);
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       c1.d(this, p0, p1, p2);
    }
}
