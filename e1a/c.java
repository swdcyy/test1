package e1a.c;
import android.transition.Visibility;
import e1a.c$a;
import nsd.u;
import androidx.viewpager.widget.KwaiViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import android.content.Context;
import com.yxcorp.utility.n;
import android.graphics.Rect;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.events.SyncDetailAnimParamEvent;
import com.yxcorp.gifshow.events.SyncDetailAnimParamEvent$Mode;
import android.transition.TransitionValues;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import th0.n;
import android.animation.TimeInterpolator;
import e1a.c$b;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import e1a.c$c;

public final class c extends Visibility	// class@002044
{
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public static final c$a l;

    static {
       c.l = new c$a(null);
    }
    public void c(int p0,int p1,int p2,int p3,boolean p4,boolean p5){
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.k = p5;
    }
    public final void a(KwaiViewPager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       View view = null;
       int childCount = p0.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < childCount) {
          if (ViewGroupKt.a(p0, i1).getLeft() >= 0 && ViewGroupKt.a(p0, i1).getRight() <= n.z(p0.getContext())) {
             view = ViewGroupKt.a(p0, i1).findViewById(R.id.icon);
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       Rect rect = new Rect();
       if (view != null) {
          view.getGlobalVisibleRect(rect);
       }
       if (view != null) {
          i = view.getHeight() - rect.bottom;
       }
       RxBus.f.b(new SyncDetailAnimParamEvent(SyncDetailAnimParamEvent$Mode.NORMAL, i));
       return;
    }
    public Animator onAppear(ViewGroup p0,View p1,TransitionValues p2,TransitionValues p3){
       float this;
       View view5;
       int height2;
       RecyclerView recyclerView;
       c uoc = this;
       float[] obj = p0;
       c$b obj1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "sceneRoot");
       if (uoc.c != null) {
          return null;
       }
       boolean b = true;
       uoc.c = b;
       View view = obj.findViewById(R.id.atlas_root);
       View view1 = view.findViewById(R.id.atlas_content_container);
       View view2 = view.findViewById(R.id.editor_holder);
       a.o(view2, "bottomBar");
       int height = view2.getHeight();
       this = 2.00f;
       float f = (uoc.k != null)? (float)uoc.f: (float)(uoc.f - uoc.g) / this;
       uoc.e = f;
       int i = 0x7f0a3f4a;
       View view3 = view.findViewById(i);
       String str = "titleContainer";
       if (uoc.k != null && NasaExperimentUtils.b()) {
          c h = uoc.h;
          if (h <= null) {
             if (h == null) {
                a.o(view3, str);
                if (uoc.i >= (- view3.getHeight())) {
                label_0082 :
                   h = null;
                label_0083 :
                   if (!h) {
                      a.o(view3, str);
                      uoc.e = uoc.e - (float)view3.getHeight();
                   }
                   String str1 = "recyclerView";
                   if (uoc.k == null) {
                      View view4 = view1.findViewById(R.id.view_pager_photos);
                      view5 = view.findViewById(0x7f0a34da);
                      int height1 = (view4 != null)? view4.getHeight(): uoc.g;
                      a.o(view5, str1);
                      height2 = view5.getHeight();
                      if (height1 > height2) {
                         a.o(view3, str);
                         uoc.e = uoc.e + ((((float)(height1 - height2) / this) / this) + ((float)view3.getHeight() / this));
                      }
                   }
                   super();
                   this.element = b;
                   Ref$FloatRef uFloatRef = new Ref$FloatRef();
                   uFloatRef.element = (float)uoc.g - ((float)(p0.getWidth() * 4) / 3.00f);
                   if (uoc.k != null) {
                      recyclerView = view.findViewById(R.id.recycler_view);
                      a.o(recyclerView, str1);
                      uFloatRef.element = (float)recyclerView.getBottom() - ((float)(p0.getWidth() * 4) / 3.00f);
                      view5 = view.findViewById(i);
                      a.o(view5, str);
                      uFloatRef.element = uFloatRef.element - (float)view5.getHeight();
                   }
                   if (uoc.j != null && uFloatRef.element - (float)0 > 0) {
                      this.element = false;
                   }
                   if (this.element != null) {
                      a.o(view1, "atlasContainer");
                      ViewGroup$LayoutParams layoutParams = view1.getLayoutParams();
                      Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                      layoutParams.bottomMargin = 0;
                      view1.setLayoutParams(layoutParams);
                      view5 = view.findViewById(R.id.photo_detail_bottom_comment_panel_container);
                      a.o(view5, "bottomBarContainer");
                      view5.setBackground(null);
                   }
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   height2 = 2;
                   Animator[] uAnimatorArr = new Animator[height2];
                   obj = new float[height2];
                   c e = (this.element != null)? uoc.e: 0;
                   obj[0] = e;
                   obj[b] = 0;
                   uAnimatorArr[0] = ObjectAnimator.ofFloat(view1, "translationY", obj);
                   float[] uofloatArray = new float[height2];
                   uofloatArray[0] = (float)height;
                   uofloatArray[b] = 0;
                   uAnimatorArr[b] = ObjectAnimator.ofFloat(view2, "translationY", uofloatArray);
                   uAnimatorSet.playTogether(uAnimatorArr);
                   n on = new n();
                   uAnimatorSet.setInterpolator(on);
                   uAnimatorSet.setDuration(400);
                   obj1 = new c$b(on, this, view1, this, view2, height, view, uFloatRef);
                   uAnimatorSet.addListener(e);
                   return uAnimatorSet;
                }
             }else {
                goto label_0082 ;
             }
          }
          h = 1;
          goto label_0083 ;
       }else {
          goto label_0082 ;
       }
    }
    public Animator onDisappear(ViewGroup p0,View p1,TransitionValues p2,TransitionValues p3){
       View this;
       p1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "sceneRoot");
       SyncDetailAnimParamEvent syncDetailAn = null;
       if (this.d != null) {
          return syncDetailAn;
       }
       boolean b = true;
       this.d = b;
       View view = p0.findViewById(R.id.atlas_root);
       View view1 = view.findViewById(R.id.atlas_content_container).findViewById(R.id.view_pager_photos);
       RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
       RecyclerView$LayoutManager layoutManage = (recyclerView != null)? recyclerView.getLayoutManager(): syncDetailAn;
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       int i = layoutManage.h();
       int i1 = 0;
       if (!i) {
          if (view1 instanceof KwaiViewPager) {
             b = view1;
             i = b.getChildCount();
             int i2 = 0;
             while (true) {
                if (i2 < i) {
                   this = view1;
                   if (ViewGroupKt.a(this, i2).getLeft() >= 0 && ViewGroupKt.a(this, i2).getRight() <= n.z(b.getContext())) {
                      view = ViewGroupKt.a(this, i2).findViewById(R.id.icon);
                   label_0093 :
                      int height = (view != null)? view.getHeight(): 0;
                      if (height < b.getHeight()) {
                         if (view != null) {
                            i1 = view.getTop();
                         }
                         RxBus.f.b(new SyncDetailAnimParamEvent(SyncDetailAnimParamEvent$Mode.REMOVE, i1));
                         break ;
                      }else {
                         RxBus.f.b(new SyncDetailAnimParamEvent(SyncDetailAnimParamEvent$Mode.NORMAL, i1, 2, syncDetailAn));
                         break ;
                      }
                   }else {
                      i2 = i2 + 1;
                   }
                }else {
                   SyncDetailAnimParamEvent syncDetailAn1 = syncDetailAn;
                   goto label_0093 ;
                }
             }
          }else {
             RxBus.f.b(new SyncDetailAnimParamEvent(SyncDetailAnimParamEvent$Mode.NORMAL, i1, 2, syncDetailAn));
          }
       }else if(i >= b){
          if (this.k == null && (view1 != null && view1 instanceof KwaiViewPager)) {
             this.a(view1);
          }else {
             RxBus.f.b(new SyncDetailAnimParamEvent(SyncDetailAnimParamEvent$Mode.MAX, i1, 2, syncDetailAn));
          }
       }else if(view1 instanceof KwaiViewPager){
          this.a(view1);
       }else {
          RxBus.f.b(new SyncDetailAnimParamEvent(SyncDetailAnimParamEvent$Mode.NORMAL, i1, 2, syncDetailAn));
       }
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "alpha", new float[2]{0x3f800000,0x3f800000});
       objectAnimat.setDuration(20);
       objectAnimat.addListener(new c$c(p0));
       return objectAnimat;
    }
}
