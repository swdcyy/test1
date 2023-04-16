package com.kwai.yoda.kernel.loading.YodaLoadingView;
import android.widget.FrameLayout;
import com.kwai.yoda.kernel.loading.YodaLoadingView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.LinearLayout;
import android.widget.TextView;
import wy7.c;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import az7.b;
import az7.b$a;
import kotlin.TypeCastException;
import android.widget.FrameLayout$LayoutParams;
import android.os.Handler;
import tb7.b;
import java.lang.Runnable;
import wy7.b;
import sy7.b;
import java.lang.Throwable;
import crd.b;
import java.lang.CharSequence;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.kernel.loading.YodaLoadingView$b;
import java.util.concurrent.Callable;
import az7.a;
import az7.a$a;
import android.graphics.Color;
import com.kwai.yoda.kernel.loading.YodaLoadingView$c;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import com.kwai.yoda.kernel.loading.YodaLoadingView$d;
import erd.o;
import com.kwai.yoda.kernel.loading.YodaLoadingView$e;
import com.kwai.yoda.kernel.loading.YodaLoadingView$f;
import com.kwai.yoda.kernel.loading.YodaLoadingView$g;
import com.kwai.yoda.kernel.loading.YodaLoadingView$h;
import erd.g;
import erd.a;

public class YodaLoadingView extends FrameLayout	// class@0012b3
{
    public LinearLayout b;
    public FrameLayout c;
    public TextView d;
    public b e;
    public Runnable f;
    public b g;
    public boolean h;
    public static final YodaLoadingView$a i;

    static {
       YodaLoadingView.i = new YodaLoadingView$a(null);
    }
    public void YodaLoadingView(Context p0){
       a.q(p0, "context");
       super(p0, null);
    }
    public void YodaLoadingView(Context p0,AttributeSet p1){
       a.q(p0, "context");
       super(p0, p1, 0);
    }
    public void YodaLoadingView(Context p0,AttributeSet p1,int p2){
       a.q(p0, "context");
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, YodaLoadingView.class, "7")) {
       }else {
          View view = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d171f, this, true);
          View view1 = view.findViewById(R.id.yoda_loading_box);
          a.h(view1, "view.findViewById\(R.id.yoda_loading_box\)");
          this.b = view1;
          view1 = view.findViewById(R.id.yoda_loading_img_container);
          a.h(view1, "view.findViewById\(R.id.yoda_loading_img_container\)");
          this.c = view1;
          view = view.findViewById(R.id.yoda_loading_text);
          a.h(view, "view.findViewById\(R.id.yoda_loading_text\)");
          this.d = view;
       }
       return;
    }
    public void a(c p0,int p1){
       b$a a;
       if (PatchProxy.isSupport(YodaLoadingView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, YodaLoadingView.class, "20")) {
          return;
       }
       c uoc = null;
       c g = (p0 != null)? p0.g: null;
       if (p0 != null) {
          uoc = p0.h;
       }
       YodaLoadingView tc = this.c;
       if (tc == null) {
          a.S("imgContainer");
       }
       ViewGroup$LayoutParams layoutParams = tc.getLayoutParams();
       if (layoutParams != null) {
          if (g > null && uoc > null) {
             a = b.a;
             layoutParams.width = a.a(g);
             layoutParams.height = a.a(uoc);
          }else if(g > null){
             layoutParams.width = b.a.a(g);
             layoutParams.height = -2;
          }else if(uoc > null){
             layoutParams.height = b.a.a(uoc);
             layoutParams.width = -2;
          }else {
             b$a a1 = b.a;
             layoutParams.width = a1.a(p1);
             layoutParams.height = a1.a(p1);
          }
          YodaLoadingView tc1 = this.c;
          if (tc1 == null) {
             a.S("imgContainer");
          }
          tc1.setLayoutParams(layoutParams);
          return;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
       }
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoadingView.class, "19")) {
          return;
       }
       int i = 0;
       p0 = (p0 != null)? p0.i: null;
       YodaLoadingView tb = this.b;
       if (tb == null) {
          a.S("loadingBox");
       }
       ViewGroup$LayoutParams layoutParams = tb.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.gravity = i;
          if (p0 > null) {
             layoutParams.gravity = 1;
             layoutParams.topMargin = p0;
          }else {
             layoutParams.gravity = 17;
             layoutParams.topMargin = i;
          }
          YodaLoadingView tb1 = this.b;
          if (tb1 == null) {
             a.S("loadingBox");
          }
          tb1.setLayoutParams(layoutParams);
          return;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, YodaLoadingView.class, "9")) {
          return;
       }
       YodaLoadingView tf = this.f;
       if (tf != null) {
          b.d().removeCallbacks(tf);
       }
       try{
          this.h = false;
          if (!PatchProxy.applyVoid(null, this, YodaLoadingView.class, "15")) {
             int i = 8;
             this.setVisibility(i);
             tf = this.g;
             if (tf != null) {
                tf.b();
             }
             tf = this.c;
             if (tf == null) {
                a.S("imgContainer");
             }
             tf.removeAllViews();
             b.b.g("Yoda hide loading");
          }
       }catch(java.lang.Exception e0){
          b.b.f(e0);
       }
       this.d();
       this.setLoadingBgColor(null);
       tf = this.e;
       if (tf != null) {
          tf.dispose();
       }
       this.e = null;
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaLoadingView.class, "17")) {
          return;
       }
       YodaLoadingView td = this.d;
       if (td == null) {
          a.S("tvLoading");
       }
       td.setText(objArray);
       td = this.d;
       if (td == null) {
          a.S("tvLoading");
       }
       td.setTextColor(-1);
       td = this.d;
       if (td == null) {
          a.S("tvLoading");
       }
       td.setVisibility(8);
       return;
    }
    public t e(b p0,int p1,String p2){
       if (PatchProxy.isSupport(YodaLoadingView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, YodaLoadingView.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p0, "provider");
       t ot = t.fromCallable(new YodaLoadingView$b(this, p0, p1, p2));
       a.h(ot, "Observable.fromCallable бн    EmptyResponse\(\)\n    }");
       return ot;
    }
    public void f(String p0,String p1){
       a$a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaLoadingView.class, "16")) {
          return;
       }
       YodaLoadingView yodaLoadingV = (p0 == null || !p0.length())? 1: null;
       if (yodaLoadingV) {
          return;
       }else {
          yodaLoadingV = this.d;
          if (yodaLoadingV == null) {
             a.S("tvLoading");
          }
          yodaLoadingV.setText(p0);
          a = a.a;
          if (a.a(p1)) {
             yodaLoadingV = this.d;
             if (yodaLoadingV == null) {
                a.S("tvLoading");
             }
             yodaLoadingV.setTextColor(Color.parseColor(a.b(p1)));
          }
          YodaLoadingView td = this.d;
          if (td == null) {
             a.S("tvLoading");
          }
          td.setVisibility(0);
          return;
       }
    }
    public void g(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoadingView.class, "10")) {
          return;
       }
       this.e = t.fromCallable(new YodaLoadingView$c(this)).subscribeOn(AzerothSchedulers.b.c()).flatMap(new YodaLoadingView$d(this, p0)).subscribe(YodaLoadingView$e.b, YodaLoadingView$f.b, new YodaLoadingView$g(this), YodaLoadingView$h.b);
       return;
    }
    public final FrameLayout getImgContainer(){
       YodaLoadingView obj = PatchProxy.apply(null, this, YodaLoadingView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("imgContainer");
       }
       return obj;
    }
    public final LinearLayout getLoadingBox(){
       YodaLoadingView obj = PatchProxy.apply(null, this, YodaLoadingView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("loadingBox");
       }
       return obj;
    }
    public final Runnable getLoadingCountDown(){
       return this.f;
    }
    public final b getLoadingDisposable(){
       return this.e;
    }
    public final b getLoadingImageProvider(){
       return this.g;
    }
    public final boolean getTimeoutSet(){
       return this.h;
    }
    public final TextView getTvLoading(){
       YodaLoadingView obj = PatchProxy.apply(null, this, YodaLoadingView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("tvLoading");
       }
       return obj;
    }
    public final void setImgContainer(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoadingView.class, "4")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public void setLoadingBgColor(c p0){
       c e;
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoadingView.class, "18")) {
          return;
       }
       if (p0 != null) {
          e = p0.e;
          if (e == null) {
          label_0012 :
             e = (p0 != null)? p0.c: null;
          }
       }else {
          goto label_0012 ;
       }
       if (e == null) {
          e = "#FFFFFF00";
       }
       a$a a = a.a;
       if (a.a(e)) {
          this.setBackgroundColor(Color.parseColor(a.b(e)));
       }
       return;
    }
    public final void setLoadingBox(LinearLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoadingView.class, "2")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void setLoadingCountDown(Runnable p0){
       this.f = p0;
    }
    public final void setLoadingDisposable(b p0){
       this.e = p0;
    }
    public final void setLoadingImageProvider(b p0){
       this.g = p0;
    }
    public final void setTimeoutSet(boolean p0){
       this.h = p0;
    }
    public final void setTvLoading(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoadingView.class, "6")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.d = p0;
       return;
    }
}
