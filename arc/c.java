package arc.c;
import t36.f$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;

public final class c implements f$a	// class@0002c0
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "videoFrameChangeListener");
          p0.w(VideoFrameChangeListener$CHANGE_TYPE.FRAME_RATIO, true);
       }
       return;
    }
}
