package com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import java.lang.Object;
import dq1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yp1.c;
import yp1.g;
import fq1.e;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import xp1.b;
import up1.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import lp1.b;

public final class LiveAudienceMultiChatController$b implements Observer	// class@0014b7
{
    public final LiveAudienceMultiChatController b;

    public void LiveAudienceMultiChatController$b(LiveAudienceMultiChatController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatController$b.class, "1")) {
       }else {
          c uoc = this.b.o.a();
          if (p0 != null && uoc != null) {
             LayoutConfig value = LiveAudienceMultiChatController.V2(this.b).m().c().getValue();
             int i = (value != null)? value.c(): 0;
             p0 = new e(i, uoc);
          }else {
             p0 = null;
          }
          this.b.w.Z(p0);
       }
       return;
    }
}
