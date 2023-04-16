package l29.d;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;
import mxb.c;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import l29.d$a;
import erd.g;

public final class d	// class@002c7f
{

    public static final boolean a(QPhoto p0){
       Integer integer = null;
       Object obj = PatchProxy.applyOneRefs(p0, integer, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PhotoAdvertisement$NegativeMenuInfo negativeMenu = c.v(p0);
       if (negativeMenu != null) {
          integer = Integer.valueOf(negativeMenu.negativeStyle);
       }
       boolean b = true;
       if (integer == null || integer.intValue() != b) {
          obj = 3;
          if (integer != null && (integer.intValue() != obj && (integer == null || integer.intValue() != 4))) {
             b = false;
          }
       }
       return b;
    }
    public static final void b(QPhoto p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uod, "1")) {
          return;
       }
       a.p(p0, "photo");
       i0.a().e(17, p0.mEntity).d(new d$a(p1)).a();
       return;
    }
}
