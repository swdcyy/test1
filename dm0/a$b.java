package dm0.a$b;
import ks5.m;
import dm0.a;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.ad.watchlive.widget.WatchLivePendantView;
import ks5.l;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.ImageView;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.Animator;
import em0.a;
import android.animation.Animator$AnimatorListener;
import ks5.i;
import lp3.c;
import lp3.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;
import java.lang.Number;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder;
import java.lang.Enum;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;

public final class a$b implements m	// class@001fba
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return a.P8(this.a);
    }
    public boolean c(){
       return l.d(this);
    }
    public void d(ViewGroup p0){
       int i;
       float f1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "4")) {
          return;
       }
       a.p(p0, "parent");
       l.e(this, p0);
       WatchLivePendantView watchLivePen = a.P8(this.a);
       Objects.requireNonNull(watchLivePen);
       Object[] objArray = null;
       AnimatorSet uAnimatorSet = PatchProxy.apply(objArray, watchLivePen, WatchLivePendantView.class, "2");
       if (uAnimatorSet != PatchProxyResult.class) {
       }else {
          WatchLivePendantView d = watchLivePen.d;
          i = 4;
          if (d != null) {
             d.setVisibility(i);
          }
          watchLivePen.setBackground(objArray);
          float f = 2.00f;
          int i1 = a1.e(60.00f);
          int i2 = a1.e(14.00f);
          WatchLivePendantView b = watchLivePen.b;
          if (b != null) {
             b.setScaleX(f);
          }
          b = watchLivePen.b;
          if (b != null) {
             b.setScaleY(f);
          }
          d = watchLivePen.b;
          if (d != null) {
             d.setTranslationY((float)i1);
          }
          float[] uofloatArray = new float[]{f1,f1};
          f1 = (float)i2;
          f1 = - f1;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(watchLivePen.b, FrameLayout.TRANSLATION_X, uofloatArray);
          a.o(objectAnimat, "ObjectAnimator.ofFloat\(\n¡­ialTransX.toFloat\(\)\n    \)");
          objectAnimat.setDuration(200);
          float[] uofloatArray1 = new float[]{(float)i1,0};
          float[] uofloatArray2 = new float[]{f1,0};
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
          propertyValu[0] = PropertyValuesHolder.ofFloat(FrameLayout.SCALE_X, new float[2]{0x40000000,0x3f800000});
          propertyValu[1] = PropertyValuesHolder.ofFloat(FrameLayout.SCALE_Y, new float[2]{0x40000000,0x3f800000});
          propertyValu[2] = PropertyValuesHolder.ofFloat(FrameLayout.TRANSLATION_Y, uofloatArray1);
          propertyValu[3] = PropertyValuesHolder.ofFloat(FrameLayout.TRANSLATION_X, uofloatArray2);
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(watchLivePen.b, propertyValu);
          a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­, scaleY, transY, transX\)");
          objectAnimat1.setDuration(400);
          objectAnimat1.setStartDelay(1380);
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
          uAnimatorSet1.playSequentially(uAnimatorArr);
          uAnimatorSet1.addListener(new a(watchLivePen));
          uAnimatorSet = uAnimatorSet1;
       }
       a t = this.a.t;
       if (t != null) {
          i oi = t.a(i.class);
          if (oi != null) {
             oi.rb(this, uAnimatorSet);
          }
       }
       a$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a.class, "10")) {
          u1.B0(new ShowMetaData().setLogPage(ta.v).setType(3).setElementPackage(ta.S8()));
       }
       return;
    }
    public void e(ViewGroup p0){
       l.f(this, p0);
    }
    public String getId(){
       return "adWatchLive";
    }
    public int getLayoutOrder(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.AD_WATCH_LIVE.ordinal();
    }
    public String h(){
       return l.c(this);
    }
    public int l(){
       return l.b(this);
    }
    public int m(){
       return 2;
    }
    public int n(){
       return 2;
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.AD_WATCH_LIVE.ordinal();
    }
    public int[] q(){
       return l.a(this);
    }
}
