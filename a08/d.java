package a08.d;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import f08.f;

public final class d implements g	// class@000009
{
    public final b b;
    public final String c;

    public void d(b p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f.b(this.b.l, this.c, "create pendant error", p0);
    }
}
