package ec9.e;
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
import ec9.d;
import java.lang.Iterable;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class e implements o	// class@002171
{
    public final a b;
    public final HashMap c;

    public void e(a p0,HashMap p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       List obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          if (this.b.f != null) {
             obj = p0.getTemplateList();
             obj = (obj == null || obj.isEmpty())? 1: null;
             if (!obj) {
                p0.setTemplateList(CollectionsKt___CollectionsKt.f5(p0.getTemplateList(), new d(this)));
             }
          }
       }
       return p0;
    }
}
