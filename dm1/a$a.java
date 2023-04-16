package dm1.a$a;
import kb.b;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dm1.a;

public class a$a extends b	// class@001fbe
{
    public final int a;
    public final ImageRequest[] b;

    public void a$a(int p0,ImageRequest[] p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.a((this.a + 1), this.b);
       return;
    }
    public void onNewResultImpl(c p0){
    }
}
