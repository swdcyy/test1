package g03.b;
import g03.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import sz2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import sz2.g;
import java.util.Map;
import e03.a;
import java.util.ArrayList;
import com.kuaishou.livestream.message.nano.LiveEffectExtraResInfo;
import com.kuaishou.livestream.message.nano.LiveEffectResourceData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class b implements a	// class@002a18
{
    public final Map a;

    public void b(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public synchronized b a(String p0,LiveCommonEffectInfo p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = g.c(p0, this.b(p1));
       if (this.a.containsKey(obj)) {
          return this.a.get(obj);
       }
       a uoa = new a(p0, p1);
       this.a.put(obj, uoa);
       return uoa;
    }
    public final List b(LiveCommonEffectInfo p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 != null) {
          p0 = p0.extraResInfo;
          if (p0 != null) {
             int len = p0.length;
             int i = 0;
             while (i < len) {
                LiveEffectExtraResInfo resourceData = p0[i].resourceDataList;
                if (resourceData != null && resourceData.length > 0) {
                   int len1 = resourceData.length;
                   int i1 = 0;
                   while (i1 < len1) {
                      object oobject = resourceData[i1];
                      if (!TextUtils.x(oobject.resourceId)) {
                         obj.add(oobject.resourceId);
                      }
                      i1 = i1 + 1;
                   }
                }
                i = i + 1;
             }
          }
       }
       return obj;
    }
}
