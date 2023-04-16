package nc1.j$a;
import bq5.f$a;
import bq5.f;
import nc1.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class j$a extends f$a	// class@0032d7
{
    public String f;
    public int g;
    public long h;

    public void j$a(){
       super();
       this.g = 0;
    }
    public f a(){
       return this.g();
    }
    public j g(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(this);
    }
    public j$a h(String p0){
       this.f = p0;
       return this;
    }
    public j$a i(int p0){
       this.g = p0;
       return this;
    }
    public j$a j(long p0){
       this.h = p0;
       return this;
    }
}
