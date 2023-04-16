package com.tencent.mm.opensdk.channel.MMessageActV2$1;
import android.app.PendingIntent$OnFinished;
import java.lang.Object;
import android.app.PendingIntent;
import android.content.Intent;
import java.lang.String;
import android.os.Bundle;
import java.lang.StringBuilder;
import com.tencent.mm.opensdk.utils.Log;

public final class MMessageActV2$1 implements PendingIntent$OnFinished	// class@000e69
{

    public void MMessageActV2$1(){
       super();
    }
    public void onSendFinished(PendingIntent p0,Intent p1,int p2,String p3,Bundle p4){
       Log.i("MicroMsg.SDK.MMessageAct", "sendUsingPendingIntent onSendFinished resultCode: "+p2+", resultData: "+p3);
    }
}
