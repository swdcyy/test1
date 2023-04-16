package com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$b;
import p02.a;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl;
import com.kuaishou.live.comments.bulletin.LiveBulletinViewType;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import p02.m;
import java.lang.StringBuilder;
import i81.a;
import java.lang.Throwable;
import mrd.a;

public final class LiveAbstractBulletinLayoutManagerImpl$b implements a	// class@000820
{
    public final LiveAbstractBulletinLayoutManagerImpl a;
    public final LiveBulletinViewType b;
    public final int c;
    public final int d;

    public void LiveAbstractBulletinLayoutManagerImpl$b(LiveAbstractBulletinLayoutManagerImpl p0,LiveBulletinViewType p1,int p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(int p0){
       LiveAbstractBulletinLayoutManagerImpl$b uob = LiveAbstractBulletinLayoutManagerImpl$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       Iterator iterator = this.a.z.iterator();
       while (iterator.hasNext()) {
          m om = iterator.next();
          LiveAbstractBulletinLayoutManagerImpl.E(this.a, "LiveBulletinShrinkStrategy onCalculateFinish viewType:"+om.a().getViewType()+" height:"+om.b(), null, 2, null);
       }
       int i = this.a.w(null, 0);
       int i1 = p0 + i;
       LiveAbstractBulletinLayoutManagerImpl.E(this.a, "LiveBulletinShrinkStrategy doRequestChangeHeight viewType=["+this.b+"] "+"modifiedRequestHeight=["+this.c+"] originalRequestHeight=["+this.d+"] "+"onCalculateFinish totalBulletinAreaHeight "+p0+'+'+i+'='+i1, null, 2, null);
       this.a.B.onNext(Integer.valueOf(i1));
       return;
    }
}
