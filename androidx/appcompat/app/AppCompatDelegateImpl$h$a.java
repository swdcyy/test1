package androidx.appcompat.app.AppCompatDelegateImpl$h$a;
import a2.o0;
import androidx.appcompat.app.AppCompatDelegateImpl$h;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.ActionBarContextView;
import android.widget.PopupWindow;
import android.view.ViewParent;
import android.view.ViewGroup;
import a2.i0;
import a2.n0;
import a2.m0;

public class AppCompatDelegateImpl$h$a extends o0	// class@000578
{
    public final AppCompatDelegateImpl$h a;

    public void AppCompatDelegateImpl$h$a(AppCompatDelegateImpl$h p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       this.a.b.s.setVisibility(8);
       AppCompatDelegateImpl$h b = this.a.b;
       AppCompatDelegateImpl t = b.t;
       if (t != null) {
          t.dismiss();
       }else if(b.s.getParent() instanceof View){
          i0.p0(this.a.b.s.getParent());
       }
       this.a.b.s.removeAllViews();
       this.a.b.v.f(null);
       b = this.a.b;
       b.v = null;
       i0.p0(b.y);
       return;
    }
}
