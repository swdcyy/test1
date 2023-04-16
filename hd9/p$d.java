package hd9.p$d;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import hd9.p;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.followshoot.f$f;

public final class p$d implements KsMediaPlayer$OnAudioProcessPCMListener	// class@002623
{
    public final p a;

    public void p$d(p p0){
       this.a = p0;
       super();
    }
    public final void onAudioProcessPCMAvailable(IMediaPlayer p0,ByteBuffer p1,long p2,int p3,int p4,int p5,double p6){
       p$d uod = p$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Double.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uod, "1")) {
             return;
          }
       }
       p e = this.a.e;
       if (e != null) {
          e.a(p1, p2, p3, p4);
       }
       return;
    }
}
