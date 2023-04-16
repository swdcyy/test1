package ad3.f;
import lf3.g;
import ad3.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitButton;
import java.util.Objects;
import com.kuaishou.commercial.reporter.data.SignalMessageData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import lf3.f;

public final class f implements g	// class@00008c
{
    public final j b;

    public void f(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
          p0.mWidgetDataType = 3;
       }else {
          int i = TextUtils.x(p0.audienceButtonJumpUrl) ^ 1;
          j oj = (p0.canShow != null && i)? 1: null;
          if (oj && tb.w == null) {
             tb.u.mRecruitReceiveTimePeriodMs = System.currentTimeMillis() - tb.q;
             oj = tb.u;
             LivePlusRecruitMessages$LivePlusRecruitButton canShow = p0.canShow;
             int i1 = (canShow != null)? 1: 2;
             oj.mWidgetDataType = i1;
             oj.mCanShowWidget = canShow;
             tb.w = true;
          }
          tb.V2(p0);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
