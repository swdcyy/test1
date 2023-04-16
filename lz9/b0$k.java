package lz9.b0$k;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Number;
import java.lang.Integer;

public class b0$k	// class@002ed5
{
    public QPhoto a;
    public int b;
    public boolean c;

    public void b0$k(QPhoto p0,int p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       b0$k ok = b0$k.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, ok, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || ok != p0.getClass()) {
          return false;
       }
       if (this.b != p0.b || (this.c != p0.c || !Objects.equals(this.a, p0.a))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, b0$k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.a,Integer.valueOf(this.b),Boolean.valueOf(this.c)};
       return Objects.hash(obj);
    }
}
