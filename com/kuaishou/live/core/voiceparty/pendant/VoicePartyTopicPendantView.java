package com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import lnc.a1;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import eu2.j;
import java.lang.Runnable;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.basic.widget.MarqueeTextView;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView$a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyChannelInfo;
import eu2.b;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import va1.l0;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.widget.ImageView;
import com.yxcorp.widget.KwaiRadiusStyles;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView$b;
import eu2.h;
import android.view.View$OnClickListener;
import eu2.i;
import android.view.ViewGroup$MarginLayoutParams;

public class VoicePartyTopicPendantView extends RelativeLayout implements d	// class@00180f
{
    public ViewGroup b;
    public KwaiImageView c;
    public TextView d;
    public MarqueeTextView e;
    public final SparseArray f;
    public static final int g;

    public void VoicePartyTopicPendantView(Context p0){
       super(p0, null);
    }
    public void VoicePartyTopicPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTopicPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new SparseArray();
    }
    public void a(int p0){
       if (PatchProxy.isSupport(VoicePartyTopicPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTopicPendantView.class, "5")) {
          return;
       }
       VoicePartyTopicPendantView te = this.e;
       p0 = (p0 == 1)? 0x7f070340: 0x7f070268;
       te.setMaxWidth(a1.d(p0));
       return;
    }
    public void b(int p0,String p1){
       if (PatchProxy.isSupport(VoicePartyTopicPendantView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VoicePartyTopicPendantView.class, "6")) {
          return;
       }
       if (p1 == null) {
          this.f.remove(p0);
       }else {
          this.f.put(p0, p1);
       }
       VoicePartyTopicPendantView te = this.e;
       p1 = PatchProxy.apply(null, this, VoicePartyTopicPendantView.class, "9");
       if (p1 != PatchProxyResult.class) {
       }else {
          int i = this.f.size();
          while (true) {
             i--;
             if (i >= 0) {
                String str = this.f.valueAt(i);
                if (str != null) {
                   i = str;
                   break ;
                }
             }else {
                i = "";
                break ;
             }
          }
       }
       te.setText(p1);
       this.e.post(new j(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTopicPendantView.class, "2")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a44ab);
       this.c = m1.f(p0, 0x7f0a44ad);
       this.b = m1.f(p0, 0x7f0a273d);
       MarqueeTextView marqueeTextV = m1.f(p0, R.id.voice_party_topic);
       this.e = marqueeTextV;
       marqueeTextV.setMarqueeEnable(true);
       this.e.postDelayed(new VoicePartyTopicPendantView$a(this), 300);
       return;
    }
    public LiveStreamMessages$VoicePartyChannelInfo getChannel(){
       return null;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTopicPendantView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void setChannel(LiveStreamMessages$VoicePartyChannelInfo p0){
       GradientDrawable gradientDraw;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTopicPendantView.class, str)) {
          return;
       }
       if (p0 != null) {
          VoicePartyTopicPendantView te = this.e;
          Object[] objArray = null;
          PaintDrawable paintDrawabl = PatchProxy.apply(objArray, objArray, uob, str);
          if (paintDrawabl != patchProxyRe) {
          }else {
             paintDrawabl = new PaintDrawable(b.b);
             paintDrawabl.setCornerRadii(b.c);
          }
          te.setBackground(paintDrawabl);
          te = this.b;
          int i = l0.j(p0.startColor, 0xff000000);
          int i1 = l0.j(p0.endColor, 0xff000000);
          if (PatchProxy.isSupport(uob)) {
             gradientDraw = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), objArray, uob, "1");
             if (gradientDraw != patchProxyRe) {
             label_0075 :
                te.setBackground(gradientDraw);
                this.d.setText(p0.name);
                this.d.setVisibility(0);
                this.c.setVisibility(8);
             }
          }
          int[] ointArray = new int[]{i,i1};
          gradientDraw = new GradientDrawable(GradientDrawable$Orientation.LEFT_RIGHT, ointArray);
          gradientDraw.setGradientType(0);
          gradientDraw.setShape(0);
          gradientDraw.setDither(1);
          gradientDraw.setCornerRadii(b.a);
          goto label_0075 ;
       }
       return;
    }
    public void setChannelForFixedStyle(int p0){
       if (PatchProxy.isSupport(VoicePartyTopicPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTopicPendantView.class, "4")) {
          return;
       }
       this.e.setBackground(b.b(KwaiRadiusStyles.FULL_RIGHT));
       this.e.setPadding(a1.d(R.dimen.arg_RES_7f0708a4), 0, a1.d(R.dimen.arg_RES_7f0708a9), 0);
       this.b.setBackground(b.b(KwaiRadiusStyles.FULL_LEFT));
       FrameLayout$LayoutParams layoutParams = this.c.getLayoutParams();
       layoutParams.leftMargin = a1.d(0x7f0708a6);
       layoutParams.height = a1.d(0x7f0708a5);
       layoutParams.width = a1.d(0x7f0708a5);
       this.c.setLayoutParams(layoutParams);
       if (p0 == -1) {
          this.c.setVisibility(8);
       }else {
          this.c.setImageResource(p0);
          this.c.setVisibility(0);
       }
       this.d.setVisibility(8);
       return;
    }
    public void setOnPendantClickListener(VoicePartyTopicPendantView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTopicPendantView.class, "7")) {
          return;
       }
       this.b.setOnClickListener(new h(p0));
       this.e.setOnClickListener(new i(p0));
       return;
    }
    public void setRightMargin(int p0){
       if (PatchProxy.isSupport(VoicePartyTopicPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTopicPendantView.class, "8")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.getLayoutParams();
       layoutParams.rightMargin = p0;
       this.setLayoutParams(layoutParams);
       return;
    }
    public void setTopic(String p0){
       this.b(0, p0);
    }
}
