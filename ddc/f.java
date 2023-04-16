package ddc.f;
import erd.o;
import java.lang.Object;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import kotlin.jvm.internal.a;

public final class f implements o	// class@002191
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0.getResult();
       }
       return obj;
    }
}
