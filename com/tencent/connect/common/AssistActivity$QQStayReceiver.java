package com.tencent.connect.common.AssistActivity$QQStayReceiver;
import android.content.BroadcastReceiver;
import com.tencent.connect.common.AssistActivity;
import com.tencent.connect.common.AssistActivity$1;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import android.os.Parcelable;
import android.net.Uri;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.tencent.open.log.SLog;
import android.app.Activity;

public class AssistActivity$QQStayReceiver extends BroadcastReceiver	// class@000e41
{
    public final AssistActivity a;

    public void AssistActivity$QQStayReceiver(AssistActivity p0){
       this.a = p0;
       super();
    }
    public void AssistActivity$QQStayReceiver(AssistActivity p0,AssistActivity$1 p1){
       super(p0);
    }
    public void onReceive(Context p0,Intent p1){
       String str = "#";
       Intent intent = new Intent();
       String str1 = "key_action";
       String str2 = "action_share";
       try{
          intent.putExtra(str1, str2);
          Uri parcelableEx = p1.getParcelableExtra("uriData");
          str1 = parcelableEx.toString();
          if (!str1.contains(str)) {
             str = "?";
          }
          String[] stringArray = (str1.substring((str1.indexOf(str) + 1))).split("&");
          int len = stringArray.length;
          for (int i = 0; i < len; i = i + 1) {
             String[] stringArray1 = (stringArray[i]).split("=");
             intent.putExtra(stringArray1[0], stringArray1[1]);
          }
          intent.setData(parcelableEx);
       }catch(java.lang.Exception e8){
          SLog.i("openSDK_LOG.AssistActivity", "QQStayReceiver parse uri error : "+e8.getMessage());
          intent.putExtra("result", "error");
          intent.putExtra("response", "parse error.");
       }
       this.a.setResult(-1, intent);
       return;
    }
}
