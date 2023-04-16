package bg8.a;
import java.lang.Runnable;
import com.mini.packagemanager.PackageManagerImpl;
import java.lang.Object;

public final class a implements Runnable	// class@00034c
{
    public final PackageManagerImpl b;

    public void a(PackageManagerImpl p0){
       this.b = p0;
    }
    public final void run(){
       PackageManagerImpl.T6(this.b);
    }
}
