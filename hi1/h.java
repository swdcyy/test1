package hi1.h;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableMap;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import wy2.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;

public class h	// class@0026da
{

    public void h(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,String p1,int p2,String p3,long p4){
       h oh = h.class;
       int i = 0;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, oh, "1")) {
             return;
          }
       }
       ImmutableMap immutableMap = ImmutableMap.of("live_streamid", TextUtils.k(p1), "author_id", TextUtils.k(p3));
       if (p2) {
          if (p2 != 1) {
             if (p2 != 2) {
                if (p2 == 3) {
                   i = 10;
                }
             }else {
                i = 7;
             }
          }else {
             i = 8;
          }
       }else {
          i = 1;
       }
       h$b uob = h$b.e(i, "AUTHOR_INTERACTIVE_TASK");
       uob.h(a.a(p0, p4));
       uob.k(a.b("AUTHOR_INTERACTIVE_TASK", null));
       uob.u(a.c(immutableMap));
       u1.r0(uob);
       return;
    }
}
