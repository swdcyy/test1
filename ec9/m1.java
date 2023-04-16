package ec9.m1;
import ec9.k;
import ec9.b1;
import ec9.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import cc9.g;

public final class m1 extends k	// class@002188
{
    public final j b;

    public void m1(b1 p0,j p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, m1.class, "1")) {
       }else {
          a.p(obj, "action");
          this.a().h(b.a(this.a().j(), false, false, false, false, false, false, obj.b, null, false, false, false, false, false, false, false, false, false, 0x1fcb1, null));
       }
       return;
    }
}
