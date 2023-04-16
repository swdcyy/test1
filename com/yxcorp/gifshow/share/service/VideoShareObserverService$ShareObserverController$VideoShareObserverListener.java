package com.yxcorp.gifshow.share.service.VideoShareObserverService$ShareObserverController$VideoShareObserverListener;
import com.yxcorp.gifshow.share.service.VideoShareObserver$VideoObserverListener;
import rq4.d;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import zic.m0;
import java.lang.Boolean;

public class VideoShareObserverService$ShareObserverController$VideoShareObserverListener implements VideoShareObserver$VideoObserverListener	// class@001c71
{
    public final WeakReference mActivityWeakReference;
    public final d mDSUserShareClientLog;

    public void VideoShareObserverService$ShareObserverController$VideoShareObserverListener(d p0,WeakReference p1){
       super();
       this.mDSUserShareClientLog = p0;
       this.mActivityWeakReference = p1;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, VideoShareObserverService$ShareObserverController$VideoShareObserverListener.class, "1")) {
          return;
       }
       VideoShareObserverService$ShareObserverController$VideoShareObserverListener tmDSUserShar = this.mDSUserShareClientLog;
       tmDSUserShar.h = 1;
       m0.f(tmDSUserShar, 1, this.mActivityWeakReference.get());
       return;
    }
    public void onStop(boolean p0){
       if (PatchProxy.isSupport(VideoShareObserverService$ShareObserverController$VideoShareObserverListener.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoShareObserverService$ShareObserverController$VideoShareObserverListener.class, "2")) {
          return;
       }
       VideoShareObserverService$ShareObserverController$VideoShareObserverListener tmDSUserShar = this.mDSUserShareClientLog;
       int i = (p0)? 2: 3;
       tmDSUserShar.h = i;
       m0.f(tmDSUserShar, true, this.mActivityWeakReference.get());
       VideoShareObserverService$ShareObserverController$VideoShareObserverListener tmDSUserShar1 = this.mDSUserShareClientLog;
       tmDSUserShar1.h = 5;
       m0.f(tmDSUserShar1, true, this.mActivityWeakReference.get());
       return;
    }
}
