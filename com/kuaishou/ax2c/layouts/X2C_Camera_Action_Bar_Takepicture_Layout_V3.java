package com.kuaishou.ax2c.layouts.X2C_Camera_Action_Bar_Takepicture_Layout_V3;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import java.lang.Integer;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;

public class X2C_Camera_Action_Bar_Takepicture_Layout_V3 implements IViewCreator	// class@001091
{

    public void X2C_Camera_Action_Bar_Takepicture_Layout_V3(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.take_picture_btn);
       Integer integer = Integer.valueOf(1);
       uFrameLayout.setClickable(1);
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setContentDescription("shoot_cover_iv");
       uFrameLayout.setMotionEventSplittingEnabled(false);
       uFrameLayout.setVisibility(4);
       uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f070d7a), c.b(resources, R.dimen.arg_RES_7f070d7a)));
       SelectShapeView selectShapeV = new SelectShapeView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 64.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 64.00f, c.c(resources)));
       selectShapeV.setId(R.id.take_picture_inner_iv);
       layoutParams.gravity = 17;
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(26, integer);
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f061f71)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeV.setAttrs(iAttrHostArr);
       selectShapeV.setLayoutParams(layoutParams);
       uFrameLayout.addView(selectShapeV);
       selectShapeV = new SelectShapeView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 64.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 64.00f, c.c(resources)));
       selectShapeV.setId(R.id.take_picture_inner_iv_bg);
       layoutParams.gravity = 17;
       selectShapeV.setVisibility(4);
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(12, Integer.valueOf(resources.getColor(R.color.arg_RES_7f061ce0)));
       xmlAttrHostI1.addAttr(26, integer);
       xmlAttrHostI1.addAttr(14, Integer.valueOf(resources.getColor(R.color.arg_RES_7f061ce1)));
       IAttrHost[] iAttrHostArr1 = new IAttrHost[]{xmlAttrHostI1,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeV.setAttrs(iAttrHostArr1);
       selectShapeV.setLayoutParams(layoutParams);
       uFrameLayout.addView(selectShapeV);
       selectShapeV = new SelectShapeView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(c.b(resources, 0x7f070d7a), c.b(resources, 0x7f070d7a));
       selectShapeV.setId(R.id.take_pic_outer_ring);
       layoutParams.gravity = 17;
       XmlAttrHostImpl xmlAttrHostI2 = new XmlAttrHostImpl();
       xmlAttrHostI2.addAttr(30, Integer.valueOf(resources.getColor(R.color.arg_RES_7f061f72)));
       xmlAttrHostI2.addAttr(26, integer);
       xmlAttrHostI2.addAttr(34, Integer.valueOf((int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources))));
       IAttrHost[] iAttrHostArr2 = new IAttrHost[]{xmlAttrHostI2,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeV.setAttrs(iAttrHostArr2);
       selectShapeV.setLayoutParams(layoutParams);
       uFrameLayout.addView(selectShapeV);
       selectShapeV = new SelectShapeView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 78.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 78.00f, c.c(resources)));
       selectShapeV.setId(R.id.take_pic_ring);
       layoutParams.gravity = 17;
       xmlAttrHostI2 = new XmlAttrHostImpl();
       xmlAttrHostI2.addAttr(30, Integer.valueOf(resources.getColor(0x106000b)));
       xmlAttrHostI2.addAttr(26, integer);
       xmlAttrHostI2.addAttr(34, Integer.valueOf((int)TypedValue.applyDimension(1, 4.00f, c.c(resources))));
       IAttrHost[] iAttrHostArr3 = new IAttrHost[]{xmlAttrHostI2,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeV.setAttrs(iAttrHostArr3);
       selectShapeV.setLayoutParams(layoutParams);
       uFrameLayout.addView(selectShapeV);
       return uFrameLayout;
    }
}
