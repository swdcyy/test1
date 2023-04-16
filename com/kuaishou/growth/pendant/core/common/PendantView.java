package com.kuaishou.growth.pendant.core.common.PendantView;
import androidx.lifecycle.ViewModelStoreOwner;
import de0.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelStore;
import com.kuaishou.growth.pendant.core.common.PendantView$viewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.growth.pendant.core.common.PendantView$touchDelegate$2;
import com.kuaishou.growth.pendant.core.common.PendantView$b;
import com.kuaishou.growth.pendant.core.common.PendantView$a;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.View;
import de0.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.growth.pendant.core.common.PendantView$dispatchTouchEvent$1;
import msd.l;
import de0.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import de0.e;
import java.lang.Throwable;
import de0.a$a;
import com.kuaishou.growth.pendant.core.common.PendantView$onInterceptTouchEvent$1;
import java.lang.Integer;
import com.kuaishou.growth.pendant.core.common.PendantView$onTouchEvent$1;

public abstract class PendantView extends FrameLayout implements ViewModelStoreOwner, a	// class@00063a
{
    public ViewModelStore b;
    public final p c;
    public final p d;
    public final Observer e;
    public final Observer f;

    public void PendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void PendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void PendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new ViewModelStore();
       this.c = s.c(new PendantView$viewModel$2(this));
       this.d = s.c(new PendantView$touchDelegate$2(this));
       this.e = new PendantView$b(this);
       this.f = new PendantView$a(this);
    }
    public void PendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static final boolean a(PendantView p0,MotionEvent p1){
       return super.dispatchTouchEvent(p1);
    }
    public static final boolean b(PendantView p0,MotionEvent p1){
       return super.onInterceptTouchEvent(p1);
    }
    public static final boolean c(PendantView p0,MotionEvent p1){
       return super.onTouchEvent(p1);
    }
    public c d(){
       return null;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       c obj = PatchProxy.applyOneRefs(p0, this, PendantView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       obj = this.getTouchDelegate();
       boolean b = (obj != null)? obj.g(p0, new PendantView$dispatchTouchEvent$1(this)): super.dispatchTouchEvent(p0);
       return b;
    }
    public abstract d e();
    public abstract void f(Object p0);
    public abstract void g(Object p0);
    public final c getTouchDelegate(){
       Object obj = PatchProxy.apply(null, this, PendantView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final d getViewModel(){
       Object obj = PatchProxy.apply(null, this, PendantView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public ViewModelStore getViewModelStore(){
       return this.b;
    }
    public final void h(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantView.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       this.getViewModel().viewStates().observe(p0, this.e);
       this.getViewModel().viewEffects$pendant_core_release().observe(p0, this.f);
       return;
    }
    public void log(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantView.class, "9")) {
          return;
       }
       a.p(p0, "msg");
       a$a.a(this, p0, p1);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, PendantView.class, "6")) {
          return;
       }
       this.b.clear();
       this.getViewModel().viewStates().removeObserver(this.e);
       this.getViewModel().viewEffects$pendant_core_release().removeObserver(this.f);
       super.onDetachedFromWindow();
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       c obj = PatchProxy.applyOneRefs(p0, this, PendantView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       obj = this.getTouchDelegate();
       boolean b = (obj != null)? obj.i(p0, new PendantView$onInterceptTouchEvent$1(this)): super.onInterceptTouchEvent(p0);
       return b;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(PendantView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, PendantView.class, "7")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       c touchDelegat = this.getTouchDelegate();
       if (touchDelegat != null) {
          touchDelegat.onSizeChanged(p0, p1, p2, p3);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       c obj = PatchProxy.applyOneRefs(p0, this, PendantView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       obj = this.getTouchDelegate();
       boolean b = (obj != null)? obj.j(p0, new PendantView$onTouchEvent$1(this)): super.onTouchEvent(p0);
       return b;
    }
}
