package xg7.b;
import java.lang.Object;
import com.kwai.performance.stability.hprof.dump.NativeHandler;
import java.lang.String;

public abstract class b	// class@003cc3
{
    public final boolean soLoaded;

    public void b(){
       super();
       this.soLoaded = NativeHandler.load();
    }
    public abstract boolean dump(String p0);
}
