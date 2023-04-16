package ab0.r$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class r$c implements g	// class@00004b
{
    public static final r$c b;

    static {
       r$c.b = new r$c();
    }
    public void r$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$c.class, "1")) {
       }else {
          PostUtils.D("SmartAlbumRestartPresenter", "onBind mFinishSettingPublisher", p0);
       }
       return;
    }
}
