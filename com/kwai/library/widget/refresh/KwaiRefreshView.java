package com.kwai.library.widget.refresh.KwaiRefreshView;
import o17.j;
import android.widget.RelativeLayout;
import com.kwai.library.widget.refresh.KwaiRefreshView$a;
import android.os.Looper;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import ll8.c$b;
import android.content.res.TypedArray;
import r17.e;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import ag6.a;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import r17.d;
import android.view.ViewParent;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

public class KwaiRefreshView extends RelativeLayout implements j	// class@0009c2
{
    public final int b;
    public final int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public PathLoadingView j;
    public boolean k;
    public boolean l;
    public d m;
    public static final Handler n;

    static {
       KwaiRefreshView.n = new KwaiRefreshView$a(Looper.getMainLooper());
    }
    public void KwaiRefreshView(Context p0){
       super(p0, null);
    }
    public void KwaiRefreshView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiRefreshView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       p2 = this.hashCode();
       this.b = p2;
       this.c = p2 + 1;
       LoadingStyle gRAY = LoadingStyle.GRAY;
       this.h = gRAY.value;
       this.i = -2;
       this.k = true;
       this.l = false;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Y1);
       this.h = typedArray.getInt(4, gRAY.value);
       this.k = typedArray.getBoolean(1, 1);
       this.i = typedArray.getResourceId(false, -2);
       typedArray.recycle();
       this.a();
    }
    public final void a(){
       e viewFactory = this.getViewFactory();
       if (viewFactory != null) {
          viewFactory.a(this.getContext(), this);
       }else {
          a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d072c, this, true);
          this.j = this.findViewById(0x7f0a3333);
          this.i(LoadingStyle.fromOrdinal(this.h), this.i);
       }
       return;
    }
    public void c(){
       this.d(false);
    }
    public void d(boolean p0){
       this.h(this.c);
       this.g = false;
       if (p0 || (this.f != null && (this.d == null && this.e == null))) {
          this.g();
          this.a();
          KwaiRefreshView tm = this.m;
          if (tm != null) {
             tm.a();
          }
       }else {
          this.g = true;
       }
       return;
    }
    public boolean e(){
       return this.k;
    }
    public boolean f(){
       return false;
    }
    public void g(){
       KwaiRefreshView tj = this.j;
       if (tj != null && tj.getParent() != null) {
          this.removeView(this.j);
          this.j = null;
       }
       return;
    }
    public e getViewFactory(){
       return null;
    }
    public final void h(int p0){
       KwaiRefreshView.n.removeMessages(p0);
    }
    public void i(LoadingStyle p0,int p1){
       KwaiRefreshView tj = this.j;
       if (tj != null) {
          tj.f(p0, p1);
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.f = true;
       if (this.g != null) {
          this.c();
       }
       return;
    }
    public void onDetachedFromWindow(){
       this.f = false;
       this.h(this.c);
       this.h(this.b);
       super.onDetachedFromWindow();
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       this.setPadding(0, 0, 0, 0);
    }
    public void pullProgress(float p0,float p1){
       if (this.d != null) {
          return;
       }
       KwaiRefreshView tj = this.j;
       if (tj != null) {
          tj.m(p1);
       }
       if (p1 - 0x3f000000 <= 0 && !this.getAlpha()) {
          this.setAlpha(0x3f800000);
       }
       return;
    }
    public void pullToRefresh(){
       this.e = true;
    }
    public void refreshComplete(){
       Message message = Message.obtain();
       message.what = this.b;
       message.obj = new WeakReference(this);
       KwaiRefreshView.n.sendMessageDelayed(message, 500);
    }
    public int refreshedAnimatorDuration(){
       return 500;
    }
    public void refreshing(){
       this.h(this.b);
       this.d = true;
       KwaiRefreshView tj = this.j;
       if (tj != null) {
          if (this.e != null) {
             tj.k();
          }else {
             tj.o(0x3f000000);
          }
       }
       this.setAlpha(0x3f800000);
       return;
    }
    public void releaseToRefresh(){
    }
    public void reset(){
       this.d = false;
       this.e = false;
       if (this.g != null) {
          this.c();
       }
       KwaiRefreshView tj = this.j;
       if (tj != null) {
          tj.a();
       }
       return;
    }
    public void setForceDefault(boolean p0){
       if (this.k == p0) {
          return;
       }
       this.k = p0;
       p0 = (!p0 && this.f())? true: false;
       if (this.l != p0) {
          this.l = p0;
          this.c();
       }
       return;
    }
    public void setLoadingColor(int p0){
       KwaiRefreshView tj = this.j;
       if (tj != null) {
          tj.setLoadingColor(p0);
       }
       return;
    }
    public void setLoadingStyle(LoadingStyle p0){
       this.i(p0, -2);
    }
    public void setOnRefreshInvalidCallback(d p0){
       this.m = p0;
    }
}
