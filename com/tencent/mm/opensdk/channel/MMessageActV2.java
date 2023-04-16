package com.tencent.mm.opensdk.channel.MMessageActV2;
import java.lang.Object;
import android.content.Context;
import com.tencent.mm.opensdk.channel.MMessageActV2$Args;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import java.lang.StringBuilder;
import com.tencent.mm.opensdk.utils.Log;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.channel.a.a;
import android.os.Build$VERSION;
import java.lang.Exception;
import android.app.PendingIntent;
import com.tencent.mm.opensdk.channel.MMessageActV2$1;
import android.app.PendingIntent$OnFinished;
import android.os.Handler;

public class MMessageActV2	// class@000e6b
{

    public void MMessageActV2(){
       super();
    }
    public static boolean send(Context p0,MMessageActV2$Args p1){
       String str;
       if (p0 == null || p1 == null) {
          str = "send fail, invalid argument";
       }else if(b.b(p1.targetPkgName)){
          str = "send fail, invalid targetPkgName, targetPkgName = "+p1.targetPkgName;
       }else if(b.b(p1.targetClassName)){
          p1.targetClassName = p1.targetPkgName+".wxapi.WXEntryActivity";
       }
       Log.d("MicroMsg.SDK.MMessageAct", "send, targetPkgName = "+p1.targetPkgName+", targetClassName = "+p1.targetClassName+", launchMode = "+p1.launchMode);
       Intent intent = new Intent();
       intent.setClassName(p1.targetPkgName, p1.targetClassName);
       MMessageActV2$Args bundle = p1.bundle;
       if (bundle != null) {
          intent.putExtras(bundle);
       }
       String packageName = p0.getPackageName();
       intent.putExtra("_mmessage_sdkVersion", 0x26080000);
       intent.putExtra("_mmessage_appPackage", packageName);
       intent.putExtra("_mmessage_content", p1.content);
       intent.putExtra("_mmessage_checksum", a.a(p1.content, 0x26080000, packageName));
       intent.putExtra("_message_token", p1.token);
       bundle = p1.flags;
       if (bundle == -1) {
          intent.addFlags(0x10000000).addFlags(0x8000000);
       }else {
          intent.setFlags(bundle);
       }
       if (Build$VERSION.SDK_INT >= 29 && p1.launchMode == 2) {
          MMessageActV2.sendUsingPendingIntent(p0, intent);
       }else {
          p0.startActivity(intent);
       }
       Log.d("MicroMsg.SDK.MMessageAct", "send mm message, intent="+intent);
       return true;
    }
    public static void sendUsingPendingIntent(Context p0,Intent p1){
       String str = "MicroMsg.SDK.MMessageAct";
       try{
          Log.i(str, "sendUsingPendingIntent");
          PendingIntent.getActivity(p0, 3, p1, 0x8000000).send(p0, 4, null, new MMessageActV2$1(), null);
       }catch(java.lang.Exception e1){
          Log.e(str, "sendUsingPendingIntent fail, ex = "+e1.getMessage());
          p0.startActivity(p1);
       }
       return;
    }
}
