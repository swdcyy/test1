package nz9.v0;
import tl8.g;
import nz9.z0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.android.model.mix.QuestionnaireInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;

public final class v0 implements g	// class@003250
{
    public final z0 a;
    public final QPhoto b;

    public void v0(z0 p0,QPhoto p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void apply(Object p0){
       v0 ta = this.a;
       v0 tb = this.b;
       if (ta.B0(true) && tb != null) {
          ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
          liveStreamPa.identity = TextUtils.k(tb.getLiveStreamId());
          p0.liveStreamPackage = liveStreamPa;
          p0.photoPackage = w1.f(ta.u.mEntity);
       }
       if (ta.u.getQuestionnaireInfo() != null && !TextUtils.isEmpty(ta.u.getQuestionnaireInfo().mKsOrderId)) {
          ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
          ksOrderInfoP.ksOrderId = ta.u.getQuestionnaireInfo().mKsOrderId;
          p0.ksOrderInfoPackage = ksOrderInfoP;
       }
       return;
    }
}
