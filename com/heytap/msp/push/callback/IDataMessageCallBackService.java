package com.heytap.msp.push.callback.IDataMessageCallBackService;
import android.content.Context;
import com.heytap.msp.push.mode.DataMessage;

public interface abstract IDataMessageCallBackService	// class@000549
{

    void processMessage(Context p0,DataMessage p1);
}
