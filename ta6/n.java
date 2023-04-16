package ta6.n;
import yid.k;
import com.kwai.framework.network.RetrofitInitModule;
import java.lang.Object;
import ta6.n$a;
import com.kwai.framework.network.q;
import ta6.n$b;
import ta6.n$c;
import okhttp3.Request;
import java.lang.String;
import java.util.Set;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
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

public class n implements k	// class@002498
{
    public final k a;
    public final j b;
    public final l c;
    public final d d;
    public final RetrofitInitModule e;

    public void n(RetrofitInitModule p0){
       this.e = p0;
       super();
       this.a = new n$a(this);
       this.b = q.a;
       this.c = new n$b(this);
       this.d = new n$c(this);
    }
    public Set a(Request p0,String p1){
       f obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p1)) {
          p1 = QCurrentUser.ME.getTokenClientSalt();
       }
       Set set = h.a.a(p0, this.a, this.b, this.c, this.d).e(p0, p1);
       HashSet hashSet = new HashSet(set.size());
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          hashSet.add(new j(obj.a, obj.a()));
       }
       return hashSet;
    }
}
