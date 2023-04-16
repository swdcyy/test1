package ba5.a;
import ba5.c;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import com.kuaishou.android.model.feed.PhotoType;

public class a implements c	// class@00036b
{
    public final Map a;
    public static final Map b;

    static {
       a.b = new ConcurrentHashMap();
    }
    public void a(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public boolean a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = r1.t1(p0);
       boolean b = false;
       if (TextUtils.x(str)) {
          return b;
       }
       if (this.a.get(str) != null) {
          b = true;
       }
       return b;
    }
    public boolean b(BaseFeed p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = r1.t1(p0);
       boolean b = false;
       if (TextUtils.x(obj)) {
          return b;
       }
       if (this.a.put(obj, PhotoType.fromFeed(p0)) != null) {
          b = true;
       }
       return b;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.a.clear();
       return;
    }
}
