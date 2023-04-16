package com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor$Companion;
import nsd.u;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.robust.PatchProxyResult;

public abstract class AbsWayneProcessor	// class@000e1c
{
    public boolean hasKernelPlayer;
    public boolean mAttached;
    public WayneLivePlayer mPlayer;
    public static final AbsWayneProcessor$Companion Companion;

    static {
       AbsWayneProcessor.Companion = new AbsWayneProcessor$Companion(null);
    }
    public void AbsWayneProcessor(){
       super();
    }
    public final void attach(WayneLivePlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsWayneProcessor.class, "2")) {
          return;
       }
       a.p(p0, "player");
       if (this.mAttached != null) {
          DebugLog.d("AbsWayneProcessor", "duplicate attach: "+this);
          return;
       }else {
          this.mAttached = true;
          this.mPlayer = p0;
          this.onAttach();
          return;
       }
    }
    public final void detach(){
       if (PatchProxy.applyVoid(null, this, AbsWayneProcessor.class, "3")) {
          return;
       }
       if (this.mAttached != null) {
          this.onDetach();
       }
       this.mAttached = false;
       this.mPlayer = null;
       return;
    }
    public final boolean getHasKernelPlayer(){
       return this.hasKernelPlayer;
    }
    public final WayneLivePlayer getMediaPlayer(){
       AbsWayneProcessor obj = PatchProxy.apply(null, this, AbsWayneProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPlayer;
       a.m(obj);
       return obj;
    }
    public final boolean isAttach(){
       return this.mAttached;
    }
    public abstract void onAttach();
    public abstract void onDetach();
    public void onKernelPlayerCreated(){
       this.hasKernelPlayer = true;
    }
    public void onKernelPlayerDestroy(){
       this.hasKernelPlayer = false;
    }
}
