package com.kuaishou.ax2c.layouts.X2C_Camera_Action_Bar_Album_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kwai.feature.post.api.flywheel.widget.FlyWheelConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeView;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import android.widget.ImageView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import com.yxcorp.gifshow.widget.textview.PressedDisableWithAlphaImageView;
import com.yxcorp.gifshow.widget.PressedImageView;
import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import androidx.core.content.ContextCompat;
import android.view.ViewStub;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;

public class X2C_Camera_Action_Bar_Album_Layout implements IViewCreator	// class@00108d
{

    public void X2C_Camera_Action_Bar_Album_Layout(){
       super();
    }
    public View createView(Context p0){
       Context uContext = p0;
       Resources resources = p0.getResources();
       FlyWheelConstraintLayout uFlyWheelCon = new FlyWheelConstraintLayout(uContext);
       uFlyWheelCon.setId(R.id.album_layout);
       uFlyWheelCon.setClipChildren(false);
       uFlyWheelCon.setTKContainerId(R.id.fly_wheel_album_tk_container);
       uFlyWheelCon.setTextViewId(R.id.button_album_tv);
       uFlyWheelCon.setLayoutParams(new ConstraintLayout$LayoutParams(-2, -2));
       LinearLayout linearLayout = new LinearLayout(uFlyWheelCon.getContext());
       linearLayout.setGravity(1);
       linearLayout.setClipChildren(false);
       linearLayout.setOrientation(1);
       linearLayout.setLayoutParams(new ConstraintLayout$LayoutParams(-2, -2));
       uFlyWheelCon.addView(linearLayout);
       FrameLayout uFrameLayout = new FrameLayout(linearLayout.getContext());
       uFrameLayout.setId(R.id.button_album_container);
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       linearLayout.addView(uFrameLayout);
       SelectShapeView selectShapeV = new SelectShapeView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(c.b(resources, 0x7f070319), c.b(resources, 0x7f070319));
       selectShapeV.setId(R.id.button_album_color_bg);
       layoutParams.gravity = 17;
       selectShapeV.setVisibility(8);
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(26, Integer.valueOf(1));
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f061cea)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeV.setAttrs(iAttrHostArr);
       selectShapeV.setLayoutParams(layoutParams);
       uFrameLayout.addView(selectShapeV);
       PressedDisableWithAlphaImageView pressedDisab = new PressedDisableWithAlphaImageView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(c.b(resources, 0x7f07008e), c.b(resources, 0x7f07008e));
       pressedDisab.setId(R.id.button_album_frame);
       layoutParams1.gravity = 1;
       pressedDisab.setImageResource(R.drawable.arg_RES_7f081bd6);
       pressedDisab.setVisibility(4);
       pressedDisab.setLayoutParams(layoutParams1);
       uFrameLayout.addView(pressedDisab);
       PressedImageView pressedImage = new PressedImageView(uFrameLayout.getContext());
       layoutParams1 = new FrameLayout$LayoutParams(c.b(resources, 0x7f07008e), c.b(resources, 0x7f07008e));
       pressedImage.setBackgroundDrawable(null);
       pressedImage.setScaleType(ImageView$ScaleType.FIT_CENTER);
       pressedImage.setId(R.id.button_album);
       layoutParams1.gravity = 17;
       pressedImage.getHierarchy().F(ContextCompat.getDrawable(uContext, R.drawable.arg_RES_7f081bd4));
       pressedImage.setPressedAlpha(0.40f);
       pressedImage.setLayoutParams(layoutParams1);
       uFrameLayout.addView(pressedImage);
       ViewStub viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(c.b(resources, 0x7f07008e), c.b(resources, 0x7f07008e));
       viewStub.setId(R.id.pie_chart_progress_album_stub);
       layoutParams2.gravity = 17;
       layoutParams2.leftMargin = (int)TypedValue.applyDimension(1, 4.50f, c.c(resources));
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d115d);
       viewStub.setLayoutParams(layoutParams2);
       uFrameLayout.addView(viewStub);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       uAppCompatTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070f6d));
       uAppCompatTe.setShadowLayer(0x3f800000, uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setSingleLine(1);
       uAppCompatTe.setMaxWidth(c.b(resources, R.dimen.arg_RES_7f07011f));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), 3.00f, uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), resources.getColor(R.color.arg_RES_7f06010e));
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f060113));
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), 3.00f, uAppCompatTe.getShadowColor());
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setIncludeFontPadding(false);
       uAppCompatTe.setId(R.id.button_album_tv);
       uAppCompatTe.setText(R.string.arg_RES_7f103189);
       uAppCompatTe.setLayoutParams(new LinearLayout$LayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f070120)));
       linearLayout.addView(uAppCompatTe);
       ConstraintLayout uConstraintL = new ConstraintLayout(uFlyWheelCon.getContext());
       ConstraintLayout$LayoutParams layoutParams3 = new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(1, 0, c.c(resources)), (int)TypedValue.applyDimension(1, 0, c.c(resources)));
       uConstraintL.setId(R.id.fly_wheel_album_tk_container);
       layoutParams3.k = 0;
       layoutParams3.d = 0;
       layoutParams3.g = 0;
       layoutParams3.h = 0;
       layoutParams3.c();
       uConstraintL.setLayoutParams(layoutParams3);
       uFlyWheelCon.addView(uConstraintL);
       return uFlyWheelCon;
    }
}