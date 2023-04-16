package com.kuaishou.ax2c.layouts.X2C_Share_Preview_Cover_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import cw9.c;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.FrameLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;

public class X2C_Share_Preview_Cover_Container implements IViewCreator	// class@00112e
{

    public void X2C_Share_Preview_Cover_Container(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       int i = -2;
       relativeLayo.setId(R.id.fl_preview_container);
       relativeLayo.setLayoutParams(new ConstraintLayout$LayoutParams(i, i));
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       int i1 = -1;
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i1, i1);
       kwaiImageVie.setId(R.id.post_cover);
       kwaiImageVie.setContentDescription(resources.getString(R.string.arg_RES_7f103bfd));
       kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
       kwaiImageVie.setImageResource(R.drawable.arg_RES_7f081aca);
       if (kwaiImageVie.getHierarchy().n() == null) {
          kwaiImageVie.getHierarchy().L(new RoundingParams());
       }
       kwaiImageVie.getHierarchy().n().n((float)c.b(resources, R.dimen.arg_RES_7f07042b));
       kwaiImageVie.setLayoutParams(layoutParams);
       relativeLayo.addView(kwaiImageVie);
       View view = new View(relativeLayo.getContext());
       view.setId(R.id.post_cover_shape);
       view.setBackgroundResource(R.drawable.arg_RES_7f081feb);
       view.setLayoutParams(new RelativeLayout$LayoutParams(i1, i1));
       relativeLayo.addView(view);
       FrameLayout uFrameLayout = new FrameLayout(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(i1, i1);
       layoutParams.addRule(2, R.id.tv_edit_photo_wrap);
       uFrameLayout.setLayoutParams(layoutParams);
       relativeLayo.addView(uFrameLayout);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(i, i);
       uAppCompatIm.setId(R.id.video_play_icon);
       layoutParams1.gravity = 17;
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f081e2b);
       uAppCompatIm.setLayoutParams(layoutParams1);
       uFrameLayout.addView(uAppCompatIm);
       uFrameLayout = new FrameLayout(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(i1, c.b(resources, 0x7f0702da));
       uFrameLayout.setId(R.id.tv_edit_photo_wrap);
       layoutParams.addRule(12, i1);
       uFrameLayout.setBackgroundResource(R.drawable.arg_RES_7f081dc4);
       uFrameLayout.setVisibility(8);
       uFrameLayout.setLayoutParams(layoutParams);
       relativeLayo.addView(uFrameLayout);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(i, i);
       uAppCompatTe.setId(R.id.tv_edit_photo);
       layoutParams2.gravity = 17;
       uAppCompatTe.setText(R.string.arg_RES_7f100f15);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061ff3));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       uAppCompatTe.setLayoutParams(layoutParams2);
       uFrameLayout.addView(uAppCompatTe);
       return relativeLayo;
    }
}
