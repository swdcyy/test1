package com.kuaishou.android.security.KSecurity;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import com.kuaishou.android.security.internal.common.KSecurityContext$Feature;
import com.kuaishou.android.security.internal.common.h$a;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.internal.common.KSecurityContext$Mode;
import com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import com.kuaishou.android.security.internal.init.SecDidProxy;
import com.kuaishou.android.security.internal.common.b;
import com.kuaishou.android.security.bridge.main.a;
import com.kuaishou.android.security.KSecurity$ENV;
import java.lang.Boolean;
import com.kuaishou.android.security.internal.dispatch.JNICLibrary;
import java.lang.Integer;
import org.json.JSONObject;
import com.kuaishou.android.security.base.util.n;
import com.kuaishou.android.security.features.drm.DrmContext;
import java.util.Map;

public class KSecurity	// class@000698
{
    public static long a;
    public static long b;
    public static AtomicBoolean c;
    public static KSecuritySdkILog d;

    static {
       KSecurity.c = new AtomicBoolean(true);
       KSecurity.d = null;
    }
    public void KSecurity(){
       super();
    }
    public static synchronized int Initialize(Context p0,String p1,String p2,KSecuritySdkILog p3){
       _monitor_enter(KSecurity.class);
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, KSecurity.class, "4");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KSecurity.class);
          return obj.intValue();
       }else {
          KSecurity.a = System.currentTimeMillis();
          b.i().h().setProductName("");
          b.i().h().setWithFeature(KSecurityContext$Feature.GUARD);
          b.i().h().setDid("");
          _monitor_exit(KSecurity.class);
          return b.i().a(h.b().a(p0).a(p1).b(p2).a(p3).a(KSecurityContext$Mode.ASYNC).a(KSecurityTrack.getDelegateCb()));
       }
    }
    public static synchronized int Initialize(Context p0,String p1,String p2,String p3,String p4,KSecuritySdkILog p5){
       _monitor_enter(KSecurity.class);
       if (PatchProxy.isSupport(KSecurity.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, KSecurity.class, "1");
          if (obj != PatchProxyResult.class) {
             _monitor_exit(KSecurity.class);
             return obj.intValue();
          }
       }
       _monitor_exit(KSecurity.class);
       return KSecurity.Initialize(p0, p1, p2, p3, p4, "", "", p5, KSecurityContext$Mode.ASYNC);
    }
    public static synchronized int Initialize(Context p0,String p1,String p2,String p3,String p4,KSecuritySdkILog p5,KSecurityContext$Mode p6){
       _monitor_enter(KSecurity.class);
       if (PatchProxy.isSupport(KSecurity.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          Object obj = PatchProxy.apply(objArray, null, KSecurity.class, "3");
          if (obj != PatchProxyResult.class) {
             _monitor_exit(KSecurity.class);
             return obj.intValue();
          }
       }
       KSecurity.a = System.currentTimeMillis();
       _monitor_exit(KSecurity.class);
       return KSecurity.Initialize(p0, p1, p2, p3, p4, "", "", p5, p6);
    }
    public static synchronized int Initialize(Context p0,String p1,String p2,String p3,String p4,String p5,String p6,KSecuritySdkILog p7,KSecurityContext$Mode p8){
       _monitor_enter(KSecurity.class);
       if (PatchProxy.isSupport(KSecurity.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          Object obj = PatchProxy.apply(objArray, null, KSecurity.class, "5");
          if (obj != PatchProxyResult.class) {
             _monitor_exit(KSecurity.class);
             return obj.intValue();
          }
       }
       KSecurity.a = System.currentTimeMillis();
       b.i().h().setProductName(p3);
       b.i().h().setWithFeature(KSecurityContext$Feature.ALL);
       b.i().h().setDid(p4);
       b.i().h().setRdid(p5);
       b.i().h().setRdidtag(p6);
       _monitor_exit(KSecurity.class);
       return b.i().a(h.b().a(p0).a(p1).b(p2).a(p7).a(p8).a(KSecurityTrack.getDelegateCb()));
    }
    public static synchronized int InitializeKuaiShou(Context p0,String p1,String p2,String p3,SecDidProxy p4,KSecuritySdkILog p5,KSecurityContext$Mode p6){
       _monitor_enter(KSecurity.class);
       if (PatchProxy.isSupport(KSecurity.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          Object obj = PatchProxy.apply(objArray, null, KSecurity.class, "2");
          if (obj != PatchProxyResult.class) {
             _monitor_exit(KSecurity.class);
             return obj.intValue();
          }
       }
       KSecurity.a = System.currentTimeMillis();
       KSecurity.a = System.currentTimeMillis();
       b.i().h().setProductName(p3);
       b.i().h().setWithFeature(KSecurityContext$Feature.ALL);
       b.i().h().setSecDidProxy(p4);
       _monitor_exit(KSecurity.class);
       return b.i().a(h.b().a(p0).a(p1).b(p2).a(p5).a(p6).a(KSecurityTrack.getDelegateCb()));
    }
    public static byte[] asymmetricDecrypt(byte[] p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KSecurity.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().a(p0, p1, true, false, "");
    }
    public static byte[] asymmetricEncrypt(byte[] p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KSecurity.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().b(p0, p1, true, false, "");
    }
    public static byte[] atlasDecrypt(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().b(p0, false, "");
    }
    public static byte[] atlasEncrypt(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().a(p0, false, "");
    }
    public static String atlasSign(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSecurity.c.getAndSet(false);
       return b.i().d(p0, false, "");
    }
    public static String atlasSignPlus(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().a(p0, false, "");
    }
    public static String atlasSignPlusIner(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KSecurity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().a(p0, true, p1);
    }
    public static String challenge(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().c(p0, false, "");
    }
    public static String checkEnv(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().b(p0, false, "");
    }
    public static boolean detectEnvironment(KSecurity$ENV p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.i().a(p0, false, "");
    }
    public static void doSentiveWork(boolean p0){
    }
    public static long getAppStartTime(){
       return KSecurity.b;
    }
    public static long getAppTime(){
       return KSecurity.b;
    }
    public static long getDRMBridgeFuncAddr(){
       Object obj = PatchProxy.apply(null, null, KSecurity.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (KSecurity.isInitialize()) {
          l = JNICLibrary.gDBF();
       }
       return l;
    }
    public static long getInitTime(){
       return KSecurity.a;
    }
    public static long getKSBridgeFuncAddr(){
       Object obj = PatchProxy.apply(null, null, KSecurity.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (KSecurity.isInitialize()) {
          l = JNICLibrary.gKSF();
       }
       return l;
    }
    public static String getSecurityValue(int p0){
       KSecurity kSecurity = KSecurity.class;
       if (PatchProxy.isSupport(kSecurity)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, kSecurity, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.i().a(p0, false, "");
    }
    public static KSecurityContext getkSecurityParameterContext(){
       Object obj = PatchProxy.apply(null, null, KSecurity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().h();
    }
    public static boolean isInitialize(){
       Object obj = PatchProxy.apply(null, null, KSecurity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.i().g();
    }
    public static String localChallenge(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().a(false, "", p0);
    }
    public static void sendReportLog(Context p0,String p1,String p2,JSONObject p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, KSecurity.class, "7")) {
          return;
       }
       n.a(p2, p3.toString());
       return;
    }
    public static void setAppStartTime(long p0){
       KSecurity.b = p0;
    }
    public static void setAppTime(long p0){
       KSecurity.b = p0;
    }
    public static void setDRMUserinfo(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KSecurity.class, "24")) {
          return;
       }
       DrmContext.setDid(p2);
       DrmContext.setUid(p1);
       DrmContext.setToken(p0);
       return;
    }
    public static void setDrmDebugHost(boolean p0){
       KSecurity kSecurity = KSecurity.class;
       if (PatchProxy.isSupport(kSecurity) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, kSecurity, "25")) {
          return;
       }
       DrmContext.setIsDebugModel(p0);
       return;
    }
    public static void setInitTime(long p0){
       KSecurity.a = p0;
    }
    public static void setKCObject(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSecurity.class, "26")) {
          return;
       }
       b.i().h().setKeyconfigMap(p0);
       return;
    }
    public static byte[] uDecrypt(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().a(p0, false, false, "");
    }
    public static byte[] uEncrypt(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().b(p0, false, false, "");
    }
}
