package com.yxcorp.gifshow.relation.intimate.dialog.e$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import cbc.a;
import java.lang.Integer;
import o07.o;

public class e$a implements PopupInterface$h	// class@0018ea
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       a.a("show dialog succeed: "+this.b.i.mStyle);
       this.b.u(p0);
       return;
    }
    public void H(c p0,int p1){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       this.b.s(p0, p1);
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.b.v(p0);
       return;
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
