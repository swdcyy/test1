package hj1.a;
import hj1.c;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import gj1.b;
import java.lang.Integer;
import java.util.Set;
import java.util.Collections;
import d61.l0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a implements c	// class@0026ed
{
    public final int a;

    public void a(int p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(obj), objArray, uob, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          label_0047 :
             b = b ^ 0x01;
             LiveLogTag pK = LiveLogTag.PK;
             pK.appendTag("PUBLIC_ID_CACHE");
             LiveLogTag liveLogTag = pK;
             b.T(liveLogTag, "try show confirm alert", "giftId", Integer.valueOf(this.a), "isGiftIdInLocalCache", Boolean.valueOf((b ^ 0x01)));
             return b;
          }
       }
       b = b.b.b(Collections.emptySet()).contains(String.valueOf(obj));
       goto label_0047 ;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       b.a(this.a);
       b.S(LiveLogTag.PK.appendTag("PUBLIC_ID_CACHE"), "append gift id to local cache", "giftId", Integer.valueOf(this.a));
       return;
    }
}
