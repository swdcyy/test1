package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import java.lang.Integer;

public final class LiveAudienceMultiLineUserInfoViewModel$e implements Observer	// class@00151d
{
    public final LiveAudienceMultiLineUserInfoViewModel b;

    public void LiveAudienceMultiLineUserInfoViewModel$e(LiveAudienceMultiLineUserInfoViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineUserInfoViewModel$e.class, "1")) {
       }else {
          LiveAudienceMultiLineUserInfoViewModel$e tb = this.b;
          a.o(p0, "it");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(tb);
          LiveAudienceMultiLineUserInfoViewModel liveAudience = LiveAudienceMultiLineUserInfoViewModel.class;
          if (!PatchProxy.isSupport(liveAudience) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, liveAudience, "6")) {
             b = tb.a.getValue();
             if (b == null) {
                b = Integer.valueOf(0);
             }
             a.o(b, "userInfoMaxWidthLiveData.value ?: 0");
             tb.u0(b.intValue(), "mute changed");
          }
       }
       return;
    }
}
