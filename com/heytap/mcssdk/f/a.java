package com.heytap.mcssdk.f.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.util.ArrayList;
import com.heytap.msp.push.mode.MessageStat;
import java.util.List;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.msp.push.mode.DataMessage;
import java.util.Iterator;

public class a	// class@00053b
{

    public void a(){
       super();
    }
    public static boolean a(Context p0,String p1){
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new MessageStat(p0.getPackageName(), p1));
       return StatUtil.statisticMessage(p0, uArrayList);
    }
    public static boolean a(Context p0,String p1,DataMessage p2){
       MessageStat messageStat;
       ArrayList uArrayList = new ArrayList();
       String packageName = p0.getPackageName();
       if (p2 == null) {
          messageStat = new MessageStat(packageName, p1);
       }else {
          MessageStat messageStat1 = new MessageStat(p2.getMessageType(), packageName, p2.getGlobalId(), p2.getTaskID(), p1, null, p2.getStatisticsExtra(), p2.getDataExtra());
          messageStat = v10;
       }
       uArrayList.add(messageStat);
       return StatUtil.statisticMessage(p0, uArrayList);
    }
    public static boolean a(Context p0,List p1){
       ArrayList uArrayList = new ArrayList();
       String packageName = p0.getPackageName();
       if (p1 != null && p1.size()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new MessageStat(packageName, iterator.next()));
          }
       }
       return StatUtil.statisticMessage(p0, uArrayList);
    }
}
