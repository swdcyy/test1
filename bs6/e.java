package bs6.e;
import javax.inject.Provider;
import java.lang.Object;
import com.kwai.kds.baidumap.mapview.KdsBaiduMapPolygonManager;

public final class e implements Provider	// class@0005f9
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final Object get(){
       return new KdsBaiduMapPolygonManager();
    }
}
