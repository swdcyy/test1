package com.kwai.framework.basestation.BaseStationManager$BaseStationInfo;
import java.io.Serializable;
import com.kwai.framework.basestation.BaseStationManager;
import java.lang.String;
import java.lang.Object;

public class BaseStationManager$BaseStationInfo implements Serializable	// class@0014d6
{
    public int mCid;
    public int mLac;
    public int mMcc;
    public int mMnc;
    public String mRadio;
    public int mRssi;
    public long mUpdateTime;
    public final BaseStationManager this$0;
    public static final long serialVersionUID = 0x24e1ab5544693e0c;

    public void BaseStationManager$BaseStationInfo(BaseStationManager p0,int p1,int p2,int p3,int p4,String p5){
       this.this$0 = p0;
       super();
       this.mMcc = p1;
       this.mMnc = p2;
       this.mLac = p3;
       this.mCid = p4;
       this.mRadio = p5;
    }
}
