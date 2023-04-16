package com.yxcorp.gifshow.detail.player.panel.BaselineShiftSpan;
import android.text.style.SuperscriptSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class BaselineShiftSpan extends SuperscriptSpan	// class@001606
{
    public final int b;

    public void BaselineShiftSpan(int p0){
       super();
       this.b = p0;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaselineShiftSpan.class, "1")) {
          return;
       }
       a.p(p0, "textPaint");
       p0.baselineShift = p0.baselineShift + this.b;
       return;
    }
    public void updateMeasureState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaselineShiftSpan.class, "2")) {
          return;
       }
       a.p(p0, "textPaint");
       p0.baselineShift = p0.baselineShift + this.b;
       return;
    }
}
