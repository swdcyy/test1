package com.kwai.video.krtc.EglContextHolder;
import java.lang.Object;
import com.kwai.video.krtc.GL.EglBase;
import com.kwai.video.krtc.GL.EglBase$Context;
import java.lang.String;
import java.lang.Throwable;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.EglContextHolder$1;
import com.kwai.video.krtc.EglContextHolder$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class EglContextHolder	// class@00073f
{
    public EglBase$Context sharedContext;
    public static final String TAG = "com.kwai.video.krtc.EglContextHolder";
    public static boolean forceUseEgl10;

    public void EglContextHolder(){
       try{
          super();
          this.sharedContext = (EglContextHolder.forceUseEgl10)? EglBase.createEgl10(EglBase.CONFIG_PLAIN).getEglBaseContext(): EglBase.create().getEglBaseContext();
       }catch(java.lang.Exception e0){
          Log.e(EglContextHolder.TAG, "EglBase.create\(\).getEglBaseContext\(\) failed", e0);
          this.sharedContext = null;
       }
       return;
    }
    public void EglContextHolder(EglContextHolder$1 p0){
       super();
    }
    public static void forceUseEgl10(){
       EglContextHolder.forceUseEgl10 = true;
    }
    public static EglContextHolder getInstance(){
       return EglContextHolder$a.a;
    }
    public static boolean isEgl14Context(){
       Object obj = PatchProxy.apply(null, null, EglContextHolder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return EglBase.isEgl14Context(EglContextHolder.sharedContext());
    }
    public static EglBase$Context sharedContext(){
       Object obj = PatchProxy.apply(null, null, EglContextHolder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EglContextHolder.getInstance().sharedContext;
    }
}
