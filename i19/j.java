package i19.j;
import i19.j$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.util.Property;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import th0.c;
import java.util.Iterator;
import java.lang.Iterable;

public final class j	// class@002610
{
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public static final j$a d;

    static {
       j.d = new j$a(null);
    }
    public void j(){
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.c = new ArrayList();
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.a.add(p0);
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0x3e99999a}).setDuration(200);
       a.o(objectAnimat, "ObjectAnimator\n      .of¡­  .setDuration\(ANIM_TIME\)");
       objectAnimat.setInterpolator(new e());
       this.b.add(objectAnimat);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3e99999a,0x3f800000}).setDuration(200);
       a.o(objectAnimat1, "ObjectAnimator\n      .of¡­  .setDuration\(ANIM_TIME\)");
       objectAnimat1.setInterpolator(new c());
       this.c.add(objectAnimat1);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().cancel();
       }
       iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().cancel();
       }
       iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().setAlpha(0x3f800000);
       }
       return;
    }
}
