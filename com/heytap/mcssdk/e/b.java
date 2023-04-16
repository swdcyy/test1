package com.heytap.mcssdk.e.b;
import com.heytap.mcssdk.e.c;
import java.lang.Object;
import android.content.Context;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.mcssdk.e.b$1;
import java.lang.Runnable;
import com.heytap.mcssdk.utils.f;
import java.lang.String;
import com.heytap.mcssdk.utils.d;
import java.lang.StringBuilder;
import android.app.NotificationManager;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import com.heytap.msp.push.statis.StatisticUtils;

public class b implements c	// class@000539
{

    public void b(){
       super();
    }
    public static void a(b p0,Context p1,DataMessage p2){
       p0.a(p1, p2);
    }
    public void a(Context p0,BaseMode p1,IDataMessageCallBackService p2){
       if (p1 == null) {
          return;
       }
       if (p1.getType() == 4103 && p2 != null) {
          f.b(new b$1(this, p1, p0, p2));
       }
       return;
    }
    public final void a(Context p0,DataMessage p1){
       if (p0 == null) {
          d.b("context is null");
          return;
       }else {
          d.b("Receive revokeMessage  extra : "+p1.getStatisticsExtra()+"notifyId :"+p1.getNotifyID()+"messageId : "+p1.getTaskID());
          p0.getSystemService("notification").cancel(p1.getNotifyID());
          this.b(p0, p1);
          return;
       }
    }
    public final void b(Context p0,DataMessage p1){
       HashMap hashMap = new HashMap();
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p1);
       hashMap.put(p1.getEventId(), uArrayList);
       StatisticUtils.statisticEvent(p0, hashMap);
    }
}
