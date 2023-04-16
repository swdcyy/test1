package abc.m;
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
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lnc.i3;
import java.lang.Number;
import k2b.h;
import k2b.e0;
import com.yxcorp.gifshow.relation.intimate.dialog.k;
import com.kwai.library.widget.popup.common.c;

public final class m implements b$b	// class@0000d8
{
    public final i a;

    public void m(i p0){
       this.a = p0;
    }
    public final void a(c p0,View p1,int p2){
       m ta = this.a;
       Objects.requireNonNull(ta);
       if (!p2) {
          e i = ta.i;
          IntimateRelationDialogParams mTargetId = i.mTargetId;
          IntimateRelationDialogParams mIntimateTyp = i.mIntimateType;
          e g = ta.g;
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(mTargetId, Integer.valueOf(mIntimateTyp), g, null, b.class, "37")) {
             i3 oi3 = i3.f();
             oi3.d("click_area", "confirm");
             oi3.d("invite_user_id", mTargetId);
             oi3.c("close_relationship_type", Integer.valueOf(mIntimateTyp));
             h oh = h.k("CONFIRM_RELATIONSHIP_POPUP");
             oh.n(oi3.e());
             oh.i(g);
          }
          ta.n = ta.i.mIntimateType;
          ta.F();
          p0.q(11);
       }
       return;
    }
}
