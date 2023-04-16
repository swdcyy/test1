package com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$livePlayConfigListener$1;
import ds5.c;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ec3.f;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$livePlayConfigListener$1$onAfterConfigUpdated$1;
import msd.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import qrd.l1;
import brd.y;
import java.lang.Throwable;

public final class LiveLiteLongConnectionManager$livePlayConfigListener$1 implements c	// class@000a28
{
    public final LiveLiteLongConnectionManager b;

    public void LiveLiteLongConnectionManager$livePlayConfigListener$1(LiveLiteLongConnectionManager p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLongConnectionManager$livePlayConfigListener$1.class, "1")) {
          return;
       }
       a.p(p0, "config");
       if (f.h()) {
          this.b.A.ll("resumeLongConnection", new LiveLiteLongConnectionManager$livePlayConfigListener$1$onAfterConfigUpdated$1(this));
       }else {
          this.b.C.onNext(l1.a);
       }
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
