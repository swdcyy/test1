package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagModel$micSeatIds$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Set;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ts2.d;
import ts2.j;
import ts2.j$a;
import com.kwai.framework.model.user.UserInfo;
import java.util.Collection;
import trd.u;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class MicSeatKtvTagModel$micSeatIds$1 extends Lambda implements p	// class@0016b2
{
    public final String $anchorId;

    public void MicSeatKtvTagModel$micSeatIds$1(String p0){
       this.$anchorId = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Set invoke(List p0,Set p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, MicSeatKtvTagModel$micSeatIds$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateInterfaceList");
       a.p(p1, "singerCandidateIdSet");
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          j state = obj1.getState();
          int i = 0;
          if (state instanceof j$a) {
             UserInfo userInfo = state.a();
             if (a.g(userInfo.mId, this.$anchorId) || p1.contains(userInfo.mId)) {
                i = 1;
             }
          }
          if (i) {
             obj.add(obj1);
          }
       }
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator1 = obj.iterator();
       while (iterator1.hasNext()) {
          uArrayList.add(Integer.valueOf(iterator1.next().getId()));
       }
       return CollectionsKt___CollectionsKt.L5(uArrayList);
    }
}
