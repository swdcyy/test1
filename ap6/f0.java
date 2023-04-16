package ap6.f0;
import erd.g;
import ro6.a;
import java.lang.Object;
import hp6.b;
import java.util.ArrayList;
import lh0.a$p;
import yp6.c;
import com.kwai.imsdk.group.KwaiGroupInviteRecord;
import lh0.a$n;
import java.lang.String;
import java.lang.CharSequence;
import ca7.u;

public final class f0 implements g	// class@00032c
{
    public final a b;

    public void f0(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       KwaiGroupInviteRecord kwaiGroupInv;
       f0 tb = this.b;
       if (tb != null) {
          ArrayList uArrayList = new ArrayList();
          a$p a = p0.b().a;
          if (a != null && a.length > 0) {
             int len = a.length;
             int i = 0;
             while (i < len) {
                object oobject = a[i];
                if (oobject == null) {
                   kwaiGroupInv = null;
                }else {
                   KwaiGroupInviteRecord kwaiGroupInv1 = new KwaiGroupInviteRecord();
                   kwaiGroupInv1.setGroupId(oobject.d);
                   kwaiGroupInv1.setInviteId(oobject.a);
                   kwaiGroupInv1.setInviterUid(oobject.b);
                   kwaiGroupInv1.setInviterRole(oobject.c);
                   kwaiGroupInv1.setInviteStatus(oobject.e);
                   kwaiGroupInv = kwaiGroupInv1;
                }
                if (kwaiGroupInv != null) {
                   uArrayList.add(kwaiGroupInv);
                }
                i = i + 1;
             }
          }
          tb.a(uArrayList, p0.b().b, u.c(p0.b().b));
       }
       return;
    }
}
