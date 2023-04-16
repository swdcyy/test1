package com.kuaishou.ax2c.layouts.X2C_Lite_Mask_View_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeView;
import android.widget.RelativeLayout$LayoutParams;
import cw9.c;
import android.widget.ImageView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import com.kuaishou.live.common.core.component.loading.LoopBackgroundView;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class X2C_Lite_Mask_View_Layout implements IViewCreator	// class@0010bf
{

    public void X2C_Lite_Mask_View_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       SelectShapeView selectShapeV = new SelectShapeView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, c.b(resources, 0x7f07028e));
       selectShapeV.setId(R.id.live_lite_top_mask_view);
       layoutParams.addRule(10, -1);
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(12, Integer.valueOf(resources.getColor(R.color.arg_RES_7f06020e)));
       xmlAttrHostI.addAttr(8, Integer.valueOf(270));
       xmlAttrHostI.addAttr(14, Integer.valueOf(resources.getColor(R.color.arg_RES_7f0601aa)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeV.setAttrs(iAttrHostArr);
       selectShapeV.setLayoutParams(layoutParams);
       relativeLayo.addView(selectShapeV);
       LoopBackgroundView loopBackgrou = new LoopBackgroundView(relativeLayo.getContext());
       loopBackgrou.setId(R.id.lite_loading_view);
       loopBackgrou.setVisibility(8);
       loopBackgrou.setLayoutParams(new RelativeLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 325.50f, c.c(resources))));
       relativeLayo.addView(loopBackgrou);
       selectShapeV = new SelectShapeView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-1, c.b(resources, 0x7f07030e));
       selectShapeV.setId(R.id.live_lite_bottom_mask_view);
       layoutParams.addRule(12, -1);
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(12, Integer.valueOf(resources.getColor(R.color.arg_RES_7f06020e)));
       xmlAttrHostI1.addAttr(8, Integer.valueOf(90));
       xmlAttrHostI1.addAttr(14, Integer.valueOf(resources.getColor(R.color.arg_RES_7f0601e4)));
       IAttrHost[] iAttrHostArr1 = new IAttrHost[]{xmlAttrHostI1,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeV.setAttrs(iAttrHostArr1);
       selectShapeV.setLayoutParams(layoutParams);
       relativeLayo.addView(selectShapeV);
       return relativeLayo;
    }
}
