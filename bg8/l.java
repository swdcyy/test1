package bg8.l;
import java.lang.Runnable;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import java.lang.Object;

public final class l implements Runnable	// class@000357
{
    public final PackageUpdateManagerImpl b;

    public void l(PackageUpdateManagerImpl p0){
       this.b = p0;
    }
    public final void run(){
       this.b.forceUpdatePackageIfNeed();
    }
}
