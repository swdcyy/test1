package androidx.appcompat.app.AppCompatDelegateImpl$d;
import java.lang.Runnable;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.lang.Object;
import android.view.View;
import android.widget.PopupWindow;
import android.view.ViewGroup;
import a2.m0;
import a2.i0;
import androidx.appcompat.app.AppCompatDelegateImpl$d$a;
import a2.n0;
import androidx.appcompat.widget.ActionBarContextView;

public class AppCompatDelegateImpl$d implements Runnable	// class@000574
{
    public final AppCompatDelegateImpl b;

    public void AppCompatDelegateImpl$d(AppCompatDelegateImpl p0){
       this.b = p0;
       super();
    }
    public void run(){
       AppCompatDelegateImpl$d tb = this.b;
       tb.t.showAtLocation(tb.s, 55, 0, 0);
       this.b.e0();
       float f = 0x3f800000;
       if (this.b.K0()) {
          this.b.s.setAlpha(0);
          tb = this.b;
          m0 om0 = i0.c(tb.s);
          om0.a(f);
          tb.v = om0;
          this.b.v.f(new AppCompatDelegateImpl$d$a(this));
       }else {
          this.b.s.setAlpha(f);
          this.b.s.setVisibility(0);
       }
       return;
    }
}
