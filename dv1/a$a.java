package dv1.a$a;
import android.animation.AnimatorListenerAdapter;
import dv1.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks5.m;
import ks5.h;
import java.util.Objects;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class a$a extends AnimatorListenerAdapter	// class@00202b
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       a$a ta = this.a;
       a f = ta.f;
       if (f != null) {
          f.b(ta.e);
       }
       ta = this.a;
       ta.So(ta.e);
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, a.class, "4") && !ta.d.isEmpty()) {
          Map$Entry uEntry = ta.d.entrySet().iterator().next();
          if (uEntry != null && uEntry.getValue() != null) {
             ta.e = uEntry.getKey();
             uEntry.getValue().start();
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       a$a ta = this.a;
       a f = ta.f;
       if (f != null) {
          f.a(ta.e);
       }
       return;
    }
}
