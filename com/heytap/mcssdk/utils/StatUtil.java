package com.heytap.mcssdk.utils.StatUtil;
import java.lang.Object;
import android.content.Context;
import com.heytap.mcssdk.PushService;
import java.lang.String;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.msp.push.mode.MessageStat;
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;
import java.lang.StringBuilder;
import com.heytap.mcssdk.utils.d;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;

public class StatUtil	// class@00053d
{
    public static final String TYPE = "type";

    public void StatUtil(){
       super();
    }
    public static boolean isSupportStatisticByMcs(Context p0){
       String mcsPackageNa = PushService.getInstance().getMcsPackageName(p0);
       boolean b = (Utils.isExistPackage(p0, mcsPackageNa) && Utils.getVersionCode(p0, mcsPackageNa) >= 1017)? true: false;
       return b;
    }
    public static void statisticMessage(Context p0,MessageStat p1){
       LinkedList linkedList = new LinkedList();
       linkedList.add(p1);
       StatUtil.statisticMessage(p0, linkedList);
    }
    public static boolean statisticMessage(Context p0,List p1){
       LinkedList linkedList = new LinkedList();
       linkedList.addAll(p1);
       d.b("isSupportStatisticByMcs:"+StatUtil.isSupportStatisticByMcs(p0)+",list size:"+linkedList.size());
       if (linkedList.size() > 0 && StatUtil.isSupportStatisticByMcs(p0)) {
          return StatUtil.statisticMessageByMcs(p0, linkedList);
       }
       return false;
    }
    public static boolean statisticMessageByMcs(Context p0,List p1){
       try{
          Intent intent = new Intent();
          intent.setAction(PushService.getInstance().getReceiveSdkAction(p0));
          intent.setPackage(PushService.getInstance().getMcsPackageName(p0));
          intent.putExtra("appPackage", p0.getPackageName());
          intent.putExtra("type", 0x3003);
          intent.putExtra("count", p1.size());
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().toJsonObject());
          }
          intent.putStringArrayListExtra("list", uArrayList);
          a.e(p0, intent);
          return true;
       }catch(java.lang.Exception e3){
          d.e("statisticMessage--Exception"+e3.getMessage());
          return false;
       }
    }
}
