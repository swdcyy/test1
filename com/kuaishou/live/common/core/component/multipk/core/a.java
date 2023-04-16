package com.kuaishou.live.common.core.component.multipk.core.a;
import zs1.f;
import java.lang.Integer;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkVoteEnd;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkCritMoment;
import java.lang.Object;
import com.google.common.collect.ImmutableMap;
import hf3.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import zs1.e;
import lf3.g;
import com.google.protobuf.nano.MessageNano;
import java.util.List;
import java.util.Collection;
import ekd.q;
import lf3.i;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;

public class a implements f	// class@0015d0
{
    public final a a;
    public final Map b;
    public final Map c;
    public final List d;
    public boolean e;
    public static final Map f;

    static {
       a.f = ImmutableMap.of(Integer.valueOf(953), SCLiveMultiPkVoteEnd.class, Integer.valueOf(977), LiveMultiPkCritMoment.class);
    }
    public void a(a p0){
       super();
       this.b = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
       this.d = new ArrayList();
       this.e = true;
       this.a = p0;
       Iterator iterator = a.f.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i = uEntry.getKey().intValue();
          Class value = uEntry.getValue();
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), value, this, uoa, "7")) {
             continue ;
          }else {
             e uoe = new e(this, i);
             this.c.put(Integer.valueOf(i), uoe);
             this.a.u0(i, value, uoe);
          }
       }
       return;
    }
    public final void a(int p0,MessageNano p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "10")) {
          return;
       }
       List list = this.b.get(Integer.valueOf(p0));
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().c.H4(p1);
          }
       }
       return;
    }
    public void o(int p0,g p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       b.d0(LiveCommonLogTag.MULTI_PK, "LiveMultiPkSCMessageCache:unregisterSCMessageListener", "enableCache", Boolean.valueOf(this.e), "payloadType", Integer.valueOf(p0));
       if (a.f.containsKey(Integer.valueOf(p0))) {
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "9")) {
             List list = this.b.get(Integer.valueOf(p0));
             if (list != null) {
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      i oi = iterator.next();
                      if (oi.a == p0 && oi.c == p1) {
                         iterator.remove();
                      }
                   }
                   if (list.isEmpty()) {
                      this.b.remove(Integer.valueOf(p0));
                      break ;
                   }
                }
             }
          }
       }else {
          this.a.o(p0, p1);
       }
       return;
    }
    public void u0(int p0,Class p1,g p2){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "5")) {
          return;
       }
       b.d0(LiveCommonLogTag.MULTI_PK, "LiveMultiPkSCMessageCache:registerSCMessageListener", "enableCache", Boolean.valueOf(this.e), "payloadType", Integer.valueOf(p0));
       if (a.f.containsKey(Integer.valueOf(p0))) {
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "8")) {
             List list = this.b.get(Integer.valueOf(p0));
             if (list == null) {
                list = new ArrayList();
                this.b.put(Integer.valueOf(p0), list);
             }
             list.add(new i(p0, p1, p2, true));
          }
       }else {
          this.a.u0(p0, p1, p2);
       }
       return;
    }
}
