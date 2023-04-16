package d4c.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import ekd.p0;
import e17.i;
import d4c.z;
import d4c.a0;
import com.kuaishou.android.model.music.Music;
import y3c.a0;
import npb.c;
import kob.r;
import java.lang.CharSequence;
import org.greenrobot.eventbus.a;
import vs5.d;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils;
import im8.f;
import java.lang.Boolean;
import e17.s;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.common_music_player.PlayBackView;
import com.kwai.library.widget.specific.misc.SpectrumView;
import android.view.ViewGroup;
import android.animation.Animator;
import kqb.d0;
import android.animation.ObjectAnimator;
import ekd.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import d4c.y;
import android.view.View$OnClickListener;
import d4c.x;
import y8c.d;

public class b0 extends PresenterV2	// class@0020c3
{
    public c A;
    public final boolean p;
    public f q;
    public PlayBackView r;
    public ConstraintLayout s;
    public SpectrumView t;
    public View u;
    public Music v;
    public r w;
    public PublishSubject x;
    public a0 y;
    public d z;

    public void b0(){
       super();
       this.p = true;
    }
    public void b0(boolean p0){
       super();
       this.p = p0;
    }
    public static void P8(b0 p0,View p1){
       Objects.requireNonNull(p0);
       b0 uob0 = b0.class;
       if (PatchProxy.applyVoidOneRefs(p1, p0, uob0, "5")) {
       }else if(!p0.C(p1.getContext())){
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       }else {
          b0 y = p0.y;
          a0 uoa0 = null;
          z oz = (y != null)? new z(p0): uoa0;
          if (y != null) {
             uoa0 = new a0(p0);
          }
          if (!PatchProxy.applyVoidTwoRefs(oz, uoa0, p0, uob0, "6")) {
             y = p0.v;
             if (y != null) {
                if (y.isOffline()) {
                   y = p0.y;
                   if (y != null) {
                      y.a(p0.v);
                   }
                }else if(p0.w.ca(p0.A) == 21){
                   p0.w.pause();
                   if (uoa0 != null) {
                      uoa0.run();
                   }
                   p0.u.setContentDescription(p0.getContext().getString(R.string.arg_RES_7f10003f));
                }else {
                   p0.w.qI(p0.v.getUniqueCode());
                   p0.w.start();
                   a.d().k(new d());
                   if (oz != null) {
                      oz.run();
                   }
                   if (p0.v.isCopyrightRiskMusic() && MusicExperienceUtils.d()) {
                      y = p0.q;
                      if (y != null && !y.get().booleanValue()) {
                         s.f(R.string.arg_RES_7f10370d);
                         p0.q.set(Boolean.TRUE);
                      }
                   }
                   p0.u.setContentDescription(p0.getContext().getString(R.string.arg_RES_7f10003e));
                }
                if (!p0.v.isCopyrightRiskMusic() || !MusicExperienceUtils.d()) {
                   p0.x.onNext(Boolean.TRUE);
                }
             }
          }
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "3")) {
          return;
       }
       this.A = new c(this.v);
       this.u.setContentDescription(this.getContext().getString(R.string.arg_RES_7f10003f));
       int i = this.w.ca(this.A);
       boolean b = false;
       if (i == 2) {
          this.r.d();
          this.t.b();
          this.R8(b, b);
       }else if(i == 11 || i == 22){
          this.r.b();
       }else if(i == 21){
          this.u.setContentDescription(this.getContext().getString(R.string.arg_RES_7f10003e));
          this.r.c();
          this.t.a();
          this.R8(true, true);
       }else if(i == 23){
          this.r.d();
          this.t.b();
          this.R8(b, true);
       }else {
          this.r.d();
          this.t.b();
          this.R8(b, b);
       }
       return;
    }
    public final void R8(boolean p0,boolean p1){
       float[] uofloatArray;
       ObjectAnimator objectAnimat;
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob0, "7")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       Animator tag = this.s.getTag(R.id.content_layout);
       if (tag != null && tag.isRunning()) {
          tag.cancel();
          this.s.setTag(R.id.content_layout, null);
       }
       int a = d0.a;
       if (p0) {
          if (p1) {
             uofloatArray = new float[]{0,(float)a};
             objectAnimat = ObjectAnimator.ofFloat(this.s, "translationX", uofloatArray);
             objectAnimat.setDuration(240);
             objectAnimat.start();
             this.s.setTag(R.id.content_layout, objectAnimat);
          }else {
             this.s.setTranslationX((float)a);
          }
       }else if(this.s.getTranslationX()){
          if (p1) {
             uofloatArray = new float[]{(float)a,0};
             objectAnimat = ObjectAnimator.ofFloat(this.s, "translationX", uofloatArray);
             objectAnimat.setDuration(240);
             objectAnimat.start();
             this.s.setTag(R.id.content_layout, objectAnimat);
          }else {
             this.s.setTranslationX(0);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3aab);
       this.s = m1.f(p0, 0x7f0a0953);
       this.u = m1.f(p0, 0x7f0a09e2);
       this.r = m1.f(p0, 0x7f0a30c5);
       m1.a(p0, new y(this), R.id.item_root);
       m1.a(p0, new x(this), R.id.play_btn);
       m1.a(p0, new x(this), R.id.cover_image);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.v = this.q8(Music.class);
       this.w = this.q8(r.class);
       this.x = this.r8("PIPED_MUSIC_PANEL_SUBJECT");
       this.y = this.s8(a0.class);
       this.z = this.r8("ADAPTER_POSITION_GETTER");
       this.q = this.w8("PIPED_MUSIC_TOAST_SHOWED");
       return;
    }
}
