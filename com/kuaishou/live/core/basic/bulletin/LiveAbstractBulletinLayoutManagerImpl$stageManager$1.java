package com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$stageManager$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import i81.c;
import i81.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class LiveAbstractBulletinLayoutManagerImpl$stageManager$1 extends Lambda implements p	// class@000823
{
    public final LiveAbstractBulletinLayoutManagerImpl this$0;

    public void LiveAbstractBulletinLayoutManagerImpl$stageManager$1(LiveAbstractBulletinLayoutManagerImpl p0){
       this.this$0 = p0;
       super(2);
    }
    public final e invoke(LiveBulletinStageType p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveAbstractBulletinLayoutManagerImpl$stageManager$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "type");
       LiveAbstractBulletinLayoutManagerImpl.E(this.this$0, "StageChange "+p0, null, 2, null);
       return this.this$0.o(p0, p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
