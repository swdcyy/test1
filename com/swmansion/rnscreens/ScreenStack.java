package com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.ScreenContainer;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import com.swmansion.rnscreens.ScreenStack$a;
import com.swmansion.rnscreens.ScreenStack$b;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import com.swmansion.rnscreens.ScreenStackFragment;
import java.lang.Object;
import java.util.Set;
import android.view.View;
import android.view.ViewGroup;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.Iterator;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.swmansion.rnscreens.Screen$StackPresentation;
import com.swmansion.rnscreens.ScreenStack$c;
import java.lang.Runnable;
import com.swmansion.rnscreens.ScreenStack$d;
import com.swmansion.rnscreens.Screen$StackAnimation;
import java.lang.Enum;
import java.util.Collection;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import df.c;
import kn8.d;
import df.b;
import androidx.fragment.app.c$b;
import androidx.fragment.app.c;
import androidx.fragment.app.c$c;

public class ScreenStack extends ScreenContainer	// class@000caf
{
    public final ArrayList k;
    public final Set l;
    public ScreenStackFragment m;
    public boolean n;
    public final c$c o;
    public final c$b p;

    public void ScreenStack(Context p0){
       super(p0);
       this.k = new ArrayList();
       this.l = new HashSet();
       this.m = null;
       this.n = false;
       this.o = new ScreenStack$a(this);
       this.p = new ScreenStack$b(this);
    }
    public ScreenFragment a(Screen p0){
       return new ScreenStackFragment(p0);
    }
    public boolean e(ScreenFragment p0){
       boolean b = (super.e(p0) && !this.l.contains(p0))? true: false;
       return b;
    }
    public void endViewTransition(View p0){
       super.endViewTransition(p0);
       if (this.n != null) {
          this.n = false;
          this.n();
       }
       return;
    }
    public Screen getRootScreen(){
       Screen screen;
       int screenCount = this.getScreenCount();
       int i = 0;
       while (true) {
          if (i >= screenCount) {
             throw new IllegalStateException("Stack has no root screen set");
          }
          screen = this.d(i);
          if (!this.l.contains(screen.getFragment())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return screen;
    }
    public Screen getTopScreen(){
       ScreenStack tm = this.m;
       Screen screen = (tm != null)? tm.Ug(): null;
       return screen;
    }
    public void h(){
       ScreenStackFragment screenStackF2;
       int i3;
       ScreenStack tm;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          ScreenStackFragment screenStackF = iterator.next();
          if (!this.b.contains(screenStackF) || this.l.contains(screenStackF)) {
             this.getOrCreateTransaction().u(screenStackF);
          }
       }
       int i = 1;
       int i1 = this.b.size() - i;
       Fragment uFragment = null;
       ScreenStackFragment screenStackF1 = uFragment;
       while (i1 >= 0) {
          screenStackF2 = this.b.get(i1);
          if (!this.l.contains(screenStackF2)) {
             if (screenStackF1 == null) {
                if (screenStackF2.Ug().getStackPresentation() != Screen$StackPresentation.TRANSPARENT_MODAL) {
                   screenStackF1 = screenStackF2;
                   break ;
                }else {
                   screenStackF1 = screenStackF2;
                }
             }else {
                uFragment = screenStackF2;
                break ;
             }
          }
          i1 = i1 - 1;
       }
       iterator = this.b.iterator();
       while (iterator.hasNext()) {
          screenStackF2 = iterator.next();
          if (screenStackF2 != screenStackF1 && (screenStackF2 != uFragment && !this.l.contains(screenStackF2))) {
             this.getOrCreateTransaction().u(screenStackF2);
          }
       }
       if (uFragment != null && !uFragment.isAdded()) {
          e orCreateTran = this.getOrCreateTransaction();
          orCreateTran.f(this.getId(), uFragment);
          orCreateTran.x(new ScreenStack$c(this, screenStackF1));
       }
       if (screenStackF1 != null && !screenStackF1.isAdded()) {
          this.getOrCreateTransaction().f(this.getId(), screenStackF1);
       }
       int i2 = 4099;
       if (!this.k.contains(screenStackF1)) {
          if (this.m != null && screenStackF1 != null) {
             i3 = ScreenStack$d.a[screenStackF1.Ug().getStackAnimation().ordinal()];
             if (i3 != i) {
                if (i3 != 2) {
                   i2 = 4097;
                }
             }else {
                i2 = 0;
             }
             this.getOrCreateTransaction().D(i2);
          }
       }else {
          tm = this.m;
          if (tm != null && !tm.equals(screenStackF1)) {
             i3 = ScreenStack$d.a[this.m.Ug().getStackAnimation().ordinal()];
             if (i3 != i) {
                if (i3 != 2) {
                   i2 = 8194;
                }
             }else {
                i2 = 0;
             }
             this.getOrCreateTransaction().D(i2);
          }
       }
       this.m = screenStackF1;
       this.k.clear();
       this.k.addAll(this.b);
       this.k();
       tm = this.m;
       if (tm != null) {
          this.setupBackHandlerIfNeeded(tm);
       }
       iterator = this.k.iterator();
       while (iterator.hasNext()) {
          View childAt = iterator.next().b.getChildAt(0);
          if (childAt instanceof ScreenStackHeaderConfig) {
             childAt.b();
          }
       }
       return;
    }
    public void i(){
       this.l.clear();
       super.i();
    }
    public void j(int p0){
       this.l.remove(this.d(p0).getFragment());
       super.j(p0);
    }
    public void m(ScreenStackFragment p0){
       this.l.add(p0);
       this.g();
    }
    public final void n(){
       this.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher().c(new d(this.getId()));
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.c.registerFragmentLifecycleCallbacks(this.p, false);
    }
    public void onDetachedFromWindow(){
       ScreenContainer tc = this.c;
       if (tc != null) {
          tc.removeOnBackStackChangedListener(this.o);
          this.c.unregisterFragmentLifecycleCallbacks(this.p);
          if (!this.c.isStateSaved()) {
             this.c.popBackStack("RN_SCREEN_LAST", 1);
          }
       }
       super.onDetachedFromWindow();
       return;
    }
    public void setupBackHandlerIfNeeded(ScreenStackFragment p0){
       if (!this.m.isResumed()) {
          return;
       }
       this.c.removeOnBackStackChangedListener(this.o);
       this.c.popBackStack("RN_SCREEN_LAST", 1);
       ScreenStackFragment screenStackF = null;
       int i = 0;
       int i1 = this.k.size();
       while (i < i1) {
          ScreenStackFragment screenStackF1 = this.k.get(i);
          if (!this.l.contains(screenStackF1)) {
             screenStackF = screenStackF1;
             break ;
          }else {
             i = i + 1;
          }
       }
       if (p0 != screenStackF && p0.b.h != null) {
          e uoe = this.c.beginTransaction().E(p0);
          uoe.j("RN_SCREEN_LAST");
          uoe.B(p0).m();
          this.c.addOnBackStackChangedListener(this.o);
       }
       return;
    }
    public void startViewTransition(View p0){
       super.startViewTransition(p0);
       this.n = true;
    }
}
