package com.yxcorp.gifshow.action.d;
import yv8.c;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
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
import com.yxcorp.gifshow.action.RealActionBizType;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yv8.b;
import fg6.a;
import yv8.g;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Collection;
import ekd.q;
import java.lang.Throwable;
import java.util.HashMap;
import zv8.n;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import yv8.a;
import yv8.f;
import ekd.q$b;
import java.lang.Number;
import java.lang.Integer;

public class d	// class@00131d
{
    public SharedPreferences a;
    public final List b;
    public final AtomicInteger c;

    public void d(c p0){
       super();
       int i = 0;
       AtomicInteger uAtomicInteg = new AtomicInteger(i);
       this.c = uAtomicInteg;
       String str = "log_key_real_action_v2";
       String str1 = "";
       d uod = d.class;
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, uod, "6");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          long l = System.currentTimeMillis();
          ArrayList uArrayList1 = new ArrayList();
          if (!PatchProxy.applyVoid(null, this, uod, "5") && this.a == null) {
             this.a = b.c(a.b(), "log_real_action", i);
          }
          String str2 = str+p0;
          if (RealActionBizType.SEARCH == p0) {
             str2 = str+p0+QCurrentUser.ME.getId();
          }
          str1 = this.a.getString(str2, str1);
          if (!TextUtils.x(str1)) {
             long l1 = System.currentTimeMillis();
             b.c("RealActionHolder", "spRealActionFeed耗时", "time", String.valueOf((l1 - l)));
             List list = a.a.i(str1, new g(this).getType());
             if (!q.f(list)) {
                uArrayList1 = list;
             }
             b.c("RealActionHolder", "反解析耗时", "time", String.valueOf((System.currentTimeMillis() - l1)));
          }
          uAtomicInteg.set(1);
          uArrayList = uArrayList1;
          HashMap hashMap = new HashMap();
          hashMap.put("bizType", p0.bizType());
          hashMap.put("strSize", String.valueOf(uArrayList.size()));
          hashMap.put("str", str1);
          b.d("RealActionHolder", "restoreActionLogSP", hashMap);
       }
       this.b = new ArrayList(uArrayList);
       return;
    }
    public synchronized void a(n p0,c p1,RealActionFeed p2){
       HashMap hashMap;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "3")) {
          return;
       }
       this.c.set(2);
       if (p0 != null && this.b.size() >= p0.maxActions()) {
          hashMap = new HashMap();
          hashMap.put("actionType", String.valueOf(p2.mActionType));
          hashMap.put("subBiz", p1.bizType());
          b.d("RealActionHolder", "remove action", hashMap);
          this.b.remove(0);
       }
       hashMap = new HashMap();
       hashMap.put("page2", p2.mPage);
       hashMap.put("feedId", p2.mFeedId);
       hashMap.put("subBiz", p1.bizType());
       b.d("RealActionHolder", "add action", hashMap);
       this.b.add(p2);
       return;
    }
    public synchronized void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       if (q.f(this.b)) {
          return;
       }
       q.c(this.b, new f(p0));
       return;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.get();
    }
    public synchronized List d(){
       return this.b;
    }
    public void e(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       this.c.set(p0);
       return;
    }
}
