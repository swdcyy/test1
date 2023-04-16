package dac.f0;
import im8.b;
import java.lang.Object;
import com.yxcorp.gifshow.relation.explore.fragment.GalleryCarouseFragment;
import java.lang.String;
import im8.e;
import a7c.h;
import java.lang.IllegalArgumentException;
import java.util.Set;
import java.util.HashSet;

public final class f0 implements b	// class@00213d
{
    public Set a;
    public Set b;

    public void f0(){
       super();
    }
    public void a(Object p0,Object p1){
       if (e.e(p1, "PYMK_ACCESS_IDSPYMK_PARAMS")) {
          p1 = e.c(p1, "PYMK_ACCESS_IDSPYMK_PARAMS");
          if (p1 != null) {
             p0.m = p1;
          }else {
             throw new IllegalArgumentException("mPymkParams ²»ÄÜÎª¿Õ");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          HashSet hashSet = new HashSet();
          this.a = hashSet;
          hashSet.add("PYMK_ACCESS_IDSPYMK_PARAMS");
       }
       return this.a;
    }
    public void c(Object p0){
       p0.m = null;
    }
    public final Set d(){
       if (this.b == null) {
          this.b = new HashSet();
       }
       return this.b;
    }
}
