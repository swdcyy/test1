package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$g;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveAudienceMultiLineUserInfoViewModel$g implements Observer	// class@00151f
{
    public final LiveAudienceMultiLineUserInfoViewModel b;

    public void LiveAudienceMultiLineUserInfoViewModel$g(LiveAudienceMultiLineUserInfoViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineUserInfoViewModel$g.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.u0(p0.intValue(), "user width changed");
       }
       return;
    }
}
