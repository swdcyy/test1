package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideModel$micSeatIds$1;
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
import com.kwai.framework.model.user.UserInfo;
import java.util.Collection;
import trd.u;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class MicSeatBubbleGuideModel$micSeatIds$1 extends Lambda implements p	// class@001661
{
    public static final MicSeatBubbleGuideModel$micSeatIds$1 INSTANCE;

    static {
       MicSeatBubbleGuideModel$micSeatIds$1.INSTANCE = new MicSeatBubbleGuideModel$micSeatIds$1();
    }
    public void MicSeatBubbleGuideModel$micSeatIds$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Set invoke(List p0,Set p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, MicSeatBubbleGuideModel$micSeatIds$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateInterfaceList");
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          j state = obj1.getState();
          boolean b = (state instanceof j$a)? p1.contains(state.a().mId): false;
          if (b) {
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
