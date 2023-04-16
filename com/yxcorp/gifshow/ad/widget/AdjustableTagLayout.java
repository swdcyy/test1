package com.yxcorp.gifshow.ad.widget.AdjustableTagLayout;
import android.widget.LinearLayout;
import android.content.Context;
import androidx.core.content.ContextCompat;
import lnc.a1;
import android.util.AttributeSet;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import java.lang.CharSequence;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import w59.f;
import java.lang.Runnable;

public class AdjustableTagLayout extends LinearLayout	// class@00191a
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Context h;
    public static final int i;

    public void AdjustableTagLayout(Context p0){
       super(p0);
       this.b = ContextCompat.getColor(this.getContext(), 0x7f0616c4);
       this.c = a1.e(0x3f800000);
       this.d = a1.e(12.00f);
       this.e = a1.e(4.00f);
       this.f = a1.d(0x7f070271);
       this.g = ContextCompat.getColor(this.getContext(), 0x7f06168c);
       this.b(p0);
    }
    public void AdjustableTagLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = ContextCompat.getColor(this.getContext(), 0x7f0616c4);
       this.c = a1.e(0x3f800000);
       this.d = a1.e(12.00f);
       this.e = a1.e(4.00f);
       this.f = a1.d(0x7f070271);
       this.g = ContextCompat.getColor(this.getContext(), 0x7f06168c);
       this.b(p0);
    }
    public void AdjustableTagLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = ContextCompat.getColor(this.getContext(), 0x7f0616c4);
       this.c = a1.e(0x3f800000);
       this.d = a1.e(12.00f);
       this.e = a1.e(4.00f);
       this.f = a1.d(0x7f070271);
       this.g = ContextCompat.getColor(this.getContext(), 0x7f06168c);
       this.b(p0);
    }
    public final void a(List p0,int p1){
       if (PatchProxy.isSupport(AdjustableTagLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AdjustableTagLayout.class, "3")) {
          return;
       }
       this.removeAllViews();
       if (p0 != null && !p0.isEmpty()) {
          int i = p0.size();
          int i1 = 0;
          Object[] objArray = null;
          int i2 = 1;
          while (i1 < i) {
             String str = p0.get(i1);
             TextView textView = PatchProxy.applyOneRefs(str, this, AdjustableTagLayout.class, "4");
             if (textView != PatchProxyResult.class) {
             }else {
                textView = new TextView(this.h);
                textView.setSingleLine(i2);
                textView.setEllipsize(TextUtils$TruncateAt.END);
                textView.setText(str);
                textView.setTextSize(0, (float)this.f);
                textView.setTextColor(this.g);
             }
             textView.measure(0, 0);
             int measuredWidt = textView.getMeasuredWidth();
             if (!i1) {
                this.addView(textView);
             }else {
                measuredWidt = measuredWidt + this.e;
                if (measuredWidt > p1) {
                   break ;
                }else if(PatchProxy.applyVoidOneRefs(textView, this, AdjustableTagLayout.class, "5")){
                   LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(-2, -2);
                   layoutParams1.leftMargin = this.e;
                   this.addView(textView, layoutParams1);
                }
             }
             p1 = p1 - measuredWidt;
             measuredWidt = this.e + this.c;
             if (measuredWidt > p1) {
                break ;
             }else if(PatchProxy.applyVoid(objArray, this, AdjustableTagLayout.class, "6")){
                View view = new View(this.h);
                view.setBackgroundColor(this.b);
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(this.c, this.d);
                layoutParams.leftMargin = this.e;
                this.addView(view, layoutParams);
             }
             p1 = p1 - measuredWidt;
             i1 = i1 + 1;
          }
          if (!PatchProxy.applyVoid(objArray, this, AdjustableTagLayout.class, "7")) {
             int childCount = this.getChildCount();
             if (childCount > i2) {
                View childAt = this.getChildAt((childCount - i2));
                if (!childAt instanceof TextView) {
                   this.removeView(childAt);
                }
             }
          }
       }
    label_00de :
       return;
    }
    public final void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdjustableTagLayout.class, "1")) {
          return;
       }
       this.h = p0;
       this.setOrientation(0);
       return;
    }
    public void setTagList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdjustableTagLayout.class, "2")) {
          return;
       }
       int width = this.getWidth();
       if (width > 0) {
          this.a(p0, width);
       }else {
          this.post(new f(this, p0));
       }
       return;
    }
}
