package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$CompletionListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.waynelive.listeners.LivePlayerCompleteListener;
import com.kwai.video.waynelive.wayneplayer.LiveDataSourceProvider;
import com.kwai.video.player.IMediaPlayer;
import ekd.k1;
import mw7.h;
import java.lang.Runnable;

public class WayneLivePlayer$CompletionListener implements IMediaPlayer$OnCompletionListener	// class@000e46
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$CompletionListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$CompletionListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public final void notifyOnCompletion(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer$CompletionListener.class, "2")) {
          return;
       }
       WayneLivePlayer$CompletionListener tthis$0 = this.this$0;
       tthis$0.mIsComplete = true;
       Iterator iterator = tthis$0.mCompletionListenerList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onLiveComplete();
       }
       this.this$0.mLiveDataSourceManager.trySwitchUrlWhenPlayerCriticalError(0, 0);
       return;
    }
    public void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$CompletionListener.class, "1")) {
          return;
       }
       if (!k1.g()) {
          k1.p(new h(this), this.this$0);
       }else {
          this.notifyOnCompletion();
       }
       return;
    }
}
