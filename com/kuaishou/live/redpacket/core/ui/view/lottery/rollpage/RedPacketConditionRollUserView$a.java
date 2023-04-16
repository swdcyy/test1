package com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionRollUserView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionRollUserView;
import rn3.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rn3.b$b$a;
import java.util.Objects;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultLuckyAreaView$a;

public class RedPacketConditionRollUserView$a extends m	// class@000f30
{
    public final b c;
    public final RedPacketConditionRollUserView d;

    public void RedPacketConditionRollUserView$a(RedPacketConditionRollUserView p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketConditionRollUserView$a.class, "1")) {
          return;
       }
       RedPacketConditionRollUserView$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(new b$b$a(), tc, b.class, "2") && !PatchProxy.applyVoid(null, tc, b.class, "3")) {
          b a = tc.a;
          if (a != null) {
             LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser mUserInfo = tc.c.mUserInfo;
             if (mUserInfo != null) {
                a.a(mUserInfo);
             }
          }
       }
       return;
    }
}
