package abc.l;
import a17.b$b;
import com.yxcorp.gifshow.relation.intimate.dialog.i;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import cbc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import ok.x;
import java.lang.Boolean;
import com.kwai.library.widget.popup.common.c;

public final class l implements b$b	// class@0000d7
{
    public final i a;

    public void l(i p0){
       this.a = p0;
    }
    public final void a(c p0,View p1,int p2){
       l ta = this.a;
       Objects.requireNonNull(ta);
       if (!p2) {
          IntimateRelationDialogParams mTargetId = ta.i.mTargetId;
          e g = ta.g;
          if (!PatchProxy.applyVoidTwoRefs(mTargetId, g, null, b.class, "33")) {
             b.b(mTargetId, "confirm", g);
          }
          ta.s = false;
          if (ta.i.mIntimateType > null && (!ta.t.get().booleanValue() && ta.i.mEnableIntimateEntranceIntensify == null)) {
             ta.H();
          }else {
             ta.x();
          }
          p0.q(10);
       }
       return;
    }
}
