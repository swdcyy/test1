package bk5.c;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.StringBuilder;

public class c	// class@0004b9
{
    public String a;
    public String b;
    public List c;
    public boolean d;
    public int e;

    public void c(String p0,String p1,List p2){
       super(p0, p1, p2, false);
    }
    public void c(String p0,String p1,List p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean equals(Object p0){
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uoc != p0.getClass()) {
          return false;
       }
       if (!TextUtils.equals(this.a, p0.a) || !TextUtils.equals(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.a+"_"+this.b).hashCode();
    }
}
