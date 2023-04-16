package com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject;
import android.os.Bundle;

public interface abstract SendMessageToWX$IWXSceneDataObject	// class@000ee3
{

    boolean checkArgs();
    int getJumpType();
    void serialize(Bundle p0);
    void unserialize(Bundle p0);
}
