package com.heytap.mcssdk.d.b;
import com.heytap.mcssdk.d.c;
import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import java.lang.String;
import com.heytap.mcssdk.f.a;
import com.heytap.mcssdk.utils.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.heytap.mcssdk.utils.d;
import org.json.JSONObject;
import org.json.JSONException;

public class b extends c	// class@000533
{

    public void b(){
       super();
    }
    public BaseMode a(Context p0,int p1,Intent p2){
       if (4103 == p1 || (4098 != p1 && 4108 != p1)) {
          return null;
       }
       BaseMode uBaseMode = this.a(p2, p1);
       a.a(p0, "push_transmit", uBaseMode);
       return uBaseMode;
    }
    public BaseMode a(Intent p0,int p1){
       try{
          DataMessage uDataMessage = new DataMessage();
          uDataMessage.setMessageID(b.d(p0.getStringExtra("messageID")));
          uDataMessage.setTaskID(b.d(p0.getStringExtra("taskID")));
          uDataMessage.setGlobalId(b.d(p0.getStringExtra("globalID")));
          uDataMessage.setAppPackage(b.d(p0.getStringExtra("appPackage")));
          uDataMessage.setTitle(b.d(p0.getStringExtra("title")));
          uDataMessage.setContent(b.d(p0.getStringExtra("content")));
          uDataMessage.setDescription(b.d(p0.getStringExtra("description")));
          String str = b.d(p0.getStringExtra("notifyID"));
          int i = 0;
          int i1 = (TextUtils.isEmpty(str))? 0: Integer.parseInt(str);
          uDataMessage.setNotifyID(i1);
          uDataMessage.setMiniProgramPkg(b.d(p0.getStringExtra("miniProgramPkg")));
          uDataMessage.setMessageType(p1);
          uDataMessage.setEventId(b.d(p0.getStringExtra("eventId")));
          uDataMessage.setStatisticsExtra(b.d(p0.getStringExtra("statistics_extra")));
          String str1 = b.d(p0.getStringExtra("data_extra"));
          uDataMessage.setDataExtra(str1);
          str1 = this.a(str1);
          if (!TextUtils.isEmpty(str1)) {
             i = Integer.parseInt(str1);
          }
          uDataMessage.setMsgCommand(i);
          uDataMessage.setBalanceTime(b.d(p0.getStringExtra("balanceTime")));
          uDataMessage.setStartDate(b.d(p0.getStringExtra("startDate")));
          uDataMessage.setEndDate(b.d(p0.getStringExtra("endDate")));
          uDataMessage.setTimeRanges(b.d(p0.getStringExtra("timeRanges")));
          uDataMessage.setRule(b.d(p0.getStringExtra("rule")));
          uDataMessage.setForcedDelivery(b.d(p0.getStringExtra("forcedDelivery")));
          uDataMessage.setDistinctContent(b.d(p0.getStringExtra("distinctBycontent")));
          uDataMessage.setAppId(b.d(p0.getStringExtra("appID")));
          return uDataMessage;
       }catch(java.lang.Exception e5){
          d.b("OnHandleIntent--"+e5.getMessage());
          return null;
       }
    }
    public String a(String p0){
       String str = "";
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       try{
          str = new JSONObject(p0).optString("msg_command");
       }catch(org.json.JSONException e3){
          d.b(e3.getMessage());
       }
       return str;
    }
}
