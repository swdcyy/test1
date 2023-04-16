package g92.a;
import lf3.g;
import com.kuaishou.live.core.show.giftachievement.d;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveGiftAchievementUpdateNotice;
import java.util.Objects;
import t02.a0;
import java.lang.String;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.giftachievement.LiveAudienceGiftAchievementModel;
import lf3.f;

public final class a implements g	// class@002ac9
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
       }else if(TextUtils.n(p0.liveStreamId, tb.r.Z2.getLiveStreamId())){
          tb.V8(LiveAudienceGiftAchievementModel.covertFromSCNotice(p0));
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
