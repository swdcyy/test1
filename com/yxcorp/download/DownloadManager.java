package com.yxcorp.download.DownloadManager;
import java.util.HashSet;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.download.DownloadManager$a;
import com.yxcorp.download.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import java.lang.StringBuilder;
import com.yxcorp.download.c;
import java.util.Set;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.download.DownloadConfig;
import java.util.HashMap;
import java.lang.Integer;
import android.content.Context;
import java.io.File;
import nu8.a;
import com.yxcorp.download.g;
import com.yxcorp.download.i;
import com.yxcorp.download.a;
import java.util.Objects;
import java.util.List;
import ou8.d;
import com.yxcorp.download.DownloadManager$WifiMonitorReceiver;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.yxcorp.download.DownloadTask;
import java.util.Map;
import com.yxcorp.utility.Log;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import java.lang.Boolean;
import com.yxcorp.download.DownloadDispatcher;
import com.kwai.video.hodor.Hodor;
import android.util.Pair;
import java.lang.Long;
import com.kwai.video.hodor.ResourceDownloadTask;

public class DownloadManager	// class@0011a9
{
    public final Map a;
    public final Map b;
    public DownloadManager$WifiMonitorReceiver c;
    public b d;
    public static final Set e;
    public static final Set f;
    public static final DownloadManager g;
    public static DownloadConfig h;

    static {
       DownloadManager.e = new HashSet();
       DownloadManager.f = new HashSet();
       DownloadManager.g = new DownloadManager();
    }
    public void DownloadManager(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       DownloadManager$a uoa = new DownloadManager$a(this);
       uoa.n(true);
       this.d = uoa;
    }
    public static void C(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DownloadManager.class, "33")) {
          return;
       }
       p0 = p0.trim();
       if (!TextUtils.isEmpty(p1)) {
          String str = p1.trim();
          try{
             Uri uri = Uri.parse(p1);
             if ((uri.getScheme()).equalsIgnoreCase("http") || (uri.getScheme()).equalsIgnoreCase("https")) {
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                   try{
                      str = uri.getQuery();
                      str = (!TextUtils.isEmpty(str))? path+str: path;
                   }catch(java.lang.Exception e0){
                   }
                }
             }
          }catch(java.lang.Exception e0){
          }
       }else if(!DownloadManager.e.contains(p0)){
          c.a(p0, p1);
       }
    }
    public static int g(DownloadTask$DownloadTaskType p0){
       Integer integer;
       Object obj = PatchProxy.applyOneRefs(p0, null, DownloadManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (DownloadManager.i().B != null) {
          integer = DownloadManager.h.E.get(p0);
          if (integer != null) {
             i = integer.intValue();
          }
          return i;
       }else {
          integer = DownloadManager.h.D.get(p0);
          if (integer != null) {
             i = integer.intValue();
          }
          return i;
       }
    }
    public static Context h(){
       return DownloadManager.h.a;
    }
    public static DownloadConfig i(){
       return DownloadManager.h;
    }
    public static File j(){
       return DownloadManager.h.b;
    }
    public static DownloadManager n(){
       return DownloadManager.g;
    }
    public static int o(){
       return DownloadManager.h.c;
    }
    public static void q(DownloadConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DownloadManager.class, "1")) {
          return;
       }
       DownloadManager.h = p0;
       a.b().a = p0.G;
       g og = g.c();
       i oi = a.c();
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoidOneRefs(oi, og, g.class, "7")) {
          og.a.add(oi);
       }
       d uod = d.a();
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoidOneRefs(p0, uod, d.class, "1")) {
          uod.b = p0;
          if (p0.r != null) {
             uod.d(0);
          }
       }
       return;
    }
    public static boolean s(){
       return DownloadManager.h.f;
    }
    public static boolean t(){
       return DownloadManager.h.g;
    }
    public static boolean u(){
       return DownloadManager.h.e;
    }
    public static boolean v(){
       return DownloadManager.h.h;
    }
    public void A(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadManager.class, "31")) {
          return;
       }
       if (this.c == null) {
          this.c = new DownloadManager$WifiMonitorReceiver(this);
       }
       UniversalReceiver.e(DownloadManager.h(), this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
       return;
    }
    public void B(int p0,b p1){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uDownloadMan, "27")) {
          return;
       }
       DownloadTask uDownloadTas = this.l(p0);
       if (uDownloadTas != null) {
          uDownloadTas.removeListener(p1);
       }
       return;
    }
    public void D(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDownloadMan, "12")) {
          return;
       }
       DownloadTask uDownloadTas = this.a.get(Integer.valueOf(p0));
       if (uDownloadTas != null) {
          Log.g("DownloadManager", "resume bizType: "+uDownloadTas.getBizType()+" url: "+uDownloadTas.getUrl());
          uDownloadTas.resume();
       }else {
          Log.g("DownloadManager", "resume. didn\'t find a task with id "+p0);
       }
       return;
    }
    public int E(DownloadTask$DownloadRequest p0,b[] p1){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DownloadManager uDownloadMan = DownloadManager.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, uDownloadMan, "9");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.applyThreeRefs(p0, null, p1, this, DownloadManager.class, "10");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          obj = p0.getBizType();
          DownloadTask obj1 = PatchProxy.applyOneRefs(obj, null, uDownloadMan, "4");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): DownloadManager.h.l.contains(obj);
          if (b) {
             p0.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
          }
          obj1 = new DownloadTask(p0, this.k(p0));
          DownloadTask uDownloadTas = this.a.get(Integer.valueOf(obj1.getId()));
          obj = " url: ";
          String str = " bizType: ";
          if (uDownloadTas != null) {
             Log.g("DownloadManager", "start an old task : "+obj1.getId()+str+p0.getBizType()+obj+p0.getDownloadUrl());
             uDownloadTas.clearListener();
             this.b(obj1.getId(), p1);
             uDownloadTas.syncRequestParams(p0);
             uDownloadTas.updateTask();
             uDownloadTas.resume();
          }else {
             Log.g("DownloadManager", "start a new task : "+obj1.getId()+str+p0.getBizType()+obj+p0.getDownloadUrl());
             this.a.put(Integer.valueOf(obj1.getId()), obj1);
             this.b.put(obj1.getUrl(), Integer.valueOf(obj1.getId()));
             this.b(obj1.getId(), p1);
             this.a(obj1);
             if (DownloadManager.i().B != null) {
                Log.g("DownloadManager", "direct submit "+p0.getDownloadUrl());
                obj1.submit();
             }else {
                obj1.schedule();
             }
          }
          i = obj1.getId();
       }
       return i;
    }
    public void F(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDownloadMan, "11")) {
          return;
       }
       DownloadTask uDownloadTas = this.a.get(Integer.valueOf(p0));
       String str = "DownloadManager";
       if (uDownloadTas != null) {
          Log.g(str, "startImmediately bizType: "+uDownloadTas.getBizType()+" url: "+uDownloadTas.getUrl());
          uDownloadTas.getRequest().setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
          uDownloadTas.updateTask();
          uDownloadTas.resume();
       }else {
          Log.g(str, "startImmediately. didn\'t find a task with id "+p0);
       }
       return;
    }
    public final void a(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadManager.class, "20")) {
          return;
       }
       p0.addListener(this.d);
       return;
    }
    public void b(int p0,b[] p1){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uDownloadMan, "26")) {
          return;
       }
       DownloadTask uDownloadTas = this.l(p0);
       if (uDownloadTas != null && p1 != null) {
          int len = p1.length;
          int i = 0;
          while (i < len) {
             object oobject = p1[i];
             if (oobject != null) {
                oobject.a = p0;
                uDownloadTas.addListener(oobject);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void c(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDownloadMan, "14")) {
          return;
       }
       DownloadTask uDownloadTas = this.a.get(Integer.valueOf(p0));
       if (uDownloadTas != null) {
          Log.g("DownloadManager", "cancel bizType: "+uDownloadTas.getBizType()+" url: "+uDownloadTas.getUrl());
          uDownloadTas.cancel();
       }else {
          Log.g("DownloadManager", "cancel. didn\'t find a task with id "+p0);
       }
       return;
    }
    public void d(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadManager.class, "29")) {
          return;
       }
       Log.b("DownloadManager", "clearDownloadTaskMap : "+p0.getId()+" ## "+p0.getUrl());
       this.a.remove(Integer.valueOf(p0.getId()));
       this.b.remove(p0.getUrl());
       return;
    }
    public void e(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDownloadMan, "28")) {
          return;
       }
       DownloadTask uDownloadTas = this.l(p0);
       if (uDownloadTas != null) {
          uDownloadTas.clearListener();
       }
       return;
    }
    public void f(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDownloadMan, "16")) {
          return;
       }
       Log.g("DownloadManager", "deleteCache");
       Hodor.instance().deleteCacheByKey(String.valueOf(p0), 1);
       return;
    }
    public final DownloadDispatcher k(DownloadTask$DownloadRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(p0.getDownloadTaskType());
    }
    public DownloadTask l(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDownloadMan, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.b("DownloadManager", "getDownloadTask");
       return this.a.get(Integer.valueOf(p0));
    }
    public Pair m(int p0){
       DownloadTask obj;
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDownloadMan, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.l(p0);
       if (obj != null) {
          return new Pair(Long.valueOf(obj.getSoFarBytes()), Long.valueOf(obj.getTotalBytes()));
       }else {
          return new Pair(Long.valueOf(ResourceDownloadTask.getCachedBytes(String.valueOf(p0))), Long.valueOf(ResourceDownloadTask.getTotalBytes(String.valueOf(p0))));
       }
    }
    public Integer p(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadManager.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.b("DownloadManager", "getTaskId");
       return this.b.get(p0);
    }
    public void r(DownloadTask$DownloadRequest p0,b[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DownloadManager.class, "8")) {
          return;
       }
       Log.g("DownloadManager", "initialize bizType: "+p0.getBizType()+" url: "+p0.getDownloadUrl());
       DownloadTask uDownloadTas = new DownloadTask(p0, this.k(p0));
       this.a.put(Integer.valueOf(uDownloadTas.getId()), uDownloadTas);
       this.b.put(uDownloadTas.getUrl(), Integer.valueOf(uDownloadTas.getId()));
       this.e(uDownloadTas.getId());
       this.b(uDownloadTas.getId(), p1);
       this.a(uDownloadTas);
       return;
    }
    public boolean w(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDownloadMan, "23");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.b("DownloadManager", "isPaused");
       DownloadTask uDownloadTas = this.a.get(Integer.valueOf(p0));
       boolean b = (uDownloadTas != null && uDownloadTas.isPaused())? true: false;
       return b;
    }
    public boolean x(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDownloadMan, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.b("DownloadManager", "isRunning");
       DownloadTask uDownloadTas = this.a.get(Integer.valueOf(p0));
       boolean b = (uDownloadTas != null && uDownloadTas.isRunning())? true: false;
       return b;
    }
    public boolean y(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDownloadMan, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.b("DownloadManager", "isWaiting");
       DownloadTask uDownloadTas = this.a.get(Integer.valueOf(p0));
       boolean b = (uDownloadTas != null && uDownloadTas.isWaiting())? true: false;
       return b;
    }
    public void z(int p0){
       DownloadManager uDownloadMan = DownloadManager.class;
       if (PatchProxy.isSupport(uDownloadMan) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDownloadMan, "13")) {
          return;
       }
       DownloadTask uDownloadTas = this.a.get(Integer.valueOf(p0));
       if (uDownloadTas != null) {
          Log.g("DownloadManager", "pause bizType: "+uDownloadTas.getBizType()+" url: "+uDownloadTas.getUrl());
          uDownloadTas.pause();
       }else {
          Log.g("DownloadManager", "pause. didn\'t find a task with id "+p0);
       }
       return;
    }
}
