package com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$PCMAvailableListener;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$1;
import com.kwai.video.player.IMediaPlayer;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.waynelive.listeners.LivePlayerOnAudioProcessPCMAvailableListener;
import java.nio.Buffer;

public class LivePlayerStatusMonitorImpl$PCMAvailableListener implements KsMediaPlayer$OnAudioProcessPCMListener	// class@000e2e
{
    public final LivePlayerStatusMonitorImpl this$0;

    public void LivePlayerStatusMonitorImpl$PCMAvailableListener(LivePlayerStatusMonitorImpl p0){
       this.this$0 = p0;
       super();
    }
    public void LivePlayerStatusMonitorImpl$PCMAvailableListener(LivePlayerStatusMonitorImpl p0,LivePlayerStatusMonitorImpl$1 p1){
       super(p0);
    }
    public void onAudioProcessPCMAvailable(IMediaPlayer p0,ByteBuffer p1,long p2,int p3,int p4,int p5,double p6){
       LivePlayerStatusMonitorImpl$PCMAvailableListener pCMAvailable = this;
       object oobject = p1;
       LivePlayerStatusMonitorImpl$PCMAvailableListener pCMAvailable1 = LivePlayerStatusMonitorImpl$PCMAvailableListener.class;
       if (PatchProxy.isSupport(pCMAvailable1)) {
          Object[] objArray = new Object[]{p0,oobject,Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Double.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, pCMAvailable1, "1")) {
             return;
          }
       }
       Iterator iterator = pCMAvailable.this$0.mPCMAvailableListeners.iterator();
       while (iterator.hasNext()) {
          ByteBuffer uByteBuffer = ByteBuffer.allocate(p1.capacity());
          p1.rewind();
          uByteBuffer.put(p1);
          p1.rewind();
          uByteBuffer.flip();
          iterator.next().onAudioProcessPCMAvailable(p1, p2, p3, p4, p5, p6);
       }
       return;
    }
}
