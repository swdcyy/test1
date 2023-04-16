package com.yxcorp.gifshow.dialog.kem.h$d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.dialog.kem.h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import x9a.d0;
import x9a.j0;
import i89.d;
import i89.c;
import com.yxcorp.gifshow.model.response.dialog.KemCommonVideoDialogResponse;
import brd.t;
import crd.b;
import java.lang.Integer;

public final class h$d implements PopupInterface$h	// class@001abe
{
    public final h b;

    public void h$d(h p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       j0.m(this.b.b(), 72);
       c.a().b(this.b.b().mActivityId).subscribe();
       return;
    }
    public void H(c p0,int p1){
       h$d uod = h$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       j0.l(this.b.b(), 72, p1);
       return;
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "3")) {
          return;
       }
       a.p(p0, "popup");
       o.a(this, p0);
       return;
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
