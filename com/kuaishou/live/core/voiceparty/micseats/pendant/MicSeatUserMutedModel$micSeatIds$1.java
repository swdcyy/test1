package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedModel$micSeatIds$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ts2.d;
import ts2.j;
import ts2.j$a;
import java.util.Objects;
import com.kwai.framework.model.user.UserInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import trd.u;
import java.lang.Integer;

public final class MicSeatUserMutedModel$micSeatIds$1 extends Lambda implements p	// class@0016f7
{
    public static final MicSeatUserMutedModel$micSeatIds$1 INSTANCE;

    static {
       MicSeatUserMutedModel$micSeatIds$1.INSTANCE = new MicSeatUserMutedModel$micSeatIds$1();
    }
    public void MicSeatUserMutedModel$micSeatIds$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Set invoke(List p0,Set p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, MicSeatUserMutedModel$micSeatIds$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateInterfaceList");
       a.p(p1, "userMutedInfo");
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          j obj2 = obj1;
          j state = obj2.getState();
          int i = 0;
          if (state instanceof j$a) {
             Objects.requireNonNull(state);
             if (!obj2.a()) {
                obj2 = obj2.getState();
                UserInfo userInfo = null;
                UserInfo userInfo1 = (obj2 instanceof j$a)? obj2.a(): userInfo;
                if (userInfo1 != null) {
                   userInfo = userInfo1.mId;
                }
                if (!CollectionsKt___CollectionsKt.H1(p1, userInfo)) {
                label_005f :
                   if (i) {
                      obj.add(obj1);
                   }
                }
             }
             i = 1;
             goto label_005f ;
          }else {
             goto label_005f ;
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
