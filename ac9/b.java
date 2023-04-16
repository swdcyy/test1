package ac9.b;
import erd.g;
import ac9.c;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import java.util.Collection;
import ac9.h;
import java.util.List;

public final class b implements g	// class@00007a
{
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.o(p0, "it");
          ArrayList uArrayList = this.b.b.a(p0, true);
          if (true ^ uArrayList.isEmpty()) {
             uArrayList.add(0, new h());
          }
          p0.setTemplateList(uArrayList);
       }
       return;
    }
}
