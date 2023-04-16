package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$f;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$b;
import android.view.View;
import bs3.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.TextView;
import ekd.m1;

public class a$f extends a$b	// class@001b8f
{
    public TextView e;

    public void a$f(View p0){
       super(p0);
    }
    public void a(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "2")) {
          return;
       }
       super.a(p0);
       Object[] objArray = new Object[]{Integer.valueOf(p0.c)};
       this.e.setText(String.format(a1.p(R.string.arg_RES_7f10025d), objArray));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.e = m1.f(p0, 0x7f0a0296);
       return;
    }
}
