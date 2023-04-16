package g9a.a$a;
import jta.a;
import g9a.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Integer;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class a$a extends a	// class@00240f
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       float f = 0x3f800000 - p0;
       int i = (int)((float)a.k * f);
       int i1 = (int)(f * (float)a.l);
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), uoa, uoa1, "5")) {
          uoa.f = i;
          uoa.h = i1;
          a d = uoa.d;
          if (d != null) {
             d.setPadding(d.getPaddingLeft(), uoa.d.getPaddingTop(), (uoa.e + uoa.f), uoa.d.getPaddingBottom());
             d.bottomMargin = uoa.g + uoa.h;
          }
       }
       return;
    }
}
