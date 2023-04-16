package com.yxcorp.gifshow.detail.helper.d;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import e1a.q;
import java.lang.Runnable;
import t45.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Number;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.detail.helper.PlayPositionInfo;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import z1.e;
import e1a.r;
import java.util.List;
import java.lang.Long;
import java.lang.System;

public class d	// class@00156e
{
    public LinkedHashMap a;
    public boolean b;
    public boolean c;
    public static final long d;
    public static final Object e;

    static {
       d.d = TimeUnit.DAYS.toMillis(7);
       d.e = new Object();
    }
    public void d(){
       super();
       c.a(new q(this));
    }
    public final boolean a(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, d.class, "9");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return this.b;
    }
    public long b(QPhoto p0){
       PlayPositionInfo obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!this.a("get")) {
          return -1;
       }
       obj = d.e;
       _monitor_enter(obj);
       PlayPositionInfo playPosition = this.a.get(p0.getWrapperPhotoId());
       _monitor_exit(obj);
       if (playPosition == null) {
          return -1;
       }
       obj = playPosition.mPlayPosition;
       if (obj > 0) {
          this.d();
       }
       return obj;
    }
    public long c(String p0){
       PlayPositionInfo obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!this.a("get")) {
          return -1;
       }
       obj = d.e;
       _monitor_enter(obj);
       PlayPositionInfo playPosition = this.a.get(p0);
       _monitor_exit(obj);
       if (playPosition == null) {
          return -1;
       }
       obj = playPosition.mPlayPosition;
       if (obj > 0) {
          this.d();
       }
       return obj;
    }
    public final void d(){
       this.c = true;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       if (!this.a("persist")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       if (this.a.isEmpty()) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Object e = d.e;
       _monitor_enter(e);
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          uArrayList.add(new e(key, uEntry.getValue()));
       }
       _monitor_exit(e);
       this.c = false;
       c.a(new r(this, uArrayList));
       return;
    }
    public void f(QPhoto p0,long p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uod, "2")) {
          return;
       }
       if (!this.a("put")) {
          return;
       }
       Object e = d.e;
       _monitor_enter(e);
       PlayPositionInfo playPosition = new PlayPositionInfo(p1, System.currentTimeMillis(), p0.getExtraSaveProgressTime());
       this.a.put(p0.getWrapperPhotoId(), v10);
       _monitor_exit(e);
       this.d();
       return;
    }
    public void g(String p0,PlayPositionInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "5")) {
          return;
       }
       if (!this.a("put")) {
          return;
       }
       Object e = d.e;
       _monitor_enter(e);
       this.a.put(p0, p1);
       _monitor_exit(e);
       this.d();
       return;
    }
    public void h(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       if (!this.a("remove")) {
          return;
       }
       Object e = d.e;
       _monitor_enter(e);
       _monitor_exit(e);
       if (this.a.remove(p0.getWrapperPhotoId()) != null) {
          this.d();
       }
       return;
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       if (!this.a("remove")) {
          return;
       }
       Object e = d.e;
       _monitor_enter(e);
       _monitor_exit(e);
       if (this.a.remove(p0) != null) {
          this.d();
       }
       return;
    }
}
