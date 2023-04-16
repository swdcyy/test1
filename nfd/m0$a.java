package nfd.m0$a;
import java.lang.Object;
import nfd.m0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;

public class m0$a	// class@001dcd
{
    public int a;
    public int b;
    public int c;
    public CDNUrl[] d;
    public boolean e;
    public int f;

    public void m0$a(){
       super();
    }
    public m0 a(){
       Object obj = PatchProxy.apply(null, this, m0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m0(this);
    }
    public m0$a b(int p0){
       this.a = p0;
       return this;
    }
    public m0$a c(int p0){
       this.c = p0;
       return this;
    }
    public m0$a d(CDNUrl[] p0){
       this.d = p0;
       return this;
    }
    public m0$a e(boolean p0){
       this.e = p0;
       return this;
    }
    public m0$a f(int p0){
       this.b = p0;
       return this;
    }
}
