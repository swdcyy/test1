package androidx.appcompat.widget.AbsActionBarView$a;
import a2.n0;
import androidx.appcompat.widget.AbsActionBarView;
import java.lang.Object;
import android.view.View;
import a2.m0;

public class AbsActionBarView$a implements n0	// class@0005bb
{
    public boolean a;
    public int b;
    public final AbsActionBarView c;

    public void AbsActionBarView$a(AbsActionBarView p0){
       this.c = p0;
       super();
       this.a = false;
    }
    public void a(View p0){
       if (this.a != null) {
          return;
       }
       AbsActionBarView$a tc = this.c;
       tc.g = null;
       AbsActionBarView.b(tc, this.b);
       return;
    }
    public void b(View p0){
       AbsActionBarView.a(this.c, 0);
       this.a = false;
    }
    public void c(View p0){
       this.a = true;
    }
    public AbsActionBarView$a d(m0 p0,int p1){
       this.c.g = p0;
       this.b = p1;
       return this;
    }
}
