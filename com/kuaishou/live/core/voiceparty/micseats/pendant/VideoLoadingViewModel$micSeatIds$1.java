package com.kuaishou.live.core.voiceparty.micseats.pendant.VideoLoadingViewModel$micSeatIds$1;
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

public final class VideoLoadingViewModel$micSeatIds$1 extends Lambda implements p	// class@00175d
{
    public final Set $needLoadingIds;

    public void VideoLoadingViewModel$micSeatIds$1(Set p0){
       this.$needLoadingIds = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Set invoke(List p0,Set p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, VideoLoadingViewModel$micSeatIds$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateInterfaceList");
       a.p(p1, "windows");
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
          obj2 = (this.$needLoadingIds.contains(Integer.valueOf(obj2.getId())) && !iterator.contains(Integer.valueOf(obj2.getId())))? 1: null;
          if (obj2) {
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
