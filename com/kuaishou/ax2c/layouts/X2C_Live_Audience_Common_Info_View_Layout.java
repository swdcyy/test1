package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Common_Info_View_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.widget.ShootMarqueeView;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

public class X2C_Live_Audience_Common_Info_View_Layout implements IViewCreator	// class@0010d8
{

    public void X2C_Live_Audience_Common_Info_View_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_common_info_view_container);
       uFrameLayout.setLayoutParams(new RelativeLayout$LayoutParams(-2, -2));
       ShootMarqueeView shootMarquee = new ShootMarqueeView(uFrameLayout.getContext());
       shootMarquee.setId(R.id.live_common_info_view);
       shootMarquee.setBackgroundResource(R.drawable.arg_RES_7f08024a);
       shootMarquee.setCompoundDrawablePadding(c.b(resources, R.dimen.arg_RES_7f07033f));
       shootMarquee.setSingleLine(true);
       shootMarquee.setGravity(16);
       shootMarquee.setTextColor(resources.getColor(R.color.arg_RES_7f061ff3));
       shootMarquee.setTextSize(true, 14.00f);
       shootMarquee.setVisibility(4);
       shootMarquee.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f0812bf), null, null, null);
       int i = c.b(resources, R.dimen.pv);
       shootMarquee.setPadding(i, 0, c.b(resources, R.dimen.arg_RES_7f070271), 0);
       shootMarquee.setLayoutParams(new FrameLayout$LayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f070952)));
       uFrameLayout.addView(shootMarquee);
       return uFrameLayout;
    }
}
