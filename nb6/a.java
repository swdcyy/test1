package nb6.a;
import kjd.b;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import nb6.b;
import java.util.Collection;
import ekd.q;
import nb6.c;
import java.util.Iterator;
import com.kuaishou.godzilla.idc.KwaiSpeedTestResult;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IdcSpeedStatEvent;
import java.lang.Number;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IdcSpeedPackage;
import com.kuaishou.godzilla.idc.KwaiIDCHost;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class a implements b	// class@001f22
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(String p0,List p1,long p2,long p3){
       KwaiSpeedTestResult kwaiSpeedTes;
       if (q.f(p1)) {
       }else {
          c uoc = new c();
          uoc.a = p0;
          uoc.c = p2;
          uoc.d = p3;
          uoc.e = p1;
          long l = Long.MIN_VALUE;
          Iterator iterator = p1.iterator();
          long l1 = Long.MAX_VALUE;
          while (iterator.hasNext()) {
             kwaiSpeedTes = iterator.next();
             KwaiSpeedTestResult mStart = kwaiSpeedTes.mStart;
             if (mStart - l1 < 0) {
                l1 = mStart;
             }
             kwaiSpeedTes = kwaiSpeedTes.mEnd;
             if (kwaiSpeedTes - l > 0) {
                l = kwaiSpeedTes;
             }
          }
          uoc.b = l - l1;
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          ClientStat$IdcSpeedStatEvent idcSpeedStat = PatchProxy.apply(null, uoc, c.class, "2");
          if (idcSpeedStat != PatchProxyResult.class) {
          }else {
             idcSpeedStat = new ClientStat$IdcSpeedStatEvent();
             c a = uoc.a;
             Object obj = PatchProxy.applyOneRefs(a, null, c.class, "1");
             int i = 6;
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                Objects.requireNonNull(a);
                int i1 = -1;
                switch (a.hashCode()){
                    case 0xce040e01:
                      if (a.equals("upload")) {
                         i1 = 0;
                      }
                      break;
                    case 0xe2d4dab1:
                      if (a.equals("pay_check")) {
                         i1 = 1;
                      }
                      break;
                    case 0x17a1a:
                      if (a.equals("api")) {
                         i1 = 2;
                      }
                      break;
                    case 0x1b0a8:
                      if (a.equals("pay")) {
                         i1 = 3;
                      }
                      break;
                    case 0x32b0ec:
                      if (a.equals("live")) {
                         i1 = 4;
                      }
                      break;
                    case 0x36d2af:
                      if (a.equals("ulog")) {
                         i1 = 5;
                      }
                      break;
                    case 0x5f008eb:
                      if (a.equals("https")) {
                         i1 = 6;
                      }
                      break;
                    default:
                }
                switch (i1){
                    case 0:
                      i = 2;
                    case 1:
                      break;
                    case 2:
                      i = 1;
                      break;
                    case 3:
                      i = 5;
                      break;
                    case 4:
                      i = 7;
                      break;
                    case 5:
                      i = 3;
                      break;
                    case 6:
                      i = 4;
                      break;
                    default:
                      i = 0;
                }
             }
             idcSpeedStat.type = i;
             idcSpeedStat.cost = uoc.b;
             String str = (TextUtils.x(uoc.f))? "": uoc.f;
             idcSpeedStat.exception = str;
             idcSpeedStat.goodIdcThreshold = uoc.c;
             idcSpeedStat.testSpeedTimeout = uoc.d;
             ArrayList uArrayList = new ArrayList();
             idcSpeedStat.strategy = 2;
             Iterator iterator1 = uoc.e.iterator();
             Object[] objArray = null;
             a = Long.MAX_VALUE;
             while (iterator1.hasNext()) {
                KwaiSpeedTestResult kwaiSpeedTes1 = iterator1.next();
                ClientStat$IdcSpeedPackage idcSpeedPack = PatchProxy.applyOneRefs(kwaiSpeedTes1, null, c.class, "3");
                if (idcSpeedPack != PatchProxyResult.class) {
                }else if(kwaiSpeedTes1 != null){
                   KwaiSpeedTestResult mHost = kwaiSpeedTes1.mHost;
                   if (mHost != null && !TextUtils.x(mHost.mDomain)) {
                      idcSpeedPack = new ClientStat$IdcSpeedPackage();
                      idcSpeedPack.idc = TextUtils.k(kwaiSpeedTes1.mHost.mDomain);
                      idcSpeedPack.cost = kwaiSpeedTes1.mDuration;
                      idcSpeedPack.exception = TextUtils.k(kwaiSpeedTes1.mException);
                      idcSpeedPack.tspCode = TextUtils.k(kwaiSpeedTes1.mTspCode);
                      idcSpeedPack.resultCode = kwaiSpeedTes1.mReponseCode;
                   }
                }
                idcSpeedPack = null;
                if (idcSpeedPack != null) {
                   KwaiSpeedTestResult mDuration = kwaiSpeedTes1.mDuration;
                   if (mDuration - a < 0) {
                      objArray = idcSpeedPack;
                      kwaiSpeedTes = mDuration;
                   }
                   uArrayList.add(idcSpeedPack);
                }
             }
             ClientStat$IdcSpeedPackage[] idcSpeedPack1 = new ClientStat$IdcSpeedPackage[uArrayList.size()];
             idcSpeedStat.idcSpeed = uArrayList.toArray(idcSpeedPack1);
             if (objArray != null) {
                objArray.isFastest = true;
                idcSpeedStat.bestResult = objArray;
             }
          }
          statPackage.idcSpeedStatEvent = idcSpeedStat;
          b.a(0x4b316083).j(statPackage);
       }
       return;
    }
}
