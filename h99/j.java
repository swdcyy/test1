package h99.j;
import im8.b;
import java.lang.Object;
import h99.i;
import java.lang.String;
import im8.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.util.Set;
import java.util.HashSet;

public final class j implements b	// class@002577
{
    public Set a;
    public Set b;

    public void j(){
       super();
    }
    public void a(Object p0,Object p1){
       String str = "DETAIL_FRAGMENT";
       if (e.e(p1, str)) {
          BaseFragment uBaseFragmen = e.c(p1, str);
          if (uBaseFragmen != null) {
             p0.c = uBaseFragmen;
          }else {
             throw new IllegalArgumentException("mFragment 不能为空");
          }
       }
       if (e.d(p1, QPhoto.class)) {
          p1 = e.b(p1, QPhoto.class);
          if (p1 != null) {
             p0.d = p1;
          }else {
             throw new IllegalArgumentException("mPhoto 不能为空");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          HashSet hashSet = new HashSet();
          this.a = hashSet;
          hashSet.add("DETAIL_FRAGMENT");
       }
       return this.a;
    }
    public void c(Object p0){
       p0.c = null;
       p0.d = null;
    }
    public final Set d(){
       if (this.b == null) {
          HashSet hashSet = new HashSet();
          this.b = hashSet;
          hashSet.add(QPhoto.class);
       }
       return this.b;
    }
}
