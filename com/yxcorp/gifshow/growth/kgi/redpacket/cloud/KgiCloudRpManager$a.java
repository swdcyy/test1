package com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfigItem;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class KgiCloudRpManager$a implements Comparator	// class@0013e6
{
    public final long b;

    public void KgiCloudRpManager$a(long p0){
       this.b = p0;
       super();
    }
    public final int compare(Object p0,Object p1){
       long l1;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KgiCloudRpManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       p0 = p0.start;
       long l = -1;
       if (p0 != null) {
          p0 = KgiCloudRpManager.k.m(p0, this.b);
          if (p0 != null) {
             l1 = p0.longValue();
          label_002b :
             p0 = Long.valueOf(l1);
             p1 = p1.start;
             if (p1 != null) {
                p1 = KgiCloudRpManager.k.m(p1, this.b);
                if (p1 != null) {
                   l = p1.longValue();
                }
             }
             return b.f(p0, Long.valueOf(l));
          }
       }
       l1 = l;
       goto label_002b ;
    }
}
