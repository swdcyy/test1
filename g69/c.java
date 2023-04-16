package g69.c;
import g7c.a;
import com.yxcorp.gifshow.aggregate.user.UserAggregateFragment;
import java.lang.String;
import java.lang.Object;
import rq4.r;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import rq4.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import k2b.k2;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g69.f;

public final class c implements a	// class@002422
{
    public final UserAggregateFragment a;
    public final String b;

    public void c(UserAggregateFragment p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final r a(r p0){
       r e;
       int b1;
       c ta = this.a;
       c tb = this.b;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (p0 != null && p0.e != null) {
          if (!TextUtils.isEmpty(ta.J)) {
             p0.e.i = ta.J;
          }
          if (!TextUtils.isEmpty(tb)) {
             p0.e.g = tb;
          }
          Object[] objArray = null;
          boolean b = false;
          if (!TextUtils.isEmpty(ta.N)) {
             e = p0.e;
             k2 obj = PatchProxy.apply(objArray, objArray, UserAggregateFragment.class, "24");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(u1.j() != null){
                obj = u1.j().c;
             }else {
                obj = null;
             }
             if (obj == 237) {
                ClientEvent$UrlPackage page = (u1.p() != null)? u1.p().page: null;
                if (page == 2) {
                   b1 = true;
                }
             }
             b1 = false;
             b1 = (b1)? 18: 34;
             e.d = b1;
          }
          e = p0.e;
          Object obj1 = PatchProxy.apply(objArray, ta, UserAggregateFragment.class, "23");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(ta.q() instanceof f){
             f uof = ta.q();
             f k = uof.K;
             uof.K = b;
             b = k;
          }
          e.b = b;
       }
       return p0;
    }
}
