package com.yxcorp.gifshow.bubble.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.bubble.b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import java.lang.Integer;
import o07.o;

public class d implements PopupInterface$h	// class@001c79
{
    public final b b;
    public final PopupInterface$h c;

    public void d(b p0,PopupInterface$h p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       b f = tb.f;
       if (f != null) {
          f.b(tb, p0);
       }
       tb = this.c;
       if (tb != null) {
          tb.B(p0);
       }
       return;
    }
    public void H(c p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "2")) {
          return;
       }
       uod = this.b;
       b f = uod.f;
       if (f != null) {
          f.a(uod, p0, p1);
       }
       uod = this.c;
       if (uod != null) {
          uod.H(p0, p1);
       }
       p0.k = null;
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
