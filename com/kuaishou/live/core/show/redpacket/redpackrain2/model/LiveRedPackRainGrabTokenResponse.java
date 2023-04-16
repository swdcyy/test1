package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainGrabTokenResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Random;
import java.util.List;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class LiveRedPackRainGrabTokenResponse implements Serializable	// class@000f04
{
    public long mExpireTimeMillis;
    public List mGrabDomains;
    public String mGrabToken;
    public String mRainId;
    public static final long serialVersionUID = 0x43a87619240fe1e8;

    public void LiveRedPackRainGrabTokenResponse(){
       super();
    }
    public String getRandomGrabDomain(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainGrabTokenResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mGrabDomains)) {
          return "";
       }
       return this.mGrabDomains.get(new Random().nextInt(this.mGrabDomains.size()));
    }
    public boolean isExpired(String p0,long p1){
       if (PatchProxy.isSupport(LiveRedPackRainGrabTokenResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, LiveRedPackRainGrabTokenResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (!TextUtils.x(this.mRainId) && (TextUtils.n(this.mRainId, p0) && (TextUtils.x(this.mGrabToken) || p1 - this.mExpireTimeMillis >= 0)))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainGrabTokenResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRedPackRainGrabTokenResponse{mGrabToken=\'"+this.mGrabToken+'''+", mExpireTimeMillis="+this.mExpireTimeMillis+", mGrabDomains="+this.mGrabDomains+'}';
    }
}
