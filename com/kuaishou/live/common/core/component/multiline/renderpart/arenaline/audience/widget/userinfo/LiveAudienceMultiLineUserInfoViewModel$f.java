package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$f;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel;
import java.lang.Object;
import pq1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import java.lang.Integer;

public final class LiveAudienceMultiLineUserInfoViewModel$f implements Observer	// class@00151e
{
    public final LiveAudienceMultiLineUserInfoViewModel b;

    public void LiveAudienceMultiLineUserInfoViewModel$f(LiveAudienceMultiLineUserInfoViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineUserInfoViewModel$f.class, "1")) {
       }else {
          LiveAudienceMultiLineUserInfoViewModel$f tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveAudienceMultiLineUserInfoViewModel.class, "4")) {
             p0 = tb.a.getValue();
             if (p0 == null) {
                p0 = Integer.valueOf(0);
             }
             a.o(p0, "userInfoMaxWidthLiveData.value ?: 0");
             tb.u0(p0.intValue(), "uiParams change");
          }
       }
       return;
    }
}
