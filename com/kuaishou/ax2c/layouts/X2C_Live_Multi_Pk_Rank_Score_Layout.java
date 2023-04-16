package com.kuaishou.ax2c.layouts.X2C_Live_Multi_Pk_Rank_Score_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveKwaiCDNImageView;
import android.widget.ImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import com.yxcorp.plugin.live.widget.LiveNumberTextView;
import android.text.TextUtils$TruncateAt;

public class X2C_Live_Multi_Pk_Rank_Score_Layout implements IViewCreator	// class@001102
{

    public void X2C_Live_Multi_Pk_Rank_Score_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       int i = -2;
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(i, c.b(resources, R.dimen.arg_RES_7f070857)));
       LinearLayout linearLayout = new LinearLayout(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i, c.b(resources, 0x7f070851));
       linearLayout.setId(R.id.live_multi_pk_rank_score_container);
       layoutParams.gravity = 80;
       layoutParams.bottomMargin = c.b(resources, 0x7f070846);
       layoutParams.leftMargin = c.b(resources, 0x7f070859);
       linearLayout.setLayoutParams(layoutParams);
       uFrameLayout.addView(linearLayout);
       FrameLayout uFrameLayout1 = new FrameLayout(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(c.b(resources, 0x7f070851), c.b(resources, 0x7f070851));
       uFrameLayout1.setId(R.id.live_multi_pk_rank_score_layout);
       layoutParams1.gravity = 16;
       layoutParams1.rightMargin = (int)TypedValue.applyDimension(1, -4.00f, c.c(resources));
       uFrameLayout1.setLayoutParams(layoutParams1);
       linearLayout.addView(uFrameLayout1);
       LiveKwaiCDNImageView liveKwaiCDNI = new LiveKwaiCDNImageView(uFrameLayout1.getContext());
       int i1 = 0x7f070854;
       FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(c.b(resources, i1), c.b(resources, i1));
       liveKwaiCDNI.setId(R.id.live_multi_pk_rank_icon);
       layoutParams2.gravity = 17;
       float f = 0x3f800000;
       layoutParams2.leftMargin = (int)TypedValue.applyDimension(1, f, c.c(resources));
       if (PatchProxy.applyVoidOneRefs("centerInside", liveKwaiCDNI, LiveKwaiCDNImageView.class, "1")) {
       }else {
          liveKwaiCDNI.getHierarchy().u(t$b.h);
          liveKwaiCDNI.getHierarchy().u(t$b.i);
          liveKwaiCDNI.getHierarchy().u(t$b.j);
          liveKwaiCDNI.getHierarchy().u(t$b.k);
          liveKwaiCDNI.getHierarchy().u(t$b.a);
       }
       liveKwaiCDNI.setLayoutParams(layoutParams2);
       uFrameLayout1.addView(liveKwaiCDNI);
       FrameLayout uFrameLayout2 = new FrameLayout(uFrameLayout1.getContext());
       layoutParams2 = new FrameLayout$LayoutParams(c.b(resources, i1), c.b(resources, i1));
       layoutParams2.leftMargin = (int)TypedValue.applyDimension(1, f, c.c(resources));
       layoutParams2.gravity = 17;
       uFrameLayout2.setLayoutParams(layoutParams2);
       uFrameLayout1.addView(uFrameLayout2);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uFrameLayout2.getContext());
       uAppCompatTe.setId(R.id.live_multi_pk_rank_score);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setIncludeFontPadding(false);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061b29));
       uAppCompatTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070855));
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout2.addView(uAppCompatTe);
       uAppCompatTe = new AppCompatTextView(uFrameLayout2.getContext());
       uAppCompatTe.setId(R.id.live_multi_pk_rank_score_anim);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setIncludeFontPadding(false);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061b29));
       uAppCompatTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070855));
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout2.addView(uAppCompatTe);
       LiveNumberTextView liveNumberTe = new LiveNumberTextView(linearLayout.getContext());
       layoutParams1 = new LinearLayout$LayoutParams(i, i);
       liveNumberTe.setId(R.id.live_multi_pk_score_grade);
       layoutParams1.gravity = 16;
       layoutParams1.leftMargin = (int)TypedValue.applyDimension(1, 4.00f, c.c(resources));
       layoutParams1.rightMargin = c.b(resources, 0x7f070334);
       liveNumberTe.setEllipsize(TextUtils$TruncateAt.END);
       liveNumberTe.setGravity(16);
       liveNumberTe.setIncludeFontPadding(false);
       liveNumberTe.setMaxLines(1);
       liveNumberTe.setTextColor(resources.getColor(R.color.arg_RES_7f06060a));
       liveNumberTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070853));
       liveNumberTe.setLayoutParams(layoutParams1);
       linearLayout.addView(liveNumberTe);
       return uFrameLayout;
    }
}
