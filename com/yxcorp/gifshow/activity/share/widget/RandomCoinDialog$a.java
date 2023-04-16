package com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$a;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.ViewParent;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$a$a;
import android.animation.Animator$AnimatorListener;

public final class RandomCoinDialog$a implements PopupInterface$b	// class@00149d
{
    public final RandomCoinDialog a;

    public void RandomCoinDialog$a(RandomCoinDialog p0){
       this.a = p0;
       super();
    }
    public final Animator a(View p0){
       Animator[] obj = PatchProxy.applyOneRefs(p0, this, RandomCoinDialog$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0,0x3f800000});
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, View.SCALE_X, new float[2]{0x3f4ccccd,0x3f800000});
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(p0, View.SCALE_Y, new float[2]{0x3f4ccccd,0x3f800000});
       ViewParent parent = p0.getParent();
       Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
       ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(parent, View.ALPHA, new float[2]{0,0x3f800000});
       AnimatorSet uAnimatorSet = new AnimatorSet();
       obj = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2,objectAnimat3};
       uAnimatorSet.playTogether(obj);
       uAnimatorSet.setDuration(300);
       uAnimatorSet.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       RandomCoinDialog$a$a uoa$a = new RandomCoinDialog$a$a(this, objectAnimat, objectAnimat1, objectAnimat2, objectAnimat3);
       uAnimatorSet.addListener(obj);
       uAnimatorSet.start();
       return uAnimatorSet;
    }
}
