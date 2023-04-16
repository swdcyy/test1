package com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController;
import n93.a;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$a;
import nsd.u;
import ia3.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$viewModel$2;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$$special$$inlined$viewModels$2;
import msd.a;
import androidx.cardview.widget.CardView;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import ga3.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ga3.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewModel$a$b;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewModel$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import qrd.p;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$c;
import android.text.TextPaint;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$d;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$e;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$f;

public abstract class LiveLiteBaseCommentNoticeViewController extends a	// class@00084d
{
    public KwaiImageView j;
    public TextView k;
    public CardView l;
    public TextView m;
    public TextView n;
    public final p o;
    public final b p;
    public static final LiveLiteBaseCommentNoticeViewController$a q;

    static {
       LiveLiteBaseCommentNoticeViewController.q = new LiveLiteBaseCommentNoticeViewController$a(null);
    }
    public void LiveLiteBaseCommentNoticeViewController(b p0){
       a.p(p0, "delegate");
       super();
       this.p = p0;
       this.o = new ViewModelLazy(m0.d(LiveLiteBaseCommentNoticeViewModel.class), new LiveLiteBaseCommentNoticeViewController$$special$$inlined$viewModels$2(new LiveLiteBaseCommentNoticeViewController$$special$$inlined$viewModels$1(this)), new LiveLiteBaseCommentNoticeViewController$viewModel$2(this));
    }
    public static final CardView W2(LiveLiteBaseCommentNoticeViewController p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("rightButtonViewContainer");
       }
       return p0;
    }
    public void F2(){
       LiveLiteBaseCommentNoticeViewController liveLiteBase = LiveLiteBaseCommentNoticeViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteBase, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0986);
       this.j = this.A2(0x7f0a034b);
       this.k = this.A2(0x7f0a3f73);
       CardView uCardView = this.A2(R.id.button_container);
       this.l = uCardView;
       if (uCardView == null) {
          a.S("rightButtonViewContainer");
       }
       uCardView.setBackgroundResource(R.drawable.arg_RES_7f081096);
       this.m = this.A2(0x7f0a364a);
       this.n = this.A2(0x7f0a364b);
       if (!PatchProxy.applyVoid(objArray, this, liveLiteBase, "4")) {
          this.Y2().b.observe(this, new b(this));
          liveLiteBase = this.m;
          if (liveLiteBase == null) {
             a.S("clickableTextView");
          }
          liveLiteBase.setOnClickListener(new c(this));
       }
       this.Y2().w0(LiveLiteBaseCommentNoticeViewModel$a$b.a);
       return;
    }
    public int V2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeViewController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070319);
    }
    public abstract LiveLiteBaseCommentNoticeViewModel X2(b p0);
    public final LiveLiteBaseCommentNoticeViewModel Y2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
    public final void Z2(boolean p0){
       ValueAnimator valueAnimato;
       LiveLiteBaseCommentNoticeViewController liveLiteBase = LiveLiteBaseCommentNoticeViewController.class;
       if (PatchProxy.isSupport(liveLiteBase) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveLiteBase, "8")) {
          return;
       }
       liveLiteBase = this.l;
       if (liveLiteBase == null) {
          a.S("rightButtonViewContainer");
       }
       Drawable background = liveLiteBase.getBackground();
       int i = 2;
       if (p0) {
          valueAnimato = ValueAnimator.ofInt(new int[i]{128,255});
          valueAnimato.addUpdateListener(new LiveLiteBaseCommentNoticeViewController$b(background));
          a.o(valueAnimato, "animator");
          valueAnimato.setDuration(200);
          valueAnimato.start();
       }else {
          valueAnimato = ValueAnimator.ofInt(new int[i]{255,128});
          valueAnimato.addUpdateListener(new LiveLiteBaseCommentNoticeViewController$c(background));
          a.o(valueAnimato, "animator");
          valueAnimato.setDuration(300);
          valueAnimato.start();
       }
       return;
    }
    public final void a3(String p0,TextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteBaseCommentNoticeViewController.class, "7")) {
          return;
       }
       int i = (int)p1.getPaint().measureText(p0);
       LiveLiteBaseCommentNoticeViewController tl = this.l;
       String str = "rightButtonViewContainer";
       if (tl == null) {
          a.S(str);
       }
       i = i + tl.getContentPaddingLeft();
       tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       i = i + tl.getContentPaddingRight();
       tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       if (tl.getWidth() != i) {
          int[] ointArray = new int[2];
          LiveLiteBaseCommentNoticeViewController tl1 = this.l;
          if (tl1 == null) {
             a.S(str);
          }
          ointArray[0] = tl1.getWidth();
          ointArray[1] = i;
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          valueAnimato.addUpdateListener(new LiveLiteBaseCommentNoticeViewController$d(this));
          valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
          valueAnimato.setDuration(300);
          valueAnimato.start();
       }
       return;
    }
    public final void b3(TextView p0,TextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteBaseCommentNoticeViewController.class, "6")) {
          return;
       }
       AlphaAnimation uAlphaAnimat = new AlphaAnimation(0, 0x3f800000);
       uAlphaAnimat.setDuration(200);
       p0.startAnimation(uAlphaAnimat);
       uAlphaAnimat.setAnimationListener(new LiveLiteBaseCommentNoticeViewController$e(p0));
       AlphaAnimation uAlphaAnimat1 = new AlphaAnimation(0x3f800000, 0);
       uAlphaAnimat1.setDuration(200);
       uAlphaAnimat1.setAnimationListener(new LiveLiteBaseCommentNoticeViewController$f(p1));
       p1.startAnimation(uAlphaAnimat1);
       return;
    }
}
