package q3d.a;
import n3d.d;
import java.lang.Object;
import n3d.b;
import n3d.d$b;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;
import n3d.f$b;
import n3d.f;
import n3d.e;
import n3d.a;

public abstract class a implements d	// class@00367f
{
    public final b b;
    public boolean c;

    public void a(){
       super();
       this.b = new b();
    }
    public final d B(d$b p0){
       b e = this.b.e;
       if (e != null) {
          p0.a(e);
       }
       return this;
    }
    public final d D(Context p0){
       this.b.a = p0;
       return this;
    }
    public final d K(int p0){
       a tb = this.b;
       tb.c = true;
       tb.b = p0;
       return this;
    }
    public final d M(Uri p0){
       this.b.e.setData(p0);
       return this;
    }
    public final d Y(int p0){
       this.b.e.addFlags(p0);
       return this;
    }
    public final void h(){
       a tb = this.b;
       f.a().a(this.b).a(tb.a, tb, 1);
    }
    public final void h0(){
       this.c = true;
    }
    public final b k(){
       return this.b;
    }
    public final d w(a p0){
       this.b.d = p0;
       return this;
    }
}
