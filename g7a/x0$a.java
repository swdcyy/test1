package g7a.x0$a;
import com.yxcorp.gifshow.comment.e$b;
import g7a.x0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.c1;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.v3;
import yy6.c;
import java.lang.Throwable;

public class x0$a implements e$b	// class@002404
{
    public final x0 b;

    public void x0$a(x0 p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       c1.e(this, p0, p1);
    }
    public void N1(QPhoto p0,QComment p1){
       c1.b(this, p0, p1);
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       Object obj = this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, obj, x0$a.class, "1")) {
          return;
       }
       v3 f = this.b.p.f;
       f.k = f.k + 1;
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
