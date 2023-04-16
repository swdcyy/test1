package ok0.h;
import ok0.i;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import ok0.f;
import qk0.b;
import ok0.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import ok0.o;
import ok0.g;
import java.lang.Object;
import java.lang.CharSequence;

public final class h	// class@003514
{

    public static void a(i p0,TextView p1,LiveData p2){
       if (p1 != null && p2 != null) {
          p0.z6().a(p0.j(), p2, new f(p1));
       }
       return;
    }
    public static void b(i p0,TextView p1,LiveData p2,o p3){
       if (p1 == null || (p2 != null && p3 != null)) {
          p0.z6().a(p0.j(), p2, new g(p1, p3));
       }
    label_0017 :
       return;
    }
    public static void c(TextView p0,o p1,Object p2){
       h.d(p0, p1, p2);
    }
    public static void d(TextView p0,o p1,Object p2){
       p0.setText(p1.apply(p2));
    }
}
