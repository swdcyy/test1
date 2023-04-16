package boc.a0;
import erd.o;
import boc.b;
import java.lang.Object;
import doc.a;
import com.yxcorp.gifshow.util.resource.p;
import java.lang.Boolean;

public final class a0 implements o	// class@000438
{
    public final b b;

    public void a0(b p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p.g(p0, this.b));
    }
}
