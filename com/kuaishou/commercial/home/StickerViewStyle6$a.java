package com.kuaishou.commercial.home.StickerViewStyle6$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kuaishou.commercial.home.StickerViewStyle6;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.commercial.home.StickerView;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import android.widget.FrameLayout;
import com.yxcorp.utility.n;
import android.view.View;
import com.kuaishou.commercial.home.DrawTextSelfStickerView;
import java.util.List;
import java.lang.Math;

public class StickerViewStyle6$a implements ViewTreeObserver$OnPreDrawListener	// class@0014d3
{
    public final StickerViewStyle6 b;

    public void StickerViewStyle6$a(StickerViewStyle6 p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       FrameLayout$LayoutParams obj = PatchProxy.apply(null, this, StickerViewStyle6$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.m.getViewTreeObserver().removeOnPreDrawListener(this);
       int i = 17;
       this.b.m.setGravity(i);
       obj = this.b.m.getLayoutParams();
       if (obj == null) {
          obj = new FrameLayout$LayoutParams(-2, -2);
       }
       obj.width = n.c(this.b.getContext(), 0x42f40000);
       obj.height = n.c(this.b.getContext(), 0x42f40000);
       obj.leftMargin = (this.b.n.getWidth() - obj.width) / 2;
       this.b.m.setLayoutParams(obj);
       StickerViewStyle6$a tb = this.b;
       tb.d((float)((obj.width - tb.m.getPaddingLeft()) - this.b.m.getPaddingRight()));
       tb = this.b;
       if (!tb.g(tb.m.getGravity(), 16)) {
          tb = this.b;
          if (!tb.g(tb.m.getGravity(), i)) {
             this.b.A = 0;
          label_00c5 :
             return true;
          }
       }
       StickerViewStyle6$a tb1 = this.b;
       tb1.A = Math.max(0, (((float)obj.height - ((float)tb1.x.size() * this.b.getTextLineHeight())) / 2.00f));
       goto label_00c5 ;
    }
}
