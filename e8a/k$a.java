package e8a.k$a;
import d6a.a;
import e8a.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.homepage.serchcard.d;
import java.util.Set;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.System;

public class k$a extends a	// class@0020b8
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void F1(){
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       if (this.b.q.isResumed()) {
          k$a tb = this.b;
          k s = tb.s;
          k p = tb.p;
          Objects.requireNonNull(s);
          if (!PatchProxy.applyVoidOneRefs(p, s, d.class, "3") && s.d >= null) {
             s.f.add(p);
          }
          tb = this.b;
          tb.s.i(tb.p.getPhotoId());
          this.b.s.j(System.currentTimeMillis());
       }
       return;
    }
}
