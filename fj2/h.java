package fj2.h;
import com.yxcorp.gifshow.util.resource.n$c;
import fj2.o;
import java.lang.Object;
import boc.b;
import java.util.Objects;
import com.yxcorp.gifshow.util.resource.Category;
import fj2.n;
import java.lang.Runnable;
import ekd.k1;
import boc.z;
import java.lang.Throwable;

public final class h implements n$c	// class@002970
{
    public final o a;

    public void h(o p0){
       this.a = p0;
    }
    public final void a(b p0){
       h ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 == Category.SCREENCAST_PATCH) {
          k1.p(new n(ta), ta.p);
       }
       return;
    }
    public void b(b p0,float p1){
       z.c(this, p0, p1);
    }
    public void c(b p0){
       z.a(this, p0);
    }
    public void d(b p0,Throwable p1){
       z.b(this, p0, p1);
    }
}
