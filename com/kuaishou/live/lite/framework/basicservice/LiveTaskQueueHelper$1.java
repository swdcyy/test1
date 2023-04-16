package com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$1$a;
import java.lang.Iterable;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import xj3.e;
import java.util.Collection;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveTaskQueueHelper$1 extends Lambda implements l	// class@000906
{
    public static final LiveTaskQueueHelper$1 INSTANCE;

    static {
       LiveTaskQueueHelper$1.INSTANCE = new LiveTaskQueueHelper$1();
    }
    public void LiveTaskQueueHelper$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       String obj;
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTaskQueueHelper$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       JsonObject jsonObject = new JsonObject();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = CollectionsKt___CollectionsKt.f5(p0, new LiveTaskQueueHelper$1$a()).iterator();
       int i = 0xf4240;
       while (iterator.hasNext()) {
          obj = iterator.next();
          l = obj.a() / (long)i;
          i = (l - (long)4 > 0)? 1: 0;
          if (i) {
             uArrayList.add(obj);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          obj = uoe.b();
          l = uoe.a() / (long)i;
          jsonObject.a0(obj, Long.valueOf(l));
       }
       b.Z(LiveLiteLogTag.LIVE_LITE_TASK, "MainThread task LiteComponentLoad Time "+jsonObject);
       return;
    }
}
