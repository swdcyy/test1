package n21.a;
import ok.h;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveActivityTopRightPendant$SCLiveActivityTopRightPendant;
import n21.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j;
import n21.e;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.String;
import java.util.List;

public final class a implements h	// class@003282
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       LiveActivityTopRightPendant$SCLiveActivityTopRightPendant sCLiveActivi = p0;
       e uoe = null;
       if (!sCLiveActivi) {
       }else if(TextUtils.x(sCLiveActivi.pendantId) || (j.h(sCLiveActivi.picUrlV2) || sCLiveActivi.endShowTime <= 0)){
          e uoe1 = new e(sCLiveActivi.pendantId, sCLiveActivi.pendantType, sCLiveActivi.endShowTime, Lists.e(e0.i(sCLiveActivi.picUrlV2)), Lists.e(e0.i(sCLiveActivi.picUrlWithoutText)), sCLiveActivi.buttonText, sCLiveActivi.clickUrl, sCLiveActivi.logMessage, sCLiveActivi.redDotRemind);
       }
       return uoe;
    }
}
