package d3b.a;
import zk.d;
import com.google.gson.Gson;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import q2b.e;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.google.common.collect.ImmutableMap$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f3b.m;
import java.util.List;
import f3b.n;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.yxcorp.utility.Log;
import java.util.Iterator;
import zk.g;
import com.yxcorp.gifshow.log.urt.RestDyeConfig;
import f3b.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d3b.a$a;
import java.lang.reflect.Type;
import el.a;
import com.yxcorp.gifshow.log.utils.a;
import d3b.a$b;
import java.io.IOException;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import android.os.SystemClock;
import k2b.b3;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import f3b.f;
import k2b.z1;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class a	// class@002421
{
    public Map a;
    public Context b;
    public RestDyeConfig c;
    public boolean d;
    public static String e = "a";
    public static Gson f;

    static {
       d uod = new d();
       uod.c();
       a.f = uod.b();
    }
    public void a(Context p0){
       super();
       this.d = false;
       this.b = p0;
    }
    public final void a(String p0,String p1,e p2,MessageNano p3,ClientEvent$AreaPackage p4,ClientContent$ContentPackage p5,StidContainerProto$StidContainer p6,ImmutableMap$b p7){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       try{
          m.d(p0, p1, p2, p3, p7);
          this.b(p2, p7);
          n.a(p2.mAreaPackage, p4, p7);
          n.b(p5, p2.mContentPackage, p7);
          n.d(p2.mInterStidContainer, p6, p7);
       }catch(java.lang.Exception e4){
          Log.d(a.e, "exception buildRealLog info: "+e4.getMessage());
       }
       return;
    }
    public final void b(e p0,ImmutableMap$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       e initData = p0.initData;
       if (initData != null && initData.size() > 0) {
          Iterator iterator = p0.initData.iterator();
          while (iterator.hasNext()) {
             String[] stringArray = (iterator.next()).split(",");
             int i = 1;
             if (stringArray.length > i) {
                p1.c(stringArray[i], new g(stringArray[0]));
             }
          }
       }
       return;
    }
    public void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a tc = this.c;
       String str = "user_track_log_whitelist";
       if (tc != null && (tc.b() != null && !this.c.b().isEmpty())) {
          this.a = this.c.b();
          d.d(p0, str, a.f.q(this.c.b()));
       }else {
          String str1 = d.b(p0, str, null);
          this.a = (!TextUtils.x(str1))? a.f.i(str1, new a$a(this).getType()): a.f.i(a.a(p0, "user_track_log_config.json"), new a$b(this).getType());
       }
    }
    public void d(ImmutableMap$b p0,ClientLog$ReportEvent p1){
       a a;
       int i3;
       int i4;
       ClientEvent$EventPackage uEventPackag;
       Map map;
       ClientEvent$TaskEvent taskEvent1;
       ClientEvent$TaskEvent taskEvent2;
       ClientEvent$TaskEvent taskEvent3;
       int i5;
       ClientEvent$TaskEvent obj2;
       String str5;
       String str6;
       int i6;
       Map map2;
       ClientEvent$EventPackage taskEvent4;
       Object obj = this;
       String obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(p0, obj1, obj, a.class, "1")) {
          return;
       }
       long l = SystemClock.currentThreadTimeMillis();
       a = obj.a;
       if (a != null && a.size() > 0) {
          String str = b3.l(p1);
          Objects.requireNonNull(str);
          ClientEvent$TaskEvent taskEvent = -1;
          int i = str.hashCode();
          String str1 = "taskEvent";
          String str2 = "clickEvent";
          String str3 = 2;
          int i1 = 1;
          if (i != -1927283299) {
             if (i != -800853518) {
                if (i == 0x95af815 && str.equals(str1)) {
                   taskEvent = 2;
                }
             }else if(!str.equals(str2)){
                taskEvent = 1;
             }
          }else if(!str.equals("showEvent")){
             taskEvent = null;
          }
          a = null;
          if (taskEvent) {
             if (taskEvent != i1) {
                if (taskEvent != str3) {
                   int i2 = a;
                   i3 = i2;
                   i = i3;
                   i4 = i;
                label_0098 :
                   uEventPackag = i2;
                   map = a;
                   taskEvent1 = i3;
                   taskEvent2 = i;
                   taskEvent3 = i4;
                   i5 = 0;
                }else {
                   map2 = obj.a.get(str1);
                   taskEvent4 = obj1.eventPackage.taskEvent;
                   i3 = taskEvent4.areaPackage;
                   obj2 = taskEvent4.contentPackage;
                   i4 = taskEvent4.interStidContainer;
                }
             }else {
                map2 = obj.a.get(str2);
                taskEvent4 = obj1.eventPackage.clickEvent;
                i3 = taskEvent4.areaPackage;
                ClientEvent$ClickEvent contentPacka = taskEvent4.contentPackage;
                i4 = taskEvent4.interStidContainer;
             }
             map2 = map2;
             taskEvent4 = taskEvent4;
             goto label_0098 ;
          }else {
             taskEvent4 = obj1.eventPackage.showEvent;
             i5 = taskEvent4.action;
             ClientEvent$ShowEvent areaPackage = taskEvent4.areaPackage;
             ClientEvent$ShowEvent contentPacka1 = taskEvent4.contentPackage;
             ClientEvent$ShowEvent interStidCon = taskEvent4.interStidContainer;
             Map map3 = (f.g(i5))? obj.a.get("pageShowEvent"): obj.a.get("elementShowEvent");
             uEventPackag = taskEvent4;
             taskEvent1 = areaPackage;
             taskEvent2 = contentPacka1;
             taskEvent3 = interStidCon;
             map = map3;
          }
          if (map == null || !map.size()) {
             return;
          }else {
             str3 = f.e(uEventPackag);
             obj1 = f.c(uEventPackag);
             if (f.g(i5)) {
                obj1 = "ACTION_GENERAL";
             }
             String str4 = obj1;
             Map map1 = map.get(str3);
             if (map1 != null) {
                obj2 = map1.get(str4);
                if (obj2 != null) {
                   str5 = str3;
                   str6 = str4;
                   this.a(str3, str4, obj2, uEventPackag, taskEvent1, taskEvent2, taskEvent3, p0);
                   i6 = 0;
                label_0119 :
                   if (i6) {
                      map1 = map.get("APP_GENERAL");
                      if (map1 != null) {
                         obj2 = map1.get(str6);
                         if (obj2 != null) {
                            this.a(str5, str6, obj2, uEventPackag, taskEvent1, taskEvent2, taskEvent3, p0);
                         }
                      }
                   }
                   z1.c("userTrack_log_mapping", (SystemClock.currentThreadTimeMillis() - l));
                }
             }
             str6 = str4;
             str5 = str3;
             i6 = 1;
             goto label_0119 ;
          }
       }else if(obj.d != null){
          b.a(0x4b316083).X0();
       }
       return;
    }
}
