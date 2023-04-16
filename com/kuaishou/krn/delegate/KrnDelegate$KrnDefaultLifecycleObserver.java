package com.kuaishou.krn.delegate.KrnDelegate$KrnDefaultLifecycleObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import android.app.Activity;
import com.facebook.react.a;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import je.a;
import java.lang.ClassCastException;

public class KrnDelegate$KrnDefaultLifecycleObserver implements DefaultLifecycleObserver	// class@000856
{
    public final Activity b;
    public final WeakReference c;
    public final boolean d;

    public void KrnDelegate$KrnDefaultLifecycleObserver(Activity p0,a p1,LaunchModel p2){
       super();
       this.b = p0;
       this.c = new WeakReference(p1);
       Objects.requireNonNull(p2);
       p0 = PatchProxy.apply(null, p2, LaunchModel.class, "13");
       boolean b = (p0 != PatchProxyResult.class)? p0.booleanValue(): p2.o("enableBackBtnHandler", true);
       this.d = b;
       return;
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, KrnDelegate$KrnDefaultLifecycleObserver.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.get();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnDelegate$KrnDefaultLifecycleObserver.class, "3")) {
          return;
       }
       a uoa = this.a();
       if (uoa != null) {
          uoa.C(this.b);
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnDelegate$KrnDefaultLifecycleObserver.class, "2")) {
          return;
       }
       a uoa = this.a();
       if (uoa != null) {
          uoa.D(this.b);
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnDelegate$KrnDefaultLifecycleObserver.class, "1")) {
          return;
       }
       a uoa = this.a();
       if (this.d != null) {
          KrnDelegate$KrnDefaultLifecycleObserver tb = this.b;
          if (tb instanceof a) {
             if (uoa != null) {
                uoa.E(tb, tb);
             }
          }else {
             throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
          }
       }else if(uoa != null){
          uoa.E(this.b, null);
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
