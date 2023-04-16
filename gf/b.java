package gf.b;
import gf.a;
import gf.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class b extends h implements a	// class@0020a3
{
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public int l;

    public void b(){
       super();
       this.k = false;
       this.l = 0;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FMP"+","+this.i+","+this.e;
    }
    public boolean hasValue(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
}
