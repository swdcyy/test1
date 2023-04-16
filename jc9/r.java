package jc9.r;
import java.lang.Runnable;
import jc9.b0;
import hc9.f;
import java.lang.Object;
import jc9.a0;
import java.util.Objects;
import ad9.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import ad9.j;
import ad9.h;
import android.animation.Animator$AnimatorListener;

public final class r implements Runnable	// class@00294a
{
    public final b0 b;
    public final boolean c;
    public final int d;
    public final f e;
    public final Runnable f;

    public void r(b0 p0,boolean p1,int p2,f p3,Runnable p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       r or = this;
       r b = or.b;
       r c = or.c;
       r d = or.d;
       r e = or.e;
       r f = or.f;
       b0 d1 = b.d;
       a0 uoa0 = (c != null)? new a0(b): 0;
       a0 uoa01 = uoa0;
       long l = b.f(d, e);
       Objects.requireNonNull(d1);
       if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(c), uoa01, Long.valueOf(l), d1, i.class, "5")) {
          if (d1.l != null) {
             if (c != null) {
                d1.i(uoa01, l);
             }
          }else {
             d1.l = true;
             b0 uob0 = d1;
             r or1 = c;
             b0 uob01 = d1;
             long l1 = l;
             j oj = new j(uob0, or1, uoa01, l1);
             h oh = new h(uob01, or1, uoa01, l1);
             uob01.h(b, v14);
          }
       }
       if (f != null) {
          f.run();
       }
       return;
    }
}
