package com.kuaishou.ax2c.layouts.X2C_Slide_V2_Photo_Detail_Video_Player_Opt;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import com.yxcorp.gifshow.widget.SmartScaleTypeImageView;
import com.kwai.component.photo.detail.slide.widget.MMUMaskView;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import android.view.ViewStub;

public class X2C_Slide_V2_Photo_Detail_Video_Player_Opt implements IViewCreator	// class@001135
{

    public void X2C_Slide_V2_Photo_Detail_Video_Player_Opt(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.player);
       uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.texture_view_frame);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       KwaiImageView kwaiImageVie = new KwaiImageView(uFrameLayout1.getContext());
       kwaiImageVie.setId(R.id.blur_cover);
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_XY);
       kwaiImageVie.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout1.addView(kwaiImageVie);
       KwaiContentFrame kwaiContentF = new KwaiContentFrame(uFrameLayout1.getContext());
       kwaiContentF.setId(R.id.slide_content_frame);
       kwaiContentF.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout1.addView(kwaiContentF);
       SmartScaleTypeImageView smartScaleTy = new SmartScaleTypeImageView(uFrameLayout1.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
       smartScaleTy.setId(R.id.poster);
       layoutParams.gravity = 17;
       smartScaleTy.setLayoutParams(layoutParams);
       uFrameLayout1.addView(smartScaleTy);
       MMUMaskView mMUMaskView = new MMUMaskView(uFrameLayout1.getContext());
       mMUMaskView.setId(R.id.mmu_mask);
       mMUMaskView.setVisibility(8);
       mMUMaskView.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout1.addView(mMUMaskView);
       ScaleHelpView scaleHelpVie = new ScaleHelpView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-1, -1);
       scaleHelpVie.setId(R.id.mask);
       layoutParams1.gravity = 17;
       scaleHelpVie.setLayoutParams(layoutParams1);
       uFrameLayout.addView(scaleHelpVie);
       ViewStub viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.progress_preview_shadow_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d1283);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       return uFrameLayout;
    }
}
