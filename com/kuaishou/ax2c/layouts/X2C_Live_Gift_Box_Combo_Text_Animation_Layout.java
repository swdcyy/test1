package com.kuaishou.ax2c.layouts.X2C_Live_Gift_Box_Combo_Text_Animation_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxComboTextAnimationView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.widget.ImageView;

public class X2C_Live_Gift_Box_Combo_Text_Animation_Layout implements IViewCreator	// class@0010e0
{

    public void X2C_Live_Gift_Box_Combo_Text_Animation_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LiveGiftBoxComboTextAnimationView liveGiftBoxC = new LiveGiftBoxComboTextAnimationView(p0);
       liveGiftBoxC.setOrientation(0);
       liveGiftBoxC.setGravity(17);
       liveGiftBoxC.setLayoutParams(new RelativeLayout$LayoutParams(-2, -2));
       KwaiImageView kwaiImageVie = new KwaiImageView(liveGiftBoxC.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 25.00f, c.c(resources)));
       kwaiImageVie.setId(R.id.live_gift_box_left_combo_text_image_view);
       layoutParams.setMarginEnd((int)TypedValue.applyDimension(1, 3.00f, c.c(resources)));
       kwaiImageVie.setLayoutParams(layoutParams);
       liveGiftBoxC.addView(kwaiImageVie);
       LinearLayout linearLayout = new LinearLayout(liveGiftBoxC.getContext());
       linearLayout.setId(R.id.live_gift_box_combo_number_container);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       liveGiftBoxC.addView(linearLayout);
       kwaiImageVie = new KwaiImageView(liveGiftBoxC.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(c.b(resources, 0x7f070273), c.b(resources, 0x7f070350));
       kwaiImageVie.setId(R.id.live_gift_box_combo_text_animation);
       layoutParams1.bottomMargin = c.b(resources, 0x7f070355);
       layoutParams1.rightMargin = c.b(resources, 0x7f070253);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setLayoutParams(layoutParams1);
       liveGiftBoxC.addView(kwaiImageVie);
       kwaiImageVie = new KwaiImageView(liveGiftBoxC.getContext());
       layoutParams1 = new LinearLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 25.00f, c.c(resources)));
       kwaiImageVie.setId(R.id.live_gift_box_right_top_container);
       layoutParams1.setMarginStart((int)TypedValue.applyDimension(1, 3.00f, c.c(resources)));
       kwaiImageVie.setLayoutParams(layoutParams1);
       liveGiftBoxC.addView(kwaiImageVie);
       liveGiftBoxC.onFinishInflate();
       return liveGiftBoxC;
    }
}
