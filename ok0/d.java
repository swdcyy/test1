package ok0.d;
import ok0.e;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.lifecycle.LiveData;
import ok0.c;
import qk0.b;
import ok0.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class d	// class@003510
{

    public static void a(e p0,KwaiImageView p1,LiveData p2){
       if (p2 != null && p1 != null) {
          p0.z6().a(p0.j(), p2, new c(p1));
       }
       return;
    }
    public static void b(KwaiImageView p0,List p1){
       d.c(p0, p1);
    }
    public static void c(KwaiImageView p0,List p1){
       if (p1 != null) {
          p0.P(p1);
       }
       return;
    }
}
