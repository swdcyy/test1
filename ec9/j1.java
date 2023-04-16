package ec9.j1;
import erd.g;
import ec9.l1;
import java.lang.Object;
import ud9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ud9.b;
import kotlin.jvm.internal.a;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.b;
import com.yxcorp.gifshow.camera.record.assistant.viewmodel.StartDiscernDelegate$run$2$$special$$inlined$let$lambda$1;
import msd.l;
import cc9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import com.yxcorp.gifshow.camera.record.assistant.viewmodel.StartDiscernDelegate$run$2$2$1;

public final class j1 implements g	// class@00217f
{
    public final l1 b;

    public void j1(l1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       b uob;
       Object obj = this;
       b obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, j1.class, "1")) {
       }else if(a.g(obj1, b.f) ^ 0x01){
          uob = obj.b.a().j();
          b uob1 = uob;
          g og = uob.o(new StartDiscernDelegate$run$2$$special$$inlined$let$lambda$1(obj, obj1));
          obj.b.a().h(b.a(uob1, false, false, false, false, false, false, null, og, false, false, false, null, false, false, false, false, false, 0x1ff7f, null));
       }else {
          obj1 = obj.b.a().j();
          uob = obj1;
          g og1 = obj1.o(StartDiscernDelegate$run$2$2$1.INSTANCE);
          obj1 = b.a(uob, false, false, false, false, false, false, null, og1, false, false, false, false, null, false, false, false, false, 0x1ff7f, null);
          obj.b.a().h(obj1);
       }
       return;
    }
}
