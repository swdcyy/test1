package ab4.b;
import cb4.c;
import cb4.e;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import ab4.g;

public final class b implements c	// class@00005b
{
    public final e a;
    public final c b;

    public void b(e p0,c p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onResult(boolean p0){
       g.b("MerchantRouter", "executeHandler: success="+p0+" handler="+this.a.getName());
       this.b.onResult(p0);
    }
}
