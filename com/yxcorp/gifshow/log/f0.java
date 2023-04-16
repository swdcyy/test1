package com.yxcorp.gifshow.log.f0;
import java.lang.Runnable;
import java.lang.Object;
import k2b.m3;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import java.util.List;
import c3b.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Exception;
import com.yxcorp.utility.Log;

public final class f0 implements Runnable	// class@001b05
{
    public static final f0 b;

    static {
       f0.b = new f0();
    }
    public void f0(){
       super();
    }
    public final void run(){
       if (!m3.e && n.A1().b()) {
          List list = n.A1().m();
          if (list != null && list.size()) {
             int i = 0;
             while (i < list.size()) {
                try{
                   b uob = list.get(i);
                   if (uob != null && (!TextUtils.x(uob.eventType) && uob.sampleRate - null > 0)) {
                      if (!TextUtils.x(uob.action2) && !TextUtils.x(uob.page2)) {
                         Set set = m3.b.get(uob.action2);
                         if (set == null) {
                            set = new HashSet();
                         }
                         set.add(uob);
                         m3.b.put(uob.action2, set);
                         b action = uob.action;
                         if (action != -1 && action != null) {
                            m3.a.put(Integer.valueOf(action), set);
                         }
                      }else {
                         m3.c.put(uob.eventType, Float.valueOf(uob.sampleRate));
                      }
                      m3.d.put(uob.eventType, Boolean.TRUE);
                   }
                }catch(java.lang.Exception e2){
                   Log.g("UrtMonitorManager", "init error£º"+e2.getMessage());
                }
                i = i + 1;
             }
             m3.e = true;
          }
       }
       return;
    }
}
