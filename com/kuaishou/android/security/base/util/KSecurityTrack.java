package com.kuaishou.android.security.base.util.KSecurityTrack;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.base.util.KSecurityTrack$LEVEL;
import java.lang.Throwable;
import java.lang.Integer;
import com.kuaishou.android.security.base.perf.c;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.util.Locale;
import com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.base.util.KSecurityTrack$a;
import java.lang.Long;

public class KSecurityTrack	// class@0006b0
{
    public static KSecurityTrack$IKSecurityTrackCallback b;
    public static boolean c;

    public void KSecurityTrack(){
       super();
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSecurityTrack.class, "5")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.DEBUG, p0, p1, null);
       return;
    }
    public static void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KSecurityTrack.class, "6")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.DEBUG, p0, p1, p2);
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSecurityTrack.class, "12")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.ERROR, p0, p1, null);
       return;
    }
    public static void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KSecurityTrack.class, "13")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.ERROR, p0, p1, p2);
       return;
    }
    public static void eLog(int p0,Throwable p1){
       KSecurityTrack kSecurityTra = KSecurityTrack.class;
       if (PatchProxy.isSupport(kSecurityTra) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, kSecurityTra, "17")) {
          return;
       }
       c.a(p0);
       String kgSessionId = (b.i().j() != null)? b.i().h().getKgSessionId(): "null";
       Object[] objArray = new Object[]{KSecurityTrack.getDelegateCb().getSessionId(),kgSessionId,Integer.valueOf(p0)};
       KSecurityTrack.log(KSecurityTrack$LEVEL.ERROR, "kguard_tracker_key", String.format(Locale.getDefault(), "[%s][%s][%d]", objArray), p1);
       return;
    }
    public static void eLog(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSecurityTrack.class, "18")) {
          return;
       }
       String kgSessionId = (b.i().j() != null)? b.i().h().getKgSessionId(): "null";
       Object[] objArray = new Object[]{KSecurityTrack.getDelegateCb().getSessionId(),kgSessionId,p0};
       KSecurityTrack.log(KSecurityTrack$LEVEL.INFO, "kguard_tracker_key", String.format(Locale.getDefault(), "[%s][%s][%s]", objArray), p1);
       return;
    }
    public static KSecurityTrack$IKSecurityTrackCallback getDelegateCb(){
       KSecurityTrack$a uoa;
       KSecurityTrack$IKSecurityTrackCallback obj = PatchProxy.apply(null, null, KSecurityTrack.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KSecurityTrack.b;
       if (obj == null) {
          uoa = new KSecurityTrack$a();
       }
       return uoa;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSecurityTrack.class, "7")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.INFO, p0, p1, null);
       return;
    }
    public static void i(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KSecurityTrack.class, "8")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.INFO, p0, p1, p2);
       return;
    }
    public static boolean isbEnableTrack(){
       return KSecurityTrack.c;
    }
    public static void log(KSecurityTrack$LEVEL p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, KSecurityTrack.class, "2")) {
          return;
       }
       if (KSecurityTrack.getDelegateCb() != null) {
          KSecurityTrack.getDelegateCb().log(p0, p1, p2, p3);
       }
       return;
    }
    public static void sLog(int p0){
       if (PatchProxy.isSupport(KSecurityTrack.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, KSecurityTrack.class, "14")) {
          return;
       }
       if (KSecurityTrack.isbEnableTrack()) {
          _monitor_enter(KSecurityTrack.class);
          c.b(p0);
          String kgSessionId = (b.i().j() != null)? b.i().h().getKgSessionId(): "null";
          Object[] objArray = new Object[]{KSecurityTrack.getDelegateCb().getSessionId(),kgSessionId,Integer.valueOf(p0)};
          KSecurityTrack.log(KSecurityTrack$LEVEL.INFO, "kguard_tracker_key", String.format(Locale.getDefault(), "[%s][%s][%d]", objArray), null);
          _monitor_exit(KSecurityTrack.class);
       }
       return;
    }
    public static void sLog(int p0,long p1){
       KSecurityTrack kSecurityTra = KSecurityTrack.class;
       if (PatchProxy.isSupport(kSecurityTra) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), null, kSecurityTra, "15")) {
          return;
       }
       if (KSecurityTrack.isbEnableTrack()) {
          c.a(p0, p1);
          String kgSessionId = (b.i().j() != null)? b.i().h().getKgSessionId(): "null";
          Object[] objArray = new Object[]{KSecurityTrack.getDelegateCb().getSessionId(),kgSessionId,Integer.valueOf(p0)};
          KSecurityTrack.log(KSecurityTrack$LEVEL.INFO, "kguard_tracker_key", String.format(Locale.getDefault(), "[%s][%s][%d]", objArray), null);
       }
       return;
    }
    public static void sLog(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSecurityTrack.class, "16")) {
          return;
       }
       String kgSessionId = (b.i().j() != null)? b.i().h().getKgSessionId(): "null";
       Object[] objArray = new Object[]{KSecurityTrack.getDelegateCb().getSessionId(),kgSessionId,p0};
       KSecurityTrack.log(KSecurityTrack$LEVEL.INFO, "kguard_tracker_key", String.format(Locale.getDefault(), "[%s][%s][%s]", objArray), null);
       return;
    }
    public static void setDelegate(KSecurityTrack$IKSecurityTrackCallback p0){
       KSecurityTrack.b = p0;
    }
    public static void setbEnableTrack(boolean p0){
       KSecurityTrack.c = p0;
    }
    public static void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSecurityTrack.class, "3")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.VERBOSE, p0, p1, null);
       return;
    }
    public static void v(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KSecurityTrack.class, "4")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.VERBOSE, p0, p1, p2);
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSecurityTrack.class, "9")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.WARN, p0, p1, null);
       return;
    }
    public static void w(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KSecurityTrack.class, "10")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.WARN, p0, p1, p2);
       return;
    }
    public static void w(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSecurityTrack.class, "11")) {
          return;
       }
       KSecurityTrack.log(KSecurityTrack$LEVEL.WARN, null, p0, p1);
       return;
    }
}
