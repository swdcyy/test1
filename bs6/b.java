package bs6.b;
import javax.inject.Provider;
import java.lang.Object;
import com.kwai.kds.baidumap.mapview.KdsBaiduMapCircleManager;

public final class b implements Provider	// class@0005f6
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return new KdsBaiduMapCircleManager();
    }
}
