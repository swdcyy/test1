package hnd.c$g;
import java.lang.Runnable;
import hnd.c;
import zmd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xld.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearActionV3;
import nsd.u;
import tvc.a;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearAction;
import wmd.g;
import wmd.i;

public final class c$g implements Runnable	// class@000f97
{
    public final c b;
    public final a c;
    public final boolean d;

    public void c$g(c p0,a p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       KSStore kSStore;
       if (PatchProxy.applyVoid(null, this, c$g.class, "1")) {
          return;
       }
       if (PostExperimentUtils.G((this.c.u() ^ 0x01))) {
          kSStore = this.b.a();
          if (kSStore != null) {
             SubtitleClearActionV3 subtitleClea = new SubtitleClearActionV3(this.d, false, false, 2, null);
             kSStore.a(v7);
          }
       }else {
          kSStore = this.b.a();
          if (kSStore != null) {
             SubtitleClearAction subtitleClea1 = new SubtitleClearAction(this.d, false, false, 2, null);
             kSStore.a(v7);
          }
       }
       this.b.j.e().f();
       return;
    }
}
