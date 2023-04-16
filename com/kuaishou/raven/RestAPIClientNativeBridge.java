package com.kuaishou.raven.RestAPIClientNativeBridge;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayDeque;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.kuaishou.raven.RestAPIClientNativeBridge$b;
import java.lang.CharSequence;
import es4.b;
import com.kuaishou.raven.b;
import java.lang.Number;
import com.kuaishou.raven.RestAPIClientNativeBridge$a;
import com.kuaishou.raven.b$a;

public class RestAPIClientNativeBridge	// class@000e91
{
    public static final int ERR_BAD_HTTP_CODE_4xx_OTHER = 65387;
    public static final int ERR_BAD_HTTP_CODE_5xx_OTHER = 65377;
    public static final int ERR_BAD_HTTP_CODE_OTHER = 65376;
    public static final int ERR_BASE_BAD_HTTP_CODE_40x = 65396;
    public static final int ERR_BASE_BAD_HTTP_CODE_50x = 65386;
    public static final int ERR_HTTP_NETWORK_FAILURE = 65375;
    public static ArrayDeque liveParamDeque;
    public static b sChannel;
    public static b sClient;
    public static AtomicLong sRequestCounter;

    static {
       RestAPIClientNativeBridge.sRequestCounter = new AtomicLong();
       RestAPIClientNativeBridge.liveParamDeque = new ArrayDeque();
    }
    public void RestAPIClientNativeBridge(){
       super();
    }
    public static String GetAnchorId(String p0){
       RestAPIClientNativeBridge$b uob;
       ArrayDeque obj = PatchProxy.applyOneRefs(p0, null, RestAPIClientNativeBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RestAPIClientNativeBridge.liveParamDeque;
       _monitor_enter(obj);
       Iterator iterator = RestAPIClientNativeBridge.liveParamDeque.iterator();
       while (true) {
          if (iterator.hasNext()) {
             uob = iterator.next();
             if ((uob.a).contains(p0)) {
                break ;
             }
          }else {
             _monitor_exit(obj);
             return "";
          }
       }
       _monitor_exit(obj);
       return uob.b;
    }
    public static String GetClientInfo(){
       b obj = PatchProxy.apply(null, null, RestAPIClientNativeBridge.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RestAPIClientNativeBridge.sChannel;
       if (obj == null) {
          return "";
       }
       return obj.c();
    }
    public static String GetClientKswitchConfig(){
       b obj = PatchProxy.apply(null, null, RestAPIClientNativeBridge.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RestAPIClientNativeBridge.sChannel;
       if (obj == null) {
          return "";
       }
       return obj.a();
    }
    public static void Initialize(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, RestAPIClientNativeBridge.class, "1")) {
          return;
       }
       RestAPIClientNativeBridge.sClient = p0;
       RestAPIClientNativeBridge.sChannel = p1;
       RestAPIClientNativeBridge.nativeSetInitialized();
       return;
    }
    public static long Request(String p0,byte[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RestAPIClientNativeBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (RestAPIClientNativeBridge.sClient == null) {
          return -1;
       }
       long andIncrement = RestAPIClientNativeBridge.sRequestCounter.getAndIncrement();
       RestAPIClientNativeBridge.sClient.a(p0, p1, new RestAPIClientNativeBridge$a(andIncrement));
       return andIncrement;
    }
    public static void SetJavaMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, RestAPIClientNativeBridge.class, "5")) {
          return;
       }
       b sChannel = RestAPIClientNativeBridge.sChannel;
       if (sChannel == null) {
          return;
       }
       sChannel.b(p0);
       return;
    }
    public static void SetLiveRavenParam(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, RestAPIClientNativeBridge.class, "3")) {
          return;
       }
       ArrayDeque liveParamDeq = RestAPIClientNativeBridge.liveParamDeque;
       _monitor_enter(liveParamDeq);
       RestAPIClientNativeBridge$b uob = new RestAPIClientNativeBridge$b();
       uob.a = p0;
       uob.b = p1;
       RestAPIClientNativeBridge.liveParamDeque.offer(uob);
       if (RestAPIClientNativeBridge.liveParamDeque.size() > 30) {
          RestAPIClientNativeBridge.liveParamDeque.poll();
       }
       _monitor_exit(liveParamDeq);
       return;
    }
    public static native void nativeOnResult(long p0,int p1,byte[] p2);
    public static native void nativeSetInitialized();
}
