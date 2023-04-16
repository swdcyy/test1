package com.heytap.msp.push.statis.StatisticUtils;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.util.ArrayList;
import com.heytap.msp.push.mode.MessageStat;
import java.util.List;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.msp.push.mode.DataMessage;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StatisticUtils	// class@000559
{

    public void StatisticUtils(){
       super();
    }
    public static boolean statisticEvent(Context p0,String p1){
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new MessageStat(p0.getPackageName(), p1));
       return StatUtil.statisticMessage(p0, uArrayList);
    }
    public static boolean statisticEvent(Context p0,String p1,DataMessage p2){
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
    public static boolean statisticEvent(Context p0,List p1){
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
    public static boolean statisticEvent(Context p0,Map p1){
       Map map = p1;
       if (!map) {
          return false;
       }
       String packageName = p0.getPackageName();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p1.keySet().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          List list = map.get(obj);
          if (list != null) {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                DataMessage uDataMessage = iterator1.next();
                int messageType = uDataMessage.getMessageType();
                String globalId = uDataMessage.getGlobalId();
                String taskID = uDataMessage.getTaskID();
                String statisticsEx = uDataMessage.getStatisticsExtra();
                String dataExtra = uDataMessage.getDataExtra();
                MessageStat messageStat = new MessageStat(messageType, packageName, globalId, taskID, obj, null, statisticsEx, dataExtra);
                uArrayList.add(v15);
             }
          }else {
             uArrayList.add(new MessageStat(packageName, obj));
          }
       }
       return StatUtil.statisticMessage(p0, uArrayList);
    }
}
