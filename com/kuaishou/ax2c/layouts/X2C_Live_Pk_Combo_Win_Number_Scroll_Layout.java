package com.kuaishou.ax2c.layouts.X2C_Live_Pk_Combo_Win_Number_Scroll_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.common.core.component.pk.combowin.LivePkComboWinNumberScrollView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import cw9.c;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

public class X2C_Live_Pk_Combo_Win_Number_Scroll_Layout implements IViewCreator	// class@001107
{

    public void X2C_Live_Pk_Combo_Win_Number_Scroll_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LivePkComboWinNumberScrollView livePkComboW = new LivePkComboWinNumberScrollView(p0);
       livePkComboW.setLayoutParams(new ConstraintLayout$LayoutParams(-1, -1));
       LinearLayout linearLayout = new LinearLayout(livePkComboW.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, c.b(resources, 0x7f0702a4));
       linearLayout.setId(R.id.live_pk_combo_win_number_display_area);
       linearLayout.setOrientation(1);
       layoutParams.k = 0;
       layoutParams.s = 0;
       layoutParams.q = 0;
       layoutParams.h = 0;
       layoutParams.c();
       linearLayout.setLayoutParams(layoutParams);
       livePkComboW.addView(linearLayout);
       LiveMediumTextView liveMediumTe = new LiveMediumTextView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(-1, c.b(resources, 0x7f0702a4));
       liveMediumTe.setId(R.id.live_pk_combo_win_previous_number_text_view);
       layoutParams1.gravity = 17;
       liveMediumTe.setGravity(17);
       liveMediumTe.setIncludeFontPadding(0);
       liveMediumTe.setMaxLines(1);
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), 0x3f800000, liveMediumTe.getShadowDy(), liveMediumTe.getShadowColor());
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), liveMediumTe.getShadowDx(), 0x3f800000, liveMediumTe.getShadowColor());
       liveMediumTe.setShadowLayer(0x3f800000, liveMediumTe.getShadowDx(), liveMediumTe.getShadowDy(), liveMediumTe.getShadowColor());
       liveMediumTe.setTextColor(resources.getColor(R.color.arg_RES_7f061e52));
       liveMediumTe.setTextSize(1, 12.00f);
       liveMediumTe.setLayoutParams(layoutParams1);
       linearLayout.addView(liveMediumTe);
       liveMediumTe = new LiveMediumTextView(linearLayout.getContext());
       layoutParams1 = new LinearLayout$LayoutParams(-1, c.b(resources, 0x7f0702a4));
       liveMediumTe.setId(R.id.live_pk_combo_win_target_number_text_view);
       layoutParams1.gravity = 17;
       liveMediumTe.setGravity(17);
       liveMediumTe.setIncludeFontPadding(0);
       liveMediumTe.setMaxLines(1);
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), 0x3f800000, liveMediumTe.getShadowDy(), liveMediumTe.getShadowColor());
       liveMediumTe.setShadowLayer(liveMediumTe.getShadowRadius(), liveMediumTe.getShadowDx(), 0x3f800000, liveMediumTe.getShadowColor());
       liveMediumTe.setShadowLayer(0x3f800000, liveMediumTe.getShadowDx(), liveMediumTe.getShadowDy(), liveMediumTe.getShadowColor());
       liveMediumTe.setTextColor(resources.getColor(R.color.arg_RES_7f061e52));
       liveMediumTe.setTextSize(1, 12.00f);
       liveMediumTe.setLayoutParams(layoutParams1);
       linearLayout.addView(liveMediumTe);
       livePkComboW.onFinishInflate();
       return livePkComboW;
    }
}
