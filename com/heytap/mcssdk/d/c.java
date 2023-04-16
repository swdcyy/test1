package com.heytap.mcssdk.d.c;
import com.heytap.mcssdk.d.d;
import java.lang.Object;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.lang.String;
import com.heytap.mcssdk.utils.b;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.heytap.mcssdk.utils.d;
import java.util.ArrayList;
import com.heytap.mcssdk.PushService;
import java.util.Iterator;
import com.heytap.msp.push.mode.BaseMode;

public abstract class c implements d	// class@000534
{

    public void c(){
       super();
    }
    public static List a(Context p0,Intent p1){
       if (p1 == null) {
          return null;
       }
       int i = 4096;
       try{
          i = Integer.parseInt(b.d(p1.getStringExtra("type")));
       }catch(java.lang.Exception e1){
          d.e("MessageParser--getMessageByIntent--Exception:"+e1.getMessage());
       }
       d.b("MessageParser--getMessageByIntent--type:"+i);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = PushService.getInstance().getParsers().iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod != null) {
             BaseMode uBaseMode = uod.a(p0, i, p1);
             if (uBaseMode != null) {
                uArrayList.add(uBaseMode);
             }
          }
       }
       return uArrayList;
    }
    public abstract BaseMode a(Intent p0,int p1);
}
