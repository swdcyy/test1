package ab0.t$e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class t$e implements g	// class@000052
{
    public static final t$e b;

    static {
       t$e.b = new t$e();
    }
    public void t$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$e.class, "1")) {
       }else {
          PostUtils.D("SmartAlbumSettingsPresenter", "onBind mFinishSettingPublisher", p0);
       }
       return;
    }
}
