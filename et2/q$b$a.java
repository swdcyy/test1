package et2.q$b$a;
import et2.q$a;
import et2.q$b;
import s0d.e;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public class q$b$a extends q$a	// class@0027e4
{
    public final e a;
    public final q$b b;

    public void q$b$a(q$b p0,e p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onNewResult(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$b$a.class, "1")) {
          return;
       }
       if (!p0.a()) {
          return;
       }
       Boolean result = p0.getResult();
       if (result != null && result.booleanValue()) {
          return;
       }
       a.d(this.a, null);
       return;
    }
}
