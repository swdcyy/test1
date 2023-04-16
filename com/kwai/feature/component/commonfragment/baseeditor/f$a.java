package com.kwai.feature.component.commonfragment.baseeditor.f$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.component.commonfragment.baseeditor.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import ky5.o;
import android.view.View$OnClickListener;
import java.lang.Math;
import android.content.res.Resources;
import lnc.a1;
import android.content.res.ColorStateList;
import android.view.View;
import ekd.m1;
import java.lang.Integer;

public class f$a extends PresenterV2	// class@0011ff
{
    public TextView p;
    public int q;
    public String r;
    public final f s;

    public void f$a(f p0){
       this.s = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "3")) {
          return;
       }
       if (TextUtils.isEmpty(this.r)) {
          return;
       }
       this.p.setText(this.r);
       this.p.setOnClickListener(new o(this));
       if (this.s.y != null) {
          int[] z = f.z;
          int i = 2;
          if (z.length >= i) {
             int i1 = (z.length * 2) - i;
             i = this.q % i1;
             this.p.setBackgroundResource(z[Math.abs((i - ((i / z.length) * i1)))]);
             this.p.setTextColor(a1.m().getColorStateList(R.color.arg_RES_7f060aec));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a45b7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       this.q = this.r8("ADAPTER_POSITION").intValue();
       this.r = this.q8(String.class);
       return;
    }
}
