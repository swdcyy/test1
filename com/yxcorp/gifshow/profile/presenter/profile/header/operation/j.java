package com.yxcorp.gifshow.profile.presenter.profile.header.operation.j;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n;
import java.lang.Object;
import android.animation.Animator;
import ekd.f;
import android.widget.ToggleButton;
import android.text.SpannableStringBuilder;
import lnc.b3;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import android.text.SpannableString;
import java.lang.CharSequence;
import java.lang.String;
import android.view.View;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.l;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.kwai.framework.model.user.User;
import s4c.r0;

public final class j implements Runnable	// class@001508
{
    public final n b;

    public void j(n p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       f.a(tb.U);
       f.a(tb.V);
       boolean b = true;
       tb.y.setEnabled(b);
       tb.s9(false);
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       b3 uob3 = new b3(tb.getContext(), 0x7f0822d7);
       uob3.g(a1.d(R.dimen.arg_RES_7f07031b));
       spannableStr.append(uob3.a());
       spannableStr.append(a1.p(R.string.arg_RES_7f100f8f));
       tb.y.setText(spannableStr);
       tb.w.setVisibility(8);
       tb.t.setVisibility(8);
       tb.R8();
       if (tb.k9()) {
          tb.y.setChecked(b);
          tb.y.setOnCheckedChangeListener(l.b);
       }else {
          tb.y.setOnCheckedChangeListener(null);
          tb.y.setChecked(tb.A.isFollowingOrFollowRequesting());
          tb.y.setOnCheckedChangeListener(new r0(tb));
       }
       return;
    }
}
