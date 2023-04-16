package ao3.f;
import java.lang.Runnable;
import ao3.g;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$LiveConditionRedPacketCurrentInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo;
import java.lang.String;
import java.lang.Class;
import com.google.gson.Gson;
import androidx.lifecycle.MutableLiveData;

public final class f implements Runnable	// class@00028c
{
    public final g b;
    public final LiveConditionRedPacketCurrentInfoResponse c;

    public void f(g p0,LiveConditionRedPacketCurrentInfoResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       if (!TextUtils.isEmpty(tc.mCurrentInfo.mExtraInfo)) {
          tb.m.postValue(a.a.h(tc.mCurrentInfo.mExtraInfo, LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo.class).mParticipateRuleTip);
       }
       return;
    }
}
