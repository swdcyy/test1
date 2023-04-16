package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class LiveAudienceMultiLineUserInfoViewModel$d implements Observer	// class@00151c
{
    public final LiveAudienceMultiLineUserInfoViewModel b;

    public void LiveAudienceMultiLineUserInfoViewModel$d(LiveAudienceMultiLineUserInfoViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineUserInfoViewModel$d.class, "1")) {
       }else {
          LiveAudienceMultiLineUserInfoViewModel$d tb = this.b;
          a.o(p0, "it");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(tb);
          LiveAudienceMultiLineUserInfoViewModel liveAudience = LiveAudienceMultiLineUserInfoViewModel.class;
          if (!PatchProxy.isSupport(liveAudience) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, liveAudience, "5")) {
             char c = '[';
             if (!b) {
                b.P(LiveAudienceMultiLineUserInfoViewModel.q, c+tb.l+"]handleFollowChanged, show follow");
                b = tb.a.getValue();
                if (b == null) {
                   b = Integer.valueOf(0);
                }
                a.o(b, "userInfoMaxWidthLiveData.value ?: 0");
                tb.u0(b.intValue(), "show follow");
             }else if(a.g(tb.i.getValue(), Boolean.TRUE)){
                b.P(LiveAudienceMultiLineUserInfoViewModel.q, c+tb.l+"]handleFollowChanged, start follow animation");
                tb.r0(tb.j).setValue(null);
             }else {
                b.P(LiveAudienceMultiLineUserInfoViewModel.q, c+tb.l+"]handleFollowChanged, ignore");
             }
          }
       }
       return;
    }
}
