package k9a.c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import kp.r1;
import k9a.c$a;
import java.util.Collection;
import ok.h;
import java.util.Map;
import k9a.c$b;
import java.util.Collections;
import java.util.List;
import gw8.a;
import k9a.c$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.q;
import java.util.HashMap;
import java.util.Iterator;
import com.yxcorp.gifshow.model.config.ActivityInfo;

public class c	// class@002c21
{
    public final QPhoto a;
    public final Map b;
    public final Map c;
    public final Map d;

    public void c(QPhoto p0){
       super();
       this.a = p0;
       PhotoMeta photoMeta = r1.u1(p0.mEntity);
       if (photoMeta != null) {
          this.b = c.b(photoMeta.mTagItems, new c$a(this));
          this.c = c.b(photoMeta.mAdminTagsModels, new c$b(this));
       }else {
          this.b = Collections.emptyMap();
          this.c = Collections.emptyMap();
       }
       this.d = c.b(a.c(), new c$c(this));
       return;
    }
    public static Map b(Collection p0,h p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return Collections.emptyMap();
       }
       obj = new HashMap(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          Object obj2 = p1.apply(obj1);
          if (obj2 != null) {
             obj.put(obj2, obj1);
          }
       }
       return Collections.unmodifiableMap(obj);
    }
    public ActivityInfo a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.get(p0);
    }
}
