package hf2.b;
import erd.g;
import hf2.l;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.e;
import com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;
import wca.m$a;
import wca.m;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.core.content.ContextCompat;
import wj2.r;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.animation.AnimatorSet;
import hf2.p;
import hf2.o;
import android.animation.Animator;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import kp.r1;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import l66.c;
import wca.r;
import m66.a;

public final class b implements g	// class@002d7d
{
    public final l b;

    public void b(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       p0 = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "19")) {
       }else {
          boolean b = false;
          e.f0(b);
          tb.v.setEnableGravityEffect(b);
          if (!PatchProxy.applyVoid(objArray, tb, p0, "22")) {
             tb.v.setText(m.a(tb.G).a);
             tb.v.setCompoundDrawables(objArray, objArray, objArray, objArray);
             tb.v.setEnabled(1);
             tb.v.setTextColor(ContextCompat.getColor(tb.getContext(), R.color.arg_RES_7f061e52));
          }
          if (tb.D.t != null) {
             tb.v.setBackground(tb.l8().getDrawable(R.drawable.arg_RES_7f0813f1).mutate());
          }else if(PatchProxy.applyVoid(objArray, tb, p0, "21")){
             AnimatorSet uAnimatorSet = new AnimatorSet();
             AnimatorSet uAnimatorSet1 = PatchProxy.apply(objArray, tb, p0, "23");
             if (uAnimatorSet1 != PatchProxyResult.class) {
             }else {
                uAnimatorSet1 = tb.C.b(tb.v, tb.B.e(), tb.B.f(), 1);
             }
             AnimatorSet uAnimatorSet2 = PatchProxy.apply(objArray, tb, p0, "25");
             if (uAnimatorSet2 != PatchProxyResult.class) {
             }else {
                uAnimatorSet2 = tb.C.a(tb.x, tb.B.i(), tb.B.f(), tb.B.c(), tb.B.d());
             }
             p0 = PatchProxy.apply(objArray, tb, p0, "24");
             if (p0 != PatchProxyResult.class) {
             }else {
                p0 = tb.C.c(tb.w, tb.B.i(), tb.B.f(), tb.B.g(), tb.B.h());
             }
             Animator[] uAnimatorArr = new Animator[]{uAnimatorSet1,uAnimatorSet2,p0};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.start();
          }
          p0 = tb.E.getBaseFeed();
          if (p0 != null) {
             User user = r1.T1(p0);
             if (user != null) {
                user.notifyChanged();
                user.fireSync();
                c.a().b(new r(user, p0));
             }
          }
       }
       return;
    }
}
