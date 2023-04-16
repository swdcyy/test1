package androidx.appcompat.widget.b$a;
import o1.f$a;
import androidx.appcompat.widget.b;
import java.lang.ref.WeakReference;
import android.graphics.Typeface;
import android.os.Build$VERSION;

public class b$a extends f$a	// class@00063e
{
    public final int a;
    public final int b;
    public final WeakReference c;
    public final b d;

    public void b$a(b p0,int p1,int p2,WeakReference p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void d(int p0){
    }
    public void e(Typeface p0){
       if (Build$VERSION.SDK_INT >= 28) {
          b$a ta = this.a;
          if (ta != -1) {
             boolean b = (this.b & 0x02)? true: false;
             p0 = Typeface.create(p0, ta, b);
          }
       }
       this.d.n(this.c, p0);
       return;
    }
}
