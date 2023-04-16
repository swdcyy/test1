package lj1.c;
import com.kwai.framework.model.user.UserInfo;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@002f7e
{
    public final UserInfo a;
    public final List b;

    public void c(UserInfo p0,List p1){
       a.p(p0, "anchor");
       a.p(p1, "receiver");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final UserInfo a(){
       return this.a;
    }
    public final List b(){
       return this.b;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.b.size() == 1 && TextUtils.n(this.b.get(i).mId, this.a.mId)) {
          i = true;
       }
       return i;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftSendReceiver\(anchor="+this.a+", receiver="+this.b+"\)";
    }
}
