package csa.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wra.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior;
import csa.b$a;
import com.kwai.kcube.decorator.IContainerDecorator;

public final class b extends PresenterV2	// class@0023a5
{
    public IContainerDecorator p;
    public b q;

    public void b(){
       super();
    }
    public static final b P8(b p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mHomeBlockViewState");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       View view = this.m8();
       a.o(view, "rootView");
       ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
       CoordinatorLayout$Behavior uBehavior = layoutParams.f();
       Objects.requireNonNull(uBehavior, "null cannot be cast to non-null type com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior");
       uBehavior.s = new b$a(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.q8(IContainerDecorator.class);
       a.o(obj, "inject\(IContainerDecorator::class.java\)");
       this.p = obj;
       obj = this.q8(b.class);
       a.o(obj, "inject\(HomeBlockViewState::class.java\)");
       this.q = obj;
       return;
    }
}
