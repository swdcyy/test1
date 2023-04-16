package com.yxcorp.gifshow.widget.RatioExpandView$RatioExpandItemView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.RatioExpandView;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.widget.ImageView;
import java.lang.CharSequence;

public class RatioExpandView$RatioExpandItemView extends FrameLayout	// class@0018a6
{
    public View b;
    public TextView c;
    public ImageView d;
    public float e;
    public final RatioExpandView f;
    public static final int g;

    public void RatioExpandView$RatioExpandItemView(RatioExpandView p0,Context p1){
       this.f = p0;
       super(p1);
       this.e = Float.MIN_VALUE;
    }
    public void a(ViewGroup p0,boolean p1,int p2){
       RelativeLayout$LayoutParams layoutParams;
       boolean b;
       if (PatchProxy.isSupport(RatioExpandView$RatioExpandItemView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, RatioExpandView$RatioExpandItemView.class, "1")) {
          return;
       }
       if (p1) {
          layoutParams = new RelativeLayout$LayoutParams(a1.e((float)RatioExpandView.x), RatioExpandView.v);
          layoutParams.rightMargin = RatioExpandView.C;
       }else {
          layoutParams = new RelativeLayout$LayoutParams(RatioExpandView.z, RatioExpandView.v);
       }
       if (p0.getChildCount()) {
          RatioExpandView$RatioExpandItemView tf = this.f;
          Objects.requireNonNull(tf);
          if (PatchProxy.isSupport(RatioExpandView.class)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p2), tf, RatioExpandView.class, "16");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
             label_0067 :
                int i = n.z(tf.getContext());
                if (i) {
                   int w = RatioExpandView.w;
                   p2 = p2 * (RatioExpandView.z + w);
                   if (tf.r != null) {
                      p2 = p2 + ((w + a1.e((float)RatioExpandView.x)) + RatioExpandView.C);
                   }
                   if (p2 > i) {
                      b = true;
                   }
                }
                b = false;
             }
          }else {
             goto label_0067 ;
          }
          if (!b) {
             layoutParams.leftMargin = RatioExpandView.w;
          label_0098 :
             this.setVisibility(4);
             float f = 0;
             this.setAlpha(f);
             this.setLayoutParams(layoutParams);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, RatioExpandView$RatioExpandItemView.class, "2")) {
                View view = new View(this.f.getContext());
                this.b = view;
                view.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
                this.b.setBackground(this.f.e);
                this.b.setAlpha(f);
                this.addView(this.b);
             }
             if (!PatchProxy.applyVoid(objArray, this, RatioExpandView$RatioExpandItemView.class, "3")) {
                TextView textView = new TextView(this.f.getContext());
                this.c = textView;
                textView.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
                this.c.setPadding(0, 0, 0, 0);
                this.c.setTextColor(RatioExpandView.I);
                this.c.setTextSize(2, (float)RatioExpandView.E);
                this.c.setSingleLine(true);
                this.c.setEllipsize(TextUtils$TruncateAt.END);
                this.c.setTextAlignment(3);
                this.c.setGravity(17);
                this.addView(this.c);
             }
             if (!PatchProxy.isSupport(RatioExpandView$RatioExpandItemView.class) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, RatioExpandView$RatioExpandItemView.class, "4") && p1)) {
                this.b.setVisibility(8);
                this.c.setVisibility(8);
                ImageView imageView = new ImageView(this.f.getContext());
                this.d = imageView;
                imageView.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
                this.d.setPadding(0, 0, 0, 0);
                this.d.setImageResource(R.drawable.arg_RES_7f081075);
                this.addView(this.d);
             }
             return;
          }
       }
       layoutParams.leftMargin = 0;
       goto label_0098 ;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RatioExpandView$RatioExpandItemView.class, "5")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
}
