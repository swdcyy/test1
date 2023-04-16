package com.kuaishou.live.common.core.component.highfrequency.widget.HighFluencyDecreaseNumberView;
import bn1.a;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Typeface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import d61.f0;
import java.lang.CharSequence;

public class HighFluencyDecreaseNumberView extends AppCompatTextView implements a	// class@00134b
{

    public void HighFluencyDecreaseNumberView(Context p0){
       super(p0, null);
    }
    public void HighFluencyDecreaseNumberView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HighFluencyDecreaseNumberView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(Typeface p0,int p1){
       if (PatchProxy.isSupport(HighFluencyDecreaseNumberView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HighFluencyDecreaseNumberView.class, "5")) {
          return;
       }
       f0.j(this, p0, p1);
       return;
    }
    public void d(int p0,int p1){
       if (PatchProxy.isSupport(HighFluencyDecreaseNumberView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HighFluencyDecreaseNumberView.class, "1")) {
          return;
       }
       this.setText(String.valueOf(p0));
       return;
    }
    public void setNumber(int p0){
       if (PatchProxy.isSupport(HighFluencyDecreaseNumberView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HighFluencyDecreaseNumberView.class, "2")) {
          return;
       }
       this.setText(String.valueOf(p0));
       return;
    }
    public void setShadowColorRes(int p0){
       if (PatchProxy.isSupport(HighFluencyDecreaseNumberView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HighFluencyDecreaseNumberView.class, "6")) {
          return;
       }
       this.setShadowLayer(3.00f, 0, 3.00f, p0);
       return;
    }
    public void setTextColorInt(int p0){
       if (PatchProxy.isSupport(HighFluencyDecreaseNumberView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HighFluencyDecreaseNumberView.class, "3")) {
          return;
       }
       this.setTextColor(p0);
       return;
    }
    public void setTextSize(int p0){
       if (PatchProxy.isSupport(HighFluencyDecreaseNumberView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HighFluencyDecreaseNumberView.class, "4")) {
          return;
       }
       this.setTextSize(1, (float)p0);
       return;
    }
}
