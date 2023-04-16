package com.kuaishou.live.core.show.redpacket.redpackrain2.game.LiveRedPackRainGameReceiveData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveRedPackRainGameReceiveData implements Serializable	// class@000ef6
{
    public int mBoomType;
    public double mCurTouchX;
    public double mCurTouchY;
    public int mGoldType;
    public boolean mIsOver;
    public int mNormalType;
    public static final long serialVersionUID = 0xd090491cd3134ab4;

    public void LiveRedPackRainGameReceiveData(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainGameReceiveData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRedPackRainGameReceiveData{mNormalType="+this.mNormalType+", mGoldType="+this.mGoldType+", mBoomType="+this.mBoomType+", mIsOver="+this.mIsOver+", mCurTouchX="+this.mCurTouchX+", mCurTouchY="+this.mCurTouchY+'}';
    }
}
