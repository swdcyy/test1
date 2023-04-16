package com.kuaishou.merchant.marketing.shop.ginsengfruit.view.GinsengFruitAnchorActivityPendantView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import android.text.TextPaint;
import android.graphics.Typeface;
import ekd.d0;

public final class GinsengFruitAnchorActivityPendantView extends ConstraintLayout	// class@001bec
{
    public CountDownTimer B;
    public TextView C;
    public TextView D;
    public HashMap E;

    public void GinsengFruitAnchorActivityPendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void GinsengFruitAnchorActivityPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void GinsengFruitAnchorActivityPendantView(Context p0,AttributeSet p1,int p2){
       try{
          super(p0, p1, p2);
          if (PatchProxy.applyVoid(null, this, GinsengFruitAnchorActivityPendantView.class, "1")) {
          }else {
             this.setClipToPadding(false);
             this.setClipChildren(false);
             a.b(this.getContext(), R.layout.arg_RES_7f0d07d1, this);
             this.D = this.findViewById(0x7f0a0992);
             this.C = this.findViewById(0x7f0a0994);
             GinsengFruitAnchorActivityPendantView tD = this.D;
             String str = "mCount";
             if (tD == null) {
                a.S(str);
             }
             boolean b = true;
             tD.getPaint().setFakeBoldText(b);
             tD = this.C;
             if (tD == null) {
                a.S("mCountDown");
             }
             TextPaint paint = tD.getPaint();
             paint.setFakeBoldText(b);
             tD = this.D;
             if (tD == null) {
                a.S(str);
             }
             tD.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          }
          return;
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
    }
    public void GinsengFruitAnchorActivityPendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
}
