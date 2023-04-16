package com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$d;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import p02.m;
import i81.a;
import com.kuaishou.live.comments.bulletin.LiveBulletinViewType;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class LiveAbstractBulletinLayoutManagerImpl$d implements Comparator	// class@000822
{

    public void LiveAbstractBulletinLayoutManagerImpl$d(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveAbstractBulletinLayoutManagerImpl$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p0.a().getViewType().getShrinkPriority()), Integer.valueOf(p1.a().getViewType().getShrinkPriority()));
    }
}
