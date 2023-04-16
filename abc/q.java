package abc.q;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.intimate.dialog.i;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import cbc.b;
import lnc.i3;
import k2b.f3;
import k2b.e0;
import java.lang.Integer;
import o07.o;

public class q implements PopupInterface$h	// class@0000dc
{
    public final i b;

    public void q(i p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       q tb = this.b;
       IntimateRelationDialogParams mTargetId = tb.i.mTargetId;
       e g = tb.g;
       if (!PatchProxy.applyVoidTwoRefs(mTargetId, g, null, b.class, "32")) {
          i3 oi3 = i3.f();
          oi3.d("apply_uid", mTargetId);
          f3 uof3 = f3.l("3481917", "APPLY_AGAIN_POPUP");
          uof3.m(oi3.e());
          uof3.h(g);
       }
       return;
    }
    public void H(c p0,int p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oq, "2")) {
          return;
       }
       if (p1 != 10) {
          oq = this.b;
          IntimateRelationDialogParams mTargetId = oq.i.mTargetId;
          e g = oq.g;
          if (!PatchProxy.applyVoidTwoRefs(mTargetId, g, null, b.class, "34")) {
             b.b(mTargetId, "cancel", g);
          }
          i.D(this.b, p0, p1);
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
