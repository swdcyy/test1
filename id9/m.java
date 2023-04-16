package id9.m;
import pi9.j$a;
import id9.t;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import tg9.b;
import com.yxcorp.gifshow.camera.record.base.b;
import pi9.j;
import android.view.View;
import id9.k;
import com.yxcorp.gifshow.camera.record.h$b;
import id9.r;
import java.lang.Runnable;
import ekd.k1;
import id9.g;

public final class m implements j$a	// class@0027f3
{
    public final t a;

    public void m(t p0){
       this.a = p0;
    }
    public final void a(){
       m ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, t.class, "21")) {
       }else {
          ta.d.j().addView(ta.t.g);
          ta.d.j().e1(new k(ta));
          if (ta.i != null) {
             k1.r(new r(ta), 100);
          }else {
             ta.b2(new g(ta));
          }
       }
       return;
    }
}
