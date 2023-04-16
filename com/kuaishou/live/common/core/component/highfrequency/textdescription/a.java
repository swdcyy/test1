package com.kuaishou.live.common.core.component.highfrequency.textdescription.a;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$DisplayPosition;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import bn1.a;
import android.graphics.Typeface;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.b;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler;
import an1.b;
import z1.a;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$a;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kuaishou.live.common.core.component.highfrequency.widget.HighFluencyIncreaseNumberView;
import com.kuaishou.live.common.core.component.highfrequency.widget.HighFluencyDecreaseNumberView;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class a extends HighFluencyDescriptionBinder	// class@001343
{
    public a b;
    public AppCompatTextView c;
    public HighFluencyAnimHandler d;

    public void a(){
       super();
    }
    public void c(int p0,int p1,HighFluencyDescriptionBinder$DisplayPosition p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, a.class, "2")) {
          return;
       }
       this.b.setTextColorInt(p0);
       this.b.setTextSize(p2.mNumberSizeDp);
       this.b.a(p2.mTypeface, p2.mTypefaceStyle);
       this.c.setTextColor(p0);
       this.c.setMaxLines(1);
       this.c.setEllipsize(TextUtils$TruncateAt.END);
       this.c.setPadding(p2.mPostfixViewPaddingLeftPx, p2.mPostfixViewPaddingTopPx, 0, 0);
       if (p3) {
          this.b.setShadowColorRes(p1);
          this.c.setShadowLayer(3.00f, 0, 3.00f, p1);
       }
       this.c.setTextSize(1, (float)p2.mTextSizeDp);
       HighFluencyDescriptionBinder$DisplayPosition mTextSizeDp = p2.mTextSizeDp;
       b.h(this.c, (mTextSizeDp - 2), mTextSizeDp, 1, 1);
       return;
    }
    public void d(HighFrequencyActionGuide$TextDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          td.c();
       }
       this.b.d(p0.startCount, p0.endCount);
       HighFluencyAnimHandler highFluencyA = new HighFluencyAnimHandler(p0, new b(this));
       this.d = highFluencyA;
       highFluencyA.b();
       this.c.setText(p0.text);
       return;
    }
    public void e(int p0,HighFluencyDescriptionBinder$a p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "4")) {
          return;
       }
       this.b(this.c, p0, p1);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          td.c();
       }
       return;
    }
    public void g(Context p0,ViewGroup p1,HighFrequencyActionGuide$TextDescription p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setOrientation(0);
       HighFluencyIncreaseNumberView highFluencyI = (p2.startCount < p2.endCount)? new HighFluencyIncreaseNumberView(p0): new HighFluencyDecreaseNumberView(p0);
       this.b = highFluencyI;
       this.c = new AppCompatTextView(p0);
       linearLayout.addView(this.b);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -2);
       layoutParams.gravity = 16;
       linearLayout.addView(this.c, layoutParams);
       linearLayout.setGravity(16);
       p1.addView(linearLayout);
       return;
    }
    public void h(a p0,AppCompatTextView p1){
       this.b = p0;
       this.c = p1;
    }
}
