package ap6.c1;
import erd.o;
import java.lang.Object;
import hp6.b;
import lh0.a$b0;
import yp6.c;
import com.kwai.imsdk.group.KwaiGroupJoinRequestResponse;
import java.lang.String;
import rh0.a$c;
import ca7.u;
import java.util.List;

public final class c1 implements o	// class@00031e
{
    public final long b;

    public void c1(long p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       KwaiGroupJoinRequestResponse kwaiGroupJoi;
       c1 tb = this.b;
       p0 = p0.b();
       if (p0 != null) {
          kwaiGroupJoi = new KwaiGroupJoinRequestResponse(p0.a, tb);
          a$b0 b = p0.b;
          if (b != null) {
             kwaiGroupJoi.setAppId(b.a);
             kwaiGroupJoi.setInviterUserId(String.valueOf(p0.b.b));
          }
          kwaiGroupJoi.setDescContent(u.a(p0.e));
          kwaiGroupJoi.setFindType(p0.d);
          kwaiGroupJoi.setStatus(p0.f);
          kwaiGroupJoi.setInviteeUserList(c.a(p0.c));
       }else {
          kwaiGroupJoi = null;
       }
       return kwaiGroupJoi;
    }
}
