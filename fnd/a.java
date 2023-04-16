package fnd.a;
import com.yxcorp.gifshow.widget.m;
import fnd.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msd.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineDetachAction;
import nsd.u;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class a extends m	// class@000e4d
{
    public final b c;

    public void a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.c.j.invoke();
       DecorationTimelineDetachAction uDecorationT = new DecorationTimelineDetachAction(false, false, false, 6, null);
       this.c.c.t0(v6);
       return;
    }
}
