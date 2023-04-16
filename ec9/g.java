package ec9.g;
import erd.g;
import ec9.i;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.b;
import cc9.g;
import java.lang.IllegalArgumentException;

public final class g implements g	// class@002177
{
    public final i b;

    public void g(i p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, g.class, "1")) {
       }else if(!obj1.getTemplateList().isEmpty()){
          obj.b.a().h(b.a(obj.b.a().j(), false, false, false, false, false, false, obj1, null, false, false, false, false, false, false, false, false, false, 0x1fcb1, null));
       }else {
          throw new IllegalArgumentException("activity recommend list is empty!");
       }
       return;
    }
}
