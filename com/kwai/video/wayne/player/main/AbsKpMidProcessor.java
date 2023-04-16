package com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor$Companion;
import nsd.u;
import java.lang.Object;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.robust.PatchProxyResult;

public abstract class AbsKpMidProcessor	// class@000d4f
{
    public boolean hasKernelPlayer;
    public boolean mAttached;
    public WaynePlayer mPlayer;
    public static final AbsKpMidProcessor$Companion Companion;

    static {
       AbsKpMidProcessor.Companion = new AbsKpMidProcessor$Companion(null);
    }
    public void AbsKpMidProcessor(){
       super();
    }
    public final void attach(WaynePlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsKpMidProcessor.class, "2")) {
          return;
       }
       a.p(p0, "player");
       if (this.mAttached != null) {
          DebugLog.d("AbsKpMidProcessor", "duplicate attach: "+this);
          return;
       }else {
          this.mAttached = true;
          this.mPlayer = p0;
          this.onAttach();
          return;
       }
    }
    public final void detach(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AbsKpMidProcessor.class, "3")) {
          return;
       }
       if (this.mAttached == null) {
          DebugLog.d("AbsKpMidProcessor", "duplicate detach: "+this);
          return;
       }else {
          this.onDetach();
          this.mAttached = false;
          this.mPlayer = objArray;
          return;
       }
    }
    public final boolean getHasKernelPlayer(){
       return this.hasKernelPlayer;
    }
    public final WaynePlayer getMediaPlayer(){
       AbsKpMidProcessor obj = PatchProxy.apply(null, this, AbsKpMidProcessor.class, "1");
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
