package ej9.f;
import erd.o;
import ej9.g$a;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import com.yxcorp.gifshow.util.cdnresource.CdnResource;

public final class f implements o	// class@002166
{
    public final g$a b;

    public void f(g$a p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       return CdnResource.f(p0, tb.c, tb.d);
    }
}
