package knd.g;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class g extends StannisNotifyObserver	// class@0017e0
{

    public void g(){
       super();
    }
    public void onNotify(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSAuditionManagerV2", "stannis onNotify withType:"+p0, objArray);
       return;
    }
}
