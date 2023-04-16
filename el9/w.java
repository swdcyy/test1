package el9.w;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.presenter.global.f;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import al9.a;
import ek9.c1;
import com.yxcorp.gifshow.comment.e$g;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.lang.Throwable;

public class w implements e$b	// class@002204
{
    public final f b;

    public void w(f p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "2")) {
          return;
       }
       w tb = this.b;
       QComment qComment = tb.P8(p1, tb.t.q());
       if (qComment == null) {
          return;
       }
       this.b.t.q().remove(qComment);
       return;
    }
    public void N1(QPhoto p0,QComment p1){
       c1.b(this, p0, p1);
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, w.class, "1")) {
          return;
       }
       w tb = this.b;
       QComment qComment = tb.P8(p1, tb.t.q());
       if (qComment == null) {
          return;
       }
       this.b.t.q().add(qComment);
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100107));
       return;
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       c1.a(this, p0, p1, p2);
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, w.class, "3")) {
          return;
       }
       w tb = this.b;
       QComment qComment = tb.P8(p1, tb.t.q());
       if (qComment == null) {
          return;
       }
       this.b.t.q().remove(qComment);
       return;
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       c1.d(this, p0, p1, p2);
    }
}
