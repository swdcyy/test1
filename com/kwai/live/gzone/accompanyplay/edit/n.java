package com.kwai.live.gzone.accompanyplay.edit.n;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.live.gzone.accompanyplay.edit.n$a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import u07.g;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import u07.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kwai.live.gzone.accompanyplay.edit.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class n extends c implements PopupInterface$f	// class@000c0e
{
    public PresenterV2 p;
    public n$a q;

    public void n(c$b p0,n$a p1){
       super(p0);
       this.d.setBackground(new ColorDrawable(Integer.MIN_VALUE));
       this.q = p1;
       p0.L(this);
       p0.F(g.a);
       p0.N(h.a);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, n.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.f(p1, R.layout.arg_RES_7f0d0b7a, p2);
       p op = new p();
       this.p = op;
       op.f(view);
       Object[] objArray = new Object[]{this};
       this.p.i(objArray);
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       n tp = this.p;
       if (tp != null) {
          tp.destroy();
       }
       return;
    }
}
