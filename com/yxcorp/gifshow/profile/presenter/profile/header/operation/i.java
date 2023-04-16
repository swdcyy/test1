package com.yxcorp.gifshow.profile.presenter.profile.header.operation.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n;
import java.lang.Object;
import android.widget.Button;
import android.animation.Animator;
import ekd.f;
import android.widget.ToggleButton;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import android.widget.CompoundButton$OnCheckedChangeListener;
import s4c.r0;

public final class i implements Runnable	// class@001507
{
    public final n b;

    public void i(n p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       tb.x.setVisibility(8);
       f.a(tb.U);
       f.a(tb.V);
       boolean b = true;
       tb.y.setEnabled(b);
       tb.y.setText(a1.p(R.string.arg_RES_7f100216));
       boolean b1 = (tb.A.mFollowStatus == User$FollowStatus.FOLLOWING)? true: false;
       tb.s9(b1);
       tb.t9();
       tb.a9();
       tb.y.setOnCheckedChangeListener(null);
       tb.y.setChecked(b);
       tb.y.setOnCheckedChangeListener(new r0(tb));
       return;
    }
}
