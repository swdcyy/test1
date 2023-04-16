package dv1.a;
import ks5.i;
import lp3.a;
import java.util.LinkedHashMap;
import ks5.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import ks5.m;
import dv1.a$a;
import android.animation.Animator$AnimatorListener;

public class a extends a implements i	// class@00202c
{
    public final LinkedHashMap d;
    public m e;
    public h f;

    public void a(){
       super();
       this.d = new LinkedHashMap();
    }
    public void Ld(h p0){
       this.f = p0;
    }
    public void Ro(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "6")) {
          Animator uAnimator = this.d.get(this.e);
          if (uAnimator != null && uAnimator.isRunning()) {
             uAnimator.removeAllListeners();
             uAnimator.cancel();
             this.d.remove(this.e);
          }
          this.d.clear();
       }
       this.f = null;
       return;
    }
    public void So(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       if (this.d.isEmpty()) {
          return;
       }
       this.d.remove(p0);
       return;
    }
    public void oo(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.So(p0);
       return;
    }
    public void rb(m p0,Animator p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.d.put(p0, p1);
       p1.addListener(new a$a(this));
       if (this.d.size() == 1) {
          this.e = p0;
          p1.start();
       }
       return;
    }
}
