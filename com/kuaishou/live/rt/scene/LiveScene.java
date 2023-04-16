package com.kuaishou.live.rt.scene.LiveScene;
import gp3.b;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.live.rt.scene.LiveScene$1;
import androidx.fragment.app.DialogFragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import com.kuaishou.live.rt.scene.LiveScene$a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gp3.d;
import java.util.Objects;
import com.kuaishou.live.rt.scene.a;
import java.util.BitSet;
import androidx.fragment.app.Fragment;
import java.util.List;
import android.content.Context;
import fp3.c;
import androidx.lifecycle.LifecycleOwner;

public abstract class LiveScene implements b	// class@000f7b
{
    public LiveScene$a a;
    public e b;
    public c c;
    public d d;
    public b e;
    public d f;
    public final List g;
    public a h;
    public int i;
    public final LifecycleObserver j;

    public void LiveScene(){
       super();
       this.g = new ArrayList();
       this.j = new LiveScene$1(this);
    }
    public final void a(DialogFragment p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveScene.class, "14")) {
          return;
       }
       p0.show(this.a.b(), p1);
       return;
    }
    public final boolean b(int p0){
       LiveScene liveScene = LiveScene.class;
       if (PatchProxy.isSupport(liveScene)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveScene, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.d.b(p0);
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveScene.class, "10")) {
          return;
       }
       LiveScene th = this.h;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, a.class, "5")) {
          a.a();
          if (th.c != null) {
             th.c();
          }
       }
       return;
    }
    public boolean d(int p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveScene liveScene = LiveScene.class;
       if (PatchProxy.isSupport(liveScene)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveScene, "7");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (p0 < 0) {
          return false;
       }else {
          liveScene = this.h;
          Objects.requireNonNull(liveScene);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), liveScene, uoa, "2");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             label_0057 :
                return b;
             }
          }
          a.a();
          if (!liveScene.d.get(p0)) {
             liveScene.d.set(p0);
             liveScene.d();
          }
          b = true;
          goto label_0057 ;
       }
    }
    public final DialogFragment e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveScene.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Fragment uFragment = this.a.b().findFragmentByTag(p0);
       if (uFragment != null) {
          return uFragment;
       }
       return null;
    }
    public boolean f(int p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveScene liveScene = LiveScene.class;
       if (PatchProxy.isSupport(liveScene)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveScene, "8");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (p0 < 0) {
          return false;
       }else {
          liveScene = this.h;
          Objects.requireNonNull(liveScene);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), liveScene, uoa, "3");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             label_0057 :
                return b;
             }
          }
          a.a();
          if (liveScene.d.get(p0)) {
             liveScene.d.clear(p0);
             liveScene.d();
          }
          b = true;
          goto label_0057 ;
       }
    }
    public abstract List g(Object p0);
    public final Context getContext(){
       Object obj = PatchProxy.apply(null, this, LiveScene.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getContext();
    }
    public abstract c h();
    public abstract void i();
    public LifecycleOwner j(){
       Object obj = PatchProxy.apply(null, this, LiveScene.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j();
    }
}
