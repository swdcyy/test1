package ew8.g;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.System;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yv8.b;
import fg6.a;
import ew8.f;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Collection;
import ekd.q;
import java.lang.Throwable;
import java.util.HashMap;
import com.yxcorp.gifshow.action.model.RealActionSignalFeed;
import java.lang.Integer;
import java.util.Iterator;
import com.yxcorp.gifshow.action.model.RealActionBaseFeed;
import java.lang.Number;

public class g	// class@002240
{
    public SharedPreferences a;
    public final List b;
    public final AtomicInteger c;

    public void g(String p0){
       super();
       int i = 0;
       AtomicInteger uAtomicInteg = new AtomicInteger(i);
       this.c = uAtomicInteg;
       String str = "";
       g og = g.class;
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, og, "6");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          long l = System.currentTimeMillis();
          ArrayList uArrayList1 = new ArrayList();
          if (!PatchProxy.applyVoid(null, this, og, "5") && this.a == null) {
             this.a = b.c(a.b(), "log_real_action_user_signal", i);
          }
          str = this.a.getString("log_key_real_action_user_signal"+p0, str);
          if (!TextUtils.x(str)) {
             long l1 = System.currentTimeMillis();
             b.c("RealActionSignalHolder", "spRealActionSignalFeed耗时", "time", String.valueOf((l1 - l)));
             List list = a.a.i(str, new f(this).getType());
             if (!q.f(list)) {
                uArrayList1 = list;
             }
             b.c("RealActionSignalHolder", "反解析耗时", "time", String.valueOf((System.currentTimeMillis() - l1)));
          }
          uAtomicInteg.set(1);
          uArrayList = uArrayList1;
          HashMap hashMap = new HashMap();
          hashMap.put("bizType", p0);
          hashMap.put("strSize", String.valueOf(uArrayList.size()));
          hashMap.put("str", str);
          b.d("RealActionSignalHolder", "restoreActionLogSP", hashMap);
       }
       this.b = new ArrayList(uArrayList);
       return;
    }
    public synchronized void a(int p0,String p1,RealActionSignalFeed p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, g.class, "3")) {
          return;
       }
       this.c.set(2);
       if (this.b.size() >= p0) {
          b.c("RealActionSignalHolder", "addAction", "removeActionInfo"+p1, p2.toString());
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             RealActionSignalFeed realActionSi = iterator.next();
             if (realActionSi.mIsOverAllEventType == null) {
                this.b.remove(realActionSi);
                break ;
             }
          }
       }
       b.c("RealActionSignalHolder", "addAction", "addActionInfo"+p1, p2.toString());
       this.b.add(p2);
       return;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.get();
    }
    public synchronized List c(){
       return this.b;
    }
    public void d(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "2")) {
          return;
       }
       this.c.set(p0);
       return;
    }
}
