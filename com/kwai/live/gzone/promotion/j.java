package com.kwai.live.gzone.promotion.j;
import com.kwai.live.gzone.widget.b;
import lnc.a1;
import com.kwai.live.gzone.promotion.j$a;
import com.kwai.live.gzone.widget.e$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.widget.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import d61.y;
import android.view.View;
import f37.o0;
import com.kwai.live.gzone.promotion.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import s67.e;
import y43.a;

public class j extends b	// class@000dc7
{
    public PresenterV2 A;
    public j$a B;
    public View z;
    public static final int C;

    static {
       j.C = a1.e(300.00f);
    }
    public void j(j$a p0){
       super(p0);
       this.B = p0;
       p0.L(this);
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "4")) {
          return;
       }
       super.N(p0);
       j tA = this.A;
       if (tA != null) {
          tA.destroy();
       }
       return;
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       super.O(p0);
       o0.p(this.y, y.d(this.u()));
       l ol = new l();
       this.A = ol;
       ol.f(this.y);
       Object[] objArray = new Object[]{this,this.B.I};
       this.A.i(objArray);
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       this.z = view;
       return view;
    }
    public int d0(){
       return 0x7f0d0b8b;
    }
    public int e0(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.B.I.j.S(this.u());
    }
    public boolean j0(){
       return false;
    }
}
