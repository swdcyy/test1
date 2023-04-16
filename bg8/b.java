package bg8.b;
import java.lang.Runnable;
import com.mini.packagemanager.PackageManagerImpl;
import java.lang.String;
import java.lang.Object;

public final class b implements Runnable	// class@00034d
{
    public final PackageManagerImpl b;
    public final String c;

    public void b(PackageManagerImpl p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       PackageManagerImpl.U6(this.b, this.c);
    }
}
