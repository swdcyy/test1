package hh1.a$b;
import erd.g;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import sl1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yg1.f;

public final class a$b implements g	// class@0026a9
{
    public final a b;
    public final String c;

    public void a$b(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          this.b.a(this.c, new f(1, "[LiveGiftNamingNetworkDataSource][fetch]", p0));
       }
       return;
    }
}
