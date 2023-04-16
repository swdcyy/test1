package com.kuaishou.ax2c.layouts.X2C_Live_Gzone_Right_Bottom_Pendant_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.live.common.gzone.pendant.LiveScaleFrameLayout;
import com.kwai.live.gzone.widget.LiveGzoneRingProgressImageView;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.graphics.Typeface;

public class X2C_Live_Gzone_Right_Bottom_Pendant_Container implements IViewCreator	// class@0010e6
{

    public void X2C_Live_Gzone_Right_Bottom_Pendant_Container(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 248.00f, c.c(resources)));
       uFrameLayout.setId(R.id.live_gzone_right_bottom_pendant_container);
       layoutParams.addRule(11, -1);
       layoutParams.addRule(12, -1);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 322.00f, c.c(resources));
       layoutParams.bottomMargin = c.b(resources, 0x7f0707bc);
       uFrameLayout.setVisibility(8);
       uFrameLayout.setLayoutParams(layoutParams);
       ViewStub viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_gzone_audience_accompany_pendant_stub);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f0707ef), c.b(resources, R.dimen.arg_RES_7f0707ef)));
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_gzone_guess_pendant_stub);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f0707ef), c.b(resources, R.dimen.arg_RES_7f0707ef)));
       uFrameLayout.addView(viewStub);
       LiveScaleFrameLayout liveScaleFra = new LiveScaleFrameLayout(uFrameLayout.getContext());
       liveScaleFra.setId(R.id.live_gzone_vote_container);
       liveScaleFra.setVisibility(8);
       liveScaleFra.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
       uFrameLayout.addView(liveScaleFra);
       FrameLayout uFrameLayout1 = new FrameLayout(liveScaleFra.getContext());
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f0707ef), c.b(resources, R.dimen.arg_RES_7f0707ef)));
       liveScaleFra.addView(uFrameLayout1);
       LiveGzoneRingProgressImageView liveGzoneRin = new LiveGzoneRingProgressImageView(uFrameLayout1.getContext());
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-1, -1);
       liveGzoneRin.setId(R.id.live_vote);
       layoutParams1.gravity = 1;
       liveGzoneRin.setImageResource(R.drawable.arg_RES_7f08127d);
       liveGzoneRin.setLayoutParams(layoutParams1);
       uFrameLayout1.addView(liveGzoneRin);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uFrameLayout1.getContext());
       layoutParams1 = new FrameLayout$LayoutParams(-2, -2);
       layoutParams1.gravity = 81;
       layoutParams1.bottomMargin = (int)TypedValue.applyDimension(1, 13.00f, c.c(resources));
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setIncludeFontPadding(false);
       uAppCompatTe.setMinHeight((int)TypedValue.applyDimension(1, 12.00f, c.c(resources)));
       uAppCompatTe.setText(R.string.arg_RES_7f102e88);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f06143e));
       uAppCompatTe.setTextSize(1, 8.00f);
       uAppCompatTe.setTypeface(null, 1);
       uAppCompatTe.setLayoutParams(layoutParams1);
       uFrameLayout1.addView(uAppCompatTe);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_bottom_turntable_view_stub);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f0707ef), c.b(resources, R.dimen.arg_RES_7f0707ef)));
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       int i = c.b(resources, R.dimen.arg_RES_7f0707ef);
       viewStub.setId(R.id.live_gzone_vote_pendant_view_stub);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(i, c.b(resources, R.dimen.arg_RES_7f0707ef)));
       uFrameLayout.addView(viewStub);
       return uFrameLayout;
    }
}
