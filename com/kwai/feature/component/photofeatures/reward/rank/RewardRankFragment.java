package com.kwai.feature.component.photofeatures.reward.rank.RewardRankFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.component.photofeatures.reward.rank.RewardRankFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import u1.a;
import android.animation.ValueAnimator;
import com.kwai.feature.component.photofeatures.reward.rank.RewardRankFragment$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.feature.component.photofeatures.reward.rank.RewardRankFragment$c;
import android.animation.Animator$AnimatorListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import zf6.l;
import ag6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oz5.g;
import android.view.View$OnClickListener;
import ekd.f;
import oz5.h;
import android.util.Property;
import android.animation.ObjectAnimator;
import oz5.a;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import pz5.f;
import pz5.c;
import pz5.l;
import pz5.d;

public final class RewardRankFragment extends BaseFragment	// class@001263
{
    public PresenterV2 j;
    public View k;
    public View l;
    public final AtomicBoolean m;
    public static final RewardRankFragment$a n;

    static {
       RewardRankFragment.n = new RewardRankFragment$a(null);
    }
    public void RewardRankFragment(){
       super(null, null, null, null, 15, null);
       this.m = super(false);
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, RewardRankFragment.class, "5")) {
          return;
       }
       boolean b = false;
       boolean b1 = true;
       if (!this.m.compareAndSet(b, b1)) {
          return;
       }
       RewardRankFragment tk = this.k;
       if (tk == null) {
          this.dh();
          return;
       }else {
          int height = tk.getHeight();
          float f = (float)height;
          float f1 = (f - tk.getTranslationY()) / f;
          f = a.a(f1, 0, 0x3f800000);
          float[] uofloatArray = new float[]{f,0};
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
          valueAnimato.setDuration((long)((float)300 * f));
          valueAnimato.addUpdateListener(new RewardRankFragment$b(this, f, tk, height));
          valueAnimato.addListener(new RewardRankFragment$c(this, f, tk, height));
          valueAnimato.start();
          return;
       }
    }
    public final void dh(){
       if (PatchProxy.applyVoid(null, this, RewardRankFragment.class, "6")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          c supportFragm = activity.getSupportFragmentManager();
          if (supportFragm != null) {
             e uoe = supportFragm.beginTransaction();
             if (uoe != null) {
                uoe = uoe.u(this);
                if (uoe != null) {
                   uoe.o();
                }
             }
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RewardRankFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       p2 = this.getArguments();
       if (p2 != null && p2.getBoolean("REWARD_RANK_FORCE_WHITE") == true) {
          p0 = l.x(p0);
       }
       return a.c(p0, 0x7f0d0896, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, RewardRankFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       RewardRankFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RewardRankFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoidOneRefs(p0, this, RewardRankFragment.class, "7")) {
          p0.setOnClickListener(new g(this));
          this.l = p0.findViewById(0x7f0a03a0);
          view = p0.findViewById(R.id.container);
          this.k = view;
          if (view != null) {
             f.g(view, (int)300, objArray);
             view.setOnClickListener(h.b);
          }
          RewardRankFragment tl = this.l;
          if (tl != null) {
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tl, View.ALPHA, new float[2]{0,0x3f800000});
             objectAnimat.setDuration(150);
             objectAnimat.start();
          }
       }
       a uoa = PatchProxy.apply(objArray, this, RewardRankFragment.class, "8");
       if (uoa != patchProxyRe) {
       }else {
          Bundle arguments = this.getArguments();
          a.m(arguments);
          a obj = b.a(arguments.getParcelable("REWARD_RANK_PHOTO"));
          a.o(obj, "Parcels.unwrap\(arguments¡­lable\(REWARD_RANK_PHOTO\)\)");
          Object obj1 = obj;
          obj = new a(obj1, this, null, 4, null);
       }
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, RewardRankFragment.class, "9");
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new f());
          presenterV2.U7(new c());
          presenterV2.U7(new l());
          presenterV2.U7(new d());
          PatchProxy.onMethodExit(RewardRankFragment.class, "9");
       }
       this.j = presenterV2;
       if (presenterV2 != null) {
          presenterV2.f(p0);
       }
       RewardRankFragment tj = this.j;
       if (tj != null) {
          Object[] objArray1 = new Object[]{uoa};
          tj.i(objArray1);
       }
       return;
    }
}
