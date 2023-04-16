package com.kuaishou.merchant.home2.magnet.toolbar.widget.ToolBarItemView;
import com.kuaishou.merchant.home.basic.widget.ImageTextView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.content.res.Resources;
import cw9.c;
import java.lang.Integer;
import java.lang.Float;
import android.widget.TextView;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;

public final class ToolBarItemView extends ImageTextView	// class@001804
{
    public HashMap i;

    public void ToolBarItemView(Context p0){
       super(p0, null, 2, null);
    }
    public void ToolBarItemView(Context p0,AttributeSet p1){
       super(p0, p1);
       if (PatchProxy.applyVoid(null, this, ToolBarItemView.class, "1")) {
       }else {
          int i = 0;
          float f = (float)c.b(this.getContext().getResources(), 0x7f070f6d);
          if (!PatchProxy.isSupport(ImageTextView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Float.valueOf(f), this, ImageTextView.class, "7")) {
             this.c.setTextSize(i, f);
          }
          this.setTextColor(-1);
          int i1 = n.c(this.getContext(), 32.00f);
          if (PatchProxy.isSupport(ImageTextView.class) && PatchProxy.applyOneRefs(Integer.valueOf(i1), this, ImageTextView.class, "5") != PatchProxyResult.class) {
          }else {
             ViewGroup$MarginLayoutParams layoutParams = this.d.getLayoutParams();
             if (layoutParams == null) {
                this.d.setLayoutParams(new ViewGroup$MarginLayoutParams(i1, i1));
             }else {
                layoutParams.width = i1;
                layoutParams.height = i1;
             }
          }
          this.setImageTextPadding(n.c(this.getContext(), 4.00f));
          this.setImageTipTopPadding(n.c(this.getContext(), 5.00f));
       }
       return;
    }
    public void ToolBarItemView(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
}
