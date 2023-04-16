package com.kwai.slide.play.detail.rightactionbar.follow.element.FollowButtonView;
import com.yxcorp.gifshow.widget.CustomLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import bt7.e;
import com.yxcorp.gifshow.widget.CustomLayout$a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import qrd.l1;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import lnc.a1;
import android.graphics.Typeface;
import ekd.d0;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import usd.q;
import android.view.ViewGroup;

public final class FollowButtonView extends CustomLayout	// class@001851
{
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final AppCompatImageView g;
    public final AppCompatTextView h;
    public final AppCompatImageView i;
    public final KwaiLottieAnimationView j;
    public HashMap k;

    public void FollowButtonView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void FollowButtonView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void FollowButtonView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(p0);
       uAppCompatIm.setId(R.id.slide_play_right_follow_button);
       uAppCompatIm.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       e b = e.b;
       int mATCH_PARENT = (b.b())? this.getMATCH_PARENT(): this.f(50);
       uAppCompatIm.setLayoutParams(new CustomLayout$a(mATCH_PARENT, (this.e(32.00f) + b.d())));
       uAppCompatIm.setPadding(this.f(5), 0, this.f(5), b.d());
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f080e9b);
       this.b(uAppCompatIm);
       this.e = uAppCompatIm;
       uAppCompatIm = new AppCompatImageView(p0);
       uAppCompatIm.setId(R.id.slide_play_right_poke_button);
       uAppCompatIm.setLayoutParams(new CustomLayout$a(this.e(0x41f00000), this.e(18.00f)));
       uAppCompatIm.setPadding(0, this.f(1), 0, this.f(1));
       uAppCompatIm.setVisibility(8);
       this.b(uAppCompatIm);
       this.f = uAppCompatIm;
       uAppCompatIm = new AppCompatImageView(p0);
       uAppCompatIm.setId(R.id.slide_play_right_fans_group_button);
       uAppCompatIm.setLayoutParams(new CustomLayout$a(this.getWRAP_CONTENT(), this.getWRAP_CONTENT()));
       uAppCompatIm.setVisibility(8);
       this.b(uAppCompatIm);
       this.g = uAppCompatIm;
       AppCompatTextView uAppCompatTe = new AppCompatTextView(p0);
       uAppCompatTe.setId(R.id.slide_play_right_fans_group_level_label);
       uAppCompatTe.setLayoutParams(new CustomLayout$a(this.getMATCH_PARENT(), this.getWRAP_CONTENT()));
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setTypeface(d0.a("fonts/AvenirNext-BoldItalic.ttf", a1.c()));
       uAppCompatTe.setTextColor(a1.a(R.color.arg_RES_7f0620d1));
       uAppCompatTe.setTextSize(2, 13.00f);
       this.b(uAppCompatTe);
       this.h = uAppCompatTe;
       uAppCompatIm = new AppCompatImageView(p0);
       uAppCompatIm.setId(R.id.slide_play_right_link_icon);
       uAppCompatIm.setLayoutParams(new CustomLayout$a(this.getWRAP_CONTENT(), this.getWRAP_CONTENT()));
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f080146);
       uAppCompatIm.setVisibility(8);
       this.b(uAppCompatIm);
       this.i = uAppCompatIm;
       KwaiLottieAnimationView kwaiLottieAn = new KwaiLottieAnimationView(p0, null, 0, 6, null);
       uAppCompatIm.setId(R.id.slide_play_right_follow_icon_stub);
       uAppCompatIm.setLayoutParams(new CustomLayout$a(this.e(42.00f), this.e(32.00f)));
       uAppCompatIm.setVisibility(8);
       this.b(uAppCompatIm);
       this.j = uAppCompatIm;
       return;
    }
    public void FollowButtonView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final AppCompatImageView getFollowButton(){
       return this.e;
    }
    public final AppCompatImageView getJoinFansGroupButton(){
       return this.g;
    }
    public final AppCompatImageView getLinkIcon(){
       return this.i;
    }
    public final KwaiLottieAnimationView getLottieView(){
       return this.j;
    }
    public final AppCompatTextView getMFansGroupLevelText(){
       return this.h;
    }
    public final AppCompatImageView getPokeButton(){
       return this.f;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 2;
       if (PatchProxy.isSupport(FollowButtonView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, FollowButtonView.class, "2")) {
             return;
          }
       }
       int i1 = e.b.d() / 2;
       FollowButtonView te = this.e;
       CustomLayout.i(this, te, this.k(te), this.j(te), false, 4, null);
       te = this.i;
       CustomLayout.i(this, te, this.k(te), (this.j(te) - i1), false, 4, null);
       te = this.g;
       CustomLayout.i(this, te, this.k(te), (this.j(te) - i1), false, 4, null);
       te = this.h;
       CustomLayout.i(this, te, this.k(te), (this.j(te) - i1), false, 4, null);
       te = this.f;
       CustomLayout.i(this, te, this.k(te), (this.j(te) - i1), false, 4, null);
       te = this.j;
       CustomLayout.i(this, te, this.k(te), (this.j(te) - i1), false, 4, null);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FollowButtonView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FollowButtonView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.c(this.e);
       this.c(this.g);
       this.c(this.f);
       this.c(this.h);
       this.c(this.j);
       this.c(this.i);
       this.setMeasuredDimension(q.n(this.g.getMeasuredWidth(), this.e.getMeasuredWidth()), q.n(this.g.getMeasuredHeight(), this.e.getMeasuredHeight()));
       return;
    }
}
