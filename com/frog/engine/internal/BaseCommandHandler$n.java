package com.frog.engine.internal.BaseCommandHandler$n;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.network.webscoket.WebSocketRequest;
import com.frog.engine.network.webscoket.WebSocketManagerImpl;
import com.frog.engine.network.FrogExternalInterceptor;
import android.util.Pair;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.frog.engine.internal.FrogLog;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import com.frog.engine.internal.BaseCommandHandler$n$a;
import com.frog.engine.network.webscoket.WebSocketListener;

public class BaseCommandHandler$n extends FrogAsyncRequestListener	// class@001521
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$n(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$n.class, "1")) {
          return;
       }
       if (this.a.checkParamInvalid(p0, p1)) {
          return;
       }
       this.a.callFuncSuccess(p1);
       WebSocketRequest webSocketReq = new WebSocketRequest();
       webSocketReq.taskId = (int)p0.getNumber("taskId");
       webSocketReq.url = p0.getString("url");
       FrogExternalInterceptor interceptor = WebSocketManagerImpl.getInstance().getInterceptor();
       int i = 0;
       if (interceptor != null) {
          Pair pair = interceptor.interceptUrl(webSocketReq.url, 3);
          StringBuilder str = "BASE_COMMAND_CONNECT_SOCKET interWebSocket ";
          int i1 = (pair != null)? pair.first.intValue(): 0;
          FrogLog.d("BaseCommandHandler", str+i1);
          if (pair != null && (pair.first.intValue() && p1 != null)) {
             FrogJSObject uFrogJSObjec = new FrogJSObject();
             FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(pair.first.intValue(), pair.second, null), uFrogJSObjec);
             p1.onResponse(uFrogJSObjec);
             return;
          }
       }
    label_008e :
       FrogJSObject jSObject = p0.getJSObject("header");
       HashMap hashMap = new HashMap();
       if (jSObject != null) {
          JSONObject jSONObject = new JSONObject();
          FrogJSObject.toJSONObject(jSObject, jSONObject);
          Iterator iterator = jSONObject.keys();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             hashMap.put(str1, jSONObject.optString(str1));
          }
       }
       webSocketReq.headers = hashMap;
       Object[] object = p0.getObject("protocols");
       if (object != null && object.length > 0) {
          ArrayList uArrayList = new ArrayList();
          int len = object.length;
          for (; i < len; i = i + 1) {
             uArrayList.add(String.valueOf(object[i]));
          }
          webSocketReq.protocols = uArrayList;
       }
       webSocketReq.tcpNoDelay = p0.getBoolean("tcpNoDelay");
       webSocketReq.perMessageDeflate = p0.getBoolean("perMessageDeflate");
       String str2 = "timeout";
       if (p0.hasKey(str2)) {
          int i2 = (int)(p0.getNumber(str2) / 0x408f400000000000);
          if (i2 < 0) {
             i2 = 1;
          }
          webSocketReq.timeout = i2;
       }
       WebSocketManagerImpl.getInstance().connect(webSocketReq, new BaseCommandHandler$n$a(this, webSocketReq));
       return;
    }
}
