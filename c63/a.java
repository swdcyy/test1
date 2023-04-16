package c63.a;
import lv1.g;
import android.content.Context;
import android.view.View;
import c63.a$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import i2b.a;
import android.view.ViewGroup;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import java.lang.Integer;

public class a extends g	// class@0004d7
{
    public final boolean j;
    public final String k;
    public final String l;
    public String m;
    public View n;

    public void a(Context p0,View p1,a$a p2,long p3,long p4,long p5,boolean p6,boolean p7){
       g og = this;
       a$a uoa = p2;
       boolean b = p7;
       super(p0, p1, uoa.a, p3, p4, p5, p6);
       og.j = b;
       og.m = uoa.b;
       og.k = uoa.c;
       og.l = uoa.d;
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
       }else if(b){
          og.a = a.a(og.d, 0x7f0d0bd5);
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(a1.d(0x7f0707ed), a1.d(0x7f0707ec));
          layoutParams.gravity = 17;
          og.a.addView(og.b, 0, layoutParams);
          View layoutParams1 = og.a.findViewById(R.id.live_gzone_red_dot_view);
          og.n = layoutParams1;
          layoutParams1.setVisibility(8);
       }else {
          RelativeLayout relativeLayo = new RelativeLayout(og.d);
          og.a = relativeLayo;
          relativeLayo.removeAllViews();
          og.a.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
          RelativeLayout$LayoutParams relativeLayo1 = new RelativeLayout$LayoutParams(-1, a1.e(48.00f));
          relativeLayo1.topMargin = a1.e(5.00f);
          relativeLayo1.addRule(14);
          og.a.addView(og.b, relativeLayo1);
          og.c = new ImageView(og.d);
          relativeLayo1 = new RelativeLayout$LayoutParams(a1.e(8.00f), a1.e(8.00f));
          relativeLayo1.addRule(11);
          og.c.setImageResource(R.drawable.arg_RES_7f081279);
          og.c.setScaleType(ImageView$ScaleType.FIT_XY);
          og.c.setLayoutParams(relativeLayo1);
          og.a.addView(og.c);
       }
       return;
    }
    public void k(){
    }
    public void l(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (p0 > 0) {
          this.n.setVisibility(0);
       }else {
          this.n.setVisibility(8);
       }
       return;
    }
    public String n(){
       return this.k;
    }
    public String o(){
       return this.m;
    }
}
