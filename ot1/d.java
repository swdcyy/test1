package ot1.d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController;
import java.lang.Object;
import sw1.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import pu1.m;
import androidx.lifecycle.MutableLiveData;
import zs1.b;
import androidx.lifecycle.LiveData;
import ut1.f;
import java.util.Objects;
import pu1.c;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ut1.k;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.basic.model.LivePkRecommendGiftInfo;
import android.widget.FrameLayout;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar;
import com.kuaishou.live.common.core.component.recommendgift.LivePkScoreBarSprintAnimView;
import java.lang.Integer;
import sw1.f;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import sw1.b;
import com.yxcorp.gifshow.model.CDNUrl;
import sw1.c;
import hc.b;
import com.kuaishou.live.common.core.basic.tools.l;
import android.graphics.Bitmap;
import cm1.a;
import d61.v;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.widget.ImageView;
import va1.e;
import android.animation.Animator;
import com.kuaishou.live.common.core.basic.degrade.j;
import sw1.e;
import android.animation.Animator$AnimatorListener;

public final class d implements Observer	// class@00357f
{
    public final LiveMultiPkProgressBarDefaultController b;

    public void d(LiveMultiPkProgressBarDefaultController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       m a;
       Object obj = this;
       LivePkRecommendGiftInfo obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, d.class, str)) {
       }else {
          obj.b.Y2();
          d b = obj.b;
          LiveMultiPkProgressBarDefaultController p = b.p;
          if (p != null) {
             a.o(obj1, "it");
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoidTwoRefs(obj1, p, b, LiveMultiPkProgressBarDefaultController.class, "18")) {
                a = m.a;
                f value = b.C.l().getValue();
                Objects.requireNonNull(a);
                c uoc = PatchProxy.applyOneRefs(value, a, m.class, "19");
                LiveMultiPkProgressBarDefaultController liveMultiPkP = null;
                if (uoc != patchProxyRe) {
                }else if(value == null || value.l().size() != 2){
                   uoc = new c(liveMultiPkP, liveMultiPkP);
                }else {
                   uoc = new c(liveMultiPkP, liveMultiPkP);
                   Iterator iterator = value.l().entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      if (TextUtils.n(uEntry.getValue().e(), String.valueOf(value.b()))) {
                         uoc.a = uEntry.getValue().g();
                      }else {
                         uoc.b = uEntry.getValue().g();
                      }
                   }
                }
                float f = 0.00f;
                long l = uoc.a() + uoc.b;
                float f1 = 100.00f;
                if (l - liveMultiPkP) {
                   f = (int)(((float)uoc.a() * f1) / (float)l);
                }
                h b1 = obj1.b;
                obj1 = obj1.c.mSpiritAnimScene;
                liveMultiPkP = b.k;
                String str1 = "progressBar";
                if (liveMultiPkP == null) {
                   a.S(str1);
                }
                int measuredWidt = liveMultiPkP.getMeasuredWidth();
                LiveMultiPkProgressBarDefaultController k = b.k;
                if (k == null) {
                   a.S(str1);
                }
                int minWidth = k.getMinWidth();
                int i = 4;
                int i1 = 3;
                int i2 = 5;
                int i3 = 1;
                if (PatchProxy.isSupport(LivePkScoreBarSprintAnimView.class)) {
                   Object[] objArray = new Object[i2];
                   objArray[0] = Integer.valueOf(b1);
                   objArray[i3] = Integer.valueOf(obj1);
                   objArray[2] = Integer.valueOf(f);
                   objArray[i1] = Integer.valueOf(measuredWidt);
                   objArray[i] = Integer.valueOf(minWidth);
                   if (!PatchProxy.applyVoid(objArray, p, LivePkScoreBarSprintAnimView.class, str)) {
                   }
                }else if(p.E == null){
                   p.E = new f(p.B, p.C, p.D);
                }
                p.E.c();
                p.setVisibility(0);
                p.B.setVisibility(0);
                l.c(p.C, c.a(b.g), i3, null);
                Bitmap uBitmap = a.b(b1);
                if (uBitmap != null) {
                   p.D.setImageBitmap(uBitmap);
                }
                LivePkScoreBarSprintAnimView e = p.E;
                Objects.requireNonNull(e);
                f uof = f.class;
                if (PatchProxy.isSupport(uof) && (!PatchProxy.applyVoidFourRefs(Integer.valueOf(obj1), Integer.valueOf(f), Integer.valueOf(measuredWidt), Integer.valueOf(minWidth), e, f.class, "1") && (obj1 != i3 && (obj1 == 2 || obj1 == i1)))) {
                   minWidth = f.e;
                   int i4 = v.b((int)(((float)f / 100.00f) * (float)measuredWidt), minWidth, (measuredWidt - minWidth)) - (minWidth - f.f);
                   if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i4), e, uof, "3")) {
                      LivePkScoreBarSprintAnimView livePkScoreB = e;
                      AnimatorSet uAnimatorSet = livePkScoreB.b(0x3f800000, 3.00f, 80, 0);
                      AnimatorSet uAnimatorSet1 = livePkScoreB.b(3.00f, 2.50f, 120, 80);
                      AnimatorSet uAnimatorSet2 = livePkScoreB.b(2.50f, 3.00f, 80, 200);
                      AnimatorSet uAnimatorSet3 = livePkScoreB.b(3.00f, 2.50f, 60, 280);
                      AnimatorSet uAnimatorSet4 = livePkScoreB.b(2.50f, 3.00f, 160, 340);
                      ObjectAnimator objectAnimat = livePkScoreB.a(90.00f, 0, 100, 60);
                      ObjectAnimator objectAnimat1 = livePkScoreB.a(0, -32.00f, 120, 160);
                      ObjectAnimator objectAnimat2 = livePkScoreB.a(-32.00f, -9.00f, 80, 280);
                      float[] uofloatArray = new float[]{(float)(- minWidth),(float)i4};
                      ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(e.a, View.TRANSLATION_X, uofloatArray);
                      objectAnimat3.setDuration(120);
                      e.c.setVisibility(8);
                      e.a.a(e.d);
                      AnimatorSet uAnimatorSet5 = new AnimatorSet();
                      e.d = uAnimatorSet5;
                      Animator[] uAnimatorArr = new Animator[11];
                      uAnimatorArr[0] = uAnimatorSet;
                      uAnimatorArr[1] = uAnimatorSet1;
                      uAnimatorArr[2] = uAnimatorSet2;
                      uAnimatorArr[3] = uAnimatorSet3;
                      uAnimatorArr[4] = uAnimatorSet4;
                      uAnimatorArr[5] = objectAnimat;
                      uAnimatorArr[6] = objectAnimat1;
                      uAnimatorArr[7] = objectAnimat2;
                      uAnimatorArr[8] = livePkScoreB.a(-9.00f, -20.00f, 60, 360);
                      uAnimatorArr[9] = objectAnimat3;
                      i4 = 10;
                      ObjectAnimator objectAnimat4 = PatchProxy.apply(null, e, uof, "6");
                      if (objectAnimat4 != patchProxyRe) {
                      }else {
                         objectAnimat4 = j.a(e.c, new float[2]{0x3f800000,0});
                         objectAnimat4.setDuration(300);
                         objectAnimat4.setStartDelay(1300);
                      }
                      uAnimatorArr[i4] = objectAnimat4;
                      uAnimatorSet5.playTogether(uAnimatorArr);
                      e.d.addListener(new e(e));
                      e.d.start();
                   }
                }
             }
          }
       }
       return;
    }
}
