package com.kuaishou.ax2c.layouts.X2C_Lite_Sidebar_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;
import cw9.c;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.widget.ImageView;

public class X2C_Lite_Sidebar_Container implements IViewCreator	// class@0010c3
{

    public void X2C_Lite_Sidebar_Container(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setId(R.id.live_lite_sidebar_container_view);
       linearLayout.setClipChildren(false);
       linearLayout.setClipToPadding(false);
       linearLayout.setGravity(1);
       linearLayout.setOrientation(1);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -1));
       FrameLayout uFrameLayout = new FrameLayout(linearLayout.getContext());
       uFrameLayout.setId(R.id.lite_sidebar_shrink_view);
       uFrameLayout.setVisibility(8);
       uFrameLayout.setPadding(c.b(resources, R.dimen.arg_RES_7f07034b), c.b(resources, R.dimen.arg_RES_7f07034b), c.b(resources, R.dimen.arg_RES_7f07034b), c.b(resources, R.dimen.arg_RES_7f07034b));
       uFrameLayout.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       linearLayout.addView(uFrameLayout);
       SelectShapeFrameLayout selectShapeF = new SelectShapeFrameLayout(uFrameLayout.getContext());
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f06019c)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(2, Integer.valueOf(c.b(resources, R.dimen.arg_RES_7f07042c)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeF.setAttrs(iAttrHostArr);
       selectShapeF.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f0702e8), c.b(resources, R.dimen.arg_RES_7f0702e8)));
       uFrameLayout.addView(selectShapeF);
       KwaiCDNImageView kwaiCDNImage = new KwaiCDNImageView(selectShapeF.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(c.b(resources, 0x7f0702a4), c.b(resources, 0x7f0702a4));
       layoutParams.gravity = 17;
       kwaiCDNImage.n0(R.string.arg_RES_7f1025a6);
       kwaiCDNImage.setLayoutParams(layoutParams);
       selectShapeF.addView(kwaiCDNImage);
       LinearLayout linearLayout1 = new LinearLayout(linearLayout.getContext());
       linearLayout1.setId(R.id.live_lite_sidebar_biz_container_view);
       linearLayout1.setClipChildren(false);
       linearLayout1.setClipToPadding(false);
       linearLayout1.setOrientation(1);
       linearLayout1.setGravity(1);
       linearLayout1.setLayoutParams(new LinearLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f070592), -1));
       linearLayout.addView(linearLayout1);
       return linearLayout;
    }
}
