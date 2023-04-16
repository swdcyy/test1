package ec9.c;
import erd.o;
import java.util.ArrayList;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo$PostActivityMaterials;
import ac9.k;

public final class c implements o	// class@00216a
{
    public final ArrayList b;

    public void c(ArrayList p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       List obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          obj = p0.getTemplateList();
          int i = 1;
          c uoc = (obj == null || obj.isEmpty())? 1: null;
          if (!uoc && (this.b.isEmpty() ^ i)) {
             ArrayList uArrayList = new ArrayList(p0.getTemplateList());
             Iterator iterator = this.b.iterator();
             while (iterator.hasNext()) {
                if (iterator.next().mType == -124) {
                   uArrayList.add(new k());
                }
             }
             p0.setTemplateList(uArrayList);
          }
       }
       return p0;
    }
}
