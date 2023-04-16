package b4d.q$b;
import com.yxcorp.gifshow.widget.m;
import b4d.q;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Boolean;
import brd.y;

public class q$b extends m	// class@000388
{
    public final q c;

    public void q$b(q p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$b.class, "1")) {
          return;
       }
       if (!this.c.t.hasFocus()) {
          this.c.P8();
          n.a0(this.c.getActivity(), this.c.t, 10);
       }
       q u = this.c.u;
       if (u != null && !u.getVisibility()) {
          this.c.q.Yi(false);
       }
       this.c.q.Ji();
       this.c.s.onNext(Boolean.TRUE);
       return;
    }
}
