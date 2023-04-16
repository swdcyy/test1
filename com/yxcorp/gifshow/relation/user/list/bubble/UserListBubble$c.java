package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$c;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import qrd.l1;
import android.view.animation.LinearInterpolator;

public final class UserListBubble$c implements PopupInterface$b	// class@001a13
{
    public static final UserListBubble$c a;

    static {
       UserListBubble$c.a = new UserListBubble$c();
    }
    public void UserListBubble$c(){
       super();
    }
    public final Animator a(View p0){
       ObjectAnimator objectAnimat;
       ObjectAnimator objectAnimat1;
       AnimatorSet obj = PatchProxy.applyOneRefs(p0, this, UserListBubble$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       obj = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat,objectAnimat1};
       objectAnimat = ObjectAnimator.ofFloat(p0, View.SCALE_X, new float[2]{0x3f800000,0});
       objectAnimat.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       objectAnimat.setDuration(350);
       objectAnimat = ObjectAnimator.ofFloat(p0, View.SCALE_Y, new float[2]{0x3f800000,0});
       objectAnimat.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       objectAnimat.setDuration(350);
       objectAnimat1 = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0});
       objectAnimat1.setDuration(120);
       objectAnimat1.setInterpolator(new LinearInterpolator());
       obj.playTogether(uAnimatorArr);
       return obj;
    }
}
