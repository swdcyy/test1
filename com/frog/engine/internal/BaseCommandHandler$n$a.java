package com.frog.engine.internal.BaseCommandHandler$n$a;
import com.frog.engine.network.webscoket.WebSocketListener;
import com.frog.engine.internal.BaseCommandHandler$n;
import com.frog.engine.network.webscoket.WebSocketRequest;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.FrogCallGameListener;
import com.frog.engine.internal.CommandExpandFuncListener;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class BaseCommandHandler$n$a implements WebSocketListener	// class@001520
{
    public final WebSocketRequest a;
    public final BaseCommandHandler$n b;

    public void BaseCommandHandler$n$a(BaseCommandHandler$n p0,WebSocketRequest p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onClose(int p0,String p1){
       BaseCommandHandler$n$a on$a = BaseCommandHandler$n$a.class;
       if (PatchProxy.isSupport(on$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, on$a, "4")) {
          return;
       }
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       uFrogJSObjec.put("taskId", this.a.taskId);
       uFrogJSObjec.put("code", p0);
       uFrogJSObjec.put("reason", p1);
       BaseCommandHandler mSendListene = this.b.a.mSendListener;
       if (mSendListene != null) {
          mSendListene.sendCommandToNativeGame("ks.webSocket.onClose", uFrogJSObjec, null);
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseCommandHandler$n$a.class, "5")) {
          return;
       }
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       uFrogJSObjec.put("taskId", this.a.taskId);
       uFrogJSObjec.put("errMsg", p0.getMessage());
       BaseCommandHandler mSendListene = this.b.a.mSendListener;
       if (mSendListene != null) {
          mSendListene.sendCommandToNativeGame("ks.webSocket.onError", uFrogJSObjec, null);
       }
       return;
    }
    public void onMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseCommandHandler$n$a.class, "2")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          uFrogJSObjec.put("taskId", (double)this.a.taskId);
          uFrogJSObjec.put("data", p0);
          BaseCommandHandler mSendListene = this.b.a.mSendListener;
          if (mSendListene != null) {
             mSendListene.sendCommandToNativeGame("ks.webSocket.onMessage", uFrogJSObjec, null);
          }
       }
       return;
    }
    public void onMessage(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseCommandHandler$n$a.class, "3")) {
          return;
       }
       if (p0 != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          uFrogJSObjec.put("data", p0.array());
          uFrogJSObjec.put("taskId", this.a.taskId);
          BaseCommandHandler mSendListene = this.b.a.mSendListener;
          if (mSendListene != null) {
             mSendListene.sendCommandToNativeGame("ks.webSocket.onMessage", uFrogJSObjec, null);
          }
       }
       return;
    }
    public void onOpen(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseCommandHandler$n$a.class, "1")) {
          return;
       }
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          uFrogJSObjec.put(key, uEntry.getValue());
       }
       uFrogJSObjec.put("taskId", this.a.taskId);
       BaseCommandHandler mSendListene = this.b.a.mSendListener;
       if (mSendListene != null) {
          mSendListene.sendCommandToNativeGame("ks.webSocket.onOpen", uFrogJSObjec, null);
       }
       return;
    }
}
