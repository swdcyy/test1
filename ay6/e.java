package ay6.e;
import ay6.i;
import ay6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.SoftReference;

public final class e implements i	// class@0003a2
{
    public final SoftReference a;

    public void e(d p0){
       a.p(p0, "trace");
       super();
       this.a = new SoftReference(p0);
    }
    public void a(){
       d uod = this.a.get();
       if (uod != null) {
          uod.c();
       }
       return;
    }
}
