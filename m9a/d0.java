package m9a.d0;
import android.transition.Visibility;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.events.SyncDetailAnimParamEvent;
import m9a.e0;
import java.lang.Enum;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.animation.ObjectAnimator;
import m9a.d0$b;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import android.transition.TransitionValues;
import java.util.ArrayList;
import m9a.d0$a;
import qrd.l1;
import java.util.Collection;
import android.animation.AnimatorSet;
import th0.n;
import android.animation.TimeInterpolator;

public final class d0 extends Visibility	// class@002f78
{
    public SyncDetailAnimParamEvent b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public void d0(String p0,String p1,boolean p2,int p3){
       a.p(p0, "imageTag");
       a.p(p1, "containerTag");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
    }
    public final Animator a(View p0,int p1){
       if (PatchProxy.isSupport(d0.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, d0.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int top = p0.getTop();
       d0 tb = this.b;
       LinearLayoutManager linearLayout = null;
       if (tb != null) {
          a.m(tb);
          int i = e0.a[tb.a.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   return linearLayout;
                }
             }else {
                tb = this.b;
                a.m(tb);
                top = top - tb.a();
             }
          }else {
             tb = this.b;
             a.m(tb);
             top = top + tb.a();
          }
       }
       if (this.e != null && (NasaExperimentUtils.b() && p0 instanceof SlideVerticalAtlasPlayer)) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          if (layoutManage instanceof LinearLayoutManager) {
             linearLayout = layoutManage;
          }
          if (linearLayout != null) {
             if (linearLayout.i0() <= 0) {
                if (!linearLayout.i0() && linearLayout.getChildAt(0) != null) {
                   View childAt = linearLayout.getChildAt(0);
                   a.m(childAt);
                   a.o(childAt, "layoutManager.getChildAt\(0\)!!");
                   if (childAt.getTop() >= (- p1)) {
                   label_0097 :
                      float[] uofloatArray = new float[]{(float)(top - p1) * 0xbf800000,0};
                      ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "translationY", uofloatArray);
                      objectAnimat.addListener(new d0$b(p0));
                      return objectAnimat;
                   }
                }else {
                   goto label_0097 ;
                }
             }
             top = top + p1;
             goto label_0097 ;
          }else {
             goto label_0097 ;
          }
       }else {
          goto label_0097 ;
       }
    }
    public final void b(SyncDetailAnimParamEvent p0){
       this.b = p0;
    }
    public Animator onAppear(ViewGroup p0,View p1,TransitionValues p2,TransitionValues p3){
       View view1;
       Animator uAnimator;
       p1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, d0.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "sceneRoot");
       ArrayList uArrayList = new ArrayList();
       View view = p0.findViewById(R.id.featured_milano_front_view);
       int i = 2;
       if (view != null) {
          uArrayList.add(ObjectAnimator.ofFloat(view, "alpha", new float[i]{0,0x3f800000}));
       }
       view = p0.findViewById(R.id.detail_container_front_view);
       if (view != null) {
          uArrayList.add(ObjectAnimator.ofFloat(view, "alpha", new float[i]{0,0x3f800000}));
       }
       view = p0.findViewWithTag(this.d);
       if (view != null) {
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(view, "alpha", new float[i]{0,0x3f800000});
          objectAnimat.addListener(new d0$a(view));
          uArrayList.add(objectAnimat);
       }
       view = p0.findViewById(R.id.bottom_bar_and_grey_cover_container);
       if (view != null) {
          uArrayList.add(ObjectAnimator.ofFloat(view, "alpha", new float[i]{0,0x3f800000}));
       }
       view = p0.findViewById(R.id.nasa_groot_view_pager);
       if (view != null) {
          view1 = view;
       }
       view1 = p0.findViewWithTag(this.c);
       AnimatorSet uAnimatorSet = null;
       if (this.e != null) {
          if (view1 != null) {
             uAnimator = this.a(view1, this.f);
             if (uAnimator != null) {
                uArrayList.add(uAnimator);
             }
          }
       }else if(view1 != null){
          view1 = view1.findViewById(R.id.autoplay_image_item_image);
       }else {
          AnimatorSet uAnimatorSet1 = uAnimatorSet;
       }
       if (view1 != null) {
          uAnimator = this.a(view1, this.f);
          if (uAnimator != null) {
             uArrayList.add(uAnimator);
          }
       }
    label_00ba :
       if (uArrayList.isEmpty() ^ 0x01) {
          uAnimatorSet = new AnimatorSet();
          uAnimatorSet.playTogether(uArrayList);
          uAnimatorSet.setInterpolator(new n());
          uAnimatorSet.setDuration(400);
       }
       return uAnimatorSet;
    }
    public Animator onDisappear(ViewGroup p0,View p1,TransitionValues p2,TransitionValues p3){
       p1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, d0.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "sceneRoot");
       return null;
    }
}
