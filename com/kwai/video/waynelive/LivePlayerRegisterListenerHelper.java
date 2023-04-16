package com.kwai.video.waynelive.LivePlayerRegisterListenerHelper;
import java.lang.Object;
import java.util.HashMap;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import java.lang.String;
import java.util.Map;
import com.kwai.video.waynelive.cache.LivePlayerCacheType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Enum;
import android.os.Message;
import hw7.b;

public class LivePlayerRegisterListenerHelper	// class@000dd8
{
    public final Map mTokenMap;
    public final Handler mUiHandler;

    public void LivePlayerRegisterListenerHelper(){
       super();
       this.mTokenMap = new HashMap();
       this.mUiHandler = new Handler(Looper.getMainLooper());
    }
    public static void a(LivePlayerRegisterListenerHelper p0,Runnable p1,String p2){
       p0.lambda$startAsyncTask$0(p1, p2);
    }
    private void lambda$startAsyncTask$0(Runnable p0,String p1){
       p0.run();
       this.mTokenMap.remove(p1);
    }
    public void cancelAsyncTask(LivePlayerCacheType p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayerRegisterListenerHelper.class, "2")) {
          return;
       }
       this.cancelAsyncTask(this.getTokenKey(p0, p1));
       return;
    }
    public final void cancelAsyncTask(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerRegisterListenerHelper.class, "4")) {
          return;
       }
       Object obj = this.mTokenMap.get(p0);
       if (obj != null) {
          this.removeUiThreadCallbacksWithToken(obj);
          this.mTokenMap.remove(p0);
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, LivePlayerRegisterListenerHelper.class, "1")) {
          return;
       }
       Iterator iterator = this.mTokenMap.keySet().iterator();
       while (iterator.hasNext()) {
          Object obj = this.mTokenMap.get(iterator.next());
          if (obj != null) {
             this.removeUiThreadCallbacksWithToken(obj);
          }
       }
       this.mTokenMap.clear();
       return;
    }
    public final String getTokenKey(LivePlayerCacheType p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LivePlayerRegisterListenerHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.name()+p1.hashCode();
    }
    public final void removeUiThreadCallbacksWithToken(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerRegisterListenerHelper.class, "7")) {
          return;
       }
       this.mUiHandler.removeCallbacksAndMessages(p0);
       return;
    }
    public final void runOnUiThread(Runnable p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayerRegisterListenerHelper.class, "6")) {
          return;
       }
       Message message = Message.obtain(this.mUiHandler, p0);
       message.obj = p1;
       this.mUiHandler.sendMessageDelayed(message, 0);
       return;
    }
    public void startAsyncTask(LivePlayerCacheType p0,Object p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LivePlayerRegisterListenerHelper.class, "5")) {
          return;
       }
       String tokenKey = this.getTokenKey(p0, p1);
       this.cancelAsyncTask(tokenKey);
       p1 = new Object();
       this.mTokenMap.put(tokenKey, p1);
       this.runOnUiThread(new b(this, p2, tokenKey), p1);
       return;
    }
}
