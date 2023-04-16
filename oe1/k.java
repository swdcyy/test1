package oe1.k;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import android.text.SpannableString;
import android.widget.TextView;
import android.animation.AnimatorSet;
import android.view.animation.OvershootInterpolator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView$b;

public final class k implements View$OnClickListener	// class@0034d4
{
    public final LiveComboCommentView b;

    public void k(LiveComboCommentView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveComboCommentView.class, "3")) {
       }else if(tb.h != null && !TextUtils.isEmpty(tb.getComboContent())){
          LiveComboCommentView d = tb.d;
          if (d != null) {
             LiveComboCommentView h = tb.h;
             int i = h.mComboCount + 1;
             h.mComboCount = i;
             d.setText(tb.a(i));
             tb.d.clearAnimation();
             AnimatorSet uAnimatorSet = new AnimatorSet();
             uAnimatorSet.setDuration(300);
             uAnimatorSet.setInterpolator(new OvershootInterpolator());
             tb.d.setPivotX(0);
             h = tb.d;
             h.setPivotY((float)h.getHeight());
             uAnimatorSet.play(ObjectAnimator.ofFloat(tb.d, View.SCALE_X, new float[2]{0x3fa66666,0x3f800000})).with(ObjectAnimator.ofFloat(tb.d, View.SCALE_Y, new float[2]{0x3fa66666,0x3f800000}));
             uAnimatorSet.start();
             d = tb.j;
             if (d != null) {
                d.a(tb.h);
             }
          }
       }
       return;
    }
}
