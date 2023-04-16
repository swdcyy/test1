package com.heytap.msp.push.service.CompatibleDataMessageCallbackService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.mcssdk.PushService;
import android.content.Context;
import com.heytap.mcssdk.b;
import com.heytap.msp.push.mode.DataMessage;
import java.lang.StringBuilder;
import java.lang.String;
import com.heytap.mcssdk.utils.d;

public class CompatibleDataMessageCallbackService extends Service implements IDataMessageCallBackService	// class@000557
{

    public void CompatibleDataMessageCallbackService(){
       super();
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public final int onStartCommand(Intent p0,int p1,int p2){
       PushService.getInstance().innerInit(this.getApplicationContext());
       b.a(this.getApplicationContext(), p0, this);
       return 2;
    }
    public void processMessage(Context p0,DataMessage p1){
       d.b("Receive DataMessageCallbackService:messageTitle: "+p1.getTitle()+" ------content:"+p1.getContent()+"------describe:"+p1.getDescription());
    }
}
