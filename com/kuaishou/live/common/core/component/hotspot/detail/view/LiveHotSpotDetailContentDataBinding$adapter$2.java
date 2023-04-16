package com.kuaishou.live.common.core.component.hotspot.detail.view.LiveHotSpotDetailContentDataBinding$adapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.view.LiveHotSpotDetailContentDataBinding;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailAdapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import un1.d;
import un1.k;

public final class LiveHotSpotDetailContentDataBinding$adapter$2 extends Lambda implements a	// class@00141a
{
    public final LiveHotSpotDetailContentDataBinding this$0;

    public void LiveHotSpotDetailContentDataBinding$adapter$2(LiveHotSpotDetailContentDataBinding p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveHotSpotDetailAdapter invoke(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailContentDataBinding$adapter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveHotSpotDetailContentDataBinding$adapter$2 tthis$0 = this.this$0;
       return new LiveHotSpotDetailAdapter(tthis$0.f, tthis$0.h, tthis$0.j, tthis$0.i);
    }
    public Object invoke(){
       return this.invoke();
    }
}
