package com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$b;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import java.util.Set;
import java.util.Objects;
import android.view.View;
import android.widget.TextView;
import android.content.res.Resources;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$d;
import android.view.ViewPropertyAnimator;
import rg2.l;
import java.lang.Runnable;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class LiveRedPacketContainerDialogFragment$b extends ViewPager$l	// class@000e62
{
    public boolean b;
    public boolean c;
    public final LiveRedPacketContainerDialogFragment d;

    public void LiveRedPacketContainerDialogFragment$b(LiveRedPacketContainerDialogFragment p0){
       this.d = p0;
       super();
       this.b = false;
       this.c = true;
    }
    public void onPageScrollStateChanged(int p0){
       if (p0) {
          if (p0 == 1) {
             this.b = true;
          }
       }else {
          this.b = false;
       }
       return;
    }
    public void onPageSelected(int p0){
       LiveRedPacketContainerDialogFragment$b d1;
       LiveRedPacketContainerDialogFragment q;
       ObjectAnimator objectAnimat;
       Object obj = this;
       int i = p0;
       LiveRedPacketContainerDialogFragment$b uob = LiveRedPacketContainerDialogFragment$b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, uob, str)) {
          return;
       }
       LiveRedPacketContainerItemBaseFragment liveRedPacke = obj.d.w.z(i);
       liveRedPacke.lh((obj.d.N.contains(liveRedPacke.hh()) ^ 1));
       obj.d.N.add(liveRedPacke.hh());
       obj.d.O = liveRedPacke.hh();
       LiveRedPacketContainerDialogFragment$b d = obj.d;
       if (d.M == null && d.w.j() > 1) {
          int i1 = 4;
          long l = 667;
          int i2 = 0x7f07025d;
          int i3 = 0;
          Object[] objArray = null;
          if (!i) {
             d1 = obj.d;
             Objects.requireNonNull(d1);
             if (!PatchProxy.applyVoid(objArray, d1, LiveRedPacketContainerDialogFragment.class, "7")) {
                d1.Fh();
                d1.z.setVisibility(false);
                d1.A.setText(R.string.arg_RES_7f102ba9);
                float[] uofloatArray = new float[]{i3,d1.getResources().getDimension(i2)};
                objectAnimat = ObjectAnimator.ofFloat(d1.z, View.TRANSLATION_X, uofloatArray);
                d1.D = objectAnimat;
                objectAnimat.setDuration(l);
                d1.D.setRepeatCount(i1);
                d1.D.setRepeatMode(2);
                d1.C.setRotation(180.00f);
                d1.C.setVisibility(false);
                d1.B.setVisibility(8);
                d1.C.setRepeatCount(-1);
                d1.C.s();
                d1.D.addListener(d1.L);
                d1.D.setInterpolator(new LinearInterpolator());
                d1.D.start();
                q = d1.Q;
                if (q != null) {
                   q.c("SIDE_DOWN");
                }
             }
          }else if(i == (obj.d.w.j() - 1)){
             d1 = obj.d;
             Objects.requireNonNull(d1);
             if (!PatchProxy.applyVoid(null, d1, LiveRedPacketContainerDialogFragment.class, "5")) {
                d1.Fh();
                d1.z.setVisibility(false);
                d1.A.setText(R.string.arg_RES_7f102bab);
                float[] uofloatArray1 = new float[]{i3,- d1.getResources().getDimension(i2)};
                objectAnimat = ObjectAnimator.ofFloat(d1.z, View.TRANSLATION_X, uofloatArray1);
                d1.D = objectAnimat;
                objectAnimat.setDuration(l);
                d1.D.setRepeatCount(i1);
                d1.D.setRepeatMode(2);
                d1.B.setVisibility(false);
                d1.C.setVisibility(8);
                d1.B.setRepeatCount(-1);
                d1.B.s();
                d1.D.addListener(d1.L);
                d1.D.setInterpolator(new LinearInterpolator());
                d1.D.start();
                q = d1.Q;
                if (q != null) {
                   q.c("SIDE_UP");
                }
             }
          }else {
             d1 = obj.d;
             Objects.requireNonNull(d1);
             if (!PatchProxy.applyVoid(null, d1, LiveRedPacketContainerDialogFragment.class, "6")) {
                d1.Fh();
                d1.z.setVisibility(false);
                d1.B.setVisibility(8);
                d1.C.setVisibility(8);
                d1.A.setText(R.string.arg_RES_7f102baa);
                d1.z.animate().translationX((- d1.getResources().getDimension(R.dimen.arg_RES_7f070329))).setDuration(500).withEndAction(new l(d1)).start();
                q = d1.Q;
                if (q != null) {
                   q.c("NORMAL");
                }
             }
          }
          if (obj.b != null) {
             d1 = obj.d;
             Objects.requireNonNull(d1);
             if (!PatchProxy.applyVoid(null, d1, LiveRedPacketContainerDialogFragment.class, str)) {
                d1.M = true;
                SharedPreferences$Editor uEditor = a.a.edit();
                uEditor.putBoolean(b.d("user")+"hasShowRedPacketContainerTips", 1);
                g.a(uEditor);
             }
          }
       }else {
          q = obj.d.D;
          if (q != null && q.isRunning()) {
             obj.d.Ah();
          }
       }
       q = obj.d.Q;
       if (q != null) {
          q.b(liveRedPacke.hh(), obj.b, obj.c);
       }
       obj.c = false;
       return;
    }
}
