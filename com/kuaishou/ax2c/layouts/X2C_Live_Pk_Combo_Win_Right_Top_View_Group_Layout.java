package com.kuaishou.ax2c.layouts.X2C_Live_Pk_Combo_Win_Right_Top_View_Group_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import cw9.c;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.kuaishou.ax2c.layouts.X2C_Live_Pk_Combo_Win_Number_Scroll_Layout;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import android.widget.TextView;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;

public class X2C_Live_Pk_Combo_Win_Right_Top_View_Group_Layout implements IViewCreator	// class@001108
{

    public void X2C_Live_Pk_Combo_Win_Right_Top_View_Group_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       SelectShapeConstraintLayout selectShapeC = new SelectShapeConstraintLayout(p0);
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, c.b(resources, 0x7f0702c5));
       layoutParams.setMarginEnd(c.b(resources, R.dimen.pv));
       layoutParams.topMargin = c.b(resources, 0x7f0702e2);
       layoutParams.p = 0;
       layoutParams.h = 0;
       layoutParams.c();
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(12, Integer.valueOf(resources.getColor(R.color.arg_RES_7f060275)));
       xmlAttrHostI.addAttr(8, Integer.valueOf(0));
       xmlAttrHostI.addAttr(14, Integer.valueOf(resources.getColor(R.color.arg_RES_7f060310)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(2, Integer.valueOf(c.b(resources, R.dimen.arg_RES_7f070420)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeC.setAttrs(iAttrHostArr);
       selectShapeC.setLayoutParams(layoutParams);
       View view = new X2C_Live_Pk_Combo_Win_Number_Scroll_Layout().createView(selectShapeC.getContext());
       ConstraintLayout$LayoutParams layoutParams1 = view.getLayoutParams();
       view.setId(R.id.live_pk_right_combo_win_number_scroll_view);
       layoutParams1.setMarginStart(c.b(resources, R.dimen.arg_RES_7f070334));
       layoutParams1.k = 0;
       layoutParams1.r = 0x7f0a2294;
       layoutParams1.q = 0;
       layoutParams1.h = 0;
       layoutParams1.c();
       view.setLayoutParams(layoutParams1);
       selectShapeC.addView(view);
       LiveMediumTextView liveMediumTe = new LiveMediumTextView(selectShapeC.getContext());
       layoutParams1 = new ConstraintLayout$LayoutParams(-2, c.b(resources, 0x7f0702a4));
       liveMediumTe.setId(R.id.live_pk_right_combo_win_tip_text_view);
       liveMediumTe.setMinWidth(c.b(resources, R.dimen.arg_RES_7f0702cc));
       layoutParams1.setMarginStart(c.b(resources, R.dimen.arg_RES_7f0702e3));
       liveMediumTe.setGravity(17);
       liveMediumTe.setIncludeFontPadding(0);
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), liveMediumTe.getShadowDx(), liveMediumTe.getShadowDy(), resources.getColor(R.color.arg_RES_7f06028a));
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), 0x3f800000, liveMediumTe.getShadowDy(), liveMediumTe.getShadowColor());
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), liveMediumTe.getShadowDx(), 0x3f800000, liveMediumTe.getShadowColor());
       liveMediumTe.setShadowLayer(0x3f800000, liveMediumTe.getShadowDx(), liveMediumTe.getShadowDy(), liveMediumTe.getShadowColor());
       liveMediumTe.setText("Á¬Ê¤");
       liveMediumTe.setTextColor(resources.getColor(R.color.arg_RES_7f061e52));
       liveMediumTe.setTextSize(1, 12.00f);
       layoutParams1.k = 0;
       layoutParams1.r = 0x7f0a2292;
       layoutParams1.p = 0x7f0a2293;
       layoutParams1.h = 0;
       layoutParams1.c();
       liveMediumTe.setLayoutParams(layoutParams1);
       selectShapeC.addView(liveMediumTe);
       KwaiImageView kwaiImageVie = new KwaiImageView(selectShapeC.getContext());
       ConstraintLayout$LayoutParams layoutParams2 = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f0702b8), c.b(resources, 0x7f0702b8));
       kwaiImageVie.setId(R.id.live_pk_right_combo_win_icon_image_view);
       layoutParams2.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f07034b));
       layoutParams2.setMarginStart(c.b(resources, R.dimen.arg_RES_7f07031b));
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_CENTER);
       kwaiImageVie.setImageResource(R.drawable.arg_RES_7f08147c);
       layoutParams2.k = 0;
       layoutParams2.s = 0;
       layoutParams2.p = 0x7f0a2294;
       layoutParams2.h = 0;
       layoutParams2.c();
       kwaiImageVie.setLayoutParams(layoutParams2);
       selectShapeC.addView(kwaiImageVie);
       return selectShapeC;
    }
}
