package com.kuaishou.ax2c.layouts.X2C_Live_Multi_Pk_Audience_Widget_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import cw9.c;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

public class X2C_Live_Multi_Pk_Audience_Widget_Layout implements IViewCreator	// class@001100
{

    public void X2C_Live_Multi_Pk_Audience_Widget_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       ViewStub viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_multi_pk_audio_widget_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0cb9);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_multi_pk_duet_continuous_win_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0cce);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       LiveMediumTextView liveMediumTe = new LiveMediumTextView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f0702be));
       liveMediumTe.setId(R.id.live_multi_pk_user_tag);
       liveMediumTe.setGravity(17);
       liveMediumTe.setVisibility(8);
       liveMediumTe.setTextSize(0, (float)c.b(resources, R.dimen.pv));
       liveMediumTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607c6));
       layoutParams.topMargin = c.b(resources, 0x7f070334);
       layoutParams.leftMargin = c.b(resources, 0x7f070334);
       layoutParams.rightMargin = c.b(resources, 0x7f070334);
       liveMediumTe.setLayoutParams(layoutParams);
       uFrameLayout.addView(liveMediumTe);
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       uFrameLayout1.setId(R.id.live_multi_pk_info_container);
       layoutParams.gravity = 85;
       layoutParams.bottomMargin = c.b(resources, 0x7f070846);
       layoutParams.rightMargin = c.b(resources, 0x7f070864);
       uFrameLayout1.setLayoutParams(layoutParams);
       uFrameLayout.addView(uFrameLayout1);
       uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       uFrameLayout1.setId(R.id.live_wish_list_item_container);
       layoutParams.gravity = 80;
       layoutParams.bottomMargin = c.b(resources, 0x7f070334);
       layoutParams.leftMargin = c.b(resources, 0x7f070334);
       uFrameLayout1.setVisibility(8);
       uFrameLayout1.setLayoutParams(layoutParams);
       uFrameLayout.addView(uFrameLayout1);
       return uFrameLayout;
    }
}
