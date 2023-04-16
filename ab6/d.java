package ab6.d;
import yid.k;
import java.lang.Object;
import ab6.d$d;
import ab6.d$c;
import ab6.d$a;
import ab6.d$b;
import okhttp3.Request;
import java.lang.String;
import java.util.Set;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import rjd.h;
import rjd.k;
import rjd.j;
import rjd.l;
import rjd.d;
import rjd.g;
import java.util.HashSet;
import java.util.Iterator;
import rjd.f;
import yid.j;

public final class d implements k	// class@000067
{
    public final k a;
    public final j b;
    public final l c;
    public final d d;

    public void d(){
       super();
       this.a = new d$d();
       this.b = new d$c();
       this.c = new d$a();
       this.d = new d$b();
    }
    public Set a(Request p0,String p1){
       QCurrentUser mE;
       f obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "tokenSalt");
       if (TextUtils.x(p1)) {
          mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          mE = mE.getTokenClientSalt();
       }
       a.m(mE);
       Set set = h.a.a(p0, this.a, this.b, this.c, this.d).e(p0, mE);
       HashSet hashSet = new HashSet(set.size());
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          hashSet.add(new j(obj.a, obj.b));
       }
       return hashSet;
    }
}
