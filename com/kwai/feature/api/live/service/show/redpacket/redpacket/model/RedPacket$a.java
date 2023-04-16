package com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket$a;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;

public class RedPacket$a	// class@00101b
{
    public long a;
    public List b;
    public String c;
    public long d;
    public boolean e;
    public boolean f;
    public final RedPacket g;

    public void RedPacket$a(RedPacket p0){
       this.g = p0;
       super();
       this.a = -1;
       this.f = true;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, RedPacket$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ExtraInfo{mGrabDou="+this.a+", mRedPacketLucks=";
       RedPacket$a tb = this.b;
       String str = (tb == null)? "null": Integer.valueOf(tb.size());
       return obj+str+", mTips=\'"+TextUtils.k(this.c)+'''+", mGrabTime="+this.d+", mGrabEnd="+this.e+", mCanShow="+this.f+'}';
    }
}
