package lr1.a;
import lr1.b;
import androidx.lifecycle.LiveData;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget;
import brd.t;
import java.util.concurrent.TimeUnit;
import lr1.a$a;
import erd.g;
import crd.b;
import krd.a;

public final class a extends b	// class@003009
{
    public final String m;
    public final a n;
    public final p o;

    public void a(LiveData p0,p p1){
       a.p(p0, "userInfo");
       a.p(p1, "updateBitmap");
       super(p0);
       this.o = p1;
       this.m = "LiveMultiLineAnchorAudioStateViewController";
       this.n = new a();
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.F2();
       b.Z(LiveLogTag.LIVE_MULTI_LINE, this.m+" onCreate");
       b uob = this.V2().getFinishUpdateObservable().delay(200, TimeUnit.MILLISECONDS).subscribe(new a$a(this));
       a.o(uob, "audioWidget.getFinishUpd¡­\)\)\)\n          }\n        }");
       a.b(this.n, uob);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.n.dispose();
       return;
    }
}
