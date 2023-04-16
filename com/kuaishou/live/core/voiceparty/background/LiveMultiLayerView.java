package com.kuaishou.live.core.voiceparty.background.LiveMultiLayerView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.drawable.Animatable;
import ho2.i$a;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import ho2.m;
import android.widget.ImageView;
import android.graphics.drawable.ColorDrawable;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerView$a;

public final class LiveMultiLayerView extends FrameLayout	// class@00133d
{
    public LiveMultiLayerViewController b;
    public Drawable c;
    public HashMap d;

    public void LiveMultiLayerView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b(p0, null);
    }
    public void LiveMultiLayerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b(p0, p1);
    }
    public void LiveMultiLayerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b(p0, p1);
    }
    public final void a(){
       LiveMultiLayerViewController b;
       if (PatchProxy.applyVoid(null, this, LiveMultiLayerView.class, "5")) {
          return;
       }
       LiveMultiLayerView tb = this.b;
       if (tb == null) {
          a.S("viewController");
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, LiveMultiLayerViewController.class, "4")) {
          b.Z(LiveLogTag.LIVE_VOICE_PARTY, "clearContentView");
          b = tb.b;
          if (b != null) {
             tb.m.removeView(b);
             tb.b = null;
          }
          b = tb.c;
          if (b != null) {
             tb.m.removeView(b);
             tb.c = null;
          }
          tb.d = null;
          tb.i = null;
       }
       return;
    }
    public final void b(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiLayerView.class, "1")) {
          return;
       }
       this.b = new LiveMultiLayerViewController(p0, this);
       return;
    }
    public final boolean c(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveMultiLayerView obj = PatchProxy.apply(objArray, this, LiveMultiLayerView.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj == null) {
          a.S("viewController");
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, LiveMultiLayerViewController.class, "17");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          LiveMultiLayerViewController d = obj.d;
          if (d != null && d.a().isRunning()) {
             d.a().stop();
             b = true;
          }else {
             b = false;
          }
       }
       return b;
    }
    public final boolean d(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveMultiLayerView obj = PatchProxy.apply(objArray, this, LiveMultiLayerView.class, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj == null) {
          a.S("viewController");
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, LiveMultiLayerViewController.class, "18");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          LiveMultiLayerViewController d = obj.d;
          if (d != null && !d.a().isRunning()) {
             d.a().start();
             b = true;
          }else {
             b = false;
          }
       }
       return b;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLayerView.class, "14")) {
          return;
       }
       super.dispatchDraw(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLayerView.class, "15") && p0 != null) {
          LiveMultiLayerView tc = this.c;
          if (tc != null) {
             tc.setBounds(this.getPaddingLeft(), this.getPaddingTop(), (this.getWidth() - this.getPaddingRight()), (this.getHeight() - this.getPaddingBottom()));
             tc.draw(p0);
          }
       }
       return;
    }
    public final void e(m p0){
       String str = "8";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLayerView.class, str)) {
          return;
       }
       String str1 = "config";
       a.p(p0, str1);
       LiveMultiLayerView tb = this.b;
       if (tb == null) {
          a.S("viewController");
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveMultiLayerViewController.class, str)) {
          a.p(p0, str1);
          if (a.g(p0, tb.i)) {
             b.c0(LiveLogTag.LIVE_VOICE_PARTY, "dataInfo is same", "info", p0.toString());
          }else {
             tb.i = p0;
             tb.g();
          }
       }
       return;
    }
    public final Drawable getBgViewDrawable(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveMultiLayerView obj = PatchProxy.apply(objArray, this, LiveMultiLayerView.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("viewController");
       }
       Objects.requireNonNull(obj);
       ColorDrawable uColorDrawab = PatchProxy.apply(objArray, obj, LiveMultiLayerViewController.class, "16");
       if (uColorDrawab != patchProxyRe) {
       }else {
          LiveMultiLayerViewController b = obj.b;
          LiveMultiLayerViewController c = obj.c;
          if (b != null && !b.getVisibility()) {
             objArray = b.getDrawable();
          }else if(c != null && !c.getVisibility()){
             objArray = c.getBackground();
          }
          if (objArray == null) {
             objArray = obj.m.getBackground();
          }
          if (objArray == null) {
             uColorDrawab = new ColorDrawable(0);
          }else {
             uColorDrawab = objArray;
          }
       }
       return uColorDrawab;
    }
    public void onAttachedToWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiLayerView.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       LiveMultiLayerView tb = this.b;
       if (tb == null) {
          a.S("viewController");
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveMultiLayerViewController.class, "1")) {
          tb.h = true;
          if (tb.f != null) {
             tb.g();
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiLayerView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       LiveMultiLayerView tb = this.b;
       if (tb == null) {
          a.S("viewController");
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveMultiLayerViewController.class, "2")) {
          tb.h = false;
          tb.b();
       }
       return;
    }
    public final void setDynamicEnable(boolean p0){
       if (PatchProxy.isSupport(LiveMultiLayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveMultiLayerView.class, "4")) {
          return;
       }
       LiveMultiLayerView tb = this.b;
       if (tb == null) {
          a.S("viewController");
       }
       tb.e = p0;
       return;
    }
    public final void setForegroundImg(Drawable p0){
       this.c = p0;
    }
    public final void setPlaceHolderImg(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLayerView.class, "9")) {
          return;
       }
       LiveMultiLayerView tb = this.b;
       if (tb == null) {
          a.S("viewController");
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveMultiLayerViewController.class, "6")) {
          tb.j = p0;
          if (tb.i == null) {
             tb.a.setBackground(p0);
          }
       }
       return;
    }
    public final void setViewStateChangeListener(LiveMultiLayerView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLayerView.class, "13")) {
          return;
       }
       LiveMultiLayerView tb = this.b;
       if (tb == null) {
          a.S("viewController");
       }
       tb.k = p0;
       return;
    }
}
