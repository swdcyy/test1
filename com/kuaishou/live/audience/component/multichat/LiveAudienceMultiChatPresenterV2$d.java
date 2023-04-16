package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$d;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.i;
import sa3.b;
import lp3.c;

public final class LiveAudienceMultiChatPresenterV2$d implements Runnable	// class@000b9f
{
    public final LiveAudienceMultiChatPresenterV2 b;
    public final LayoutConfig c;
    public final ViewGroup d;

    public void LiveAudienceMultiChatPresenterV2$d(LiveAudienceMultiChatPresenterV2 p0,LayoutConfig p1,ViewGroup p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2$d.class, "1")) {
          return;
       }
       if (!LiveAudienceMultiChatPresenterV2.Z8(this.b).b()) {
          LiveAudienceMultiChatPresenterV2.Z8(this.b).a(b.class).an(this.c, this.d.getWidth(), this.d.getTop());
       }
       return;
    }
}
