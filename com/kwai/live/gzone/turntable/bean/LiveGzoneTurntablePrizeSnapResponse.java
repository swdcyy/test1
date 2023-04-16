package com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrizeSnapResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;

public class LiveGzoneTurntablePrizeSnapResponse implements Serializable, a	// class@000e3b
{
    public int mAvailableDrawCount;
    public String mForwardUrl;
    public long mKshell;
    public LiveGzoneTurntablePrize mPrize;
    public long mServerTime;
    public static final long serialVersionUID = 0xa77c550dc6d3b675;

    public void LiveGzoneTurntablePrizeSnapResponse(){
       super();
    }
    public void afterDeserialize(){
       LiveGzoneTurntablePrizeSnapResponse tmPrize = this.mPrize;
       if (tmPrize != null) {
          tmPrize.mForwardUrl = this.mForwardUrl;
       }
       return;
    }
}
