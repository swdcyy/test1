package com.kwai.chat.kwailink.utils.CustomHandlerThread;
import java.lang.String;
import java.lang.Object;
import android.os.HandlerThread;
import com.kwai.chat.kwailink.utils.CustomHandlerThread$1;
import android.os.Looper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import android.os.Handler;
import java.lang.Runnable;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;

public class CustomHandlerThread	// class@000a72
{
    public Handler mHandler;
    public final HandlerThread mHandlerThread;

    public void CustomHandlerThread(String p0){
       super(p0, 0);
    }
    public void CustomHandlerThread(String p0,int p1){
       super();
       HandlerThread handlerThrea = new HandlerThread(p0, p1);
       this.mHandlerThread = handlerThrea;
       handlerThrea.start();
       this.mHandler = new CustomHandlerThread$1(this, handlerThrea.getLooper());
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, CustomHandlerThread.class, "7")) {
          return;
       }
       try{
          this.mHandlerThread.quitSafely();
          this.mHandler = null;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, CustomHandlerThread.class, "8")) {
          return;
       }
       try{
          this.destroy();
          return;
       }catch(java.lang.Exception e0){
       }catch(java.lang.Error e0){
       }
    }
    public Message obtainMessage(){
       CustomHandlerThread obj = PatchProxy.apply(null, this, CustomHandlerThread.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mHandler;
       if (obj != null) {
          return obj.obtainMessage();
       }
       return null;
    }
    public final boolean post(Runnable p0){
       CustomHandlerThread obj = PatchProxy.applyOneRefs(p0, this, CustomHandlerThread.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mHandler;
       if (obj != null) {
          return obj.post(p0);
       }
       return false;
    }
    public final boolean postDelayed(Runnable p0,long p1){
       CustomHandlerThread uCustomHandl = CustomHandlerThread.class;
       if (PatchProxy.isSupport(uCustomHandl)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uCustomHandl, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uCustomHandl = this.mHandler;
       if (uCustomHandl != null) {
          return uCustomHandl.postDelayed(p0, p1);
       }else {
          return false;
       }
    }
    public void processMessage(Message p0){
    }
    public void removeMessage(int p0){
       CustomHandlerThread uCustomHandl = CustomHandlerThread.class;
       if (PatchProxy.isSupport(uCustomHandl) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCustomHandl, "3")) {
          return;
       }
       uCustomHandl = this.mHandler;
       if (uCustomHandl != null) {
          uCustomHandl.removeMessages(p0);
       }
       return;
    }
    public void removeRunnable(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomHandlerThread.class, "4")) {
          return;
       }
       CustomHandlerThread tmHandler = this.mHandler;
       if (tmHandler != null) {
          tmHandler.removeCallbacks(p0);
       }
       return;
    }
    public void sendMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomHandlerThread.class, "2")) {
          return;
       }
       CustomHandlerThread tmHandler = this.mHandler;
       if (tmHandler != null) {
          tmHandler.sendMessage(p0);
       }
       return;
    }
}
