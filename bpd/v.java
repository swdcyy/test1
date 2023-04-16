package bpd.v;
import im8.b;
import java.lang.Object;
import bpd.u;
import apd.i;
import java.lang.Class;
import im8.e;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.yxcorp.plugin.kwaitoken.model.OnePictureDialogInfo;
import java.util.Set;
import java.util.HashSet;

public final class v implements b	// class@0002b0
{
    public Set a;
    public Set b;

    public void v(){
       super();
    }
    public void a(Object p0,Object p1){
       i oi = i.class;
       if (e.d(p1, oi)) {
          oi = e.b(p1, oi);
          if (oi != null) {
             p0.r = oi;
          }else {
             throw new IllegalArgumentException("mDialog 不能为空");
          }
       }
       if (e.d(p1, OnePictureDialogInfo.class)) {
          p1 = e.b(p1, OnePictureDialogInfo.class);
          if (p1 != null) {
             p0.q = p1;
          }else {
             throw new IllegalArgumentException("mInfo 不能为空");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          this.a = new HashSet();
       }
       return this.a;
    }
    public void c(Object p0){
       p0.r = null;
       p0.q = null;
    }
    public final Set d(){
       if (this.b == null) {
          HashSet hashSet = new HashSet();
          this.b = hashSet;
          hashSet.add(i.class);
          this.b.add(OnePictureDialogInfo.class);
       }
       return this.b;
    }
}
