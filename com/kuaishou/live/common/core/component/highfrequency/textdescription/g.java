package com.kuaishou.live.common.core.component.highfrequency.textdescription.g;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$DisplayPosition;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.b;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$a;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;

public class g extends HighFluencyDescriptionBinder	// class@00134a
{
    public AppCompatTextView b;

    public void g(){
       super();
    }
    public void c(int p0,int p1,HighFluencyDescriptionBinder$DisplayPosition p2,boolean p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, g.class, "2")) {
          return;
       }
       this.b.setTextColor(p0);
       this.b.setTextSize(1, (float)p2.mTextSizeDp);
       if (p3) {
          this.b.setShadowLayer(3.00f, 0, 3.00f, p2.mDefaultShadowColor);
       }
       HighFluencyDescriptionBinder$DisplayPosition mTextSizeDp = p2.mTextSizeDp;
       b.h(this.b, (mTextSizeDp - 2), mTextSizeDp, 1, 1);
       return;
    }
    public void d(HighFrequencyActionGuide$TextDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       this.b.setText(p0.text);
       return;
    }
    public void e(int p0,HighFluencyDescriptionBinder$a p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, og, "4")) {
          return;
       }
       this.b(this.b, p0, p1);
       return;
    }
    public void g(Context p0,ViewGroup p1,HighFrequencyActionGuide$TextDescription p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "1")) {
          return;
       }
       AppCompatTextView uAppCompatTe = new AppCompatTextView(p0);
       this.b = uAppCompatTe;
       p1.addView(uAppCompatTe);
       return;
    }
}
