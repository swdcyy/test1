package dy8.c;
import lnc.c3$a;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import dy8.f$a;

public final class c implements c3$a	// class@0020fc
{
    public final int a;
    public final Drawable b;

    public void c(int p0,Drawable p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void apply(Object p0){
       p0.a(this.a, this.b);
    }
}
