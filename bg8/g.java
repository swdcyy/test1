package bg8.g;
import java.lang.Runnable;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import java.util.List;
import java.lang.Object;
import og8.a;

public final class g implements Runnable	// class@000352
{
    public final PackageUpdateManagerImpl b;
    public final List c;

    public void g(PackageUpdateManagerImpl p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.s.a(this.c);
    }
}
