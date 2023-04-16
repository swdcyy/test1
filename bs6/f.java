package bs6.f;
import javax.inject.Provider;
import java.lang.Object;
import com.kwai.kds.baidumap.mapview.KdsBaiduMapPolylineManager;

public final class f implements Provider	// class@0005fa
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final Object get(){
       return new KdsBaiduMapPolylineManager();
    }
}
