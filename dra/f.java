package dra.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.a;
import vma.a;
import android.content.SharedPreferences;
import android.content.Context;
import android.view.ViewGroup;
import ea9.a;
import dra.f$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import dra.f$b;
import android.view.View$OnTouchListener;

public final class f	// class@00250b
{
    public static ValueAnimator a;
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       ValueAnimator a = f.a;
       if (a != null) {
          if (a.isRunning()) {
             a.cancel();
          }
          f.a = null;
       }
       return;
    }
    public final void b(RecyclerView p0){
       ValueAnimator a;
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!a.a.getBoolean("growthShownVfcScrollAnim", false)) {
          a = f.a;
          if (a == null) {
             if (a == null) {
                f.a = ValueAnimator.ofInt(new int[2]{0,2700});
             }
             a.p(true);
             Context context = p0.getContext();
             a.o(context, "recyclerView.context");
             f = a.a(context, 140.00f);
             ValueAnimator a1 = f.a;
             if (a1 != null) {
                a1.setDuration((long)2700);
             }
             a1 = f.a;
             if (a1 != null) {
                a1.addUpdateListener(new f$a(p0, f));
             }
             a = f.a;
             if (a != null) {
                a.setStartDelay(200);
             }
             a = f.a;
             if (a != null) {
                a.start();
             }
             p0.setOnTouchListener(f$b.b);
          }
       }
       return;
    }
}
