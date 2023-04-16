package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.GraphicVerticalMarqueeView;
import android.widget.ViewFlipper;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.ViewGroup;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.TextView;
import java.util.List;
import android.view.View;
import java.lang.Integer;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.GraphicVerticalMarqueeView$a;

public abstract class GraphicVerticalMarqueeView extends ViewFlipper	// class@001c1a
{
    public Context b;
    public List c;
    public boolean d;
    public GraphicVerticalMarqueeView$a e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    public void GraphicVerticalMarqueeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new ArrayList();
       boolean b = false;
       this.d = b;
       this.f = 2000;
       this.g = 500;
       this.h = 14;
       boolean b1 = true;
       this.i = b1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GraphicVerticalMarqueeView.class, "1")) {
       }else {
          this.b = p0;
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.e3, b, b);
          this.f = typedArray.getInteger(b1, this.f);
          this.d = typedArray.hasValue(b);
          this.g = typedArray.getInteger(b, this.g);
          int i = 2;
          if (typedArray.hasValue(i)) {
             i = (int)typedArray.getDimension(i, (float)this.h);
             this.h = i;
             GraphicVerticalMarqueeView tb = this.b;
             float f = (float)i;
             if (PatchProxy.isSupport(GraphicVerticalMarqueeView.class)) {
                Object obj = PatchProxy.applyTwoRefs(tb, Float.valueOf(f), this, GraphicVerticalMarqueeView.class, "7");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                label_008b :
                   this.h = i;
                }
             }
             i = (int)((f / c.c(tb.getResources()).scaledDensity) + 0x3f000000);
             goto label_008b ;
          }
          typedArray.recycle();
          this.setFlipInterval(this.f);
       }
       return;
    }
    public abstract MerchantKwaiImageView a(ViewGroup p0);
    public abstract TextView b(ViewGroup p0);
    public abstract int getLayoutResId();
    public List getMarquees(){
       return this.c;
    }
    public int getPosition(){
       Object obj = PatchProxy.apply(null, this, GraphicVerticalMarqueeView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getCurrentView().getTag().intValue();
    }
    public void setImage(boolean p0){
       this.i = p0;
    }
    public void setMarquees(List p0){
       this.c = p0;
    }
    public void setOnItemClickListener(GraphicVerticalMarqueeView$a p0){
       this.e = p0;
    }
}
