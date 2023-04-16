package com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.animation.AnimatorSet;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.lsjwzh.widget.text.FastTextView;
import android.text.TextPaint;
import oe1.m;
import android.view.View$OnTouchListener;
import com.kuaishou.live.lite.combocomment.ComboCommentStrokeView;
import android.widget.ImageView;
import oe1.l;
import oe1.k;
import android.view.View$OnClickListener;
import lnc.a1;
import android.view.animation.OvershootInterpolator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.text.SpannableString;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import java.lang.CharSequence;
import android.text.style.AbsoluteSizeSpan;
import q38.a;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import android.widget.TextView;
import android.widget.TextView$BufferType;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView$b;

public class LiveComboCommentView extends RelativeLayout	// class@001065
{
    public final int b;
    public FastTextView c;
    public ComboCommentStrokeView d;
    public ImageView e;
    public View f;
    public int g;
    public ComboCommentMessage h;
    public long i;
    public LiveComboCommentView$b j;
    public View$OnClickListener k;
    public final int l;
    public boolean m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final Handler p;
    public static final int q;

    public void LiveComboCommentView(Context p0,boolean p1){
       super(p0);
       this.b = 66;
       this.l = 200;
       this.m = false;
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.n = uAnimatorSet;
       AnimatorSet uAnimatorSet1 = new AnimatorSet();
       this.o = uAnimatorSet1;
       this.p = new LiveComboCommentView$a(this);
       if (!PatchProxy.isSupport(LiveComboCommentView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, LiveComboCommentView.class, "1")) {
          int i = (p1)? 0x7f0d0ab6: 0x7f0d0ab5;
          a.k(this, i, true);
          FastTextView uFastTextVie = this.findViewById(R.id.content);
          this.c = uFastTextVie;
          uFastTextVie.getPaint().setFakeBoldText(true);
          this.c.setOnTouchListener(new m(this));
          this.d = this.findViewById(0x7f0a083c);
          this.f = this.findViewById(0x7f0a0841);
          ImageView imageView = this.findViewById(R.id.live_audience_add_combo_comment_image_view);
          this.e = imageView;
          imageView.setOnTouchListener(new l(this));
          this.e.setOnClickListener(new k(this));
          LiveComboCommentView tf = this.f;
          if (tf != null) {
             tf.setMinimumHeight(a1.d(R.dimen.arg_RES_7f0702c5));
          }
          if (!PatchProxy.applyVoid(null, this, LiveComboCommentView.class, "2")) {
             uAnimatorSet.setDuration(200);
             uAnimatorSet.setInterpolator(new OvershootInterpolator());
             uAnimatorSet.play(ObjectAnimator.ofFloat(this.e, View.SCALE_X, new float[2]{0x3f800000,0x3f666666})).with(ObjectAnimator.ofFloat(this.e, View.SCALE_Y, new float[2]{0x3f800000,0x3f666666})).with(j.a(this.e, new float[2]{0x3f800000,0x3f000000}));
             uAnimatorSet1.setDuration(200);
             uAnimatorSet1.setInterpolator(new OvershootInterpolator());
             uAnimatorSet1.play(ObjectAnimator.ofFloat(this.e, View.SCALE_X, new float[2]{0x3f666666,0x3f800000})).with(ObjectAnimator.ofFloat(this.e, View.SCALE_Y, new float[2]{0x3f666666,0x3f800000})).with(j.a(this.e, new float[2]{0x3f000000,0x3f800000}));
          }
       }
       return;
    }
    public final SpannableString a(int p0){
       SpannableString obj;
       if (PatchProxy.isSupport(LiveComboCommentView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveComboCommentView.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       obj = new SpannableString(String.format(Locale.US, "x%d ", objArray));
       obj.setSpan(new AbsoluteSizeSpan(14, 1), 1, 2, 17);
       obj.setSpan(new a(a1.a(R.color.arg_RES_7f061d64), a1.a(R.color.arg_RES_7f061d64), a1.e(0x3f19999a)), 0, obj.length(), 17);
       return obj;
    }
    public ComboCommentMessage getComboCommentMessage(){
       return this.h;
    }
    public String getComboContent(){
       LiveComboCommentView obj = PatchProxy.apply(null, this, LiveComboCommentView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj != null) {
          return obj.getContent();
       }
       return "";
    }
    public int getComboCount(){
       LiveComboCommentView th = this.h;
       if (th != null) {
          return th.mComboCount;
       }
       return 0;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveComboCommentView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveComboCommentView.class, "4")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.setMeasuredDimension((int)((float)this.getMeasuredWidth() + ((((float)this.d.getMeasuredWidth() * 0x3fa66666) - (float)this.d.getMeasuredWidth()) / 2.00f)), this.getMeasuredHeight());
       return;
    }
    public void setComboCommentMessage(ComboCommentMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboCommentView.class, "5")) {
          return;
       }
       if (p0 != null) {
          this.h = p0;
          this.c.setText(p0.getContent());
          this.d.setText(this.a(p0.mComboCount), TextView$BufferType.SPANNABLE);
       }else {
          this.h = null;
       }
       return;
    }
    public void setOnCustomClickListener(LiveComboCommentView$b p0){
       this.j = p0;
    }
}
