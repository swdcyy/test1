package com.yxcorp.gifshow.magic.ui.magicemoji.wish.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.magic.ui.magicemoji.wish.WishInputFragment;
import java.lang.Object;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.model.WishMagicInfo;
import java.util.List;
import com.yxcorp.gifshow.model.WishMagicInfo$WishMagicDetailInfo;
import android.widget.RadioButton;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import lnc.a1;
import android.content.res.ColorStateList;
import java.lang.String;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.RadioGroup$LayoutParams;
import android.view.View;
import java.util.Objects;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.RadioGroup;
import java.util.Map;
import n5b.i;
import android.widget.RadioGroup$OnCheckedChangeListener;

public final class b implements Runnable	// class@001c48
{
    public final WishInputFragment b;

    public void b(WishInputFragment p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       int i = 0;
       tb.Y0.setVisibility(i);
       int i1 = 0;
       int i2 = 0;
       while (i1 < tb.d1.mWishMagicDetailInfos.size()) {
          RadioButton radioButton = new RadioButton(tb.getContext());
          radioButton.setText(tb.d1.mWishMagicDetailInfos.get(i1).mTitle);
          radioButton.setGravity(17);
          radioButton.setIncludeFontPadding(i);
          radioButton.setPadding(i, a1.d(R.dimen.arg_RES_7f07031b), i, i);
          radioButton.setTextColor(a1.b(R.color.arg_RES_7f0617ec));
          radioButton.setTextSize(i, (float)a1.d(R.dimen.arg_RES_7f070f70));
          radioButton.setTypeface(Typeface.create("sans-serif-medium", i));
          radioButton.setButtonDrawable(null);
          radioButton.setBackground(null);
          RadioGroup$LayoutParams layoutParams = new RadioGroup$LayoutParams(-2, -1);
          radioButton.setId(View.generateViewId());
          if (i1 == tb.g1) {
             i2 = radioButton.getId();
          }else {
             layoutParams.leftMargin = a1.d(0x7f0702cc);
          }
          WishInputFragment y0 = tb.Y0;
          Objects.requireNonNull(y0);
          if (!PatchProxy.isSupport(PostRadioGroupWithIndicator.class) || !PatchProxy.applyVoidThreeRefs(radioButton, Integer.valueOf(i1), layoutParams, y0, PostRadioGroupWithIndicator.class, "8")) {
             y0.m.addView(radioButton, i1, layoutParams);
             y0.s.put(Integer.valueOf(radioButton.getId()), radioButton);
          }
          i1 = i1 + 1;
       }
       tb.ki(tb.d1.mWishMagicDetailInfos.get(tb.g1));
       tb.Y0.l(i2);
       tb.Y0.setPostRadioGroupCheckChangedListener(new i(tb));
       return;
    }
}
