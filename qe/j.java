package qe.j;
import java.lang.Object;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.WritableMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Long;
import java.lang.Throwable;
import java.net.SocketTimeoutException;
import java.lang.StringBuilder;
import com.facebook.base.tracing.TracingManager;

public class j	// class@0029ce
{

    public void j(){
       super();
    }
    public static void a(DeviceEventManagerModule$RCTDeviceEventEmitter p0,int p1,WritableMap p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, j.class, "5")) {
          return;
       }
       WritableArray writableArra = Arguments.createArray();
       writableArra.pushInt(p1);
       writableArra.pushMap(p2);
       if (p0 != null) {
          p0.emit("didReceiveNetworkData", writableArra);
       }
       return;
    }
    public static void b(DeviceEventManagerModule$RCTDeviceEventEmitter p0,int p1,String p2,long p3,long p4){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Long.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, oj, "2")) {
             return;
          }
       }
       WritableArray writableArra = Arguments.createArray();
       writableArra.pushInt(p1);
       writableArra.pushString(p2);
       writableArra.pushInt((int)p3);
       writableArra.pushInt((int)p4);
       if (p0 != null) {
          p0.emit("didReceiveNetworkIncrementalData", writableArra);
       }
       return;
    }
    public static void c(DeviceEventManagerModule$RCTDeviceEventEmitter p0,int p1,String p2,Throwable p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, j.class, "6")) {
          return;
       }
       WritableArray writableArra = Arguments.createArray();
       writableArra.pushInt(p1);
       writableArra.pushString(p2);
       if (p3 != null && p3.getClass() == SocketTimeoutException.class) {
          writableArra.pushBoolean(true);
       }
       if (p0 != null) {
          p0.emit("didCompleteNetworkResponse", writableArra);
       }
       TracingManager.c("sendRequest"+p1);
       return;
    }
    public static void d(DeviceEventManagerModule$RCTDeviceEventEmitter p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oj, "7")) {
          return;
       }
       WritableArray writableArra = Arguments.createArray();
       writableArra.pushInt(p1);
       writableArra.pushNull();
       if (p0 != null) {
          p0.emit("didCompleteNetworkResponse", writableArra);
       }
       TracingManager.c("sendRequest"+p1);
       return;
    }
}
