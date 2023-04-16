package a2.r0$d$a;
import android.view.WindowInsetsAnimation$Callback;
import a2.r0$b;
import java.util.HashMap;
import android.view.WindowInsetsAnimation;
import a2.r0;
import java.lang.Object;
import java.util.Objects;
import android.view.WindowInsets;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import a2.u0;
import android.view.WindowInsetsAnimation$Bounds;
import a2.r0$a;

public class r0$d$a extends WindowInsetsAnimation$Callback	// class@0000a0
{
    public final r0$b a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public void r0$d$a(r0$b p0){
       super(p0.a());
       this.d = new HashMap();
       this.a = p0;
    }
    public final r0 a(WindowInsetsAnimation p0){
       r0 or0 = this.d.get(p0);
       if (or0 == null) {
          or0 = r0.f(p0);
          this.d.put(p0, or0);
       }
       return or0;
    }
    public void onEnd(WindowInsetsAnimation p0){
       this.a.b(this.a(p0));
       this.d.remove(p0);
    }
    public void onPrepare(WindowInsetsAnimation p0){
       this.a(p0);
       Objects.requireNonNull(this.a);
    }
    public WindowInsets onProgress(WindowInsets p0,List p1){
       r0$d$a tc = this.c;
       if (tc == null) {
          ArrayList uArrayList = new ArrayList(p1.size());
          this.c = uArrayList;
          this.b = Collections.unmodifiableList(uArrayList);
       }else {
          tc.clear();
       }
       for (int i = p1.size() - 1; i >= 0; i = i - 1) {
          WindowInsetsAnimation windowInsets = p1.get(i);
          r0 or0 = this.a(windowInsets);
          or0.e(windowInsets.getFraction());
          this.c.add(or0);
       }
       return this.a.c(u0.w(p0), this.b).v();
    }
    public WindowInsetsAnimation$Bounds onStart(WindowInsetsAnimation p0,WindowInsetsAnimation$Bounds p1){
       return this.a.d(this.a(p0), r0$a.d(p1)).c();
    }
}
