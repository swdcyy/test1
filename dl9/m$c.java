package dl9.m$c;
import eya.b;
import dl9.m;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import jk9.b;
import jk9.c;
import java.util.Collection;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.utility.TextUtils;

public class m$c extends b	// class@001f7c
{
    public final m o;

    public void m$c(m p0){
       this.o = p0;
       super();
    }
    public List a(String p0,User p1,int p2,int p3){
       List obj;
       if (PatchProxy.isSupport(m$c.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, m$c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = super.a(p0, p1, p2, p3);
       b a = this.o.W.a;
       if (a != null) {
          obj.addAll(a.a(p0, p1, p2, p3));
       }
       return obj;
    }
    public String c(String p0,User p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, m$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       Object[] objArray = new Object[]{TextUtils.k(this.o.r.getId()),this.o.r.getUser().getId(),p1.getId()};
       return String.format("c_%s_%s_at_%s", objArray);
    }
}
