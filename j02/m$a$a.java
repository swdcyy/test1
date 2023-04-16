package j02.m$a$a;
import z1.k;
import j02.m$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class m$a$a implements k	// class@002a22
{
    public final m$a b;

    public void m$a$a(m$a p0){
       this.b = p0;
       super();
    }
    public Object get(){
       String str = PatchProxy.apply(null, this, m$a$a.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = String.valueOf(this.b.a.hashCode());
       }
       return str;
    }
}
