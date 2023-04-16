package b4d.f1$e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class f1$e implements g	// class@000369
{
    public static final f1$e b;

    static {
       f1$e.b = new f1$e();
    }
    public void f1$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1$e.class, "1")) {
       }else {
          Log.d("EmotionFloatPanelPresenter", "timeout exception: ..."+p0);
       }
       return;
    }
}
