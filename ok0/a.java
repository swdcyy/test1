package ok0.a;
import ok0.b;
import qk0.b;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.util.Map;
import androidx.lifecycle.Lifecycle;
import qk0.a;
import androidx.lifecycle.LifecycleObserver;

public final class a	// class@00350d
{

    public static b a(b p0){
       LifecycleOwner lifecycleOwn = p0.j();
       Map b = b.b;
       b uob = b.get(lifecycleOwn);
       if (uob == null) {
          uob = new b();
          b.put(lifecycleOwn, uob);
          lifecycleOwn.getLifecycle().addObserver(new a(lifecycleOwn));
       }
       return uob;
    }
}
