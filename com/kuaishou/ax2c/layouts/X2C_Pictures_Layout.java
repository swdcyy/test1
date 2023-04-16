package com.kuaishou.ax2c.layouts.X2C_Pictures_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.gifshow.widget.PicturesContainer;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.CustomRecyclerView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public class X2C_Pictures_Layout implements IViewCreator	// class@00111e
{

    public void X2C_Pictures_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       PicturesContainer picturesCont = new PicturesContainer(p0);
       picturesCont.setId(R.id.pictures_container);
       picturesCont.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       CustomRecyclerView uCustomRecyc = new CustomRecyclerView(picturesCont.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
       uCustomRecyc.setId(R.id.picture_recycler_view);
       layoutParams.gravity = 17;
       uCustomRecyc.setLayoutParams(layoutParams);
       picturesCont.addView(uCustomRecyc);
       View view = new View(picturesCont.getContext());
       view.setVisibility(8);
       view.setId(R.id.long_pic_event_view);
       view.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       picturesCont.addView(view);
       RecyclerViewCirclePagerIndicator recyclerView = new RecyclerViewCirclePagerIndicator(picturesCont.getContext());
       layoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 105.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 25.00f, c.c(resources)));
       recyclerView.setId(R.id.pager_indicator);
       layoutParams.gravity = 81;
       layoutParams.bottomMargin = (int)TypedValue.applyDimension(1, 180.00f, c.c(resources));
       recyclerView.setIndicatorHeight((int)TypedValue.applyDimension(1, 2.50f, c.c(resources)));
       recyclerView.setIndicatorMargin((int)TypedValue.applyDimension(1, 3.00f, c.c(resources)));
       recyclerView.setIndicatorWidth((int)TypedValue.applyDimension(1, 2.50f, c.c(resources)));
       recyclerView.setLayoutParams(layoutParams);
       picturesCont.addView(recyclerView);
       LinearLayout linearLayout = new LinearLayout(picturesCont.getContext());
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       linearLayout.setId(R.id.pager_text_hint);
       layoutParams.gravity = 81;
       layoutParams.bottomMargin = (int)TypedValue.applyDimension(1, 200.00f, c.c(resources));
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(layoutParams);
       picturesCont.addView(linearLayout);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       uAppCompatTe.setId(R.id.current_progress_text);
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), resources.getColor(R.color.arg_RES_7f062040));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), 0, uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), 0x3f800000, uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(3.00f, uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061fd5));
       uAppCompatTe.setTextSize(1, 12.00f);
       uAppCompatTe.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       linearLayout.addView(uAppCompatTe);
       uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       uAppCompatTe.setId(R.id.total_progress_text);
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), resources.getColor(R.color.arg_RES_7f062040));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), 0, uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), 0x3f800000, uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(3.00f, uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061fd5));
       uAppCompatTe.setTextSize(1, 12.00f);
       uAppCompatTe.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       linearLayout.addView(uAppCompatTe);
       KwaiImageView kwaiImageVie = new KwaiImageView(picturesCont.getContext());
       layoutParams = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f070325));
       kwaiImageVie.setId(R.id.long_picture_blank_area);
       kwaiImageVie.setBackgroundColor(resources.getColor(R.color.arg_RES_7f0600a6));
       layoutParams.gravity = 80;
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setLayoutParams(layoutParams);
       picturesCont.addView(kwaiImageVie);
       return picturesCont;
    }
}
