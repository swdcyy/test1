package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.lang.String;
import t02.a0;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment$a;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.a;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.a$a;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.view.View;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment$c;
import android.view.View$OnTouchListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import crd.b;
import lnc.b9;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment$b;
import android.view.View$OnClickListener;
import gy2.e;
import gy2.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.d;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.b;
import ok.h;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.g;
import ki2.a;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.f;
import java.lang.Boolean;
import ki2.b;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import ki2.h;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;

public class LiveSurpriseRedPackDialogFragment extends LiveSafeDialogFragment	// class@000fa4
{
    public String A;
    public b B;
    public LiveSurpriseRedPackGrabResult C;
    public a$a D;
    public int s;
    public ViewGroup t;
    public ViewGroup u;
    public View v;
    public KwaiImageView w;
    public a x;
    public String y;
    public a0 z;
    public static final int E;

    public void LiveSurpriseRedPackDialogFragment(String p0,String p1,a0 p2){
       super();
       this.s = 0;
       LiveSurpriseRedPackDialogFragment$a uoa = new LiveSurpriseRedPackDialogFragment$a(this);
       this.D = uoa;
       this.x = new a(uoa);
       this.A = p0;
       this.y = p1;
       this.z = p2;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, LiveSurpriseRedPackDialogFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawableResource(0x106000d);
          obj.requestFeature(1);
          obj.getDecorView().setOnTouchListener(new LiveSurpriseRedPackDialogFragment$c(this));
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveSurpriseRedPackDialogFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0e03, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveSurpriseRedPackDialogFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.x.b();
       b9.a(this.B);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveSurpriseRedPackDialogFragment.class, "3")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null || (dialog.getWindow() == null || (this.getActivity() != null && this.getContext() != null))) {
          dialog.getWindow().setLayout(-1, -1);
          this.w.setVisibility(0);
       }
    label_0036 :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSurpriseRedPackDialogFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.t = m1.f(p0, 0x7f0a2680);
       ViewGroup viewGroup = m1.f(p0, R.id.live_surprise_red_pack_opened_content);
       this.u = viewGroup;
       LiveSurpriseRedPackDialogFragment tx = this.x;
       tx.d = this.t;
       tx.e = viewGroup;
       this.v = m1.f(p0, 0x7f0a2679);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_surprise_red_pack_close_view);
       this.w = kwaiImageVie;
       kwaiImageVie.setOnClickListener(new LiveSurpriseRedPackDialogFragment$b(this));
       this.yh(1);
       return;
    }
    public e uh(){
       Object obj = PatchProxy.apply(null, this, LiveSurpriseRedPackDialogFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(1, 3);
    }
    public ClientContent$LiveStreamPackage wh(){
       Object obj = PatchProxy.apply(null, this, LiveSurpriseRedPackDialogFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k0.b(this.z, d.a, c.a).orNull();
    }
    public final void xh(){
       if (PatchProxy.applyVoid(null, this, LiveSurpriseRedPackDialogFragment.class, "8")) {
          return;
       }
       this.B = b9.c(this.B, new b(this));
       return;
    }
    public final void yh(int p0){
       boolean b;
       if (PatchProxy.isSupport(LiveSurpriseRedPackDialogFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSurpriseRedPackDialogFragment.class, "9")) {
          return;
       }
       this.s = p0;
       LiveSurpriseRedPackDialogFragment tx = this.x;
       Objects.requireNonNull(tx);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tx, uoa, "1") && p0 >= tx.c)) {
          tx.b();
          int i = 8;
          int i1 = 0;
          if (p0 == 1) {
             tx.e.setVisibility(i);
             tx.d.setVisibility(i1);
             g og = new g(tx.d, tx.f);
             tx.a = og;
             tx.a(tx.d, og);
          }else {
             int i2 = 2;
             if (p0 == i2) {
                tx.e.setVisibility(i1);
                tx.b = new f(tx.e, tx.f);
                tx.a = new g(tx.d, tx.f);
                a obj = PatchProxy.apply(null, tx, uoa, "2");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(!tx.d.getVisibility() && (!tx.e.getVisibility() && (tx.a != null && tx.b != null))){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   tx.d.setVisibility(i1);
                   tx.a(tx.d, tx.a);
                   obj = tx.a;
                   a b1 = tx.b;
                   if (!PatchProxy.applyVoidTwoRefs(obj, b1, tx, uoa, "3")) {
                      tx.e.setVisibility(i1);
                      tx.a(tx.e, b1);
                      b uob = new b(tx, b1);
                      Objects.requireNonNull(obj);
                      if (!PatchProxy.applyVoidOneRefs(uob, obj, g.class, "5")) {
                         if (!obj.c.getMeasuredHeight()) {
                            obj.c.measure(i1, i1);
                         }
                         int[] ointArray = new int[i2];
                         obj.c.getLocationOnScreen(ointArray);
                         g c = obj.c;
                         float[] uofloatArray = new float[i2];
                         uofloatArray[i1] = c.getTranslationY();
                         uofloatArray[1] = (float)((- obj.c.getMeasuredHeight()) - ointArray[1]);
                         ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(c, View.TRANSLATION_Y, uofloatArray);
                         obj.j = objectAnimat;
                         objectAnimat.setDuration(250);
                         obj.j.setInterpolator(new AccelerateDecelerateInterpolator());
                         obj.j.addListener(new h(obj, uob));
                         obj.j.start();
                         obj.e.setVisibility(i);
                      }
                   }
                }else {
                   tx.d.setVisibility(i);
                }
             }
          }
       }
       return;
    }
}
