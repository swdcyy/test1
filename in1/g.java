package in1.g;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import java.lang.Object;
import java.util.LinkedHashSet;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import msd.p;

public final class g implements IMediaPlayer$OnVideoSizeChangedListener	// class@002966
{
    public final Set b;

    public void g(){
       super();
       this.b = new LinkedHashSet();
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, og, "1")) {
             return;
          }
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().invoke(Integer.valueOf(p1), Integer.valueOf(p2));
       }
       return;
    }
}
