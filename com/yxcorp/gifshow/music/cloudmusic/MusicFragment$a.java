package com.yxcorp.gifshow.music.cloudmusic.MusicFragment$a;
import dpb.h;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import dpb.b;
import fpb.d;
import hpb.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import android.view.ViewGroup;
import com.yxcorp.gifshow.music.cloudmusic.viewbinder.AbsMusicFragmentViewBinder;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;

public class MusicFragment$a implements h	// class@001fe2
{
    public final MusicFragment a;

    public void MusicFragment$a(MusicFragment p0){
       this.a = p0;
       super();
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, MusicFragment$a.class, "2")) {
          return;
       }
       this.a.th();
       this.a.B.onNext(Boolean.TRUE);
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, MusicFragment$a.class, "4")) {
          return;
       }
       this.a.th();
       return;
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, MusicFragment$a.class, "3")) {
          return;
       }
       this.a.th();
       this.a.B.onNext(Boolean.FALSE);
       return;
    }
    public void U(){
       if (PatchProxy.applyVoid(null, this, MusicFragment$a.class, "5")) {
          return;
       }
       this.a.th();
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MusicFragment$a.class, "1")) {
          return;
       }
       if (!this.a.O.h()) {
          d a = d.a;
          MusicFragment$a ta = this.a;
          MusicFragment c = ta.C;
          String str = a.a.a(ta.u, 0);
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(c, str, a, d.class, "3")) {
             a.p(c, "page");
             a.p(str, "entrySource");
             u1.L("", c, 1, a.g(str), null);
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, MusicFragment$a.class, "7")) {
          return;
       }
       int i = 0;
       this.a.k.setVisibility(i);
       this.a.mh(i);
       if (this.a.rh() != null) {
          this.a.rh().C();
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration(200);
       uAnimatorSet.play(ObjectAnimator.ofFloat(this.a.k, "alpha", new float[2]{0,0x3f800000}));
       uAnimatorSet.start();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, MusicFragment$a.class, "6")) {
          return;
       }
       this.a.k.setVisibility(4);
       this.a.mh(4);
       if (this.a.rh() != null) {
          this.a.rh().D();
       }
       return;
    }
    public void d(){
    }
}
