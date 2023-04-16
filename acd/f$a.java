package acd.f$a;
import java.lang.Object;
import com.kwai.feature.component.entry.SearchSceneSource;
import acd.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class f$a	// class@0000d0
{
    public String a;
    public int b;
    public boolean c;

    public void f$a(){
       super();
       this.b = SearchSceneSource.UNKNOWN.mPageSource;
    }
    public f a(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
    public f$a b(boolean p0){
       this.c = p0;
       return this;
    }
    public f$a c(String p0){
       this.a = p0;
       return this;
    }
    public f$a d(int p0){
       this.b = p0;
       return this;
    }
}
