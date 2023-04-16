package f59.c;
import erd.g;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;
import android.util.Property;
import android.animation.ObjectAnimator;
import f59.d;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import f59.e;
import tyc.p5;
import lnc.a1;
import f59.f;
import f59.g;
import f59.h;
import android.animation.AnimatorSet;

public final class c implements g	// class@0022a4
{
    public final AdUnionHalfFollowFragment b;

    public void c(AdUnionHalfFollowFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "event");
          n b = p0.b;
          AdUnionHalfFollowFragment k = this.b.k;
          if (k == null) {
             a.S("mUser");
          }
          if (TextUtils.n(b, k.getId())) {
             boolean b1 = true;
             if (p0.d != null) {
                AdUnionHalfFollowFragment.dh(this.b).setEnabled(b1);
             }else {
                AdUnionHalfFollowFragment.eh(this.b).setText("");
                p0 = this.b;
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoid(null, p0, AdUnionHalfFollowFragment.class, "12")) {
                   k = p0.x;
                   String str = "mClickText";
                   if (k == null) {
                      a.S(str);
                   }
                   ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(k, View.ALPHA, new float[4]{0x3f800000,0,0,0x3f800000});
                   objectAnimat.setDuration(2000);
                   objectAnimat.addListener(new d(p0));
                   AdUnionHalfFollowFragment y = p0.y;
                   String str1 = "mFollowSucIcon";
                   if (y == null) {
                      a.S(str1);
                   }
                   ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(y, View.SCALE_X, new float[4]{0,0x3f800000,0x3f99999a,0x3f800000});
                   long l = 500;
                   objectAnimat1.setDuration(l);
                   objectAnimat1.setStartDelay(l);
                   objectAnimat1.addListener(new e(p0));
                   AdUnionHalfFollowFragment y1 = p0.y;
                   if (y1 == null) {
                      a.S(str1);
                   }
                   ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(y1, View.SCALE_Y, new float[4]{0,0x3f800000,0x3f99999a,0x3f800000});
                   objectAnimat2.setDuration(l);
                   objectAnimat2.setStartDelay(l);
                   y1 = p0.x;
                   if (y1 == null) {
                      a.S(str);
                   }
                   ObjectAnimator tag = y1.getTag();
                   Objects.requireNonNull(tag, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.ViewAnimWrapper");
                   int[] ointArray = new int[]{0,a1.e(50.00f)};
                   tag = ObjectAnimator.ofInt(tag, p5.b, ointArray);
                   tag.setDuration(l);
                   tag.setStartDelay(1000);
                   tag.addListener(new f(p0));
                   y1 = p0.B;
                   String str2 = "mBottomTextLayout";
                   if (y1 == null) {
                      a.S(str2);
                   }
                   ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(y1, View.ALPHA, new float[2]{0x3f800000,0});
                   objectAnimat3.setDuration(l);
                   objectAnimat3.setStartDelay(3500);
                   objectAnimat3.addListener(new g(p0));
                   AdUnionHalfFollowFragment b2 = p0.B;
                   if (b2 == null) {
                      a.S(str2);
                   }
                   ObjectAnimator objectAnimat4 = ObjectAnimator.ofFloat(b2, View.ALPHA, new float[2]{0,0x3f800000});
                   objectAnimat4.setDuration(l);
                   objectAnimat4.setStartDelay(4000);
                   objectAnimat4.addListener(new h(p0));
                   p0 = new AnimatorSet();
                   Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2,tag,objectAnimat3,objectAnimat4};
                   p0.playTogether(uAnimatorArr);
                   p0.start();
                }
             }
          }
       }
       return;
    }
}
