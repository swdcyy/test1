package com.heytap.mcssdk.utils.DataMessageUtil;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.heytap.mcssdk.utils.d;

public class DataMessageUtil	// class@00053c
{
    public static final String TYPE = "type";

    public void DataMessageUtil(){
       super();
    }
    public void appArrive(Context p0,String p1){
       try{
          Intent intent = new Intent();
          intent.setAction(PushService.getInstance().getReceiveSdkAction(p0));
          intent.setPackage(PushService.getInstance().getMcsPackageName(p0));
          intent.putExtra("appPackage", p0.getPackageName());
          intent.putExtra("messageID", p1);
          intent.putExtra("type", 0x3018);
          a.e(p0, intent);
       }catch(java.lang.Exception e4){
          d.e("statisticMessage--Exception"+e4.getMessage());
       }
       return;
    }
}
