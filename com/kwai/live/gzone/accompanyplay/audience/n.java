package com.kwai.live.gzone.accompanyplay.audience.n;
import com.kwai.live.gzone.widget.b;
import com.kwai.live.gzone.widget.e$a;
import java.util.ArrayList;
import k37.d;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import android.os.Bundle;
import ekd.m1;
import android.view.ViewGroup;
import com.kwai.live.gzone.accompanyplay.audience.n$c;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.audience.n$b;
import i2b.a;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import zf6.j;
import java.lang.CharSequence;
import com.kwai.live.gzone.accompanyplay.audience.n$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public class n extends b	// class@000b9f
{
    public ViewGroup A;
    public n$c B;
    public p1 C;
    public List z;

    public void n(e$a p0){
       super(p0);
       this.z = new ArrayList();
       p0.G(new d(this));
       p0.O(null);
    }
    public void b(c p0){
    }
    public int d0(){
       return 0x7f0d0b65;
    }
    public int e0(){
       Object obj = PatchProxy.apply(null, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.c(this.m0(), 397.00f);
    }
    public void f0(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "1")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a1208);
       this.o0();
       return;
    }
    public boolean j0(){
       return true;
    }
    public void n0(n$c p0){
       this.B = p0;
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       n tA = this.A;
       if (tA == null) {
          return;
       }
       tA.removeAllViews();
       if (q.f(this.z)) {
          return;
       }
       int i = 0;
       while (i < this.z.size()) {
          n$b uob = this.z.get(i);
          View view = a.d(this.A.getContext(), R.layout.arg_RES_7f0d0b62, this.A, false);
          view.findViewById(R.id.icon).setImageDrawable(j.n(this.u(), uob.a, R.color.arg_RES_7f061dc4));
          view.findViewById(R.id.item).setText(uob.b);
          this.A.addView(view);
          view.setOnClickListener(new n$a(this, uob.c, this.B));
          int i1 = this.z.size() - 1;
          if (i < i1) {
             View view1 = new View(this.A.getContext());
             view1.setLayoutParams(new ViewGroup$LayoutParams(-1, a1.e(0x3f800000)));
             view1.setBackgroundColor(a1.a(R.color.arg_RES_7f061d82));
             this.A.addView(view1);
          }
          i = i + 1;
       }
       return;
    }
}
