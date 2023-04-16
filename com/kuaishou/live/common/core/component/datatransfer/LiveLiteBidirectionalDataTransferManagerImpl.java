package com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransferManagerImpl;
import uf1.a;
import xp5.g;
import androidx.lifecycle.Lifecycle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransferManagerImpl$lifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransfer;
import lp3.e;
import lp3.c;
import lp3.b;

public final class LiveLiteBidirectionalDataTransferManagerImpl implements a	// class@0010de
{
    public final String b;
    public final LifecycleEventObserver c;
    public final g d;
    public final Lifecycle e;

    public void LiveLiteBidirectionalDataTransferManagerImpl(g p0,Lifecycle p1){
       a.p(p0, "liveInfoManager");
       a.p(p1, "lifecycle");
       super();
       this.d = p0;
       this.e = p1;
       this.b = "LiveLiteBidirectionalDataTransferPresenter";
       LiveLiteBidirectionalDataTransferManagerImpl$lifecycleObserver$1 olifecycleOb = new LiveLiteBidirectionalDataTransferManagerImpl$lifecycleObserver$1(this);
       this.c = olifecycleOb;
       p1.addObserver(olifecycleOb);
    }
    public boolean Ge(String p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLiteBidirectionalDataTransferManagerImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "streamId");
       a.p(p1, "bizKey");
       a.p(p2, "bizValue");
       return LiveLiteBidirectionalDataTransfer.c.f(p0, p1, p2);
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public Object wb(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteBidirectionalDataTransferManagerImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "streamId");
       a.p(p1, "bizKey");
       return LiveLiteBidirectionalDataTransfer.c.b(p0, p1);
    }
}
