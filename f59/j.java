package f59.j;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.net.Uri;
import jyc.b;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$Companion$FollowStyleModel;
import java.lang.Number;
import f59.i;
import java.lang.Enum;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo$LiveInfo;
import lnc.y0;

public final class j	// class@0022ab
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public static String a(String p0,String p1,String p2,boolean p3,int p4,Object p5){
       String str;
       int i = 1;
       if (p4 & 0x08) {
          p3 = true;
       }
       if (PatchProxy.isSupport(j.class)) {
          str = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, j.class, "7");
          if (str != PatchProxyResult.class) {
          label_0065 :
             return str;
          }
       }
       a.p(p0, "scheme");
       a.p(p1, "key");
       str = 0;
       if (p2 != null && p2.length()) {
          i = 0;
       }
       if (!i) {
          if (p3) {
             p2 = Uri.encode(p2);
          }
          p0 = b.a(p0, p1, p2);
          a.o(p0, "WebUrlTools.addQueryWith¡­encode\(value\) else value\)");
       }else {
          Object[] objArray = new Object[str];
          j0.f("AdHalfFollowFragment", p1+" is null", objArray);
       }
       str = p0;
       goto label_0065 ;
    }
    public static final int b(AdUnionHalfFollowFragment$Companion$FollowStyleModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "currentModel");
       int i = i.a[p0.ordinal()];
       if (i != 1) {
          i = (i != 2)? 15: 16;
       }else {
          i = 17;
       }
       return i;
    }
    public static final boolean c(AdUnionFollowInfo p0){
       Boolean uBoolean = null;
       Object obj = PatchProxy.applyOneRefs(p0, uBoolean, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "adUnionFollowInfo");
       p0 = p0.mLiveInfo;
       if (p0 != null) {
          uBoolean = Boolean.valueOf(p0.isLiving());
       }
       return y0.p(uBoolean);
    }
}
