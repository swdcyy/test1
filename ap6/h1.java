package ap6.h1;
import erd.o;
import java.lang.String;
import java.lang.Object;
import hp6.b;
import lh0.a$u;
import java.util.ArrayList;
import yp6.c;
import com.kwai.imsdk.group.KwaiGroupJoinRequestResponse;
import ca7.u;
import lh0.a$s;
import rh0.a$c;
import java.util.List;
import android.util.Pair;

public final class h1 implements o	// class@000337
{
    public final String b;

    public void h1(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       KwaiGroupJoinRequestResponse kwaiGroupJoi;
       h1 tb = this.b;
       a$u b = p0.b().b;
       ArrayList uArrayList = new ArrayList();
       p0 = p0.b().a;
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject != null) {
             kwaiGroupJoi = new KwaiGroupJoinRequestResponse(u.a(tb), oobject.a);
             a$s b1 = oobject.b;
             if (b1 != null) {
                kwaiGroupJoi.setAppId(b1.a);
                kwaiGroupJoi.setInviterUserId(String.valueOf(oobject.b.b));
             }
             kwaiGroupJoi.setDescContent(u.a(oobject.e));
             kwaiGroupJoi.setFindType(oobject.d);
             kwaiGroupJoi.setStatus(oobject.f);
             kwaiGroupJoi.setInviteeUserList(c.a(oobject.c));
             a$s i1 = oobject.i;
             String str = (i1 != null)? String.valueOf(i1.b): "";
             kwaiGroupJoi.setApproverId(str);
          }else {
             kwaiGroupJoi = null;
          }
          if (kwaiGroupJoi != null) {
             uArrayList.add(kwaiGroupJoi);
          }
          i = i + 1;
       }
       return new Pair(b, uArrayList);
    }
}
