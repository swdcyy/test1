package com.kuaishou.live.common.core.component.highfrequency.widget.HighFluencyIncreaseNumberView;
import bn1.a;
import com.yxcorp.gifshow.widget.merchant.live.SellingNumberScrollLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Typeface;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import d61.f0;
import android.text.TextPaint;
import java.lang.Integer;
import java.lang.CharSequence;
import java.lang.Boolean;

public class HighFluencyIncreaseNumberView extends SellingNumberScrollLayout implements a	// class@00134c
{
    public int g;
    public int h;
    public int i;
    public Typeface j;
    public int k;
    public int l;

    public void HighFluencyIncreaseNumberView(Context p0){
       super(p0, null);
    }
    public void HighFluencyIncreaseNumberView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = -1;
       this.j = Typeface.DEFAULT;
       this.k = 0;
       this.l = 0;
       if (PatchProxy.applyVoid(null, this, HighFluencyIncreaseNumberView.class, "1")) {
       }else {
          this.setTextViewResId(R.layout.arg_RES_7f0d0c13);
          this.setAnimDurationMillis(500);
       }
       return;
    }
    public void a(Typeface p0,int p1){
       this.j = p0;
       this.k = p1;
    }
    public void c(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighFluencyIncreaseNumberView.class, "5")) {
          return;
       }
       f0.j(p0, this.j, this.k);
       p0.setTextColor(this.h);
       int i = 1;
       p0.setTextSize(i, (float)this.i);
       p0.getPaint().setFakeBoldText(i);
       HighFluencyIncreaseNumberView tl = this.l;
       if (tl != null) {
          p0.setShadowLayer(3.00f, 0, 3.00f, tl);
       }
       return;
    }
    public void d(int p0,int p1){
       if (PatchProxy.isSupport(HighFluencyIncreaseNumberView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HighFluencyIncreaseNumberView.class, "2")) {
          return;
       }
       this.g = p0;
       this.setCurrentText(String.valueOf(p0));
       return;
    }
    public int getAnimDurationMillisDivisor(){
       return 1;
    }
    public void setNumber(int p0){
       if (PatchProxy.isSupport(HighFluencyIncreaseNumberView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HighFluencyIncreaseNumberView.class, "3")) {
          return;
       }
       String str = String.valueOf(p0);
       boolean b = (this.g > p0)? true: false;
       if (!PatchProxy.isSupport(SellingNumberScrollLayout.class) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(b), this, SellingNumberScrollLayout.class, "3")) {
          this.e(str, this.e, this.d, this.c, b);
       }
       this.g = p0;
       return;
    }
    public void setShadowColorRes(int p0){
       this.l = p0;
    }
    public void setTextColorInt(int p0){
       this.h = p0;
    }
    public void setTextSize(int p0){
       this.i = p0;
    }
}
