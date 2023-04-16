package jh9.a$c;
import java.lang.Runnable;
import jh9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.android.material.appbar.AppBarLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import java.util.Objects;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import jh9.a$c$a;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$b;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

public final class a$c implements Runnable	// class@002ace
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = a.P8(this.b).getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
       CoordinatorLayout$Behavior uBehavior = layoutParams.f();
       Objects.requireNonNull(uBehavior, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
       uBehavior.x(new a$c$a(this));
       return;
    }
}
