package cic.e;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.Pair;
import java.lang.Object;
import mhc.p1;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import oic.u1;
import java.lang.Number;
import oic.r1;

public final class e	// class@0005a9
{

    public static p1 a(QPhoto p0,Pair p1,int p2,int p3,Object p4){
       u1 ou1;
       if (p3 & 0x02) {
          p1 = new Pair(Integer.valueOf(0x7f081fb9), Integer.valueOf(0x7f081fba));
       }
       if (p3 & 0x04) {
          p2 = 0x7f100f19;
       }
       if (PatchProxy.isSupport(e.class)) {
          ou1 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, e.class, "1");
          if (ou1 != PatchProxyResult.class) {
          }else {
          label_003c :
             a.p(p0, "photo");
             a.p(p1, "iconResIdPair");
             ou1 = (!p0.isMine() && !p0.isAllowPhotoDownload())? new u1(p0, p1.getSecond().intValue(), p2): new r1(p0, p1.getFirst().intValue(), p2);
          }
       }else {
          goto label_003c ;
       }
       return ou1;
    }
}
