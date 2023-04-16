package com.yxcorp.gifshow.util.resource.n;
import java.util.concurrent.ConcurrentHashMap;
import t45.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import java.lang.Object;
import wkd.b;
import boc.h;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.util.resource.k;
import boc.b;
import com.yxcorp.gifshow.util.resource.n$c;
import t16.a;
import qfc.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.util.resource.j;
import boc.p;
import erd.g;
import crd.b;
import com.kwai.kscnnrenderlib.YCNNComm;
import com.yxcorp.utility.SystemUtil;
import xf6.g;
import xf6.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.camera.record.assistant.utils.e;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import boc.t;
import com.yxcorp.gifshow.util.resource.m;
import com.yxcorp.gifshow.util.resource.l;
import java.util.Map;
import java.lang.Boolean;
import java.io.File;
import ekd.j;
import java.lang.Throwable;
import lnc.s6;
import java.lang.Integer;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadTask;
import java.util.Objects;
import t16.c;
import com.yxcorp.gifshow.util.resource.Category;
import com.yxcorp.gifshow.util.resource.d$a;
import java.util.List;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import c0d.d;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.gifshow.util.resource.MagicModel;
import com.yxcorp.gifshow.util.resource.FontCategory;
import com.yxcorp.gifshow.util.resource.p$a;
import java.lang.Enum;
import android.os.Looper;
import boc.v;
import java.lang.Runnable;
import ekd.k1;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import ekd.q;
import boc.q;
import boc.w;
import boc.u;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import doc.a;
import boc.x;
import android.os.SystemClock;
import java.lang.Long;
import com.yxcorp.gifshow.util.resource.d;
import coc.a;
import java.util.concurrent.CountDownLatch;
import com.yxcorp.gifshow.util.resource.n$a;
import com.kuaishou.android.model.response.ConfigResponse;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$DiffInfo;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$a;
import com.yxcorp.gifshow.util.resource.e;
import com.yxcorp.gifshow.util.resource.o;
import t16.f;
import com.yxcorp.download.b;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.util.resource.n$b;

public class n	// class@000cf5
{
    public static final Map a;
    public static final Map b;
    public static final Map c;
    public static final ThreadPoolExecutor d;
    public static ConfigResponse e;
    public static YlabModelConfigResponse f;
    public static final Map g;
    public static final Map h;

    static {
       n.a = new ConcurrentHashMap();
       n.b = new ConcurrentHashMap();
       n.c = new ConcurrentHashMap();
       e uoe = new e(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("post-download"));
       n.d = v0;
       n.g = new ConcurrentHashMap();
       n.h = new ConcurrentHashMap();
    }
    public static t A(RequestTiming p0){
       ConfigResponse e = n.e;
       if (e != null) {
          return t.just(e);
       }
       return b.a(-1625817566).b("android2.json", p0).map(new e()).map(k.b);
    }
    public static void B(b p0,boolean p1,boolean p2,boolean p3,n$c p4,a p5){
       Object[] objArray = new Object[0];
       a.C().w("resourcemanager", "download "+p0.getResourceName()+" limitSpeedWhenHighLevelResDownloading "+p1, objArray);
       j oj = new j(p0, p1, p2, p3, p4, p5);
       n.z(p0).subscribe(v8, new p(p0, p4));
    }
    public static t C(){
       String str1;
       YlabModelConfigResponse f = n.f;
       if (f != null) {
          return t.just(f);
       }
       String str = YCNNComm.YCNNGetMainVersion();
       if (SystemUtil.I() || (g.o1() && SystemUtil.J())) {
          str1 = l.g("beauty_model_version", str);
          if (!TextUtils.x(str1)) {
             str = str1;
          }
       }
       str1 = YCNNComm.Face3DGetMainVersion();
       Object[] objArray = new Object[0];
       a.C().w("UpdateModleConfig", "YCNNMainVersion:"+str+" MMUMainVersion:"+str1, objArray);
       return t.fromCallable(e.b).subscribeOn(d.c).flatMap(new t(str, str1)).map(m.b).map(l.b);
    }
    public static void a(n$c p0){
       if (p0 != null) {
          Map h = n.h;
          if (!h.containsKey(p0)) {
             h.put(p0, Boolean.TRUE);
          }
       }
       return;
    }
    public static void b(b p0){
       if (!p0.needAddNoMediaFile()) {
          return;
       }
       File uFile = new File(p0.getResourceDir());
       if (uFile.exists() && !j.h(uFile.listFiles())) {
          File uFile1 = new File(uFile, ".nomedia");
          if (!uFile1.exists()) {
             uFile1.createNewFile();
          }
       }
       return;
    }
    public static boolean c(b p0,boolean p1,boolean p2){
       Integer integer;
       DownloadTask uDownloadTas;
       boolean b = true;
       String str = "already downloading: ";
       if (s6.g()) {
          integer = n.c.get(p0);
          uDownloadTas = (integer != null)? DownloadManager.n().l(integer.intValue()): null;
          a uoa = a.C();
          StringBuilder str1 = p0.getResourceName()+" downloadId : "+integer+", ";
          Integer integer1 = (uDownloadTas != null)? Integer.valueOf(uDownloadTas.getStatus()): "";
          Object[] objArray = new Object[0];
          uoa.w("resourcemanager", str1+integer1, objArray);
          if (uDownloadTas != null && !uDownloadTas.isError()) {
             Object[] objArray1 = new Object[0];
             a.C().D("resourcemanager", "[yModel][keypath][download] ", str+p0.getResourceName(), objArray1);
             if (!p1) {
                uDownloadTas.setAllowedNetworkTypes(3);
             }
             if (!p2) {
                integer.intValue();
                Objects.requireNonNull(DownloadManager.n());
                c.a().e(integer.intValue());
             }
          }else {
             b = false;
          }
          return b;
       }else {
          integer = n.c.get(p0);
          if (integer == null || (!DownloadManager.n().x(integer.intValue()) && !DownloadManager.n().y(integer.intValue()))) {
             return 0;
          }
          uDownloadTas = DownloadManager.n().l(integer.intValue());
          if (!p1 && uDownloadTas != null) {
             uDownloadTas.setAllowedNetworkTypes(3);
          }
          if (!p2) {
             integer.intValue();
             Objects.requireNonNull(DownloadManager.n());
             c.a().e(integer.intValue());
          }
          Object[] objArray2 = new Object[0];
          a.C().D("resourcemanager", "[yModel][keypath][download] ", str+p0.getResourceName(), objArray2);
          return b;
       }
    }
    public static void d(){
       Category[] uCategoryArr = Category.values();
       int len = uCategoryArr.length;
       for (int i = 0; i < len; i = i + 1) {
          n.b(uCategoryArr[i]);
       }
       return;
    }
    public static DownloadTask$DownloadRequest e(d$a p0,b p1,boolean p2,boolean p3,boolean p4,List p5,boolean p6){
       int i;
       DownloadTask$DownloadRequest uDownloadReq = (p0 != null)? new DownloadTask$DownloadRequest(p0.c): new DownloadTask$DownloadRequest(p5);
       String str = (p6)? "post_resource_manager_incremental": "post_resource_manager";
       uDownloadReq.setBizInfo(":ks-components:resource", str, null);
       str = true;
       uDownloadReq.setNeedCDNReport(str);
       if (p0 != null) {
          p0 = p0.d;
          if (p0 != null) {
             uDownloadReq.addRequestHeader("Host", p0.b);
          }
       }
       if (p2) {
          uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.ENQUEUE);
       }else {
          uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
       }
       if (!p3) {
          uDownloadReq.setAllowedNetworkTypes(3);
       }
       if (p4) {
          uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.PRE_DOWNLOAD);
       }
       if (p1 instanceof MagicModel || p1.useYcnnModelConfig()) {
          i = 4;
       }else if(p1 instanceof FontCategory){
          i = 36;
       }else if(p1 instanceof Category){
          switch (p$a.a[p1.ordinal()]){
              case 1:
                i = 15;
                break;
              case 2:
              case 4:
              case 5:
              case 3:
                i = 6;
                break;
              case 6:
              case 8:
              case 7:
                i = 7;
                break;
              case 9:
                i = 10;
                break;
              case 10:
                i = 11;
              case 11:
              default:
          }
       }
       i = 0;
       uDownloadReq.setResourceType(i);
       return uDownloadReq;
    }
    public static void f(b p0){
       if (Looper.getMainLooper() != Looper.myLooper()) {
          k1.o(new v(p0));
          return;
       }else {
          Iterator iterator = n.h.keySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().c(p0);
          }
          Set set = n.g.get(p0);
          if (!q.f(set)) {
             Iterator iterator1 = set.iterator();
             while (iterator1.hasNext()) {
                n$c uoc = iterator1.next();
                if (uoc == null) {
                   continue ;
                }
                uoc.c(p0);
             }
             set.clear();
          }
          return;
       }
    }
    public static void g(b p0,Throwable p1){
       if (Looper.getMainLooper() != Looper.myLooper()) {
          k1.o(new q(p0, p1));
          return;
       }else if(p1 != null){
          Object[] objArray = new Object[0];
          a.C().D("resourcemanager", "[yModel][keypath][download] ", "error "+p0.getResourceName()+" msg: "+p1.getMessage(), objArray);
       }
       Iterator iterator = n.h.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0, p1);
       }
       Set set = n.g.get(p0);
       if (!q.f(set)) {
          Iterator iterator1 = set.iterator();
          while (iterator1.hasNext()) {
             n$c uoc = iterator1.next();
             if (uoc == null) {
                continue ;
             }
             uoc.d(p0, p1);
          }
          set.clear();
       }
       return;
    }
    public static void h(b p0,float p1){
       if (Looper.getMainLooper() != Looper.myLooper()) {
          k1.o(new w(p0, p1));
          return;
       }else {
          Iterator iterator = n.h.keySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p0, p1);
          }
          Set set = n.g.get(p0);
          if (!q.f(set)) {
             iterator = set.iterator();
             while (iterator.hasNext()) {
                n$c uoc = iterator.next();
                if (uoc == null) {
                   continue ;
                }
                uoc.b(p0, p1);
             }
          }
          return;
       }
    }
    public static void i(b p0){
       if (Looper.getMainLooper() != Looper.myLooper()) {
          k1.o(new u(p0));
          return;
       }else if(p0.useYcnnModelConfig()){
          Object[] objArray = new Object[0];
          a.C().D("resourcemanager", "[yModel][keypath][download] ", "completed "+p0.getResourceName()+" path: "+p0.getResourceDir(), objArray);
       }
       if (p0 instanceof MagicModel) {
          MagicEmojiResourceHelper.v(p0.getResourceName(), true);
       }
       Iterator iterator = n.h.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       Set set = n.g.get(p0);
       if (!q.f(set)) {
          Iterator iterator1 = set.iterator();
          while (iterator1.hasNext()) {
             n$c uoc = iterator1.next();
             if (uoc == null) {
                continue ;
             }
             uoc.a(p0);
          }
          set.clear();
       }
       return;
    }
    public static synchronized void j(a p0,b p1,boolean p2,boolean p3,boolean p4,n$c p5){
       _monitor_enter(n.class);
       n.k(p0, p1, p2, p3, p4, null, new a());
       _monitor_exit(n.class);
    }
    public static synchronized void k(a p0,b p1,boolean p2,boolean p3,boolean p4,n$c p5,a p6){
       Object[] objArray1;
       _monitor_enter(n.class);
       k1.o(new x(p1, p5));
       if (n.c(p1, p3, p2)) {
          _monitor_exit(n.class);
          return;
       }else if(!n.s(p1, p0, p2, p3, p4, p6)){
          String initDownload = p1.getInitDownloadUrl(p0);
          int i = 0;
          if (TextUtils.x(initDownload)) {
             Object[] objArray = new Object[i];
             a.C().t("resourcemanager", p1.getResourceName()+" getUrl null", objArray);
             _monitor_exit(n.class);
             return;
          }else if(p1.useYcnnModelConfig()){
             objArray1 = new Object[i];
             a.C().D("resourcemanager", "[yModel][keypath][download] ", "start "+p1.getResourceName()+" url£º"+initDownload, objArray1);
          }else {
             objArray1 = new Object[i];
             a.C().s("resourcemanager", p1.getResourceName()+" getUrl£º"+initDownload, objArray1);
          }
          n.b.put(p1, Long.valueOf(SystemClock.elapsedRealtime()));
          n.v(new d(initDownload), p1, p2, p3, p4, p6, new a(p1.getResourceName(), 1));
       }
       _monitor_exit(n.class);
       return;
    }
    public static void l(b p0){
       n.n(p0, null, new a());
    }
    public static void m(b p0,n$c p1){
       n.n(p0, p1, new a());
    }
    public static void n(b p0,n$c p1,a p2){
       n.B(p0, false, false, false, p1, p2);
    }
    public static void o(b p0,a p1){
       n.n(p0, null, p1);
    }
    public static boolean p(b p0,long p1){
       File uFile = new File(p0.getResourceDir());
       boolean b = true;
       if (uFile.exists() && uFile.isDirectory()) {
          String[] stringArray = uFile.list();
          if (stringArray != null && stringArray.length > 0) {
             return b;
          }
       }
       CountDownLatch uCountDownLa = new CountDownLatch(b);
       n$a uoa = new n$a(uCountDownLa);
       try{
          int i = 0;
          Object[] objArray = new Object[i];
          a.C().y("resourcemanager", "download sync begin "+p0, objArray);
          n.m(p0, uoa);
          uCountDownLa.await(p1, TimeUnit.MILLISECONDS);
          Object[] objArray1 = new Object[i];
          a.C().y("resourcemanager", "download sync end "+p0, objArray1);
          if (uFile.exists() && uFile.isDirectory()) {
             String[] stringArray1 = uFile.list();
             if (stringArray1 == null || stringArray1.length <= 0) {
                b = false;
             }
             return b;
          }else {
             return i;
          }
       }catch(java.lang.InterruptedException e0){
       }
    }
    public static ConfigResponse q(){
       return n.e;
    }
    public static synchronized String r(b p0){
       _monitor_enter(n.class);
       if (p0.useYcnnModelConfig()) {
          _monitor_exit(n.class);
          return p0.getRetryDownloadUrl(n.f);
       }else {
          _monitor_exit(n.class);
          return p0.getRetryDownloadUrl(n.e);
       }
    }
    public static boolean s(b p0,a p1,boolean p2,boolean p3,boolean p4,a p5){
       Object[] objArray2;
       int i1;
       if (!s6.g()) {
          return false;
       }
       YlabModelConfigResponse$ModelConfig$DiffInfo incrementalI = p0.getIncrementalInfo(p1);
       if (incrementalI == null || !incrementalI.a()) {
          Object[] objArray = new Object[false];
          a.C().A("resourcemanager", p0.getResourceName()+" : no diffinfo", objArray);
          return false;
       }else {
          a uoa = new a(p0.getResourceName(), 2);
          Object[] objArray1 = new Object[false];
          a.C().w("resourcemanager", "start incrementalDownload : "+p0, objArray1);
          n.a.put(p0, Long.valueOf(SystemClock.elapsedRealtime()));
          ArrayList uArrayList = new ArrayList();
          YlabModelConfigResponse$ModelConfig$DiffInfo mUrls = incrementalI.mUrls;
          if (mUrls != null) {
             Iterator iterator = mUrls.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().mUrl);
             }
          }
          if (uArrayList.isEmpty() || !e.a(p0)) {
             String initDownload = p0.getInitDownloadUrl(p1);
             int i = (!uArrayList.isEmpty())? 1008: 1009;
             uoa.b(i, "");
             if (!TextUtils.x(initDownload)) {
                objArray2 = new Object[false];
                a.C().t("resourcemanager", "try normal download : "+p0.getResourceName(), objArray2);
                n.v(new d(initDownload), p0, p2, p3, p4, p5, new a(p0.getResourceName(), 3));
             }else {
                n.g(p0, new IllegalStateException("check incremental failed"));
             }
          }else {
             o oo = new o(uoa, p0, incrementalI, p1, p2, p3, p4, p5);
             DownloadTask$DownloadRequest uDownloadReq = n.e(null, p0, p2, p3, p4, uArrayList, true);
             if (f.b()) {
                i1 = c.a().d(p5, uDownloadReq, v14);
             }else {
                b[] uobArray = new b[true];
                uobArray[0] = v14;
                i1 = DownloadManager.n().E(uDownloadReq, uobArray);
             }
             objArray2 = new Object[false];
             a.C().w("resourcemanager", "Incremental download Id : "+i1, objArray2);
             n.c.put(p0, Integer.valueOf(i1));
             if (p2) {
                Objects.requireNonNull(DownloadManager.n());
             }else {
                Objects.requireNonNull(DownloadManager.n());
             }
          }
          return true;
       }
    }
    public static boolean t(b p0){
       Integer integer = n.c.get(p0);
       boolean b = (integer != null && (DownloadManager.n().x(integer.intValue()) || DownloadManager.n().y(integer.intValue())))? true: false;
       return b;
    }
    public static void u(b p0){
       n.B(p0, true, false, true, null, new a());
    }
    public static void v(d p0,b p1,boolean p2,boolean p3,boolean p4,a p5,a p6){
       StringBuilder str;
       int i;
       d uod = p0;
       Object obj = p1;
       n.a.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
       if (!p0.b()) {
          str = null;
       }else {
          str = uod.a.get(uod.b);
          uod.b = uod.b + 1;
       }
       if (str == null) {
          return;
       }else {
          String str1 = obj+", "+p0;
          d a = uod.a;
          Object[] objArray = new Object[0];
          a.C().y("resourcemanager", "download start "+str1, objArray);
          n$b uob = new n$b(p6, a.get((a.size() - 1)).a, p1, str1, p0, p2, p3, p4, p5);
          DownloadTask$DownloadRequest uDownloadReq = n.e(p0.a(), p1, p2, p3, p4, null, false);
          if (f.b()) {
             i = c.a().d(p5, uDownloadReq, v14);
          }else {
             b[] uobArray = new b[]{v14};
             i = DownloadManager.n().E(uDownloadReq, uobArray);
          }
          n.c.put(obj, Integer.valueOf(i));
          if (p2) {
             Objects.requireNonNull(DownloadManager.n());
          }else {
             Objects.requireNonNull(DownloadManager.n());
          }
          return;
       }
    }
    public static void w(n$c p0){
       n.h.remove(p0);
    }
    public static boolean x(Category p0){
       Integer integer = n.c.get(p0);
       if (integer == null || (!DownloadManager.n().x(integer.intValue()) && !DownloadManager.n().y(integer.intValue()))) {
          return false;
       }
       integer.intValue();
       Objects.requireNonNull(DownloadManager.n());
       DownloadManager.n().F(integer.intValue());
       return true;
    }
    public static t y(){
       return n.A(RequestTiming.DEFAULT);
    }
    public static t z(b p0){
       if (p0.useYcnnModelConfig()) {
          return n.C();
       }
       return n.y();
    }
}
