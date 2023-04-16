package com.kuaishou.merchant.marketing.shop.ginsengfruit.view.GinsengFruitAnchorGuidePendantView;
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
import com.kwai.robust.PatchProxyResult;

public final class GinsengFruitAnchorGuidePendantView extends ConstraintLayout	// class@001bed
{
    public TextView B;
    public HashMap C;

    public void GinsengFruitAnchorGuidePendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void GinsengFruitAnchorGuidePendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void GinsengFruitAnchorGuidePendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, GinsengFruitAnchorGuidePendantView.class, "2")) {
       }else {
          this.setClipToPadding(false);
          this.setClipChildren(false);
          a.b(this.getContext(), R.layout.arg_RES_7f0d07d0, this);
          TextView textView = this.findViewById(R.id.pop);
          this.B = textView;
          if (textView == null) {
             a.S("mPopText");
          }
          textView.getPaint().setFakeBoldText(true);
       }
       return;
    }
    public void GinsengFruitAnchorGuidePendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final TextView getMPopText(){
       GinsengFruitAnchorGuidePendantView obj = PatchProxy.apply(null, this, GinsengFruitAnchorGuidePendantView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B;
       if (obj == null) {
          a.S("mPopText");
       }
       return obj;
    }
    public final void setMPopText(TextView p0){
       this.B = p0;
    }
}
