package com.alipay.apmobilesecuritysdk.common.a;
import android.content.Context;
import java.util.ArrayList;
import java.lang.String;
import com.alipay.apmobilesecuritysdk.e.h;
import java.lang.Object;
import java.util.List;
import com.alipay.apmobilesecuritysdk.common.RushTimeUtil$1;
import java.text.SimpleDateFormat;
import java.lang.Math;
import java.util.Iterator;
import java.util.Date;
import java.lang.StringBuilder;
import java.util.Calendar;

public final class a	// class@000e66
{

    public static boolean a(Context p0){
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(h.e(p0));
       boolean b = a.a(uArrayList);
       if (b) {
          return true;
       }
       if (a.a(new RushTimeUtil$1())) {
          return true;
       }
       return false;
    }
    public static boolean a(List p0){
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       simpleDateFo.setLenient(false);
       double d = 60.00f;
       int i = (int)(((Math.random() * 24.00f) * d) * d);
       try{
          i = i * 1;
          Iterator iterator = p0.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return false;
             }
             String[] stringArray = (iterator.next()).split("&");
             if (stringArray != null && stringArray.length == 2) {
                Date uDate = new Date();
                Calendar instance = Calendar.getInstance();
                instance.setTime(simpleDateFo.parse(stringArray[1]+" 23:59:59"));
                instance.add(13, i);
                Date time = instance.getTime();
                if (uDate.after(simpleDateFo.parse(stringArray[0]+" 00:00:00")) && uDate.before(time)) {
                   break ;
                }
             }
          }
          return 1;
       }catch(java.lang.Exception e0){
       }
    }
}
