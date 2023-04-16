package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$a;
import nsd.u;
import hf3.a;
import td3.o;
import x83.a;
import hx1.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$viewModel$2;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import rb3.f;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$$special$$inlined$viewModels$2;
import msd.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$getRootView$factory$1;
import ec3.f;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$a;
import qrd.p;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$setupGestureDetector$disposable$1;
import msd.l;
import crd.b;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$setupGestureDetector$1;
import u63.a;
import android.animation.ValueAnimator;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$onDestroy$1$1;
import java.lang.Number;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$d;
import android.animation.Animator$AnimatorListener;

public final class LiveLiteInteractiveMessageViewController extends ViewController	// class@0009cd
{
    public final p j;
    public ViewGroup k;
    public EmojiTextView l;
    public EmojiTextView m;
    public boolean n;
    public ValueAnimator o;
    public LiveLiteViewRecycler$a p;
    public final LiveStreamFeed q;
    public final LiveLiteGestureService r;
    public final a s;
    public final a t;
    public static final LiveLiteInteractiveMessageViewController$a u;

    static {
       LiveLiteInteractiveMessageViewController.u = new LiveLiteInteractiveMessageViewController$a(null);
    }
    public void LiveLiteInteractiveMessageViewController(a p0,o p1,a p2,a p3,LiveStreamFeed p4,LiveLiteGestureService p5,a p6,a p7){
       a.p(p0, "longConnection");
       a.p(p1, "liteUserStatusManager");
       a.p(p2, "anonymityManager");
       a.p(p3, "roleInfoManager");
       a.p(p5, "gestureService");
       a.p(p6, "profileCardService");
       a.p(p7, "liveGiftInfoService");
       super();
       this.q = p4;
       this.r = p5;
       this.s = p6;
       this.t = p7;
       this.j = new ViewModelLazy(m0.d(f.class), new LiveLiteInteractiveMessageViewController$$special$$inlined$viewModels$2(new LiveLiteInteractiveMessageViewController$$special$$inlined$viewModels$1(this)), new LiveLiteInteractiveMessageViewController$viewModel$2(p0, p1, p2, p3));
    }
    public static final ViewGroup V2(LiveLiteInteractiveMessageViewController p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("container");
       }
       return p0;
    }
    public static final EmojiTextView W2(LiveLiteInteractiveMessageViewController p0){
       p0 = p0.m;
       if (p0 == null) {
          a.S("currentMessageView");
       }
       return p0;
    }
    public void F2(){
       LiveLiteInteractiveMessageViewController$getRootView$factory$1 obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteInteractiveMessageViewController liveLiteInte = LiveLiteInteractiveMessageViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteInte, "2")) {
          return;
       }
       b.Z(LiveLiteLogTag.INTERACTIVE_MESSAGE, "InteractiveMessageViewController onCreate");
       View view = PatchProxy.apply(objArray, this, liveLiteInte, "4");
       if (view != patchProxyRe) {
       }else {
          obj = new LiveLiteInteractiveMessageViewController$getRootView$factory$1(this);
          if (f.h()) {
             Object obj1 = PatchProxy.apply(objArray, objArray, f.class, "15");
             b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().u("SOURCE_LIVE").d("liteJankOptInteractiveMessageViewRecycle", false);
             if (b) {
                LiveLiteViewRecycler$a uoa = LiveLiteViewRecycler.d.a("INTERACTIVE_MESSAGE", obj);
                this.p = uoa;
                view = uoa.getView();
             }
          }
          view = obj.invoke();
       }
       this.R2(view);
       this.k = this.A2(0x7f0a20d4);
       this.m = this.A2(0x7f0a20d5);
       this.l = this.A2(0x7f0a20d6);
       obj = PatchProxy.apply(objArray, this, liveLiteInte, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.j.getValue();
       }
       obj.a.observe(this, new LiveLiteInteractiveMessageViewController$b(this));
       if (!PatchProxy.applyVoid(objArray, this, liveLiteInte, "6")) {
          LiveLiteInteractiveMessageViewController tr = this.r;
          liveLiteInte = this.k;
          if (liveLiteInte == null) {
             a.S("container");
          }
          a.a(this, new LiveLiteInteractiveMessageViewController$setupGestureDetector$1(tr.b(liveLiteInte, true, new LiveLiteInteractiveMessageViewController$setupGestureDetector$disposable$1(this))));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteInteractiveMessageViewController.class, "3")) {
          return;
       }
       b.Z(LiveLiteLogTag.INTERACTIVE_MESSAGE, "InteractiveMessageViewController onDestroy");
       LiveLiteInteractiveMessageViewController to = this.o;
       if (to != null) {
          to.end();
       }
       to = this.p;
       if (to != null) {
          LiveLiteViewRecycler.d.d(to, new LiveLiteInteractiveMessageViewController$onDestroy$1$1(this));
       }
       return;
    }
    public final int X2(View p0){
       LiveLiteInteractiveMessageViewController obj = PatchProxy.applyOneRefs(p0, this, LiveLiteInteractiveMessageViewController.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.k;
       if (obj == null) {
          a.S("container");
       }
       p0.measure(View$MeasureSpec.makeMeasureSpec(obj.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(0, 0));
       int measuredHeig = p0.getMeasuredHeight();
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams = null;
       }
       if (layoutParams != null) {
          measuredHeig = measuredHeig + layoutParams.topMargin;
       }
       return measuredHeig;
    }
    public final void Y2(int p0,a p1){
       LiveLiteInteractiveMessageViewController to;
       LiveLiteInteractiveMessageViewController liveLiteInte = LiveLiteInteractiveMessageViewController.class;
       if (PatchProxy.isSupport(liveLiteInte) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveLiteInte, "14")) {
          return;
       }
       LiveLiteLogTag iNTERACTIVE_ = LiveLiteLogTag.INTERACTIVE_MESSAGE;
       StringBuilder str = "InteractiveMessageViewController startContainerHeightAnimation: ";
       LiveLiteInteractiveMessageViewController tk = this.k;
       if (tk == null) {
          a.S("container");
       }
       b.Z(iNTERACTIVE_, str+tk.getHeight()+" to "+p0);
       liveLiteInte = this.o;
       if (liveLiteInte != null) {
          liveLiteInte.end();
       }
       int[] ointArray = new int[2];
       int i = 0;
       tk = this.k;
       if (tk == null) {
          a.S("container");
       }
       ointArray[i] = tk.getHeight();
       ointArray[1] = p0;
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       this.o = valueAnimato;
       a.m(valueAnimato);
       valueAnimato.setDuration(200);
       to = this.o;
       a.m(to);
       to.addUpdateListener(new LiveLiteInteractiveMessageViewController$c(this));
       to = this.o;
       a.m(to);
       to.addListener(new LiveLiteInteractiveMessageViewController$d(this, p1));
       to = this.o;
       a.m(to);
       to.start();
       return;
    }
}
