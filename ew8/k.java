package ew8.k;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import yv8.b;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import ew8.i;
import erd.g;
import crd.b;
import eda.l;
import ew8.h;
import o56.c;
import o56.a;
import android.app.Application;
import ew8.k$a;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.action.startup.UserSignalRealActionsBizConfig;
import com.yxcorp.gifshow.action.model.RealActionSignalFeed;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import ew8.g;
import java.util.Set;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.q;
import com.yxcorp.gifshow.action.model.RealActionBaseFeed;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageBaseConfig;
import java.util.ArrayList;
import bw8.e;
import bw8.d;
import bw8.c;
import bw8.b;
import zv8.l;
import java.lang.StringBuilder;
import bw8.a;
import java.util.List;
import com.yxcorp.gifshow.action.startup.c;
import java.util.Collection;
import fg6.a;
import com.google.gson.Gson;
import ew8.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.util.HashMap;
import b66.k$a;

public class k	// class@002245
{
    public final Map a;
    public final Map b;
    public SharedPreferences c;

    public void k(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       b.b("RealActionSignalManager", "init");
       u1.a(this);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(n.class, mAIN).subscribe(new i(this));
       f.g(l.class, mAIN).subscribe(new h(this));
       a.a().a().registerActivityLifecycleCallbacks(new k$a(this));
    }
    public synchronized final void a(UserSignalRealActionsBizConfig p0,String p1,RealActionSignalFeed p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "15")) {
          return;
       }
       g og = this.b.get(p1);
       if (og == null) {
          og = new g(p1);
          this.b.put(p1, og);
       }
       og.a(p0.maxActions(), p1, p2);
       return;
    }
    public void b(RealActionSignalFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "13")) {
          return;
       }
       this.h();
       Iterator iterator = this.a.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Object obj = this.a.get(str);
          _monitor_enter(this);
          if (PatchProxy.applyVoidThreeRefs(p0, obj, str, this, k.class, "14")) {
             _monitor_exit(this);
          }else if(this.d(str, p0)){
             this.a(obj, str, p0);
          }
          _monitor_exit(this);
       }
       return;
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && this.a.containsKey(p0))? true: false;
       return b;
    }
    public synchronized final boolean d(String p0,RealActionSignalFeed p1){
       b uob;
       UserSignalRealActionsBizConfig obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.get(p0);
       if (obj == null) {
          return false;
       }
       Map map = obj.availableActionConfig();
       if (q.h(map)) {
          return false;
       }
       FeedRealActionsPageBaseConfig uFeedRealAct = map.get(p1.mPage);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new e());
       uArrayList.add(new d());
       uArrayList.add(new c());
       Iterator iterator = uArrayList.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          uob = iterator.next();
          if (!uob.b(p1, obj, uFeedRealAct)) {
             break ;
          }
       }
       b.c("RealActionSignalManager", "canRespondToActionFeed", p0+" not accept "+uob.a(), p1.toString());
       return false;
    }
    public synchronized final List e(String p0,a p1){
       c a;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          a = c.a;
       }
       List list = this.g(p0);
       obj = new ArrayList();
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             RealActionSignalFeed realActionSi = iterator.next();
             if (realActionSi != null && a.a(realActionSi)) {
                realActionSi.mHasReported = true;
                obj.add(realActionSi);
             }
          }
       }
       b.c("RealActionSignalManager", "getActions", "actionSize", String.valueOf(obj.size()));
       return obj;
    }
    public synchronized String f(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = p0.c();
       if (!q.f(list)) {
          return a.a.q(list);
       }
       return "";
    }
    public synchronized final List g(String p0){
       g obj = PatchProxy.applyOneRefs(p0, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.get(p0);
       if (obj == null) {
          obj = new g(p0);
          this.b.put(p0, obj);
       }
       return obj.c();
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       e.d();
       return;
    }
    public final void i(String p0,g p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "22")) {
          return;
       }
       g.a(this.c.edit().putString("log_key_real_action_user_signal"+p0, p2));
       p1.d(4);
       HashMap hashMap = new HashMap();
       hashMap.put("bizType", p0);
       hashMap.put("actionSize", String.valueOf(p1.c().size()));
       b.d("RealActionSignalManager", "saveActionLogStr", hashMap);
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "18")) {
          return;
       }
       if (p0.a == 2) {
          e.d();
       }
       return;
    }
}
