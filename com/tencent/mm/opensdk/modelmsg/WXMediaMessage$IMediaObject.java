package com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import android.os.Bundle;

public interface abstract WXMediaMessage$IMediaObject	// class@000efc
{

    boolean checkArgs();
    void serialize(Bundle p0);
    int type();
    void unserialize(Bundle p0);
}
