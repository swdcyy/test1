package lr1.b;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.View;
import androidx.lifecycle.Transformations;
import lr1.b$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kwai.robust.PatchProxyResult;

public class b extends ViewController	// class@00300b
{
    public final String j;
    public LiveMultiVideoSceneAudioWidget k;
    public final LiveData l;

    public void b(LiveData p0){
       a.p(p0, "userInfo");
       super();
       this.l = p0;
       this.j = "LiveAnchorMultiLineAudioStateViewController";
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_MULTI_LINE, this.j+" onCreate");
       LiveMultiVideoSceneAudioWidget liveMultiVid = new LiveMultiVideoSceneAudioWidget(this.D2());
       this.k = liveMultiVid;
       liveMultiVid.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       b tk = this.k;
       if (tk == null) {
          a.S("audioWidget");
       }
       this.R2(tk);
       LiveData liveData = Transformations.distinctUntilChanged(this.l);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(this, new b$a(this));
       return;
    }
    public final LiveMultiVideoSceneAudioWidget V2(){
       b obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("audioWidget");
       }
       return obj;
    }
}
