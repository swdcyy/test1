package androidx.appcompat.app.AppCompatDelegateImpl$e;
import a2.o0;
import androidx.appcompat.app.AppCompatDelegateImpl;
import android.view.View;
import android.view.ViewGroup;
import a2.n0;
import a2.m0;
import androidx.appcompat.widget.ActionBarContextView;
import android.view.ViewParent;
import a2.i0;

public class AppCompatDelegateImpl$e extends o0	// class@000575
{
    public final AppCompatDelegateImpl a;

    public void AppCompatDelegateImpl$e(AppCompatDelegateImpl p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       this.a.s.setAlpha(0x3f800000);
       this.a.v.f(null);
       p0.v = null;
    }
    public void b(View p0){
       this.a.s.setVisibility(0);
       this.a.s.sendAccessibilityEvent(32);
       if (this.a.s.getParent() instanceof View) {
          i0.p0(this.a.s.getParent());
       }
       return;
    }
}
