package em1.a0$a;
import em1.q$b;
import em1.a0;
import java.lang.String;
import java.util.List;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import dm1.d;

public class a0$a extends q$b	// class@0021ab
{
    public final int d;
    public final List e;
    public final int f;
    public final String g;
    public final a0 h;

    public void a0$a(a0 p0,int p1,String p2,int p3,List p4,int p5,String p6){
       this.h = p0;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super(p1, p2);
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$a.class, "1")) {
          return;
       }
       if (p0 == null) {
          this.h.x((this.d + 1), this.e, this.f);
       }else {
          this.h.g.b(this.g, p0.getBitmap());
       }
       return;
    }
}
