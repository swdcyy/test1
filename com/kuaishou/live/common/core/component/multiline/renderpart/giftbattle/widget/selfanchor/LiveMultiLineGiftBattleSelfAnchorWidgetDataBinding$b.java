package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import xp5.g;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import tr1.a;
import ya1.n0;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import msd.a;
import com.kwai.framework.model.user.UserInfo;
import mk1.b$b;
import mk1.b$c;
import mk1.b;
import jk1.f;

public final class LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$b implements View$OnClickListener	// class@001582
{
    public final LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding b;

    public void LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$b(LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$b.class, "1")) {
          return;
       }
       User user = this.b.e.I();
       if (user != null) {
          a.o(user, "liveInfoManager.anchorUs¡­return@setOnClickListener");
          n0 value = this.b.c.b().getValue();
          if (value != null) {
             this.b.g.invoke();
             b$b uob = b$c.b(UserInfo.convertFromQUser(user), value.a(), this.b.f.Y());
             uob.h(54);
             this.b.d.bb(uob.a());
          }
       }
       return;
    }
}
