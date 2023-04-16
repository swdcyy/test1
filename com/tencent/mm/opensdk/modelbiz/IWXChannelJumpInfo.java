package com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo;
import android.os.Bundle;

public interface abstract IWXChannelJumpInfo	// class@000e94
{

    boolean checkArgs();
    void serialize(Bundle p0);
    int type();
    void unserialize(Bundle p0);
}
