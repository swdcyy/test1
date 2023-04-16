package com.kuaishou.live.lite.player.basic.service.LivePlayTextureViewWrapper;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class LivePlayTextureViewWrapper extends LivePlayTextureView	// class@000a7f
{

    public void LivePlayTextureViewWrapper(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LivePlayTextureViewWrapper(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LivePlayTextureViewWrapper(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void LivePlayTextureViewWrapper(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void setLayoutParams(ViewGroup$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTextureViewWrapper.class, "1")) {
          return;
       }
       super.setLayoutParams(p0);
       b.g0(LiveLiteLogTag.LAYOUT_MANAGER, "LivePlayTextureViewWrapper setLayoutParams "+p0, new RuntimeException());
       return;
    }
}
