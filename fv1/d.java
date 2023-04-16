package fv1.d;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import fv1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.core.basic.model.TempIndicatorPendantConfig$PendantGroupConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import fv1.f;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Collection;
import com.kuaishou.live.core.basic.model.TempIndicatorPendantConfig$PendantRejectionConfig;
import fv1.g;
import java.util.Set;
import trd.d1;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d	// class@0023bc
{
    public final List a;
    public final List b;
    public final Map c;

    public void d(List p0,List p1){
       List list;
       Set set;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       a.p(p0, "groups");
       a.p(p1, "rejections");
       super();
       int i = 10;
       ArrayList uArrayList = new ArrayList(u.Y(p0, i));
       Iterator iterator = p0.iterator();
       int i1 = 0;
       f obj = null;
       while (iterator.hasNext()) {
          TempIndicatorPendantConfig$PendantGroupConfig obj1 = iterator.next();
          int i2 = i1 + 1;
          if (i1 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (PatchProxy.isSupport(uoe)) {
             obj = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(i1), obj, uoe, "1");
             if (obj != patchProxyRe) {
             label_0066 :
                uArrayList.add(obj);
                i1 = i2;
             }
          }
          TempIndicatorPendantConfig$PendantGroupConfig mName = obj1.mName;
          a.o(mName, "mName");
          obj1 = obj1.mPendantIdList;
          if (obj1 != null) {
             list = ArraysKt___ArraysKt.uy(obj1);
             if (list != null) {
             label_0063 :
                obj = new f(mName, i1, list);
                goto label_0066 ;
             }
          }
          list = CollectionsKt__CollectionsKt.E();
          goto label_0063 ;
       }
       this.a = uArrayList;
       uArrayList = new ArrayList(u.Y(p1, i));
       Iterator iterator1 = p1.iterator();
       while (iterator1.hasNext()) {
          TempIndicatorPendantConfig$PendantRejectionConfig pendantRejec = iterator1.next();
          g og = PatchProxy.applyOneRefs(pendantRejec, obj, uoe, "2");
          if (og != patchProxyRe) {
          }else {
             TempIndicatorPendantConfig$PendantRejectionConfig mPendantId = pendantRejec.mPendantId;
             a.o(mPendantId, "mPendantId");
             pendantRejec = pendantRejec.mRejectIdList;
             if (pendantRejec != null) {
                set = ArraysKt___ArraysKt.Wy(pendantRejec);
                if (set != null) {
                label_00a9 :
                   og = new g(mPendantId, set);
                }
             }
             set = d1.k();
             goto label_00a9 ;
          }
          uArrayList.add(og);
       }
       this.b = uArrayList;
       this.c = new LinkedHashMap();
       Iterator iterator2 = p0.iterator();
       int i3 = 0;
       while (iterator2.hasNext()) {
          TempIndicatorPendantConfig$PendantGroupConfig obj2 = iterator2.next();
          int i4 = i3 + 1;
          if (i3 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj2 = obj2.mPendantIdList;
          a.o(obj2, "groupConfig.mPendantIdList");
          int len = obj2.length;
          for (i = 0; i < len; i = i + 1) {
             object oobject = obj2[i];
             a.o(oobject, "it");
             this.c.put(oobject, Integer.valueOf(i3));
          }
          i3 = i4;
       }
       return;
    }
}
