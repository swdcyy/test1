package jo1.a$a;
import ud5.a;
import jo1.a;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import jo1.f;
import java.util.List;

public class a$a extends a	// class@002bda
{
    public final String d;
    public final String e;
    public final a f;

    public void a$a(a p0,String p1,String p2){
       this.f = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a$a.class, "1")) {
          return;
       }
       super.onRequestSuccess(p0, p1, p2);
       this.f.a.add(new f(this.d, this.e));
       return;
    }
}
