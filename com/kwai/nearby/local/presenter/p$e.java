package com.kwai.nearby.local.presenter.p$e;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kwai.nearby.local.presenter.p;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import vc7.d0;
import mrb.a;
import q87.c;
import com.kwai.library.widget.popup.common.c;
import qd7.b;

public final class p$e extends GestureDetector$SimpleOnGestureListener	// class@000fc0
{
    public final p b;

    public void p$e(p p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Object[] objArray;
       p$e tb;
       p a;
       p t;
       boolean b;
       p0 = PatchProxy.applyOneRefs(p0, this, p$e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (this.b.R8()) {
          String str = "HomeLocalTopBubblePresenter";
          if (p.P8(this.b).e()) {
             objArray = new Object[0];
             a.C().s(str, "onSingleTapConfirmed on HomeLocal Tab", objArray);
             if (this.b.w == null) {
                objArray = new Object[0];
                a.C().s(str, "Refresh by local tab reclick.", objArray);
                p.P8(this.b).k(5);
             }
             this.b.S8();
             tb = this.b;
             p w = tb.w;
             a = tb.A;
             String str1 = String.valueOf(tb.y);
             tb = this.b;
             p z = tb.z;
             t = tb.t;
             b = (t != null)? t.K(): false;
             b.a("CLICK", w, a, str1, z, b);
             t = this.b.t;
             if (t != null && t.K()) {
                tb = this.b;
                b.b(tb.y, "TopNearby", tb.z, tb.A, "CLICK");
             }
          }else {
             objArray = new Object[0];
             a.C().s(str, "onSingleTapConfirmed for switch Tab", objArray);
             tb = this.b;
             tb.x = true;
             a = tb.w;
             p a1 = tb.A;
             String str2 = String.valueOf(tb.y);
             tb = this.b;
             p z1 = tb.z;
             t = tb.t;
             boolean b1 = (t != null)? t.K(): false;
             b.a("CLICK", a, a1, str2, z1, b1);
             t = this.b.t;
             if (t != null && t.K()) {
                tb = this.b;
                b.b(tb.y, "TopNearby", tb.z, tb.A, "CLICK");
             }
          }
       }
    label_00d6 :
       return 0;
    }
}
