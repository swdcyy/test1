package com.kuaishou.ax2c.layouts.X2C_Live_Top_Bar_Anchor_Avatar_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import androidx.core.content.ContextCompat;
import com.facebook.drawee.generic.RoundingParams;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.widget.ImageView$ScaleType;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import android.view.ViewStub;
import com.yxcorp.gifshow.image.KwaiImageView;
import xb.t$b;
import com.facebook.drawee.view.SimpleDraweeView;

public class X2C_Live_Top_Bar_Anchor_Avatar_Container_Layout implements IViewCreator	// class@001113
{

    public void X2C_Live_Top_Bar_Anchor_Avatar_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       Context uContext = p0;
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(uContext);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070982), c.b(resources, 0x7f070984));
       uFrameLayout.setId(R.id.live_anchor_avatar_container);
       layoutParams.setMarginStart(c.b(resources, R.dimen.arg_RES_7f0702e3));
       layoutParams.addRule(15, -1);
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setLayoutParams(layoutParams);
       LiveUserView liveUserView = new LiveUserView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(c.b(resources, 0x7f070982), c.b(resources, 0x7f070982));
       liveUserView.setId(R.id.live_anchor_avatar_new_like_icon);
       layoutParams1.gravity = 16;
       liveUserView.setBackgroundDrawable(null);
       liveUserView.setBorderColor(resources.getColor(R.color.arg_RES_7f061e52));
       liveUserView.setBorderWidth((int)TypedValue.applyDimension(1, 0x3fc00000, c.c(resources)));
       liveUserView.setEnableBorder(false);
       liveUserView.getHierarchy().F(ContextCompat.getDrawable(uContext, R.drawable.detail_avatar_secret));
       liveUserView.getHierarchy().L(RoundingParams.a());
       liveUserView.setVisibility(8);
       liveUserView.setLayoutParams(layoutParams1);
       uFrameLayout.addView(liveUserView);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(uFrameLayout.getContext());
       layoutParams1 = new FrameLayout$LayoutParams(c.b(resources, 0x7f070321), c.b(resources, 0x7f070321));
       liveLottieAn.setId(R.id.live_like_avatar_lottie_back);
       layoutParams1.gravity = 17;
       liveLottieAn.setLayoutParams(layoutParams1);
       uFrameLayout.addView(liveLottieAn);
       liveUserView = new LiveUserView(uFrameLayout.getContext());
       layoutParams1 = new FrameLayout$LayoutParams(c.b(resources, 0x7f070982), c.b(resources, 0x7f070982));
       liveUserView.setId(R.id.live_anchor_avatar_icon);
       layoutParams1.gravity = 16;
       liveUserView.setBackgroundDrawable(null);
       liveUserView.setScaleType(ImageView$ScaleType.FIT_XY);
       liveUserView.setBorderColor(resources.getColor(R.color.arg_RES_7f060788));
       liveUserView.setBorderWidth((int)TypedValue.applyDimension(1, 0x3fc00000, c.c(resources)));
       liveUserView.setEnableBorder(false);
       liveUserView.getHierarchy().L(RoundingParams.a());
       liveUserView.setLayoutParams(layoutParams1);
       uFrameLayout.addView(liveUserView);
       liveLottieAn = new LiveLottieAnimationView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(c.b(resources, 0x7f070321), c.b(resources, 0x7f070321));
       liveLottieAn.setId(R.id.live_like_avatar_lottie_front);
       layoutParams2.gravity = 17;
       liveLottieAn.setLayoutParams(layoutParams2);
       uFrameLayout.addView(liveLottieAn);
       SelectShapeTextView selectShapeT = new SelectShapeTextView(uFrameLayout.getContext());
       layoutParams2 = new FrameLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 12.00f, c.c(resources)));
       selectShapeT.setId(R.id.live_natural_look_label);
       layoutParams2.gravity = 81;
       selectShapeT.setGravity(17);
       selectShapeT.setText(R.string.arg_RES_7f102840);
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f060753));
       selectShapeT.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f07033f));
       selectShapeT.setVisibility(8);
       selectShapeT.setPadding(c.b(resources, R.dimen.arg_RES_7f07030a), false, c.b(resources, R.dimen.arg_RES_7f07030a), false);
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f0620d1)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(2, Integer.valueOf(c.b(resources, R.dimen.arg_RES_7f07042c)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(layoutParams2);
       uFrameLayout.addView(selectShapeT);
       ViewStub viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       FrameLayout$LayoutParams layoutParams3 = new FrameLayout$LayoutParams(c.b(resources, 0x7f0702fd), c.b(resources, 0x7f070271));
       viewStub.setId(R.id.live_voice_party_gold_room_label);
       layoutParams3.gravity = 81;
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0e4c);
       viewStub.setLayoutParams(layoutParams3);
       uFrameLayout.addView(viewStub);
       KwaiImageView kwaiImageVie = new KwaiImageView(uFrameLayout.getContext());
       layoutParams3 = new FrameLayout$LayoutParams(c.b(resources, 0x7f07030d), c.b(resources, 0x7f07030d));
       kwaiImageVie.setId(R.id.live_score_rank_avatar_ring_image_view);
       layoutParams3.gravity = 17;
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.getHierarchy().u(t$b.a);
       kwaiImageVie.setLayoutParams(layoutParams3);
       uFrameLayout.addView(kwaiImageVie);
       kwaiImageVie = new KwaiImageView(uFrameLayout.getContext());
       layoutParams3 = new FrameLayout$LayoutParams(c.b(resources, 0x7f0702a4), c.b(resources, 0x7f0702a4));
       kwaiImageVie.setId(R.id.live_anchor_birthday_hat_view);
       layoutParams3.leftMargin = (int)TypedValue.applyDimension(1, -7.00f, c.c(resources));
       layoutParams3.topMargin = (int)TypedValue.applyDimension(1, -2.00f, c.c(resources));
       kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setActualImageResource(R.drawable.arg_RES_7f0812c1);
       kwaiImageVie.setLayoutParams(layoutParams3);
       uFrameLayout.addView(kwaiImageVie);
       kwaiImageVie = new KwaiImageView(uFrameLayout.getContext());
       layoutParams3 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 27.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 12.00f, c.c(resources)));
       kwaiImageVie.setId(R.id.live_natural_trustbuy_label);
       layoutParams3.gravity = 81;
       kwaiImageVie.setLayoutParams(layoutParams3);
       uFrameLayout.addView(kwaiImageVie);
       return uFrameLayout;
    }
}