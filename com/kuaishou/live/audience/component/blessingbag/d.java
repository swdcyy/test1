package com.kuaishou.live.audience.component.blessingbag.d;
import w07.l;
import com.kuaishou.live.audience.component.blessingbag.e;
import java.lang.Object;
import u07.t;
import java.util.Objects;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.popup.common.PopupLayout;
import android.widget.LinearLayout;
import jl5.c;
import com.kuaishou.live.audience.component.blessingbag.LiveAudienceBlessingBagNoticeView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import gx0.a;
import android.view.View$OnClickListener;

public final class d implements l	// class@000a47
{
    public final e a;

    public void d(e p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (p0.z() != null && ta.getContext() != null) {
          p0 = p0.z();
          p0.setPadding(p0.getPaddingLeft(), c.c(R.dimen.arg_RES_7f0702cc), p0.getRight(), c.c(R.dimen.arg_RES_7f070295));
          LiveAudienceBlessingBagNoticeView liveAudience = new LiveAudienceBlessingBagNoticeView(ta.getContext());
          ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-2, -2);
          marginLayout.topMargin = c.c(0x7f0702cc);
          liveAudience.setLayoutParams(marginLayout);
          liveAudience.setOnClickListener(new a(liveAudience));
          p0.addView(liveAudience);
       }
       return;
    }
}
