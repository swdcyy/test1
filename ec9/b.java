package ec9.b;
import erd.o;
import cc9.a;
import java.util.HashMap;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ac9.g;
import java.lang.Integer;

public final class b implements o	// class@002167
{
    public final a b;
    public final HashMap c;

    public void b(a p0,HashMap p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       List obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          obj = this.b.b();
          obj = (obj == null || obj.isEmpty())? 1: null;
          if (!obj) {
             obj = p0.getTemplateList();
             obj = (obj == null || obj.isEmpty())? 1: null;
             if (!obj) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = p0.getTemplateList().iterator();
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   Integer obj2 = obj1;
                   HashMap hashMap = this.c.get(obj2.getTemplateId());
                   obj2 = (hashMap != null)? hashMap.get(Integer.valueOf(obj2.getType())): null;
                   Object obj3 = (obj2 != null)? 1: null;
                   if (obj3) {
                      uArrayList.add(obj1);
                   }
                }
                p0.setTemplateList(uArrayList);
             }
          }
       }
       return p0;
    }
}
