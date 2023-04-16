package ld1.e;
import msd.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo$ExtraInfo;

public final class e implements a	// class@002ed1
{
    public final LiveServiceAccountNoticeInfo b;

    public void e(LiveServiceAccountNoticeInfo p0){
       this.b = p0;
    }
    public final Object invoke(){
       return "tunaBizType is:"+this.b.mExtraInfo.mTunaBizType;
    }
}
