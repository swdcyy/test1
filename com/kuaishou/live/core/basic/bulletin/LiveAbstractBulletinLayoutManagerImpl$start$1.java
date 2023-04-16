package com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$start$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl;
import java.lang.Object;
import android.graphics.Rect;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mrd.a;
import java.lang.Number;
import java.lang.Integer;

public final class LiveAbstractBulletinLayoutManagerImpl$start$1 extends Lambda implements l	// class@000824
{
    public final LiveAbstractBulletinLayoutManagerImpl this$0;

    public void LiveAbstractBulletinLayoutManagerImpl$start$1(LiveAbstractBulletinLayoutManagerImpl p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAbstractBulletinLayoutManagerImpl$start$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       LiveAbstractBulletinLayoutManagerImpl c = this.this$0.C;
       Object obj = c.i();
       a.m(obj);
       c.onNext(Integer.valueOf((obj.intValue() + 1)));
       return;
    }
}
