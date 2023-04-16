package androidx.appcompat.app.AppCompatDelegateImpl$b;
import a2.z;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.lang.Object;
import android.view.View;
import a2.u0;
import android.graphics.Rect;
import a2.i0;

public class AppCompatDelegateImpl$b implements z	// class@000571
{
    public final AppCompatDelegateImpl a;

    public void AppCompatDelegateImpl$b(AppCompatDelegateImpl p0){
       this.a = p0;
       super();
    }
    public u0 a(View p0,u0 p1){
       int i = this.a.R0(p1, null);
       if (p1.k() != i) {
          p1 = p1.q(p1.i(), i, p1.j(), p1.h());
       }
       return i0.f0(p0, p1);
    }
}
