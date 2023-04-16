package bg8.d;
import java.lang.Runnable;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import oh8.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import com.mini.packagemanager.PackageManagerImpl;
import nh8.b;

public final class d implements Runnable	// class@00034f
{
    public final PackageUpdateManagerImpl b;
    public final a c;

    public void d(PackageUpdateManagerImpl p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       tc.c.d(0, "", tb.c.getMaxMiniAppInfo(tc.a));
    }
}
