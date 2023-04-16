package com.yxcorp.gifshow.widget.g;
import e17.i$e;
import com.yxcorp.gifshow.widget.h$b;
import com.yxcorp.gifshow.widget.h$a;
import java.lang.Object;
import android.view.View;
import e17.i$b;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.app.Application;
import o56.a;
import android.content.Context;
import lnc.i5;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import tyc.r;
import android.view.View$OnClickListener;
import tyc.q;

public final class g implements i$e	// class@001986
{
    public final int a;
    public final boolean b;
    public final h$b c;
    public final boolean d;
    public final h$a e;

    public void g(int p0,boolean p1,h$b p2,boolean p3,h$a p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void a(View p0,i$b p1){
       g ta = this.a;
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       g te = this.e;
       FrameLayout$LayoutParams layoutParams = p0.getLayoutParams();
       int i = i5.a(a.b());
       if (ta > null) {
          layoutParams.bottomMargin = ta;
       }else if(!i){
          i = n.c(a.b(), 26.00f);
       }
       layoutParams.bottomMargin = i;
       p0.setLayoutParams(layoutParams);
       ImageView imageView = p0.findViewById(R.id.iv_right);
       if (tb != null) {
          imageView.setImageResource(R.drawable.arg_RES_7f080a76);
       }
       if (tc != null) {
          imageView.setOnClickListener(new r(tc));
       }
       if (td != null) {
          p0.findViewById(R.id.lottie).setVisibility(8);
       }
       if (te != null) {
          te.b(p0);
          p0.setOnClickListener(new q(te));
       }
       return;
    }
}
