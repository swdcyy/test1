package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$containerChangedListener$2$a;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$containerChangedListener$2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import lp3.i;
import android.graphics.Rect;
import sa3.b;
import lp3.c;

public final class LiveAudienceMultiChatPresenterV2$containerChangedListener$2$a implements View$OnLayoutChangeListener	// class@000b9d
{
    public final LiveAudienceMultiChatPresenterV2$containerChangedListener$2 b;

    public void LiveAudienceMultiChatPresenterV2$containerChangedListener$2$a(LiveAudienceMultiChatPresenterV2$containerChangedListener$2 p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(LiveAudienceMultiChatPresenterV2$containerChangedListener$2$a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiChatPresenterV2$containerChangedListener$2$a.class, "1")) {
             return;
          }
       }
       if (!LiveAudienceMultiChatPresenterV2.Z8(this.b.this$0).b()) {
          LiveAudienceMultiChatPresenterV2.Z8(this.b.this$0).a(b.class).Oa(1, new Rect(p1, p2, p3, p4));
       }
       return;
    }
}
