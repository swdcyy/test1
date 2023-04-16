package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Line_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import cw9.c;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import com.kuaishou.ax2c.layouts.X2C_Live_Line_Peer_Info_Layout;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;

public class X2C_Live_Audience_Line_Container_Layout implements IViewCreator	// class@0010db
{

    public void X2C_Live_Audience_Line_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.live_line_container);
       relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       LinearLayout linearLayout = new LinearLayout(relativeLayo.getContext());
       linearLayout.setId(R.id.live_line_area_float_container);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(new RelativeLayout$LayoutParams(-1, -2));
       relativeLayo.addView(linearLayout);
       View view = new View(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -1);
       view.setId(R.id.live_line_self_click_view);
       layoutParams.weight = 0x3f800000;
       view.setLayoutParams(layoutParams);
       linearLayout.addView(view);
       view = new View(linearLayout.getContext());
       layoutParams = new LinearLayout$LayoutParams(-2, -1);
       view.setId(R.id.live_line_peer_click_view);
       layoutParams.weight = 0x3f800000;
       view.setLayoutParams(layoutParams);
       linearLayout.addView(view);
       SelectShapeTextView selectShapeT = new SelectShapeTextView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-2, c.b(resources, 0x7f0702b8));
       selectShapeT.setId(R.id.live_line_top_tag_container);
       layoutParams1.addRule(6, R.id.live_line_area_float_container);
       selectShapeT.setGravity(16);
       layoutParams1.addRule(14, -1);
       selectShapeT.setTextSize(1, 11.00f);
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f060cf6));
       selectShapeT.setText(R.string.arg_RES_7f10257c);
       selectShapeT.setVisibility(8);
       selectShapeT.setPadding(c.b(resources, R.dimen.arg_RES_7f07025d), 0, c.b(resources, R.dimen.arg_RES_7f07025d), c.b(resources, R.dimen.arg_RES_7f0702ac));
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f061c14)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(1, Integer.valueOf((int)TypedValue.applyDimension(1, 12.00f, c.c(resources))));
       xmlAttrHostI1.addAttr(0, Integer.valueOf((int)TypedValue.applyDimension(1, 12.00f, c.c(resources))));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(layoutParams1);
       relativeLayo.addView(selectShapeT);
       View view1 = new X2C_Live_Line_Peer_Info_Layout().createView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams2 = view1.getLayoutParams();
       view1.setId(R.id.live_line_peer_info_layout);
       layoutParams2.addRule(19, R.id.live_line_area_float_container);
       layoutParams2.addRule(8, R.id.live_line_area_float_container);
       layoutParams2.bottomMargin = c.b(resources, 0x7f070267);
       layoutParams2.setMarginEnd(c.b(resources, R.dimen.pv));
       view1.setVisibility(8);
       view1.setLayoutParams(layoutParams2);
       relativeLayo.addView(view1);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(relativeLayo.getContext());
       layoutParams2 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702cc), c.b(resources, 0x7f0702cc));
       uAppCompatIm.setId(R.id.live_line_mute_peer_view);
       layoutParams2.addRule(6, R.id.live_line_area_float_container);
       layoutParams2.addRule(19, R.id.live_line_area_float_container);
       layoutParams2.topMargin = c.b(resources, 0x7f07027a);
       layoutParams2.setMarginEnd(c.b(resources, R.dimen.pv));
       uAppCompatIm.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f0813bc);
       uAppCompatIm.setVisibility(8);
       uAppCompatIm.setLayoutParams(layoutParams2);
       relativeLayo.addView(uAppCompatIm);
       return relativeLayo;
    }
}
