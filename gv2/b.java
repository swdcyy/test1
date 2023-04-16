package gv2.b;
import java.util.List;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ts2.d;
import kotlin.Result;
import fe3.g;
import java.lang.Throwable;
import qrd.j0;
import fe3.e;
import fe3.f;
import ts2.j;
import ts2.j$a;
import com.kwai.framework.model.user.UserInfo;
import fe3.c;
import fe3.c$d;
import fe3.c$a;
import fe3.d;
import com.kuaishou.live.livestage.VideoScaleMode;
import nsd.u;
import java.util.Collection;

public final class b	// class@002bab
{

    public static final List a(List p0,Set p1,List p2){
       UserInfo mId;
       e uoe;
       Object obj = p1;
       Object obj1 = p2;
       f obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(p0, "stateInterfaceList");
       a.p(obj, "openCameraUsers");
       a.p(obj1, "windowRectList");
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          j obj3 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          Object obj4 = obj3;
          obj2 = Result.constructor-impl(obj1.get(i));
          c$d uod = null;
          if (Result.isFailure-impl(obj2)) {
             i = uod;
          }
          Object obj5 = i;
          if (obj5 != null) {
             obj2 = PatchProxy.applyThreeRefs(obj4, obj5, p1, null, b.class, "2");
             if (obj2 != PatchProxyResult.class) {
                uod = obj2;
             }else {
                obj2 = new f(obj4.getId());
                obj3 = obj4.getState();
                UserInfo userInfo = (obj3 instanceof j$a)? obj3.a(): uod;
                if (userInfo != null) {
                   String str = "it.mId";
                   if (obj.contains(userInfo.mId)) {
                      mId = userInfo.mId;
                      a.o(mId, str);
                      uod = c.a.a(mId);
                   }
                   userInfo = userInfo.mId;
                   a.o(userInfo, str);
                   uoe = new e(obj2, uod, obj5, new d(userInfo), null, 16, null);
                }else {
                   uoe = new e(obj2, null, obj5, null, null, 16, null);
                }
                uod = v2;
             }
          }
          if (uod != null) {
             uArrayList.add(uod);
          }
          i = i1;
       }
       return uArrayList;
    }
}
