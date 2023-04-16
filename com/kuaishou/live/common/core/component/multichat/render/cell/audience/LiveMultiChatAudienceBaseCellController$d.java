package com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveMultiChatAudienceBaseCellController$d implements Observer	// class@0014df
{
    public final LiveMultiChatAudienceBaseCellController b;

    public void LiveMultiChatAudienceBaseCellController$d(LiveMultiChatAudienceBaseCellController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatAudienceBaseCellController$d.class, "1")) {
       }else {
          p0 = QCurrentUser.me();
          a.o(p0, "QCurrentUser.me\(\)");
          if (TextUtils.n(p0.getId(), this.b.K)) {
             this.b.M3();
          }
       }
       return;
    }
}
