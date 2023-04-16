package b4d.q$a;
import uid.i;
import b4d.q;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.EditText;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import brd.y;

public class q$a extends i	// class@000387
{
    public final q d;

    public void q$a(q p0,long p1){
       this.d = p0;
       super(p1);
    }
    public boolean a(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, q$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!this.d.t.hasFocus()) {
          this.d.P8();
          n.a0(this.d.getActivity(), this.d.t, 10);
       }
       q u = this.d.u;
       if (u != null && !u.getVisibility()) {
          this.d.q.Yi(false);
       }
       this.d.q.Ji();
       this.d.s.onNext(Boolean.TRUE);
       return false;
    }
}
