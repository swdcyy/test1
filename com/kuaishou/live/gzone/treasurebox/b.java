package com.kuaishou.live.gzone.treasurebox.b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.gzone.treasurebox.a$c$a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.gzone.treasurebox.a$c;
import r53.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j77.d;

public class b implements PopupInterface$h	// class@001c58
{
    public final a$c$a b;

    public void b(a$c$a p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       a$c$a b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       b = this.b.b;
       a w = b.v.w;
       if (w != null) {
          w.b(b.r, b.n8(R.string.arg_RES_7f10243b));
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
