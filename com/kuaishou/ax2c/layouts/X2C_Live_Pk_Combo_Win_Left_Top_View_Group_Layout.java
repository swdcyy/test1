package com.kuaishou.ax2c.layouts.X2C_Live_Pk_Combo_Win_Left_Top_View_Group_Layout;
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
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.kuaishou.ax2c.layouts.X2C_Live_Pk_Combo_Win_Number_Scroll_Layout;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import android.widget.TextView;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;

public class X2C_Live_Pk_Combo_Win_Left_Top_View_Group_Layout implements IViewCreator	// class@001106
{

    public void X2C_Live_Pk_Combo_Win_Left_Top_View_Group_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       SelectShapeConstraintLayout selectShapeC = new SelectShapeConstraintLayout(p0);
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, c.b(resources, 0x7f0702c5));
       layoutParams.setMarginStart(c.b(resources, R.dimen.pv));
       layoutParams.topMargin = c.b(resources, 0x7f0702e2);
       layoutParams.r = 0;
       layoutParams.h = 0;
       layoutParams.c();
       IAttrHost[] iAttrHostArr = new IAttrHost[]{new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeC.setAttrs(iAttrHostArr);
       selectShapeC.setLayoutParams(layoutParams);
       KwaiImageView kwaiImageVie = new KwaiImageView(selectShapeC.getContext());
       ConstraintLayout$LayoutParams layoutParams1 = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f0702b8), c.b(resources, 0x7f0702b8));
       kwaiImageVie.setId(R.id.live_pk_left_combo_win_icon_image_view);
       layoutParams1.setMarginStart(c.b(resources, R.dimen.arg_RES_7f07034b));
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_CENTER);
       kwaiImageVie.setImageResource(R.drawable.arg_RES_7f08147c);
       layoutParams1.k = 0;
       layoutParams1.r = 0x7f0a2274;
       layoutParams1.q = 0;
       layoutParams1.h = 0;
       layoutParams1.c();
       kwaiImageVie.setLayoutParams(layoutParams1);
       selectShapeC.addView(kwaiImageVie);
       View view = new X2C_Live_Pk_Combo_Win_Number_Scroll_Layout().createView(selectShapeC.getContext());
       layoutParams1 = view.getLayoutParams();
       view.setId(R.id.live_pk_left_combo_win_number_scroll_view);
       layoutParams1.setMarginStart(c.b(resources, R.dimen.arg_RES_7f0702e3));
       layoutParams1.k = 0;
       layoutParams1.r = 0x7f0a2275;
       layoutParams1.p = 0x7f0a2273;
       layoutParams1.h = 0;
       layoutParams1.c();
       view.setLayoutParams(layoutParams1);
       selectShapeC.addView(view);
       LiveMediumTextView liveMediumTe = new LiveMediumTextView(selectShapeC.getContext());
       layoutParams1 = new ConstraintLayout$LayoutParams(-2, c.b(resources, 0x7f0702a4));
       liveMediumTe.setId(R.id.live_pk_left_combo_win_tip_text_view);
       liveMediumTe.setMinWidth(c.b(resources, R.dimen.arg_RES_7f0702cc));
       layoutParams1.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f07034b));
       layoutParams1.setMarginStart(c.b(resources, R.dimen.arg_RES_7f0702e3));
       liveMediumTe.setGravity(17);
       liveMediumTe.setIncludeFontPadding(0);
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), liveMediumTe.getShadowDx(), liveMediumTe.getShadowDy(), resources.getColor(R.color.arg_RES_7f06042c));
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), 0x3f800000, liveMediumTe.getShadowDy(), liveMediumTe.getShadowColor());
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), liveMediumTe.getShadowDx(), 0x3f800000, liveMediumTe.getShadowColor());
       liveMediumTe.setShadowLayer(0x3f800000, liveMediumTe.getShadowDx(), liveMediumTe.getShadowDy(), liveMediumTe.getShadowColor());
       liveMediumTe.setText("Á¬Ê¤");
       liveMediumTe.setTextColor(resources.getColor(R.color.arg_RES_7f061e52));
       liveMediumTe.setTextSize(1, 12.00f);
       layoutParams1.k = 0;
       layoutParams1.s = 0;
       layoutParams1.p = 0x7f0a2274;
       layoutParams1.h = 0;
       layoutParams1.c();
       liveMediumTe.setLayoutParams(layoutParams1);
       selectShapeC.addView(liveMediumTe);
       return selectShapeC;
    }
}
