package kaa.i;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.EnhanceColorFilterResult$b;
import com.kuaishou.edit.draft.EnhanceColorFilterResult;
import java.util.List;
import java.util.Collections;
import java.lang.Iterable;

public class i extends w	// class@002c2b
{
    public final d a;

    public void i(){
       super();
       this.a = new d(2, 5, 3);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       if (p0.instance.getEnhanceColorFilterResourcesCount() > 0) {
          EnhanceColorFilterResult$b uob = EnhanceColorFilterResult.newBuilder();
          uob.copyOnWrite();
          uob.instance.addAllAnalysisResultsResources(Collections.unmodifiableList(p0.instance.getEnhanceColorFilterResourcesList()));
          uob.b(true);
          uob.a(-2);
          p0.copyOnWrite();
          p0.instance.addEnhanceColorFilterResult(uob);
          p0.copyOnWrite();
          p0.instance.clearEnhanceColorFilterResources();
       }
       return;
    }
}
