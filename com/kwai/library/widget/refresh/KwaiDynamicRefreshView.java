package com.kwai.library.widget.refresh.KwaiDynamicRefreshView;
import com.kwai.library.widget.refresh.KwaiRefreshView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.refresh.KwaiDynamicRefreshView$a;
import p17.a;
import com.kwai.library.widget.refresh.config.KwaiRefreshManager;
import r17.b;
import r17.e;
import o17.e;
import o17.j;
import java.lang.ref.WeakReference;
import r17.a;

public final class KwaiDynamicRefreshView extends KwaiRefreshView	// class@0009be
{
    public b o;
    public WeakReference p;
    public final KwaiDynamicRefreshView$a q;

    public void KwaiDynamicRefreshView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void KwaiDynamicRefreshView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void KwaiDynamicRefreshView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.q = new KwaiDynamicRefreshView$a(this);
    }
    public void KwaiDynamicRefreshView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public boolean f(){
       return KwaiRefreshManager.d(this.q);
    }
    public void g(){
       KwaiDynamicRefreshView to = this.o;
       if (to != null) {
          to.b();
       }
       this.o = null;
       super.g();
       return;
    }
    public e getViewFactory(){
       e uoe = (!this.e() && this.f())? new e(this): super.getViewFactory();
       return uoe;
    }
    public void pullProgress(float p0,float p1){
       KwaiDynamicRefreshView to = this.o;
       if (to != null) {
          to.pullProgress(p0, p1);
       }
       super.pullProgress(p0, p1);
       return;
    }
    public void pullToRefresh(){
       KwaiDynamicRefreshView to = this.o;
       if (to != null) {
          to.pullToRefresh();
       }
       super.pullToRefresh();
       return;
    }
    public void refreshComplete(){
       super.refreshComplete();
       if (this.o != null) {
          KwaiDynamicRefreshView tp = this.p;
          if (tp != null) {
             a uoa = tp.get();
             if (uoa != null) {
                uoa.a();
             }
          }
       }
       return;
    }
    public void refreshing(){
       KwaiDynamicRefreshView to = this.o;
       if (to != null) {
          to.refreshing();
       }
       super.refreshing();
       return;
    }
    public void releaseToRefresh(){
       KwaiDynamicRefreshView to = this.o;
       if (to != null) {
          to.releaseToRefresh();
       }
       return;
    }
    public void reset(){
       KwaiDynamicRefreshView to = this.o;
       if (to != null) {
          to.reset();
       }
       super.reset();
       return;
    }
    public final void setRefreshCompleteListener(a p0){
       a.p(p0, "listener");
       this.p = new WeakReference(p0);
    }
}
