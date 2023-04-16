package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameModel$micSeatIds$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.util.Map;
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
import java.lang.Integer;
import xs2.l;
import java.util.Collection;
import trd.u;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class MicSeatDecorationNameModel$micSeatIds$1 extends Lambda implements p	// class@00166b
{
    public static final MicSeatDecorationNameModel$micSeatIds$1 INSTANCE;

    static {
       MicSeatDecorationNameModel$micSeatIds$1.INSTANCE = new MicSeatDecorationNameModel$micSeatIds$1();
    }
    public void MicSeatDecorationNameModel$micSeatIds$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Set invoke(List p0,Map p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, MicSeatDecorationNameModel$micSeatIds$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateInterfaceList");
       a.p(p1, "decorationInfo");
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          l ol = p1.get(Integer.valueOf(obj1.getId()));
          int i = 0;
          if (ol != null && (ol.c() || ol.b())) {
             i = 1;
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
