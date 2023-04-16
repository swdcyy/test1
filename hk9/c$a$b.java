package hk9.c$a$b;
import com.yxcorp.gifshow.comment.e$b;
import hk9.c$a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ek9.c1;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Throwable;

public final class c$a$b implements e$b	// class@002696
{
    public final c$a b;

    public void c$a$b(c$a p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a$b.class, "1")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "comment");
       if (a.g(this.b.b9(), p0)) {
          this.b.c9();
       }
       return;
    }
    public void N1(QPhoto p0,QComment p1){
       c1.b(this, p0, p1);
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$a$b.class, "2")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "comment");
       a.p(p2, "intercept");
       if (a.g(this.b.b9(), p0)) {
          this.b.c9();
       }
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
