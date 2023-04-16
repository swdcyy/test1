package elb.m;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class m	// class@002759
{
    public String a;
    public String b;

    public void m(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.equals(p0)) {
          return b;
       }
       if (!p0 instanceof m) {
          return false;
       }
       if (!TextUtils.n(this.a, p0.a)) {
          return false;
       }
       if (TextUtils.x(this.b) && (!TextUtils.x(p0.b) && !TextUtils.n(this.b, p0.b))) {
          b = false;
       }
       return b;
    }
}
