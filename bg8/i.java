package bg8.i;
import java.lang.Runnable;
import nh8.b;
import java.lang.Object;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.String;

public final class i implements Runnable	// class@000354
{
    public final b b;

    public void i(b p0){
       this.b = p0;
    }
    public final void run(){
       this.b.d(0, "", new MiniAppInfo());
    }
}
