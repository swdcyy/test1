package com.yxcorp.gifshow.v3.mixed.timeline.c;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.v3.mixed.timeline.i;
import java.lang.Object;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTranslationIndicators;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import gwc.p;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;

public final class c implements View$OnLayoutChangeListener	// class@001565
{
    public final i b;

    public void c(i p0){
       this.b = p0;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       c tb = this.b;
       i y = tb.y;
       p2 = tb.p.getWidth();
       Objects.requireNonNull(y);
       if (PatchProxy.isSupport(MixTranslationIndicators.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), y, MixTranslationIndicators.class, "5") && y.b != p2)) {
          y.b = p2;
          y.post(new p(y));
          Object[] objArray = new Object[0];
          a.D().s("MixTranslationIndicators", "onSizeChange\(\) called with: width = ["+p2+"]", objArray);
       }
       tb.y.b(tb.B);
       return;
    }
}
