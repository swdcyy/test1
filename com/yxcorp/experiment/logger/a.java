package com.yxcorp.experiment.logger.a;
import java.util.concurrent.TimeUnit;
import dv8.b;
import dv8.a;
import java.lang.Object;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.lang.System;
import java.util.Calendar;
import zu8.g;
import java.lang.Runnable;
import f97.a;
import zu8.h;
import java.lang.String;
import am8.d;
import java.util.List;
import java.util.Map$Entry;
import java.util.Set;
import com.yxcorp.experiment.logger.LogEventWrapper;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment$a;
import java.lang.Long;
import android.content.SharedPreferences;
import com.yxcorp.experiment.logger.LogEventSeqIdInfo;
import java.lang.Class;
import wu8.a;
import java.lang.CharSequence;
import yb7.o;
import java.lang.Integer;
import c97.d;
import q97.c;
import java.lang.StringBuilder;
import com.yxcorp.experiment.c;
import wu8.q;
import com.yxcorp.experiment.ABConfig;
import java.lang.Boolean;
import zu8.i;
import java.util.Map;
import zu8.j;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import brd.t;
import zu8.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.util.Iterator;

public class a	// class@00101e
{
    public final ConcurrentHashMap a;
    public final Set b;
    public final ConcurrentHashMap c;
    public final Set d;
    public final HashMap e;
    public final HashMap f;
    public b g;
    public z h;
    public final b i;
    public final b j;
    public final a k;
    public String l;
    public static final long m;

    static {
       a.m = TimeUnit.MILLISECONDS.convert(20, TimeUnit.SECONDS);
    }
    public void a(b p0,b p1,a p2){
       super();
       this.b = new HashSet();
       this.d = new HashSet();
       this.l = "";
       if (this.b()) {
          this.a = new ConcurrentHashMap(128);
          this.c = new ConcurrentHashMap(128);
          this.f = new HashMap(128);
          this.e = new HashMap(128);
          this.i = p0;
          this.j = p1;
          this.k = p2;
          long l = System.currentTimeMillis();
          Calendar instance = Calendar.getInstance();
          instance.setTimeInMillis(l);
          instance.add(5, 1);
          instance.set(11, 0);
          instance.set(12, 0);
          instance.set(13, 0);
          instance.set(14, 0);
          this.f(l, instance);
          a.a(new g(this));
          d.d(new h(this), "ks-abtest-init-sp", 2);
       }else {
          this.a = new ConcurrentHashMap();
          this.c = new ConcurrentHashMap();
          this.e = new HashMap();
          this.f = new HashMap();
          this.i = p0;
          this.j = p1;
          this.k = p2;
       }
       return;
    }
    public final void a(List p0,Map$Entry p1,Set p2,boolean p3){
       String str;
       long gid = p1.getValue().mLogItem.getGid();
       AbEntranceEventProto$AbExperiment$a uAbExperimen = p1.getValue().mLogItem.toBuilder();
       a te = this.e;
       _monitor_enter(te);
       a tf = this.f;
       _monitor_enter(tf);
       a tk = this.k;
       Long longx = Long.valueOf(gid);
       _monitor_enter(tk);
       LogEventSeqIdInfo logEventSeqI = null;
       if (longx == null) {
          _monitor_exit(tk);
       }else {
          logEventSeqI = a.e(tk.a.getString(String.valueOf(longx), logEventSeqI), LogEventSeqIdInfo.class);
          _monitor_exit(tk);
       }
       if (!this.f.containsKey(Long.valueOf(gid))) {
          str = LogEventSeqIdInfo.createNotInNewDataExtraInfo(logEventSeqI, this.l);
          if (!o.c(str)) {
             uAbExperimen.c(str);
          }else {
             uAbExperimen.c("{\"GroupIdNotInNewData\":1}");
          }
       }else {
          Integer integer = this.f.get(Long.valueOf(gid));
          if (integer != null) {
             uAbExperimen.b(integer.intValue());
          }
          integer = this.e.get(Long.valueOf(gid));
          if (integer != null) {
             p1.getValue().mLogPolicy = integer.intValue();
          }
          str = LogEventSeqIdInfo.createExtraInfo(logEventSeqI, this.l);
          if (!o.c(str)) {
             uAbExperimen.c(str);
          }
       }
       _monitor_exit(tf);
       _monitor_exit(te);
       if (!p3) {
          if ((uAbExperimen.getDf() & 0x04) > 0) {
             return;
          }
       }else {
          uAbExperimen.b((uAbExperimen.getDf() | 0x08));
       }
       p3.mLogItem = uAbExperimen.build();
       if (p1.getValue().mLogPolicy == 1) {
          if (!p2.contains(Long.valueOf(gid))) {
             p0.add(p1.getValue().mLogItem);
             p2.add(Long.valueOf(gid));
          }else {
             d.a().f().v("ABTest-LogEventHelper", "logUsage LOG_POLICY_SESSION_FIRST already reported groupId: "+gid);
          }
       }else {
          p0.add(p1.getValue().mLogItem);
       }
       return;
    }
    public boolean b(){
       return c.h().g().d();
    }
    public void c(ABConfig p0,Boolean p1){
       if (!this.b()) {
          return;
       }
       String str = " , groupId: ";
       if (p0 == null || p0.getGroupId() == null) {
          c uoc = d.a().f();
          StringBuilder str1 = "logUsage config is null? ";
          boolean b = (p0 == null)? true: false;
          str1 = str1+b+str;
          Long longx = (p0 == null)? null: p0.getGroupId();
          uoc.v("ABTest-LogEventHelper", str1+longx);
          return;
       }else if(!p0.getLogPolicy()){
          d.a().f().v("ABTest-LogEventHelper", "logUsage LOG_POLICY_NOT key: "+p0.getKey()+str+p0.getGroupId());
          return;
       }else {
          a.a(new i(this, p0, p1));
          return;
       }
    }
    public final void d(ABConfig p0,ConcurrentHashMap p1){
       Long groupId;
       a td;
       if (p0.getGroupId() == null) {
          return;
       }
       int i = 0;
       a uoa = 1;
       int i1 = (p1 == this.c)? 1: 0;
       int logPolicy = p0.getLogPolicy();
       a te = this.e;
       _monitor_enter(te);
       if (this.e.containsKey(p0.getGroupId())) {
          Integer integer = this.e.get(p0.getGroupId());
          if (integer != null) {
             logPolicy = integer.intValue();
          }
       }
       _monitor_exit(te);
       if (p0.getLogPolicy() == uoa) {
          groupId = p0.getGroupId();
          if (i1) {
             td = this.d;
             _monitor_enter(td);
             if (this.d.contains(groupId)) {
                _monitor_exit(td);
             label_0060 :
                i = 1;
             }else {
                _monitor_exit(td);
             }
          }else {
             td = this.b;
             _monitor_enter(td);
             if (this.b.contains(groupId)) {
                _monitor_exit(td);
                goto label_0060 ;
             }else {
                _monitor_exit(td);
             }
          }
          if (i) {
             return;
          }
       }
       if (!logPolicy) {
          return;
       }else {
          i = p0.getDynamicFlag();
          uoa = this.f;
          _monitor_enter(uoa);
          if (this.f.containsKey(p0.getGroupId())) {
             Integer integer1 = this.f.get(p0.getGroupId());
             if (integer1 != null) {
                i = integer1.intValue();
             }
          }
          _monitor_exit(uoa);
          if (!i1 && (i & 0x04) > 0) {
             return;
          }else {
             LogEventWrapper logEventWrap = p1.get(p0.getGroupId());
             if (logEventWrap == null) {
                logEventWrap = LogEventWrapper.create(p0);
                if (logEventWrap == null) {
                   d.a().f().v("ABTest-LogEventHelper", "logUsage wrapper is null key: "+p0.getKey()+" , groupId: "+p0.getGroupId());
                   return;
                }else {
                   p1.put(p0.getGroupId(), logEventWrap);
                }
             }else {
                logEventWrap.update(p0);
             }
             a tj = (p1 == this.c)? this.j: this.i;
             tj.b(p0.getGroupId(), logEventWrap);
             this.k.a(p0.getGroupId());
             d.a().f().i("ABTest-LogEventHelper", "logUsage: groupId="+logEventWrap.mLogItem.getGid()+" , count="+logEventWrap.mLogItem.getCount());
             return;
          }
       }
    }
    public final void e(int p0){
       d.a().f().d("ABTest-LogEventHelper", "reportEvent mode: "+p0);
       HashMap hashMap = new HashMap(this.a.size());
       HashMap hashMap1 = new HashMap(this.c.size());
       a ta = this.a;
       _monitor_enter(ta);
       a tb = this.b;
       _monitor_enter(tb);
       this.g(hashMap, this.b, this.a);
       _monitor_exit(tb);
       _monitor_exit(ta);
       tb = this.c;
       _monitor_enter(tb);
       ta = this.d;
       _monitor_enter(ta);
       this.g(hashMap1, this.d, this.c);
       _monitor_exit(ta);
       _monitor_exit(tb);
       if (hashMap.isEmpty() && hashMap1.isEmpty()) {
          return;
       }
       a.a(new j(this, hashMap, hashMap1, p0));
       return;
    }
    public final void f(long p0,Calendar p1){
       if (this.h == null) {
          this.h = b.b(a.c());
       }
       long l = p1.getTimeInMillis() - p0;
       d.a().f().d("ABTest-LogEventHelper", "resetReportedSet delay: "+l);
       t.timer(l, TimeUnit.MILLISECONDS).observeOn(this.h).subscribe(new f(this, p1), Functions.d());
       return;
    }
    public final void g(Map p0,Set p1,ConcurrentHashMap p2){
       Iterator iterator = p2.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!p1.contains(uEntry.getKey())) {
             p0.put(uEntry.getKey(), uEntry.getValue());
             iterator.remove();
          }
       }
       return;
    }
    public final void h(){
       a tg = this.g;
       if (tg != null && !tg.isDisposed()) {
          d.a().f().d("ABTest-LogEventHelper", "stopNormalLog");
          this.g.dispose();
       }
       return;
    }
    public void i(Map p0){
       if (!this.b()) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          return;
       }
       a tf = this.f;
       _monitor_enter(tf);
       a te = this.e;
       _monitor_enter(te);
       this.f.clear();
       this.e.clear();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          ABConfig value = iterator.next().getValue();
          if (value.getGroupId() == null) {
             continue ;
          }else {
             this.f.put(value.getGroupId(), Integer.valueOf(value.getDynamicFlag()));
             this.e.put(value.getGroupId(), Integer.valueOf(value.getLogPolicy()));
             d.a().f().i("ABTest-LogEventHelper", "updateGidMap: groupId="+value.getGroupId()+",mDynamicFlag="+value.getDynamicFlag()+",mPolicyType="+value.getPolicyType());
          }
       }
       _monitor_exit(te);
       _monitor_exit(tf);
       return;
    }
}
