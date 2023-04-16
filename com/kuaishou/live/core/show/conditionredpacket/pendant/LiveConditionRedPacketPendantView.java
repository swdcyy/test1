package com.kuaishou.live.core.show.conditionredpacket.pendant.LiveConditionRedPacketPendantView;
import ml8.d;
import l62.a;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import java.text.DecimalFormat;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import android.animation.AnimatorSet;
import l62.k;
import android.animation.Animator$AnimatorListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import l12.d;
import va1.f0;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import va1.n0;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import java.lang.Integer;

public class LiveConditionRedPacketPendantView extends RelativeLayout implements d, a	// class@000abc
{
    public KwaiImageView b;
    public TextView c;
    public AnimatorSet d;
    public KwaiImageView e;

    public void LiveConditionRedPacketPendantView(Context p0){
       super(p0, null);
    }
    public void LiveConditionRedPacketPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveConditionRedPacketPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.k(this, R.layout.arg_RES_7f0d0ac9, true);
       this.doBindView(this);
    }
    public void a(LiveConditionRedPacketInfo p0,long p1){
       if (PatchProxy.isSupport(LiveConditionRedPacketPendantView.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, LiveConditionRedPacketPendantView.class, "2")) {
          return;
       }
       this.b((p0.d - p1));
       return;
    }
    public void b(long p0){
       String str;
       if (PatchProxy.isSupport(LiveConditionRedPacketPendantView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveConditionRedPacketPendantView.class, "3")) {
          return;
       }
       p0 = p0 / 1000;
       this.b.setVisibility(0);
       LiveConditionRedPacketPendantView tc = this.c;
       if (PatchProxy.isSupport(LiveConditionRedPacketPendantView.class)) {
          str = PatchProxy.applyOneRefs(Long.valueOf(p0), null, LiveConditionRedPacketPendantView.class, "11");
          if (str != PatchProxyResult.class) {
          label_0066 :
             tc.setText(str);
             return;
          }
       }
       DecimalFormat uDecimalForm = new DecimalFormat("00");
       str = uDecimalForm.format((p0 / 60))+":"+uDecimalForm.format((p0 % 60));
       goto label_0066 ;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveConditionRedPacketPendantView.class, "4")) {
          return;
       }
       this.d();
       if (!PatchProxy.applyVoid(objArray, this, LiveConditionRedPacketPendantView.class, "7")) {
          this.d = this.getContentViewAnim();
          this.setVisibility(4);
          this.d.addListener(new k(this));
          this.d.start();
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketPendantView.class, "10")) {
          return;
       }
       LiveConditionRedPacketPendantView td = this.d;
       if (td != null) {
          td.removeAllListeners();
          this.d.end();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketPendantView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1b9f);
       this.c = m1.f(p0, 0x7f0a18ea);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_condition_red_packet_pendant_background);
       this.e = kwaiImageVie;
       f0.a(kwaiImageVie, LiveRedPacketResourcePathConstant.LIVE_IC_ARROW_RED_PACK_CLOSE);
       return;
    }
    public final AnimatorSet getContentViewAnim(){
       float f;
       AnimatorSet obj = PatchProxy.apply(null, this, LiveConditionRedPacketPendantView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimatorSet();
       float[] uofloatArray = new float[]{(float)n0.f(),f};
       f = (float)(- n.c(a.a().a(), 8.00f));
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this, View.TRANSLATION_X, uofloatArray);
       objectAnimat.setDuration(252);
       float[] uofloatArray1 = new float[]{f,f};
       f = (float)n.c(a.a().a(), 2.00f);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this, View.TRANSLATION_X, uofloatArray1);
       objectAnimat1.setDuration(126);
       uofloatArray1 = new float[]{f,0};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this, View.TRANSLATION_X, uofloatArray1);
       objectAnimat2.setDuration(84);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       obj.playSequentially(uAnimatorArr);
       obj.setInterpolator(new LinearInterpolator());
       return obj;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketPendantView.class, "9")) {
          return;
       }
       super.onDetachedFromWindow();
       this.d();
       return;
    }
    public void release(){
    }
    public final void setIconViewImageResource(int p0){
       if (PatchProxy.isSupport(LiveConditionRedPacketPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveConditionRedPacketPendantView.class, "6")) {
          return;
       }
       LiveRedPacketResourcePathConstant lIVE_CONDITI = LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_OLD_PENDANT_FANS_GROUP_ICON;
       if (p0 != 39) {
          switch (p0){
              case 14:
              case 15:
                lIVE_CONDITI = LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_OLD_PENDANT_SHARE_ICON;
                break;
              case 16:
                lIVE_CONDITI = LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_OLD_PENDANT_GIFT_ICON;
                break;
              default:
          }
       }
       f0.a(this.b, lIVE_CONDITI);
       return;
    }
    public void setPendantIcon(int p0){
       if (PatchProxy.isSupport(LiveConditionRedPacketPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveConditionRedPacketPendantView.class, "5")) {
          return;
       }
       this.setIconViewImageResource(p0);
       return;
    }
}
