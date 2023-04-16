package com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$a;
import nsd.u;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import com.kuaishou.live.service.ServiceProvider;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$bottomBubbleService$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import ha1.a;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import qrd.l1;
import android.view.ViewGroup;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$onCreate$2;
import msd.l;
import crd.b;
import androidx.lifecycle.LifecycleOwner;
import android.animation.ObjectAnimator;
import n93.a;
import vb3.f;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.animation.PropertyValuesHolder;
import java.util.Arrays;
import android.util.Property;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class LiveLiteBottomBubbleViewController extends ViewController	// class@001edf
{
    public a j;
    public ViewGroup k;
    public ObjectAnimator l;
    public final LiveLiteBottomBubbleViewController$bottomBubbleService$1 m;
    public final LiveLiteGestureService n;
    public final ServiceProvider o;
    public final a p;
    public static final LiveLiteBottomBubbleViewController$a q;

    static {
       LiveLiteBottomBubbleViewController.q = new LiveLiteBottomBubbleViewController$a(null);
    }
    public void LiveLiteBottomBubbleViewController(LiveLiteGestureService p0,ServiceProvider p1,a p2){
       a.p(p0, "gestureService");
       a.p(p1, "bottomBubbleServiceProvider");
       a.p(p2, "bottomBubbleHeightNotifierService");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.m = new LiveLiteBottomBubbleViewController$bottomBubbleService$1(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBottomBubbleViewController.class, "1")) {
          return;
       }
       View view = a.a(this, this.D2(), R.layout.arg_RES_7f0d0979);
       view.setTag(d.a, LayoutViewType.BottomBubble.name());
       this.R2(view);
       ViewGroup viewGroup = this.A2(R.id.lite_bottom_bubble_container);
       this.k = viewGroup;
       LiveLiteBottomBubbleViewController tn = this.n;
       if (viewGroup == null) {
          a.S("container");
       }
       tn.b(viewGroup, true, LiveLiteBottomBubbleViewController$onCreate$2.INSTANCE);
       this.o.b(this, this.m);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBottomBubbleViewController.class, "5")) {
          return;
       }
       LiveLiteBottomBubbleViewController tl = this.l;
       if (tl != null) {
          tl.cancel();
       }
       return;
    }
    public final void V2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBottomBubbleViewController.class, "3")) {
          return;
       }
       LiveLiteBottomBubbleViewController tj = this.j;
       if (tj != null) {
          LiveLiteBottomBubbleViewController tl = this.l;
          if (tl == null) {
             this.W2(tj);
          }else if(tl != null){
             tl.cancel();
          }
       }
       this.j = p0;
       tj = this.k;
       if (tj == null) {
          a.S("container");
       }
       this.y2(tj, p0);
       this.X2(true, p0).start();
       return;
    }
    public final void W2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBottomBubbleViewController.class, "2")) {
          return;
       }
       this.O2(p0);
       this.j = null;
       this.l = null;
       f uof = this.p.get();
       if (uof != null) {
          uof.a(0);
       }
       return;
    }
    public final ObjectAnimator X2(boolean p0,a p1){
       float[] uofloatArray;
       LiveLiteBottomBubbleViewController liveLiteBott = LiveLiteBottomBubbleViewController.class;
       if (PatchProxy.isSupport(liveLiteBott)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, liveLiteBott, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = (float)p1.V2();
       int i = 0;
       int i1 = 2;
       int i2 = 1;
       if (p0) {
          uofloatArray = new float[i1];
          uofloatArray[0] = f;
          uofloatArray[i2] = i;
       }else {
          uofloatArray = new float[i1];
          uofloatArray[0] = i;
          uofloatArray[i2] = f;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i2];
       propertyValu[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, Arrays.copyOf(uofloatArray, uofloatArray.length));
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.P2(), propertyValu);
       a.o(objectAnimat, "ObjectAnimator.ofPropert¡­     *array\n      \)\n    \)");
       objectAnimat.addUpdateListener(new LiveLiteBottomBubbleViewController$b(this, f));
       objectAnimat.setDuration(300);
       return objectAnimat;
    }
}
