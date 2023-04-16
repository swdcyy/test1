package androidx.core.app.a$f$a;
import androidx.core.app.g$a;
import androidx.core.app.a$f;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import java.lang.Object;

public class a$f$a implements g$a	// class@0006f9
{
    public final SharedElementCallback$OnSharedElementsReadyListener a;
    public final a$f b;

    public void a$f$a(a$f p0,SharedElementCallback$OnSharedElementsReadyListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onSharedElementsReady(){
       this.a.onSharedElementsReady();
    }
}
