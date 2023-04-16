package z36.d$a;
import java.lang.Object;
import com.kuaishou.android.post.PostArguments;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.p3;
import q87.c;
import java.util.Map;
import g46.a;

public abstract class d$a	// class@004571
{
    public int b;
    public int c;
    public Bundle d;
    public a e;
    public Map f;
    public PostArguments g;

    public void d$a(){
       super();
    }
    public PostArguments b(){
       d$a obj = PatchProxy.apply(null, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj != null) {
          return obj;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostPageParam", "getArgs\(\) create new PostArguments\(\)", objArray);
       PostArguments postArgument = new PostArguments();
       this.g = postArgument;
       return postArgument;
    }
    public abstract d$a c();
    public d$a d(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.f = p0;
       return this.c();
    }
    public d$a e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e = p0;
       return this;
    }
}
