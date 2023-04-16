package com.yxcorp.gifshow.push.init.interceptor.command.CommandCalendarInterceptor;
import com.kwai.android.register.core.command.BaseCommandInterceptor;
import com.yxcorp.gifshow.push.model.CmdCalendarData;
import java.util.HashMap;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import java.util.Collection;
import java.lang.Number;
import qrd.l1;
import java.util.ArrayList;
import m6c.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.push.model.CmdCalendarEvent;
import com.google.gson.JsonElement;
import com.kwai.android.common.coroutines.PushScope;
import com.yxcorp.gifshow.push.init.interceptor.command.CommandCalendarInterceptor$onCommandReceived$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;

public final class CommandCalendarInterceptor extends BaseCommandInterceptor	// class@00165b
{

    public void CommandCalendarInterceptor(){
       super();
    }
    public final List a(CmdCalendarData p0,HashMap p1){
       Iterator iterator;
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, CommandCalendarInterceptor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.get(Integer.valueOf(p0.getBizId()));
       String str = 1;
       LinkedHashMap linkedHashMa = (obj == null || obj.isEmpty())? 1: null;
       if (linkedHashMa) {
          return null;
       }else {
          linkedHashMa = new LinkedHashMap();
          int i = 16;
          int i1 = 10;
          if (p0.getDeleteAll()) {
             Set set = obj.entrySet();
             a.o(set, "localIdMap.entries");
             LinkedHashMap linkedHashMa1 = new LinkedHashMap(q.n(s0.j(u.Y(set, i1)), i));
             iterator = set.iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Long value = uEntry.getValue();
                linkedHashMa1.put(value, uEntry.getKey());
             }
             linkedHashMa.putAll(linkedHashMa1);
             p1.remove(Integer.valueOf(p0.getBizId()));
          }else {
             List deleteIds = p0.getDeleteIds();
             if (deleteIds != null && !deleteIds.isEmpty()) {
                str = null;
             }
             if (str == null) {
                LinkedHashMap linkedHashMa2 = new LinkedHashMap();
                Iterator iterator2 = obj.entrySet().iterator();
                while (iterator2.hasNext()) {
                   Map$Entry uEntry2 = iterator2.next();
                   if (p0.getDeleteIds().contains(uEntry2.getKey())) {
                      linkedHashMa2.put(uEntry2.getKey(), uEntry2.getValue());
                   }
                }
                Set set1 = linkedHashMa2.entrySet();
                LinkedHashMap linkedHashMa3 = new LinkedHashMap(q.n(s0.j(u.Y(set1, i1)), i));
                Iterator iterator3 = set1.iterator();
                while (iterator3.hasNext()) {
                   Map$Entry uEntry3 = iterator3.next();
                   linkedHashMa3.put(Long.valueOf(uEntry3.getValue().longValue()), uEntry3.getKey());
                }
                linkedHashMa.putAll(linkedHashMa3);
                Integer integer = Integer.valueOf(p0.getBizId());
                HashMap hashMap = new HashMap();
                linkedHashMa3 = new LinkedHashMap();
                iterator = obj.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry4 = iterator.next();
                   if (!p0.getDeleteIds().contains(uEntry4.getKey())) {
                      linkedHashMa3.put(uEntry4.getKey(), uEntry4.getValue());
                   }
                }
                hashMap.putAll(linkedHashMa3);
                p1.put(integer, hashMap);
             }
          }
          ArrayList uArrayList = new ArrayList();
          Iterator iterator1 = linkedHashMa.entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry1 = iterator1.next();
             String value1 = uEntry1.getValue();
             Application uApplication = a.b();
             a.o(uApplication, "AppEnv.getAppContext\(\)");
             if (a.a.b(uApplication, uEntry1.getKey().longValue())) {
                uArrayList.add(value1);
             }
          }
          return uArrayList;
       }
    }
    public final JsonObject b(CmdCalendarData p0,HashMap p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, CommandCalendarInterceptor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getInsertEvent().isEmpty()) {
          return null;
       }
       obj = new HashMap();
       JsonObject jsonObject = new JsonObject();
       Iterator iterator = p0.getInsertEvent().iterator();
       while (iterator.hasNext()) {
          CmdCalendarEvent uCmdCalendar = iterator.next();
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          long l = a.a.f(uApplication, uCmdCalendar);
          if (l - -1) {
             obj.put(uCmdCalendar.getCalendarId(), Long.valueOf(l));
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.a0("id", Long.valueOf(l));
             jsonObject1.a0("startTime", Long.valueOf(uCmdCalendar.getStartTimeMillis()));
             jsonObject1.a0("endTime", Long.valueOf(uCmdCalendar.getEndTimeMillis()));
             jsonObject.G(uCmdCalendar.getCalendarId(), jsonObject1);
          }
       }
       if (p1.get(Integer.valueOf(p0.getBizId())) == null) {
          p1.put(Integer.valueOf(p0.getBizId()), obj);
       }else {
          HashMap hashMap = p1.get(Integer.valueOf(p0.getBizId()));
          if (hashMap != null) {
             hashMap.putAll(obj);
          }
       }
       return jsonObject;
    }
    public int getSubType(){
       return 6;
    }
    public void onCommandReceived(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommandCalendarInterceptor.class, "1")) {
          return;
       }
       a.p(p0, "json");
       a.f(PushScope.INSTANCE, null, null, new CommandCalendarInterceptor$onCommandReceived$1(this, p0, null), 3, null);
       return;
    }
}
