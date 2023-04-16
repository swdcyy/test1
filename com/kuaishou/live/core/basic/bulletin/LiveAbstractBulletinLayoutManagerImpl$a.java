package com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$a;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$BizType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import usd.q;

public final class LiveAbstractBulletinLayoutManagerImpl$a	// class@00081f
{
    public final Map a;
    public final a b;

    public void LiveAbstractBulletinLayoutManagerImpl$a(){
       super();
       this.a = new LinkedHashMap();
       a uoa = a.h(Integer.valueOf(0));
       a.o(uoa, "BehaviorSubject.createDefault\(0\)");
       this.b = uoa;
    }
    public final void a(LiveBulletinLayoutManager$BizType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAbstractBulletinLayoutManagerImpl$a.class, "2")) {
          return;
       }
       a.p(p0, "bizType");
       this.a.remove(p0);
       this.b.onNext(Integer.valueOf(this.c()));
       return;
    }
    public final t b(){
       return this.b;
    }
    public final int c(){
       Object obj = PatchProxy.apply(null, this, LiveAbstractBulletinLayoutManagerImpl$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          i = q.n(i, iterator.next().intValue());
       }
       return i;
    }
    public final void d(LiveBulletinLayoutManager$BizType p0,int p1){
       LiveAbstractBulletinLayoutManagerImpl$a uoa = LiveAbstractBulletinLayoutManagerImpl$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "bizType");
       this.a.put(p0, Integer.valueOf(p1));
       this.b.onNext(Integer.valueOf(this.c()));
       return;
    }
}
