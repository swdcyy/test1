package c15.a$a$a;
import c15.a;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import c15.a$a;

public final class a$a$a implements a	// class@0003fc
{
    public final String b;

    public void a$a$a(String p0){
       this.b = p0;
       super();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       return a$a.a(this, p0);
    }
    public String getTagName(){
       return this.b;
    }
}
