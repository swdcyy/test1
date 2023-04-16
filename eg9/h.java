package eg9.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class h implements g	// class@00213e
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("SwitchCameraController", "获取摄像头数量错误", p0);
    }
}
