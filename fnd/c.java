package fnd.c;
import yld.j;
import androidx.fragment.app.Fragment;
import hnd.f;
import android.view.View;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import voc.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import amd.c;
import nsd.u;
import xld.a;
import zmd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jod.a;
import java.util.List;
import com.yxcorp.gifshow.v3.widget.TimelineCoreView;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import com.yxcorp.gifshow.widget.adv.ITimelineView;

public final class c extends j	// class@000e4f
{

    public void c(Fragment p0,f p1,View p2,VideoSDKPlayerView p3,o p4){
       a.p(p0, "fragment");
       a.p(p1, "viewModel");
       a.p(p2, "rootView");
       a.p(p3, "sdkPlayerView");
       a.p(p4, "editorContext");
       super(p2, p1, p0, p3, p4, false, 32, null);
    }
    public void x(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          this.D(p0, p1);
          if (p0.z() != p1.z() && (p1.z() < p0.r().b().size() && (p0.z() < p0.r().b().size() && p0.s()))) {
             this.J().getTimeLineView().v(p0.r().b()).E();
          }
       }
       return;
    }
}
