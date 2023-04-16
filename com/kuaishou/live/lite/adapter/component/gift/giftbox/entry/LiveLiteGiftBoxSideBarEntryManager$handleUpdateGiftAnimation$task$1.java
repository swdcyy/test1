package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm1.d;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem;
import android.view.View;
import android.content.Context;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1$a;
import qm1.c;
import qm1.a;
import androidx.lifecycle.MutableLiveData;
import nsd.u;

public final class LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1 extends Lambda implements a	// class@001dc8
{
    public final boolean $isLastPosition;
    public final UpdatedGiftResponse $response;
    public final LiveLiteGiftBoxSideBarEntryManager this$0;

    public void LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1(LiveLiteGiftBoxSideBarEntryManager p0,boolean p1,UpdatedGiftResponse p2){
       this.this$0 = p0;
       this.$isLastPosition = p1;
       this.$response = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1.class, "1")) {
          return;
       }
       LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1 tthis$0 = this.this$0;
       if (tthis$0.d == null) {
          int i = (this.$isLastPosition != null)? 4: 1;
          LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1 tthis$01 = this.this$0;
          d uod = new d(i, tthis$01.e, tthis$01.b().m().getContext(), new LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1$a(this), null, 16, null);
          tthis$0.d = v1;
       }
       LiveLiteGiftBoxSideBarEntryManager d = this.this$0.d;
       if (d != null) {
          d.c(this.$response);
       }
       return;
    }
}
