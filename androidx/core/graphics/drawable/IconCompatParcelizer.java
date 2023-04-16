package androidx.core.graphics.drawable.IconCompatParcelizer;
import java.lang.Object;
import androidx.versionedparcelable.a;
import androidx.core.graphics.drawable.IconCompat;
import android.os.Parcelable;
import android.content.res.ColorStateList;
import java.lang.String;
import java.util.Objects;

public class IconCompatParcelizer	// class@000716
{

    public void IconCompatParcelizer(){
       super();
    }
    public static IconCompat read(a p0){
       IconCompat iconCompat = new IconCompat();
       iconCompat.a = p0.r(iconCompat.a, 1);
       iconCompat.c = p0.j(iconCompat.c, 2);
       iconCompat.d = p0.u(iconCompat.d, 3);
       iconCompat.e = p0.r(iconCompat.e, 4);
       iconCompat.f = p0.r(iconCompat.f, 5);
       iconCompat.g = p0.u(iconCompat.g, 6);
       iconCompat.i = p0.w(iconCompat.i, 7);
       iconCompat.j = p0.w(iconCompat.j, 8);
       iconCompat.F();
       return iconCompat;
    }
    public static void write(IconCompat p0,a p1){
       Objects.requireNonNull(p1);
       p0.G(false);
       IconCompat a = p0.a;
       if (-1 != a) {
          p1.M(a, 1);
       }
       a = p0.c;
       if (a != null) {
          p1.F(a, 2);
       }
       a = p0.d;
       if (a != null) {
          p1.P(a, 3);
       }
       a = p0.e;
       if (a != null) {
          p1.M(a, 4);
       }
       a = p0.f;
       if (a != null) {
          p1.M(a, 5);
       }
       a = p0.g;
       if (a != null) {
          p1.P(a, 6);
       }
       a = p0.i;
       if (a != null) {
          p1.R(a, 7);
       }
       p0 = p0.j;
       if (p0 != null) {
          p1.R(p0, 8);
       }
       return;
    }
}
