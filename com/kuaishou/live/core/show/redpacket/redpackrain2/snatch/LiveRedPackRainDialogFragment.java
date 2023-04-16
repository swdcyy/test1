package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment;
import hka.a;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import ph2.a;
import t02.a0;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment$a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uh2.q;
import ih2.x;
import android.widget.ImageView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.i;
import th2.d;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.k;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e;
import java.lang.Boolean;
import th2.e;
import jh2.m;
import kotlin.jvm.internal.a;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import jh2.f;
import android.animation.Animator$AnimatorListener;
import jh2.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import jh2.j;
import jh2.k;
import jh2.c;
import jh2.d;
import jh2.h;
import jh2.i;
import jh2.a;
import jh2.b;
import jh2.l;
import android.media.SoundPool;
import jh2.e;
import android.media.SoundPool$OnLoadCompleteListener;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import pp.a;
import java.lang.Throwable;
import q87.c;
import qrd.l1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.view.View;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment$c;
import android.view.View$OnTouchListener;
import android.view.LayoutInflater;
import i2b.a;
import crd.b;
import lnc.b9;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ekd.m1;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordSpreadAnimView;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.WindmillAnimView;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment$b;
import android.view.View$OnClickListener;
import gy2.e;
import gy2.k;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.d;
import ok.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ih2.n;

public class LiveRedPackRainDialogFragment extends LiveSafeDialogFragment implements a	// class@000f1a
{
    public LiveRedPackRainGrabResult A;
    public b B;
    public boolean C;
    public c$b D;
    public int s;
    public ViewGroup t;
    public ViewGroup u;
    public KwaiImageView v;
    public View w;
    public c x;
    public a0 y;
    public a z;
    public static final int E;

    public void LiveRedPackRainDialogFragment(int p0,a p1,a0 p2){
       super();
       LiveRedPackRainDialogFragment$a uoa = new LiveRedPackRainDialogFragment$a(this);
       this.D = uoa;
       this.s = p0;
       this.x = new c(uoa);
       this.z = p1;
       this.y = p2;
    }
    public final void Ah(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainDialogFragment.class, "11")) {
          return;
       }
       if (!this.z.a()) {
          a0 w2 = this.y.w2;
          if (w2 == null) {
             return;
          }else {
             w2.a().g(this.z);
             this.wh(true);
          }
       }
       return;
    }
    public final void Bh(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainDialogFragment.class, "7")) {
          return;
       }
       if (this.s == 2) {
          this.v.setVisibility(8);
       }else {
          this.v.setVisibility(0);
       }
       return;
    }
    public final void Ch(){
       int b1;
       String str3;
       Animator[] uAnimatorArr1;
       c uoc3;
       SoundPool soundPool;
       c uoc4;
       Object obj = this;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, obj, LiveRedPackRainDialogFragment.class, str)) {
          return;
       }
       LiveRedPackRainDialogFragment x = obj.x;
       LiveRedPackRainDialogFragment s = obj.s;
       Objects.requireNonNull(x);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String str1 = "2";
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(s), x, uoc, str1)) {
          x.b();
          int i3 = 8;
          if (s == i1) {
             x.f.setVisibility(i3);
             x.e.setVisibility(i2);
             i oi = new i(x.e, x.g);
             x.a = oi;
             x.a(x.e, oi);
             x.d = s;
          }else if(s == i){
             x.f.setVisibility(i3);
             x.e.setVisibility(i2);
             k ok = new k(x.e);
             x.c = ok;
             x.a(x.e, ok);
             x.d = s;
          }else {
             c uoc1 = 5;
             if (s == 3 || s == uoc1) {
                boolean b = (s == uoc1)? true: false;
                if (x.b == null) {
                   x.b = new e(x.f, x.g);
                }
                if (x.a == null) {
                   x.a = new i(x.e, x.g);
                }
                c obj1 = PatchProxy.apply(objArray, x, uoc, str);
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else if(!x.e.getVisibility() && (x.a != null && x.b != null)){
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (b1) {
                   x.e.setVisibility(4);
                   x.a(x.e, x.a);
                   String str2 = "4";
                   if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), x, uoc, str2)) {
                      if (b) {
                         obj1 = x.i;
                         e uoe = new e(x);
                         Objects.requireNonNull(obj1);
                         if (!PatchProxy.applyVoidOneRefs(uoe, obj1, m.class, str1)) {
                            a.p(uoe, "listener");
                            obj1.h = uoe;
                            AnimatorSet uAnimatorSet = new AnimatorSet();
                            Animator[] uAnimatorArr = new Animator[6];
                            ValueAnimator valueAnimato = PatchProxy.apply(objArray, obj1, m.class, "5");
                            float f = 0x3ea8f5c3;
                            if (valueAnimato != patchProxyRe) {
                               str3 = str2;
                            }else {
                               valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                               str3 = str2;
                               valueAnimato.setDuration(800);
                               valueAnimato.setInterpolator(a.b(f, 0, 0, 0x3f800000));
                               valueAnimato.addListener(new f(obj1));
                               valueAnimato.addUpdateListener(new g(valueAnimato, obj1));
                               i2 = 0;
                            }
                            uAnimatorArr[i2] = valueAnimato;
                            ValueAnimator valueAnimato1 = PatchProxy.apply(objArray, obj1, m.class, "6");
                            c uoc2 = obj1;
                            long l = 333;
                            if (valueAnimato1 != patchProxyRe) {
                               uAnimatorArr1 = uAnimatorArr;
                               uoc3 = uoc2;
                            }else {
                               valueAnimato1 = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                               uAnimatorArr1 = uAnimatorArr;
                               valueAnimato1.setStartDelay(330);
                               valueAnimato1.setDuration(l);
                               valueAnimato1.setInterpolator(a.b(0x3ea8f5c3, 0, 0x3f2b851f, 0x3f800000));
                               uoc3 = uoc2;
                               valueAnimato1.addListener(new j(uoc3));
                               valueAnimato1.addUpdateListener(new k(valueAnimato1, uoc3));
                            }
                            uAnimatorArr1[1] = valueAnimato1;
                            ValueAnimator valueAnimato2 = PatchProxy.apply(null, uoc3, m.class, "7");
                            if (valueAnimato2 != patchProxyRe) {
                            }else {
                               valueAnimato2 = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                               valueAnimato2.setStartDelay(947);
                               valueAnimato2.setDuration(l);
                               valueAnimato2.setInterpolator(a.b(0.42f, 0, 0x3f51eb85, 0x3f800000));
                               valueAnimato2.addListener(new c(uoc3));
                               valueAnimato2.addUpdateListener(new d(valueAnimato2, uoc3));
                            }
                            int i4 = 2;
                            uAnimatorArr1[i4] = valueAnimato2;
                            ValueAnimator valueAnimato3 = PatchProxy.apply(null, uoc3, m.class, "8");
                            if (valueAnimato3 != patchProxyRe) {
                            }else {
                               valueAnimato3 = ValueAnimator.ofFloat(new float[i4]{0,0x3f800000});
                               valueAnimato3.setStartDelay(117);
                               valueAnimato3.setDuration(550);
                               valueAnimato3.setInterpolator(a.b(0x3ea8f5c3, 0, 0x3f2b851f, 0x3f800000));
                               valueAnimato3.addListener(new h(uoc3));
                               valueAnimato3.addUpdateListener(new i(valueAnimato3, uoc3));
                            }
                            uAnimatorArr1[3] = valueAnimato3;
                            ValueAnimator valueAnimato4 = PatchProxy.apply(null, uoc3, m.class, "9");
                            if (valueAnimato4 != patchProxyRe) {
                            }else {
                               valueAnimato4 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                               valueAnimato4.setStartDelay(1184);
                               valueAnimato4.setDuration(417);
                               valueAnimato4.setInterpolator(a.b(0.17f, 0, 0x3f547ae1, 0x3f800000));
                               valueAnimato4.addListener(new a(uoc3));
                               valueAnimato4.addUpdateListener(new b(valueAnimato4, uoc3));
                            }
                            uAnimatorArr1[4] = valueAnimato4;
                            valueAnimato4 = PatchProxy.apply(null, uoc3, m.class, "10");
                            if (valueAnimato4 != patchProxyRe) {
                            }else {
                               valueAnimato4 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                               valueAnimato4.setStartDelay(67);
                               valueAnimato4.setDuration(700);
                               valueAnimato4.addListener(new l(valueAnimato4, uoc3));
                            }
                            uAnimatorArr1[5] = valueAnimato4;
                            uAnimatorSet.playTogether(uAnimatorArr1);
                            if (!PatchProxy.applyVoid(null, uoc3, m.class, str3)) {
                               int i5 = 3;
                               b1 = 1;
                               i3 = 0;
                               try{
                                  soundPool = new SoundPool(b1, i5, i3);
                                  soundPool.setOnLoadCompleteListener(new e(uoc3));
                                  uoc4 = a.a();
                                  a.o(uoc4, "AppEnv.get\(\)");
                                  soundPool.load(uoc4.a(), R.raw.arg_RES_7f0f003e, 0);
                               }catch(java.lang.Exception e0){
                                  Object[] objArray1 = new Object[0];
                                  a.C().u(uoc3.a, e0, objArray1);
                                  m f1 = uoc3.f;
                                  if (f1 != null) {
                                     f1.start();
                                  }
                               }
                               uoc3.g = soundPool;
                            }
                            uoc3.f = uAnimatorSet;
                         }
                      }else {
                         x.c();
                      }
                   }
                }else {
                   x.f.setVisibility(0);
                   uoc4 = x.c;
                   if (uoc4 != null) {
                      uoc4.c();
                   }
                   x.e.setVisibility(8);
                   x.e.removeAllViews();
                   x.a(x.f, x.b);
                }
                x.d = s;
             }
          }
       }
       this.Bh();
       if (obj.s == 2) {
          obj.yh(false);
          obj.wh(false);
       }else {
          obj.yh(true);
       }
       return;
    }
    public void Dh(int p0){
       if (PatchProxy.isSupport(LiveRedPackRainDialogFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRedPackRainDialogFragment.class, "5")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_RED_PACK_RAIN, "LiveRedPackRainDialogFragment updateComponentByStatus", "status", Integer.valueOf(p0));
       this.zh(p0);
       this.Ch();
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainDialogFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isAdded() && (this.getDialog() != null && this.getDialog().isShowing()))? true: false;
       return b;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainDialogFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.xh();
       return false;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, LiveRedPackRainDialogFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawableResource(0x106000d);
          obj.requestFeature(1);
          obj.getDecorView().setOnTouchListener(new LiveRedPackRainDialogFragment$c(this));
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveRedPackRainDialogFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0d8b, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainDialogFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       this.x.b();
       b9.a(this.B);
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainDialogFragment.class, "6")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null || (dialog.getWindow() == null || (this.getActivity() != null && this.getContext() != null))) {
          dialog.getWindow().setLayout(-1, -1);
          this.Bh();
       }
    label_0033 :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPackRainDialogFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.t = m1.f(p0, 0x7f0a24d0);
       ViewGroup viewGroup = m1.f(p0, R.id.live_red_pack_rain_opened_content);
       this.u = viewGroup;
       LiveRedPackRainDialogFragment tx = this.x;
       LiveRedPackRainDialogFragment tt = this.t;
       Objects.requireNonNull(tx);
       if (!PatchProxy.applyVoidThreeRefs(p0, tt, viewGroup, tx, c.class, "1")) {
          c i = tx.i;
          Objects.requireNonNull(i);
          if (!PatchProxy.applyVoidOneRefs(p0, i, m.class, "1")) {
             a.p(p0, "rootView");
             View view = m1.f(p0, R.id.live_red_pack_rain_content);
             a.o(view, "ViewBindUtils.bindWidget¡­ve_red_pack_rain_content\)");
             i.b = view;
             view = m1.f(p0, R.id.live_red_pack_rain_swords);
             a.o(view, "ViewBindUtils.bindWidget¡­ive_red_pack_rain_swords\)");
             i.c = view;
             view = m1.f(p0, R.id.live_red_pack_rain_windmill);
             a.o(view, "ViewBindUtils.bindWidget¡­e_red_pack_rain_windmill\)");
             i.d = view;
             view = m1.f(p0, R.id.live_red_pack_rain_circle);
             a.o(view, "ViewBindUtils.bindWidget¡­ive_red_pack_rain_circle\)");
             i.e = view;
             String str = c0.a.b("/udata/pkg/kwai-client-image/live_red_packet_rain/red_packet_anim_circle.webp");
             m e = i.e;
             if (e == null) {
                a.S("circle");
             }
             e.L(str);
          }
          tx.e = tt;
          tx.f = viewGroup;
       }
       this.v = m1.f(p0, 0x7f0a24b6);
       this.w = m1.f(p0, 0x7f0a24af);
       this.v.setOnClickListener(new LiveRedPackRainDialogFragment$b(this));
       if (this.s == null) {
          this.s = 1;
       }
       this.Ch();
       return;
    }
    public e uh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainDialogFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(1, 3);
    }
    public final void wh(boolean p0){
       if (PatchProxy.isSupport(LiveRedPackRainDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveRedPackRainDialogFragment.class, "12")) {
          return;
       }
       a0 w2 = this.y.w2;
       if (w2 == null) {
          return;
       }
       this.B = b9.c(this.B, new d(this, w2.a(), p0));
       return;
    }
    public void xh(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainDialogFragment.class, "15")) {
          return;
       }
       LiveRedPackRainDialogFragment ts = this.s;
       if (ts == 1 && this.C != null) {
          n.d(this.z.a, "BACK", this.y.Z2.a());
       }else if(ts == 4){
          n.f(this.z.a, "BACK", this.y.Z2.a());
       }
       return;
    }
    public final void yh(boolean p0){
       if (PatchProxy.isSupport(LiveRedPackRainDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveRedPackRainDialogFragment.class, "4")) {
          return;
       }
       this.setCancelable(p0);
       if (this.getDialog() != null) {
          this.getDialog().setCancelable(p0);
       }
       return;
    }
    public void zh(int p0){
       this.s = p0;
    }
}
