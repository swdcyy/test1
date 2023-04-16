package cl9.y$b;
import com.yxcorp.gifshow.comment.e$b;
import cl9.y;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.c1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.comment.e$f;
import java.util.Objects;
import android.view.View;
import com.yxcorp.gifshow.comment.utils.e;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Throwable;

public class y$b implements e$b	// class@000681
{
    public final y b;

    public void y$b(y p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       c1.e(this, p0, p1);
    }
    public void N1(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, y$b.class, "1")) {
          return;
       }
       if (!this.b.q.equals(p0)) {
          return;
       }
       y v = this.b.v;
       if (v != null) {
          e a = v.a;
          if (a != null) {
             a.b(p1);
          }
       }
       y$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, y.class, "11")) {
          v = tb.E;
          if (v != null) {
             v.setVisibility(8);
          }
       }
       tb = this.b;
       y f = tb.F;
       if (f != null) {
          tb.I = null;
          f.b();
       }
       this.b.S8();
       return;
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       c1.c(this, p0, p1, p2);
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
