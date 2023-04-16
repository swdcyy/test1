package com.kuaishou.ax2c.layouts.X2C_Lite_Bottombar_Shrink;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeView;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;

public class X2C_Lite_Bottombar_Shrink implements IViewCreator	// class@0010bc
{

    public void X2C_Lite_Bottombar_Shrink(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f07030d), c.b(resources, R.dimen.arg_RES_7f07030d)));
       SelectShapeView selectShapeV = new SelectShapeView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(c.b(resources, 0x7f07030d), c.b(resources, 0x7f07030d));
       layoutParams.gravity = 17;
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f0601aa)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(2, Integer.valueOf(c.b(resources, R.dimen.arg_RES_7f07042c)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeV.setAttrs(iAttrHostArr);
       selectShapeV.setLayoutParams(layoutParams);
       uFrameLayout.addView(selectShapeV);
       KwaiCDNImageView kwaiCDNImage = new KwaiCDNImageView(uFrameLayout.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f0702df);
       layoutParams = new FrameLayout$LayoutParams(i, c.b(resources, 0x7f0702df));
       layoutParams.gravity = 17;
       kwaiCDNImage.n0(R.string.arg_RES_7f1025a5);
       kwaiCDNImage.setLayoutParams(layoutParams);
       uFrameLayout.addView(kwaiCDNImage);
       return uFrameLayout;
    }
}
