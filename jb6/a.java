package jb6.a;
import java.lang.Object;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fjd.b;
import jb6.d;
import wkd.b;
import pb6.o;
import com.google.common.base.Optional;
import com.kwai.framework.network.idc.config.ScheduleConfig;
import com.kwai.robust.PatchProxyResult;
import gjd.a;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import ta6.q;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.util.List;
import ta6.a;
import hb6.b;
import ta6.c;
import q87.c;
import hb6.a;
import qk.g0;
import com.google.common.collect.HashMultimap;
import hb6.d;
import com.yxcorp.retrofit.region.config.RegionInfo;
import pjd.c;
import com.yxcorp.retrofit.model.Region;
import wb6.c;
import java.util.ArrayList;
import java.util.Iterator;
import bb6.e;
import com.yxcorp.retrofit.cdn.CdnHostGroup;
import java.lang.Iterable;
import trd.u;
import bb6.e$a;
import bjd.b;
import java.lang.Number;
import java.lang.Integer;
import bjd.d;
import bb6.c;
import com.kwai.framework.network.keyconfig.ApiRetryPolicy;

public class a	// class@001b3f
{

    public void a(){
       super();
    }
    public static void a(BaseConfig p0,String p1){
       CdnHostGroup obj2;
       b a;
       Object[] objArray2;
       Object[] objArray3;
       ApiRetryPolicy obj = p0;
       e$a obj1 = p1;
       Object[] objArray = null;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, objArray, a.class, "1")) {
          return;
       }
       if (obj == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "3")) {
          d.a().j(b.a(0x3d855db5).b());
       }
       if (p0.f().isPresent()) {
          Map map = p0.f().get();
          ScheduleConfig scheduleConf = ScheduleConfig.class;
          if (!PatchProxy.applyVoidTwoRefs(map, obj1, objArray, a.class, "2")) {
             a uoa = new a();
             Objects.requireNonNull(map);
             ScheduleConfig scheduleConf1 = PatchProxy.apply(objArray, map, scheduleConf, "1");
             if (scheduleConf1 != PatchProxyResult.class) {
             }else if(map.mHosts == null){
                map.mHosts = new HashMap();
             }
             scheduleConf1 = map.mHosts;
             uoa.a = scheduleConf1;
             uoa.d = map.mServerIdcOnly;
             if (map.mSpeedTestTypeAndOrder == null) {
                map.mSpeedTestTypeAndOrder = ScheduleConfig.a;
             }
             uoa.c = map.mSpeedTestTypeAndOrder;
             uoa.e = map.a();
             uoa.f = map.c();
             scheduleConf1 = PatchProxy.apply(objArray, map, scheduleConf, "2");
             if (scheduleConf1 != PatchProxyResult.class) {
             }else if(map.mHttpsHosts == null){
                map.mHttpsHosts = new HashMap();
             }
             scheduleConf1 = map.mHttpsHosts;
             uoa.b = scheduleConf1;
             SharedPreferences$Editor uEditor = q.a.edit();
             uEditor.putString(b.d("user")+"UserFlag", map.mUserFlag);
             g.a(uEditor);
             d.a().i(uoa);
             SharedPreferences$Editor uEditor1 = a.a.edit();
             uEditor1.putString("IdcIpList", b.e(map.b()));
             g.a(uEditor1);
             b uob = b.a(-1295466596);
             List list = map.b();
             Objects.requireNonNull(uob);
             if (!PatchProxy.applyVoidOneRefs(list, uob, b.class, "1")) {
                Object[] objArray1 = new Object[0];
                c.C().w("HostIpMapProvider", "Update host_ip_map", objArray1);
                a = uob.a;
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoidOneRefs(list, a, a.class, "1")) {
                   _monitor_enter(a);
                   g0 og01 = a.c(list);
                   if (og01.isEmpty()) {
                      objArray3 = new Object[0];
                      c.C().w("HostFailoverIpMapProvider", "new hostIpMap is empty", objArray3);
                      _monitor_exit(a);
                   }else {
                      int i2 = HashMultimap.create(a.b).equals(HashMultimap.create(og01)) ^ 0x01;
                      if (i2) {
                         a.b = og01;
                      }
                      objArray3 = new Object[0];
                      c.C().w("HostFailoverIpMapProvider", "HostIpMap is changed: "+i2, objArray3);
                      _monitor_exit(a);
                   }
                }
                uob = uob.b;
                Objects.requireNonNull(uob);
                if (!PatchProxy.applyVoidOneRefs(list, uob, d.class, "1")) {
                   _monitor_enter(uob);
                   g0 og0 = d.d(list);
                   if (og0.isEmpty()) {
                      objArray2 = new Object[0];
                      c.C().w("HostOptimalIpMapProvider", "new hostIpMap is empty", objArray2);
                      _monitor_exit(uob);
                   }else {
                      int i1 = HashMultimap.create(uob.b).equals(HashMultimap.create(og0)) ^ 0x01;
                      if (i1) {
                         uob.b = og0;
                         uob.b("Update");
                      }
                      uob.c = d.c(list);
                      objArray2 = new Object[0];
                      c.C().w("HostOptimalIpMapProvider", "HostIpMap is changed: "+i1, objArray2);
                      _monitor_exit(uob);
                   }
                }
             }
             Optional optional = PatchProxy.apply(objArray, map, scheduleConf, "4");
             if (optional != PatchProxyResult.class) {
             }else {
                optional = Optional.fromNullable(map.mRegionInfo);
             }
             if (optional.isPresent()) {
                obj2 = optional.get();
                b.a(0x3c63ef10).d(obj2, map.a(), map.c(), p1);
                if (obj2.c().isPresent()) {
                   c.c(obj2.c().get(), "Update region from schedule config");
                }
             }
             ArrayList uArrayList = new ArrayList();
             scheduleConf1 = PatchProxy.apply(objArray, map, scheduleConf, "5");
             if (scheduleConf1 != PatchProxyResult.class) {
             }else if(map.mCdnHostGroups == null){
                map.mCdnHostGroups = new ArrayList();
             }
             scheduleConf1 = map.mCdnHostGroups;
             Iterator iterator = scheduleConf1.iterator();
             while (iterator.hasNext()) {
                e uoe = iterator.next();
                Objects.requireNonNull(uoe);
                String str = "1";
                CdnHostGroup uCdnHostGrou = PatchProxy.apply(objArray, uoe, e.class, str);
                if (uCdnHostGrou != PatchProxyResult.class) {
                }else {
                   e hostList = uoe.hostList;
                   ArrayList uArrayList1 = new ArrayList(u.Y(hostList, 10));
                   Iterator iterator1 = hostList.iterator();
                   while (iterator1.hasNext()) {
                      obj1 = iterator1.next();
                      e$a host = obj1.host;
                      obj2 = PatchProxy.apply(objArray, obj1, e$a.class, str);
                      int i = (obj2 != PatchProxyResult.class)? obj2.intValue(): Integer.parseInt(obj1.weight);
                      uArrayList1.add(new b(host, i));
                      objArray = null;
                   }
                   obj2 = new CdnHostGroup(uoe.id, uoe.typeName, uArrayList1, uoe.version, false);
                }
                uArrayList.add(uCdnHostGrou);
                objArray = null;
             }
             c.a().k(uArrayList);
          }
       }
       obj = p0.a();
       if (!PatchProxy.applyVoidOneRefs(obj, null, a.class, "4")) {
          a.k(obj.apiRetryTimes);
       }
       return;
    }
}
