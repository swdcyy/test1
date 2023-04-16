package s79.a;
import dtd.a;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModel;

public abstract class a implements a	// class@00377a
{
    public ViewModel b;
    public final LifecycleOwner c;
    public HashMap d;

    public void a(LifecycleOwner p0){
       a.q(p0, "mHost");
       super();
       this.c = p0;
    }
    public void b(ViewModel p0){
       this.b = p0;
    }
    public final LifecycleOwner e(){
       return this.c;
    }
    public final ViewModel f(){
       return this.b;
    }
    public void g(){
    }
}
