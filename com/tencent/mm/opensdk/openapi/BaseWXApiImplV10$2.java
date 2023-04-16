package com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$2;
import android.app.PendingIntent$OnFinished;
import com.tencent.mm.opensdk.openapi.BaseWXApiImplV10;
import java.lang.Object;
import android.app.PendingIntent;
import android.content.Intent;
import java.lang.String;
import android.os.Bundle;
import java.lang.StringBuilder;
import com.tencent.mm.opensdk.utils.Log;

public class BaseWXApiImplV10$2 implements PendingIntent$OnFinished	// class@000f15
{
    public final BaseWXApiImplV10 this$0;

    public void BaseWXApiImplV10$2(BaseWXApiImplV10 p0){
       this.this$0 = p0;
       super();
    }
    public void onSendFinished(PendingIntent p0,Intent p1,int p2,String p3,Bundle p4){
       Log.d("MicroMsg.SDK.WXApiImplV10", "onSendFinished resultCode: "+p2+", resultData: "+p3);
    }
}
