package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Multi_Line_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import cw9.c;
import android.widget.LinearLayout;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;

public class X2C_Live_Lite_Multi_Line_Container_Layout implements IViewCreator	// class@0010f9
{

    public void X2C_Live_Lite_Multi_Line_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       LiveInteractWidgetContainer liveInteract = new LiveInteractWidgetContainer(uFrameLayout.getContext());
       liveInteract.setId(R.id.live_audience_multi_line_flex_layout);
       liveInteract.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(liveInteract);
       SelectShapeLinearLayout selectShapeL = new SelectShapeLinearLayout(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f0702b8));
       selectShapeL.setId(R.id.live_multi_line_top_tag_container);
       layoutParams.gravity = 49;
       selectShapeL.setVisibility(0);
       selectShapeL.setPadding(c.b(resources, R.dimen.arg_RES_7f07025d), 0, c.b(resources, R.dimen.arg_RES_7f07025d), c.b(resources, R.dimen.arg_RES_7f0702ac));
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f061c14)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(1, Integer.valueOf((int)TypedValue.applyDimension(1, 12.00f, c.c(resources))));
       xmlAttrHostI1.addAttr(0, Integer.valueOf((int)TypedValue.applyDimension(1, 12.00f, c.c(resources))));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeL.setAttrs(iAttrHostArr);
       selectShapeL.setLayoutParams(layoutParams);
       uFrameLayout.addView(selectShapeL);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(selectShapeL.getContext());
       uAppCompatTe.setId(R.id.live_multi_line_top_tag);
       uAppCompatTe.setGravity(16);
       uAppCompatTe.setText(R.string.arg_RES_7f10257c);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f060cf6));
       uAppCompatTe.setTextSize(1, 11.00f);
       uAppCompatTe.setLayoutParams(new LinearLayout$LayoutParams(-2, -1));
       selectShapeL.addView(uAppCompatTe);
       return uFrameLayout;
    }
}
