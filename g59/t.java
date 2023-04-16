package g59.t;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.feed.VideoFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class t implements h	// class@002417
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, t.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.m(p0);
          uBoolean = Boolean.valueOf(p0.isPayCourse());
       }
       return uBoolean;
    }
}
