package lz9.b0$d;
import com.yxcorp.gifshow.comment.e$b;
import lz9.b0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Throwable;
import ek9.c1;

public class b0$d implements e$b	// class@002ece
{
    public final b0 b;

    public void b0$d(b0 p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b0$d.class, "4")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void N1(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b0$d.class, "1")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b0$d.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
    public final void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$d.class, "6")) {
          return;
       }
       if (!this.b.t.equals(p0)) {
          return;
       }
       b0$d tb = this.b;
       tb.t = p0;
       tb.r0();
       return;
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b0$d.class, "3")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       c1.f(this, p0, p1, p2);
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b0$d.class, "5")) {
          return;
       }
       this.a(p0);
       return;
    }
}
