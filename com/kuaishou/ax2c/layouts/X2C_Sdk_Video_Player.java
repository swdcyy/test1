package com.kuaishou.ax2c.layouts.X2C_Sdk_Video_Player;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kwai.video.editorsdk2.PreviewTextureView;
import android.widget.RelativeLayout$LayoutParams;
import android.view.TextureView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import cw9.c;
import androidx.appcompat.widget.AppCompatImageView;

public class X2C_Sdk_Video_Player implements IViewCreator	// class@001121
{

    public void X2C_Sdk_Video_Player(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setBackgroundColor(resources.getColor(R.color.arg_RES_7f06202f));
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       PreviewTextureView previewTextu = new PreviewTextureView(relativeLayo.getContext());
       previewTextu.setId(R.id.editor_sdk_player);
       previewTextu.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(previewTextu);
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       kwaiImageVie.setId(R.id.editor_sdk_cover);
       kwaiImageVie.setContentDescription(resources.getString(R.string.arg_RES_7f103e1c));
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_CENTER);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.getHierarchy().u(t$b.e);
       kwaiImageVie.getHierarchy().x(0);
       kwaiImageVie.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(kwaiImageVie);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       uAppCompatTe.setId(R.id.video_info);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607d4));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f70));
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setLayoutParams(new RelativeLayout$LayoutParams(-2, -2));
       relativeLayo.addView(uAppCompatTe);
       uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.dump_info);
       layoutParams.addRule(9, -1);
       layoutParams.addRule(15, -1);
       layoutParams.leftMargin = c.b(resources, 0x7f07025d);
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f72));
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607d4));
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setText("DUMP");
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setBackgroundColor(resources.getColor(R.color.arg_RES_7f06006e));
       uAppCompatTe.setPadding(c.b(resources, R.dimen.arg_RES_7f07025d), c.b(resources, R.dimen.arg_RES_7f07025d), c.b(resources, R.dimen.arg_RES_7f07025d), c.b(resources, R.dimen.arg_RES_7f07025d));
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(relativeLayo.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f070323);
       layoutParams = new RelativeLayout$LayoutParams(i, c.b(resources, 0x7f070323));
       layoutParams.addRule(13, -1);
       uAppCompatIm.setId(R.id.iv_player_status);
       uAppCompatIm.setVisibility(8);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f08186d);
       uAppCompatIm.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatIm);
       return relativeLayo;
    }
}
