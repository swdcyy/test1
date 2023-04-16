package lv1.g;
import qq5.a;
import android.content.Context;
import android.view.View;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.System;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;

public class g extends a	// class@003065
{
    public ViewGroup a;
    public View b;
    public ImageView c;
    public Context d;
    public String e;
    public long f;
    public long g;
    public boolean h;
    public long i;

    public void g(Context p0,View p1,String p2,long p3,long p4,long p5,boolean p6){
       super();
       this.d = p0;
       this.b = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       if (!p5) {
          p5 = Long.MAX_VALUE;
       }
       this.i = p5;
       this.h = p6;
       this.k();
       return;
    }
    public View f(){
       return this.a;
    }
    public boolean g(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, og, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.h != null) {
          return b;
       }
       Object obj1 = PatchProxy.apply(objArray, this, og, "4");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          long l = System.currentTimeMillis() - this.i;
          b1 = (this.g - this.f > 0 && l - 0x5265c00 > 0)? true: false;
       }
       if (b1) {
          this.g = 0;
       }
       if (this.g - this.f >= 0) {
          b = false;
       }
       return b;
    }
    public View h(){
       return this.b;
    }
    public String i(){
       return this.e;
    }
    public long j(){
       return this.g;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       RelativeLayout relativeLayo = new RelativeLayout(this.d);
       this.a = relativeLayo;
       relativeLayo.removeAllViews();
       this.a.setLayoutParams(new LinearLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f0708b6), a1.d(R.dimen.arg_RES_7f0708b5)));
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(a1.d(0x7f0708b2), a1.d(0x7f0708b1));
       layoutParams.addRule(12);
       this.b.setLayoutParams(layoutParams);
       this.a.addView(this.b);
       this.c = new ImageView(this.d);
       layoutParams = new RelativeLayout$LayoutParams(a1.d(0x7f0708b0), a1.d(0x7f0708b0));
       layoutParams.addRule(11);
       this.c.setImageResource(R.drawable.arg_RES_7f0813b7);
       this.c.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       this.c.setLayoutParams(layoutParams);
       this.a.addView(this.c);
       return;
    }
    public void l(int p0){
    }
    public boolean m(){
       return this.h;
    }
}
