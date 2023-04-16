package androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.b0$b;
import java.lang.Object;
import androidx.recyclerview.widget.b0$a;
import android.view.View;

public class b0	// class@0008ea
{
    public final b0$b a;
    public b0$a b;

    public void b0(b0$b p0){
       super();
       this.a = p0;
       this.b = new b0$a();
    }
    public View a(int p0,int p1,int p2,int p3){
       View childAt;
       int i = this.a.c();
       int i1 = this.a.a();
       int i2 = (p1 > p0)? 1: -1;
       View view = null;
       while (true) {
          if (p0 == p1) {
             return view;
          }
          childAt = this.a.getChildAt(p0);
          this.b.e(i, i1, this.a.b(childAt), this.a.d(childAt));
          if (p2) {
             this.b.d();
             this.b.a(p2);
             if (this.b.b()) {
                break ;
             }
          }
          if (p3) {
             this.b.d();
             this.b.a(p3);
             if (this.b.b()) {
                view = childAt;
             }
          }
          p0 = p0 + i2;
       }
       return childAt;
    }
    public boolean b(View p0,int p1){
       this.b.e(this.a.c(), this.a.a(), this.a.b(p0), this.a.d(p0));
       if (!p1) {
          return false;
       }
       this.b.d();
       this.b.a(p1);
       return this.b.b();
    }
}
