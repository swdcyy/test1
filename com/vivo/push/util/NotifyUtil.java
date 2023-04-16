package com.vivo.push.util.NotifyUtil;
import java.lang.Object;
import android.content.Context;
import com.vivo.push.util.BaseNotifyDataAdapter;
import com.vivo.push.util.BaseNotifyLayoutAdapter;
import java.lang.String;
import java.lang.Class;
import com.vivo.push.util.h;
import com.vivo.push.util.i;

public class NotifyUtil	// class@0010ad
{
    public static BaseNotifyDataAdapter sNotifyData;
    public static String sNotifyDataAdapter;
    public static BaseNotifyLayoutAdapter sNotifyLayout;
    public static String sNotifyLayoutAdapter;

    public void NotifyUtil(){
       super();
    }
    public static BaseNotifyDataAdapter getNotifyDataAdapter(Context p0){
       NotifyUtil.initAdapter(p0);
       return NotifyUtil.sNotifyData;
    }
    public static BaseNotifyLayoutAdapter getNotifyLayoutAdapter(Context p0){
       NotifyUtil.initAdapter(p0);
       return NotifyUtil.sNotifyLayout;
    }
    public static Object getObjectByReflect(String p0,Object p1){
       Class uClass;
       Object obj = null;
       try{
          uClass = Class.forName(p0);
       }catch(java.lang.Exception e0){
          uClass = e0;
       }
       if (uClass != null) {
          try{
             obj = uClass.newInstance();
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static synchronized void initAdapter(Context p0){
       _monitor_enter(NotifyUtil.class);
       if (NotifyUtil.sNotifyData == null) {
          BaseNotifyDataAdapter objectByRefl = NotifyUtil.getObjectByReflect(NotifyUtil.sNotifyDataAdapter, new h());
          NotifyUtil.sNotifyData = objectByRefl;
          objectByRefl.init(p0);
       }
       if (NotifyUtil.sNotifyLayout == null) {
          BaseNotifyLayoutAdapter objectByRefl1 = NotifyUtil.getObjectByReflect(NotifyUtil.sNotifyLayoutAdapter, new i());
          NotifyUtil.sNotifyLayout = objectByRefl1;
          objectByRefl1.init(p0);
       }
       _monitor_exit(NotifyUtil.class);
       return;
    }
}
