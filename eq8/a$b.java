package eq8.a$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Process;

public class a$b implements Runnable	// class@00222a
{
    public final int b;

    public void a$b(int p0){
       super();
       this.b = p0;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       Process.setThreadPriority(this.b);
       return;
    }
}
