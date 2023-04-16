package fi2.b;
import uo3.d$a;
import dx1.b;
import java.lang.Object;
import xo3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.CDNUrl;
import zo3.d;
import dx1.c;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.ResourceDownloadFailType;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.util.Objects;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;
import uo3.c;

public final class b implements d$a	// class@002963
{
    public final b a;

    public void b(b p0){
       this.a = p0;
       super();
    }
    public void a(a p0,long p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uob, "2")) {
          return;
       }
       a.p(p0, "requestConfig");
       String str = d.f(p0.a());
       a.o(str, "if \(requestConfig != nul¡­.cdnUrls\)\n        else \"\"");
       c.a.b(this.a, true, p1, "", str);
       return;
    }
    public void b(a p0,ResourceDownloadFailType p1,String p2,Throwable p3,long p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
             return;
          }
       }
       a.p(p0, "requestConfig");
       if (TextUtils.isEmpty(p2)) {
          p2 = (p3 != null)? p3.getMessage(): null;
       }
    label_0032 :
       String str = p2;
       String str1 = d.f(p0.a());
       a.o(str1, "if \(requestConfig != nul¡­.cdnUrls\)\n        else \"\"");
       c.a.b(this.a, false, p4, str, str1);
       return;
    }
    public void c(boolean p0,long p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, uob, "1")) {
          return;
       }
       c a = c.a;
       b ta = this.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(ta, Boolean.valueOf(p0), Long.valueOf(p1), a, c.class, "3")) {
          a.p(ta, "redPacketData");
          i3 oi3 = i3.f();
          oi3.d("leeeId", ta.a());
          oi3.c("leeeType", Integer.valueOf(a.c(ta.b())));
          oi3.c("isNewStyle", Integer.valueOf(ta.c()));
          oi3.c("result", Integer.valueOf(p0));
          oi3.c("costTime", Long.valueOf(p1));
          u1.R("LEEE_SKIN_PREFETCH", oi3.e(), 3);
       }
       return;
    }
    public void d(long p0,boolean p1){
       c.a(this, p0, p1);
    }
}
