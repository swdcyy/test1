package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoModel$micSeatIds$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.util.Set;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import fe3.f;
import java.lang.Integer;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ts2.d;
import ts2.j;
import ts2.j$a;
import com.kwai.framework.model.user.UserInfo;

public final class MicSeatVideoModel$micSeatIds$1 extends Lambda implements p	// class@001719
{
    public final Set $forceOpenVideoUsers;

    public void MicSeatVideoModel$micSeatIds$1(Set p0){
       this.$forceOpenVideoUsers = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Set invoke(List p0,Set p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, MicSeatVideoModel$micSeatIds$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateInterfaceList");
       a.p(p1, "windowIds");
       obj = new ArrayList(u.Y(p1, 10));
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          obj.add(Integer.valueOf(iterator.next().a()));
       }
       iterator = CollectionsKt___CollectionsKt.L5(obj);
       obj = new ArrayList();
       Iterator iterator1 = p0.iterator();
       while (iterator1.hasNext()) {
          Object obj1 = iterator1.next();
          Object obj2 = obj1;
          j state = obj2.getState();
          int i = 0;
          if (state instanceof j$a) {
             UserInfo userInfo = state.a();
             if (iterator.contains(Integer.valueOf(obj2.getId())) || this.$forceOpenVideoUsers.contains(userInfo.mId)) {
                i = 1;
             }
          }
          if (i) {
             obj.add(obj1);
          }
       }
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(Integer.valueOf(iterator.next().getId()));
       }
       return CollectionsKt___CollectionsKt.L5(uArrayList);
    }
}
