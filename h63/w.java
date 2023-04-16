package h63.w;
import erd.g;
import h63.y;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import y43.a;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.favorite.LiveGzoneFavoriteFollowConfigResponse;
import h63.g;
import h63.z;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import java.lang.Boolean;
import java.lang.Integer;
import android.animation.AnimatorSet;
import android.view.View;
import j63.b;
import h63.g$a;
import android.graphics.drawable.Drawable;
import android.animation.Animator;
import j47.c;
import h63.b;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import e63.k1;

public final class w implements g	// class@002ca4
{
    public final y b;

    public void w(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w b = this.b;
       y obj = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(obj, b, y.class, "15")) {
       }else if(b.t == null || !TextUtils.n(b.q.Q().getUser().mId, obj.b)){
          if (obj.d == null && obj.c != null) {
             obj = b.t;
             obj.mFansCount = obj.mFansCount + 1;
          }else {
             obj = b.t;
             obj.mFansCount = obj.mFansCount - 1;
          }
          if (b.P8()) {
             b.a9();
             boolean b1 = false;
             b.p.e(b1);
             obj = b.p;
             z oz = new z(b);
             boolean b2 = (b.q.G.Qi().mStatus != 3)? true: false;
             y t = b.t;
             LiveGzoneFavoriteFollowConfigResponse mFansGroupMe = (t != null)? t.mFansGroupMemberCount: 0;
             Objects.requireNonNull(obj);
             if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(oz, Boolean.valueOf(b2), Integer.valueOf(mFansGroupMe), obj, g.class, "5")) {
                g m = obj.m;
                if (m != null && m.isRunning()) {
                   obj.m.cancel();
                }
                obj.c.setVisibility(b1);
                obj.c.setBackground(new b(obj.f.d));
                obj.m = new AnimatorSet();
                Animator uAnimator = obj.l.f3(obj.d, 0x3f800000, 0);
                Animator uAnimator1 = obj.l.f3(obj.b, 0x3f800000, 0);
                Animator uAnimator2 = obj.l.f3(obj.e, 0x3f800000, 0);
                uAnimator2.addListener(new b(obj, mFansGroupMe, b2));
                float[] uofloatArray = new float[]{(float)obj.b.getWidth(),0};
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(obj.d, View.TRANSLATION_X, uofloatArray);
                float[] uofloatArray1 = new float[]{(float)obj.b.getWidth(),0};
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(obj.e, View.TRANSLATION_X, uofloatArray1);
                objectAnimat.setStartDelay(400);
                objectAnimat.setDuration(600);
                objectAnimat1.setStartDelay(400);
                objectAnimat1.setDuration(600);
                uAnimator2.setDuration(400);
                uAnimator.setDuration(400);
                uAnimator1.setDuration(400);
                Animator[] uAnimatorArr = new Animator[]{uAnimator1,uAnimator,uAnimator2,objectAnimat,objectAnimat1};
                obj.m.playTogether(uAnimatorArr);
                obj.d.setAlpha(0x3f800000);
                obj.e.setAlpha(0x3f800000);
                obj.b.setAlpha(0x3f800000);
                obj.m.removeAllListeners();
                obj.m.addListener(oz);
                obj.m.start();
             }
          }else {
             b.Z8();
             if (!TextUtils.n(QCurrentUser.me().getId(), b.q.Q().getUser().getId())) {
                k1.b(b.S8(), b.r.a());
             }
          }
       }
       return;
    }
}
