package com.yxcorp.gifshow.relation.intimate.dialog.i$a;
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
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import k2b.f3;
import k2b.e0;
import k2b.h;
import o07.o;

public class i$a implements PopupInterface$h	// class@0018f2
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       i$a tb = this.b;
       e i = tb.i;
       IntimateRelationDialogParams mTargetId = i.mTargetId;
       IntimateRelationDialogParams mIntimateTyp = i.mIntimateType;
       e g = tb.g;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(mTargetId, Integer.valueOf(mIntimateTyp), g, null, b.class, "36")) {
          i3 oi3 = i3.f();
          oi3.d("invite_user_id", mTargetId);
          oi3.c("close_relationship_type", Integer.valueOf(mIntimateTyp));
          f3 uof3 = f3.j("CONFIRM_RELATIONSHIP_POPUP");
          uof3.m(oi3.e());
          uof3.h(g);
       }
       return;
    }
    public void H(c p0,int p1){
       e i;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (p1 != 11) {
          uoa = this.b;
          i = uoa.i;
          IntimateRelationDialogParams mTargetId = i.mTargetId;
          IntimateRelationDialogParams mIntimateTyp = i.mIntimateType;
          e g = uoa.g;
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(mTargetId, Integer.valueOf(mIntimateTyp), g, null, b.class, "38")) {
             i3 oi3 = i3.f();
             oi3.d("click_area", "cancel");
             oi3.d("invite_user_id", mTargetId);
             oi3.c("close_relationship_type", Integer.valueOf(mIntimateTyp));
             h oh = h.k("CONFIRM_RELATIONSHIP_POPUP");
             oh.n(oi3.e());
             oh.i(g);
          }
       }
       i.C(this.b, p0, p1);
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
