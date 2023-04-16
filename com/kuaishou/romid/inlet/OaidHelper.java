package com.kuaishou.romid.inlet.OaidHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rv4.l;
import i30.t;
import java.lang.Boolean;
import l30.l;
import hv4.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import rv4.h;
import rv4.a;
import rv4.i;
import java.lang.Thread;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.dfp.c.d;
import r30.d;
import rv4.f;
import r30.a;
import android.os.Build$VERSION;
import rv4.k;
import l30.y;
import rv4.m;
import rv4.g;
import java.lang.System;
import rv4.e;
import java.lang.Runnable;
import java.lang.Throwable;
import iv4.a;
import ov4.a;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Objects;
import java.lang.IllegalStateException;
import lv4.a;
import kv4.a;
import nv4.d;
import android.content.Intent;
import nv4.e;
import com.kuaishou.romid.inlet.a;
import rv4.c;
import ev4.a;
import android.provider.Settings$Global;
import java.lang.StringBuilder;
import android.content.ComponentName;
import ev4.b;
import android.os.Build;
import gv4.a;
import gv4.b;
import dv4.a;
import dv4.b;
import fv4.a;
import java.lang.reflect.Method;
import qv4.d;
import qv4.e;
import jv4.d;
import jv4.e;
import mv4.a;
import r4.a;
import r4.g;
import q4.a;
import r4.b;
import r4.h;
import java.util.ArrayList;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import r4.c;
import p4.b;
import java.util.Map;
import android.content.SharedPreferences;
import oe6.o;
import r4.i;
import p4.a;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.RuntimeException;
import pv4.a;
import android.os.MessageQueue;
import com.kuaishou.dfp.c.a;
import android.os.Message;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

public class OaidHelper	// class@000943
{
    public long S_TIME;
    public CountDownLatch mCdOAID;
    public String mCheckClassName;
    public String mCheckClassName_sec;
    public Context mContext;
    public CountDownLatch mGaGAID;
    public AtomicBoolean mGaidIsInited;
    public y mPre;
    public static final int CMD_AAID = 3;
    public static final int CMD_OAID = 1;
    public static final int CMD_VAID = 2;
    public static String GAID = "KWE_NS";
    public static String LOCAL_OAID = "";
    public static String OAID = "KWE_NS";
    public static String ROME_INDEX = "0";
    public static AtomicBoolean mIsInited;
    public static AtomicBoolean mIsPrivacyChecked;

    static {
       OaidHelper.mIsInited = new AtomicBoolean(false);
       OaidHelper.mIsPrivacyChecked = new AtomicBoolean(false);
    }
    public void OaidHelper(){
       super();
       this.mGaidIsInited = new AtomicBoolean(false);
       this.mCdOAID = null;
       this.mGaGAID = new CountDownLatch(1);
       this.S_TIME = 0;
       this.mCheckClassName = "";
       this.mCheckClassName_sec = "";
    }
    public static final String getHolderName(){
       Object obj = PatchProxy.apply(null, null, OaidHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.class.getName();
    }
    public static final OaidHelper getSingletonInstance(){
       Object obj = PatchProxy.apply(null, null, OaidHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.a;
    }
    public final boolean channelControl(){
       return t.l;
    }
    public void doGetGms(boolean p0){
       OaidHelper oaidHelper = OaidHelper.class;
       if (PatchProxy.isSupport(oaidHelper) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oaidHelper, "11")) {
          return;
       }
       boolean b = false;
       if (!this.mGaidIsInited.compareAndSet(b, true)) {
          l.c("Gaid has been initialized,return!");
          return;
       }else {
          a uoa = new a(this.mContext);
          a obj = PatchProxy.apply(null, uoa, a.class, "1");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             try{
                obj = uoa.a;
                if (obj != null && obj.getPackageManager().getPackageInfo("com.android.vending", b) != null) {
                   b = true;
                }
             }catch(java.lang.Exception e0){
             }
          }
          if (b) {
             if (p0) {
                uoa.a(new h(this));
             }else {
                i oi = new i(this, uoa);
                oi.setName("doGetGms_thread");
                oi.start();
             }
          }else {
             this.mGaGAID.countDown();
          }
          return;
       }
    }
    public String getIdImpl(int p0){
       String obj;
       OaidHelper oaidHelper = OaidHelper.class;
       if (PatchProxy.isSupport(oaidHelper)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oaidHelper, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.mContext == null) {
          return "";
       }else if(p0 != 1){
          obj = "KWE";
          if (!TextUtils.isEmpty(OaidHelper.OAID) && !(OaidHelper.OAID).startsWith(obj)) {
             return OaidHelper.OAID;
          }else if(!TextUtils.isEmpty(OaidHelper.LOCAL_OAID)){
             if (!(OaidHelper.LOCAL_OAID).startsWith(obj)) {
                return OaidHelper.LOCAL_OAID;
             }else {
                return "";
             }
          }else if(!(this.mContext.getPackageName()).equals(d.b())){
             d.a().b(new f(this));
          }
       }
       return "";
    }
    public String getOaidInner(){
       Object obj = PatchProxy.apply(null, this, OaidHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (t.c().f() || !this.channelControl()) {
          return this.getIdImpl(1);
       }
       if (this.mContext != null && (!TextUtils.isEmpty(OaidHelper.OAID) && !(OaidHelper.OAID).startsWith("KWE"))) {
          return OaidHelper.OAID;
       }
       return "KWE_NU";
    }
    public final void handleTraverseComponentIntent(){
       if (PatchProxy.applyVoid(null, this, OaidHelper.class, "12")) {
          return;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29 && sDK_INT <= 32) {
          OaidHelper tmCdOAID = this.mCdOAID;
          if (tmCdOAID != null && tmCdOAID.getCount() > 0) {
             d.a().c(new k(this), 100);
          }
       }
       return;
    }
    public void initOAIDImpl(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OaidHelper.class, "10")) {
          return;
       }
       if (this.mContext == null) {
          this.mContext = p0;
       }
       if (!t.c().f() && this.channelControl()) {
          l.c("OaHelper check privacy false!!");
          if (!OaidHelper.mIsPrivacyChecked.compareAndSet(false, true)) {
             l.c("OaHelper check privacy again£¡return");
             return;
          }else if(this.mPre == null){
             this.mPre = new y(this.mContext);
          }
          if (!d.D(this.mContext)) {
             OaidHelper.OAID = this.mPre.q();
          }
          if (m.c()) {
             OaidHelper.ROME_INDEX = "7";
          }else if(m.b() || m.d()){
             OaidHelper.ROME_INDEX = "1";
          }else if(!m.g() && (m.h() || m.i())){
             OaidHelper.ROME_INDEX = "4";
          }else if(m.f()){
             OaidHelper.ROME_INDEX = "2";
          }else if(m.e() || m.j()){
             OaidHelper.ROME_INDEX = "5";
          }else if(m.m()){
             if (m.l()) {
                OaidHelper.ROME_INDEX = "6";
             }else if(m.k()){
                OaidHelper.ROME_INDEX = "3";
             }
          }
          return;
       }else {
          this.initSdk(p0, new g(this));
          return;
       }
    }
    public void initSdk(Context p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OaidHelper.class, "3")) {
          return;
       }
       if (!OaidHelper.mIsInited.compareAndSet(false, true)) {
          l.c("OaHelper has been initialized,return");
          return;
       }else if(this.mPre == null){
          this.mPre = new y(this.mContext);
       }
       this.S_TIME = System.currentTimeMillis();
       if (Build$VERSION.SDK_INT >= 29) {
          if (!(p0.getPackageName()).equals(d.b())) {
             l.c("call initOAID in diff proc");
             return;
          }else {
             this.mCdOAID = new CountDownLatch(true);
             l.c("call initOAID cdoaid");
          }
       }
       Thread thread = new Thread(new e(this, p0, p1));
       thread.setName("dfp_oaid_thread");
       thread.start();
       return;
    }
    public void oaidGetterImpl(Context p0,a p1){
       a uoa;
       Cursor uCursor;
       a a;
       boolean i1;
       String str6;
       HashMap hashMap;
       String str8;
       String str9;
       String str10;
       i oi;
       d uod2;
       Object obj5;
       Object[] objArray;
       Object obj6;
       d obj7;
       a obj = this;
       String obj1 = p0;
       Object obj2 = p1;
       m om = m.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "4";
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, OaidHelper.class, str)) {
          return;
       }
       if (m.c()) {
          OaidHelper.ROME_INDEX = "7";
          new a(obj1).a(obj2);
       }else {
          String str1 = "1";
          if (m.b() || m.d()) {
             OaidHelper.ROME_INDEX = str1;
             new a(obj1).a(obj2);
          }else {
             String str2 = "OAID query failed";
             if (!m.g() && (m.h() || m.i())) {
                OaidHelper.ROME_INDEX = str;
                obj = new a(obj1);
                if (PatchProxy.applyVoidOneRefs(obj2, obj, a.class, str1) || (obj.a != null && obj2 != null)) {
                   if (obj.b == null || obj.c == null) {
                      obj2.b("Xiaomi IdProvider not exists");
                   }else {
                      obj1 = obj.b();
                      if (obj1 != null && obj1.length()) {
                         obj2.a(obj1);
                      }else {
                         throw new IllegalStateException(str2);
                      }
                   }
                }
             }else {
                str = "value";
                String str3 = "2";
                if (m.f()) {
                   OaidHelper.ROME_INDEX = str3;
                   uoa = new a(obj1);
                   if (PatchProxy.applyVoidOneRefs(obj2, uoa, a.class, str3) || (uoa.a != null && obj2 != null)) {
                      uCursor = uoa.a.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
                      Objects.requireNonNull(uCursor);
                      uCursor.moveToFirst();
                      obj1 = uCursor.getString(uCursor.getColumnIndex(str));
                      if (obj1 != null && obj1.length()) {
                         obj2.a(obj1);
                         uCursor.close();
                      }else {
                         throw new IllegalStateException(str2);
                      }
                   }
                }else {
                   String str4 = "";
                   String str5 = "not support";
                   ArrayList uArrayList = null;
                   Context uContext = 1;
                   int i = 0;
                   if (m.e() || m.j()) {
                      OaidHelper.ROME_INDEX = "5";
                      obj.mCheckClassName = "com.heytap.openid.IdentifyService";
                      obj.mCheckClassName_sec = "com.oplus.stdid.IdentifyService";
                      this.handleTraverseComponentIntent();
                      uoa = new a(obj1);
                      if (!PatchProxy.applyVoidOneRefs(obj2, uoa, a.class, str1)) {
                         a = uoa.a;
                         if (a != null && obj2 != null) {
                            a.a(a);
                            a = (g.b || g.c)? 1: null;
                            if (!a) {
                               obj2.b(str5);
                            }else {
                               a = uoa.a;
                               int f = a.f;
                               i1 = 0x2710;
                               ArrayList uArrayList1 = (f <= h.a && f > 0)? 0x2710: 0x2711;
                               if (uArrayList1 == i1) {
                                  uArrayList1 = new ArrayList();
                                  if ((f & 0x08) == 8) {
                                     uArrayList1.add("OUID");
                                     uArrayList1.add("OUID_STATUS");
                                  }
                                  if ((f & 0x20) == 32 && !uArrayList1.contains("OUID_STATUS")) {
                                     uArrayList1.add("OUID_STATUS");
                                  }
                                  if ((f & 0x02) == 2) {
                                     uArrayList1.add("AUID");
                                  }
                                  str3 = "GUID";
                                  if ((f & 0x10) == 16) {
                                     uArrayList1.add(str3);
                                  }
                                  str5 = "APID";
                                  if ((f & 0x01) == uContext) {
                                     uArrayList1.add(str5);
                                  }
                                  i1 = 4;
                                  if ((f & i1) == i1) {
                                     uArrayList1.add("DUID");
                                  }
                                  if (!g.a || (!g.b && (!g.c || Looper.myLooper() == Looper.getMainLooper()))) {
                                     uContext = null;
                                  }
                                  str6 = "FALSE";
                                  if (!uContext) {
                                     hashMap = new HashMap();
                                     Iterator iterator = uArrayList1.iterator();
                                     while (iterator.hasNext()) {
                                        String str7 = iterator.next();
                                        str3 = (str7 == "OUID_STATUS")? str6: str4;
                                        hashMap.put(str7, str3);
                                     }
                                     str8 = str6;
                                  }else {
                                     c uoc = c.e();
                                     uContext = g.a(a);
                                     Objects.requireNonNull(uoc);
                                     uArrayList = new ArrayList();
                                     if (uoc.a.isEmpty()) {
                                        b a1 = uoc.a;
                                        try{
                                           SharedPreferences sharedPrefer = o.c(uContext, "cache", i);
                                           String str11 = "GUID_TIME";
                                           try{
                                              str8 = str6;
                                              b.f(sharedPrefer, a1, str3, str11, "GUID_IV");
                                              b.f(sharedPrefer, a1, str5, "APID_TIME", "APID_IV");
                                              b.e(sharedPrefer, a1, "DUID", "DUID_TIME");
                                              b.e(sharedPrefer, a1, "AUID", "AUID_TIME");
                                              b.e(sharedPrefer, a1, "OUID", "OUID_TIME");
                                              b.e(sharedPrefer, a1, "OUID_STATUS", "OUID_STATUS_TIME");
                                           }catch(java.lang.IllegalStateException e0){
                                           }
                                           if ("1020:"+e0.getMessage() != null) {
                                              e0.getMessage();
                                           }else {
                                              e0.getLocalizedMessage();
                                           }
                                        }catch(java.lang.IllegalStateException e0){
                                           str8 = str6;
                                           goto label_05e6 ;
                                        }
                                     }else {
                                        str8 = str6;
                                     }
                                     Iterator iterator1 = uArrayList1.iterator();
                                     while (iterator1.hasNext()) {
                                        str9 = iterator1.next();
                                        if (uoc.a.containsKey(str9)) {
                                           oi = uoc.a.get(str9);
                                           if (!oi.a(str9)) {
                                              ArrayList uArrayList2 = new ArrayList();
                                              uArrayList2.add(str9);
                                              b.a.execute(new a(uoc, uContext, uArrayList2));
                                           }
                                           oi = oi.a;
                                        }else {
                                           oi = null;
                                        }
                                        if (oi == null) {
                                           uArrayList.add(str9);
                                        }
                                     }
                                     if (!uArrayList.isEmpty()) {
                                        uoc.b(uContext, uArrayList, false);
                                     }
                                     hashMap = new HashMap();
                                     Iterator iterator2 = uArrayList1.iterator();
                                     while (iterator2.hasNext()) {
                                        str6 = iterator2.next();
                                        i oi1 = uoc.a.get(str6);
                                        if (oi1 == null) {
                                           str10 = (str6 == "OUID_STATUS")? str8: str4;
                                        }else {
                                           oi1 = oi1.a;
                                        }
                                        hashMap.put(str6, str10);
                                     }
                                  }
                                  str9 = (hashMap.get("OUID") == null)? str4: hashMap.get("OUID");
                                  str6 = (hashMap.get("OUID_STATUS") == null)? str8: hashMap.get("OUID_STATUS");
                                  f = ("TRUE").equalsIgnoreCase(str6);
                                  str10 = (hashMap.get("AUID") == null)? str4: hashMap.get("AUID");
                                  if (hashMap.get("DUID") != null) {
                                     str4 = hashMap.get("DUID");
                                  }
                                  obj2.a(new a(str9, f, str4, str10).b);
                               }else {
                                  throw new RuntimeException(uArrayList1+str4);
                               }
                            }
                         }
                      }
                   }else if(m.m()){
                      new a(obj1).a(obj2);
                   }else if(m.l()){
                      OaidHelper.ROME_INDEX = "6";
                      uoa = new a(obj1);
                      if (PatchProxy.applyVoidOneRefs(obj2, uoa, a.class, str3) || (uoa.a != null && obj2 != null)) {
                         String[] stringArray = new String[]{"oaid"};
                         uCursor = uoa.a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, stringArray, null);
                         Objects.requireNonNull(uCursor);
                         uCursor.moveToFirst();
                         obj1 = uCursor.getString(uCursor.getColumnIndex(str));
                         if (obj1 != null && obj1.length()) {
                            obj2.a(obj1);
                            uCursor.close();
                         }else {
                            throw new IllegalStateException(str2);
                         }
                      }
                   }else if(m.k()){
                      OaidHelper.ROME_INDEX = "3";
                      str6 = "com.samsung.android.deviceidservice.DeviceIdService";
                      obj.mCheckClassName = str6;
                      this.handleTraverseComponentIntent();
                      d uod = new d(obj1);
                      d uod1 = d.class;
                      if (PatchProxy.applyVoidOneRefs(obj2, uod, uod1, str3) || (uod.a != null && obj2 != null)) {
                         Intent obj3 = PatchProxy.apply(uArrayList, uod, uod1, str1);
                         if (obj3 != patchProxyRe) {
                            uContext = obj3.booleanValue();
                         }else {
                            uod1 = uod.a;
                            if (uod1 == null || uod1.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", i) == null) {
                               uContext = false;
                            }
                         }
                      }
                   }else {
                      Class[] obj4 = PatchProxy.applyOneRefs(obj1, uArrayList, om, "19");
                      str = "com.coolpad.deviceidsupport";
                      if (obj4 != patchProxyRe) {
                         i1 = obj4.booleanValue();
                      }else {
                         try{
                            p0.getPackageManager().getPackageInfo(str, i);
                            i1 = true;
                         }catch(java.lang.Exception e0){
                            i1 = false;
                         }
                      }
                   }
                }
             }
          }
       }
    label_072d :
       return;
    }
    public void releaseCountDownLatch(){
       if (PatchProxy.applyVoid(null, this, OaidHelper.class, "5")) {
          return;
       }
       OaidHelper tmCdOAID = this.mCdOAID;
       if (tmCdOAID != null) {
          tmCdOAID.countDown();
       }
       return;
    }
    public void traverseComponentIntentImpl(){
       long l;
       Message message;
       if (PatchProxy.applyVoid(null, this, OaidHelper.class, "13")) {
          return;
       }
       l.a("message traverse start");
       l = System.currentTimeMillis();
       MessageQueue queue = Looper.getMainLooper().getQueue();
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i < 5) {
             message = a.a(queue).i("mMessages").d();
             while (true) {
                if (message != null) {
                   if (i1 >= 60) {
                      l.a("reach max! break");
                   label_00ca :
                      i = i + 1;
                      long l1 = 50;
                      try{
                         Thread.sleep(l1);
                         long l2 = System.currentTimeMillis() - e0;
                         l.a("search message end! "+l2);
                      }catch(java.lang.InterruptedException e0){
                      }
                   }else {
                      OaidHelper tmCdOAID = this.mCdOAID;
                      if (tmCdOAID != null && !tmCdOAID.getCount() - null) {
                      }else if(message.getCallback() != null){
                         ComponentName uComponentNa = a.a(message.getCallback()).i("mName").d();
                         if (uComponentNa != null) {
                            String className = uComponentNa.getClassName();
                            l.a("message first RunConnection ComponentName = "+className);
                            if (!TextUtils.isEmpty(className) && (className.equals(this.mCheckClassName) || className.equals(this.mCheckClassName_sec))) {
                               l.a("oaid active dispatch");
                               a.a(message).i("target").d().dispatchMessage(message);
                               return;
                            }
                         }
                      }
                      message = a.a(message).i("next").d();
                      i1 = i1 + 1;
                   }
                }else {
                   goto label_00ca ;
                }
             }
             return;
          }else {
             goto label_00ec ;
          }
       }
       l.a("reach cd! break");
       return;
    }
    public void waitGaidCountDownLatch(){
       if (PatchProxy.applyVoid(null, this, OaidHelper.class, "7")) {
          return;
       }
       OaidHelper tmGaGAID = this.mGaGAID;
       if (tmGaGAID != null && tmGaGAID.getCount() > 0) {
          l.c("awaitGa");
          this.mGaGAID.await(500, TimeUnit.MILLISECONDS);
       }
       return;
    }
    public void waitOaidCountDownLatch(){
       if (PatchProxy.applyVoid(null, this, OaidHelper.class, "6")) {
          return;
       }
       OaidHelper tmCdOAID = this.mCdOAID;
       if (tmCdOAID != null && tmCdOAID.getCount() > 0) {
          l.c("awaitCdOaid");
          this.mCdOAID.await(2000, TimeUnit.MILLISECONDS);
       }
       return;
    }
}
