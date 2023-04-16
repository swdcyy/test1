package com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo$SignalExtraInfo;
import java.lang.String;
import java.lang.Class;
import com.google.gson.Gson;
import nt5.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveConditionRedPacketInfo	// class@001757
{
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme A;
    public String a;
    public int b;
    public String c;
    public long d;
    public UserInfo e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public String k;
    public List l;
    public String m;
    public boolean n;
    public long o;
    public int p;
    public MutableLiveData q;
    public MutableLiveData r;
    public MutableLiveData s;
    public MutableLiveData t;
    public MutableLiveData u;
    public MutableLiveData v;
    public MutableLiveData w;
    public final a x;
    public LiveConditionRedPacketInfo$SignalExtraInfo y;
    public boolean z;

    public void LiveConditionRedPacketInfo(SCLiveConditionRedPackInfo p0){
       super();
       Boolean fALSE = Boolean.FALSE;
       this.q = new MutableLiveData(fALSE);
       this.r = new MutableLiveData(fALSE);
       int i = 0;
       Integer integer = Integer.valueOf(i);
       this.s = new MutableLiveData(integer);
       this.t = new MutableLiveData("0");
       this.u = new MutableLiveData(integer);
       this.v = new MutableLiveData(integer);
       this.w = new MutableLiveData(integer);
       this.z = i;
       this.a = p0.liveStreamId;
       this.b = p0.redPackType;
       this.c = p0.redPackId;
       this.d = p0.lotteryTime;
       this.e = UserInfo.convertFromProto(p0.senderInfo);
       this.f = p0.displayDeadline;
       this.g = p0.queryLotteryDeadline;
       this.h = p0.queryLotteryMaxDelayDuration;
       this.i = p0.showResultDeadline;
       if (!TextUtils.isEmpty(p0.extraInfo)) {
          this.y = a.a.h(p0.extraInfo, LiveConditionRedPacketInfo$SignalExtraInfo.class);
       }
       this.A = p0.customRedPackSkinTheme;
       SCLiveConditionRedPackInfo senderInfo = p0.senderInfo;
       long l = (senderInfo == null)? 0: senderInfo.userId;
       this.x = new a(l);
       this.o = p0.appendAllowMinDuration;
       this.n = p0.enableAppend;
       return;
    }
    public static String a(LiveConditionRedPacketInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveConditionRedPacketInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.e == null) {
          return "";
       }
       return p0.e.mId+"";
    }
    public void b(boolean p0){
       LiveConditionRedPacketInfo liveConditio = LiveConditionRedPacketInfo.class;
       if (PatchProxy.isSupport(liveConditio) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveConditio, "3")) {
          return;
       }
       this.r.setValue(Boolean.valueOf(p0));
       return;
    }
}
