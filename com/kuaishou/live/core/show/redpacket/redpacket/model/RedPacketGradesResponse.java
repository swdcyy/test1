package com.kuaishou.live.core.show.redpacket.redpacket.model.RedPacketGradesResponse;
import java.io.Serializable;
import java.lang.Object;

public class RedPacketGradesResponse implements Serializable	// class@000eed
{
    public String mAppendRedPackId;
    public int mAppendRedPackType;
    public int mDou;
    public boolean mEnableAppend;
    public List mGrades;
    public long mOpenTimeMs;
    public String mSendTipText;
    public WalletResponse mWallet;
    public static final long serialVersionUID = 0x6b00ee5448fe5c84;

    public void RedPacketGradesResponse(){
       super();
    }
}
