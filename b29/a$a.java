package b29.a$a;
import qp7.b1;
import b29.a;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserVerifiedDetail;
import n49.s;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import b29.a$a$a;
import erd.g;

public final class a$a implements b1	// class@00035a
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       a1.a(this);
    }
    public void b(){
       a1.g(this);
    }
    public void c(boolean p0){
       a1.b(this, p0);
    }
    public void d(boolean p0){
       a1.h(this, p0);
    }
    public void e(boolean p0){
       a1.f(this, p0);
    }
    public void f(boolean p0){
       a1.d(this, p0);
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       User user = a.n0(this.a).getUser();
       if (user != null) {
          user = user.mVerifiedDetail;
          if (user != null && (user.mIconType == 2 && s.a())) {
             o.z().e(140, a.n0(this.a).mEntity).d(a$a$a.b).a();
          }
       }
       return;
    }
}
