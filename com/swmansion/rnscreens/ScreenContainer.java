package com.swmansion.rnscreens.ScreenContainer;
import android.view.ViewGroup;
import android.content.Context;
import java.util.ArrayList;
import com.swmansion.rnscreens.ScreenContainer$a;
import com.swmansion.rnscreens.ScreenContainer$b;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import java.lang.Object;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.a$a;
import androidx.fragment.app.c;
import java.util.HashSet;
import java.util.List;
import java.util.Collection;
import java.util.Set;
import com.swmansion.rnscreens.ScreenContainer$c;
import java.lang.Runnable;
import com.facebook.react.ReactRootView;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import android.content.ContextWrapper;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.Iterator;
import android.view.View;

public class ScreenContainer extends ViewGroup	// class@000ca8
{
    public final ArrayList b;
    public c c;
    public e d;
    public e e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final a$a i;
    public final a$a j;

    public void ScreenContainer(Context p0){
       super(p0);
       this.b = new ArrayList();
       this.h = false;
       this.i = new ScreenContainer$a(this);
       this.j = new ScreenContainer$b(this);
    }
    public ScreenFragment a(Screen p0){
       return new ScreenFragment(p0);
    }
    public void b(Screen p0,int p1){
       ScreenFragment screenFragme = this.a(p0);
       p0.setFragment(screenFragme);
       this.b.add(p1, screenFragme);
       p0.setContainer(this);
       this.g();
    }
    public final void c(ScreenFragment p0){
       this.getOrCreateTransaction().u(p0);
    }
    public Screen d(int p0){
       return this.b.get(p0).Ug();
    }
    public boolean e(ScreenFragment p0){
       return this.b.contains(p0);
    }
    public boolean f(ScreenFragment p0){
       return p0.Ug().d;
    }
    public void g(){
       if (this.f == null) {
          this.f = true;
          ReactChoreographer.a().d(ReactChoreographer$CallbackType.NATIVE_ANIMATED_MODULE, this.i);
       }
       return;
    }
    public e getOrCreateTransaction(){
       if (this.d == null) {
          e uoe = this.c.beginTransaction();
          this.d = uoe;
          uoe.C(true);
       }
       return this.d;
    }
    public int getScreenCount(){
       return this.b.size();
    }
    public void h(){
       HashSet hashSet = new HashSet(this.c.getFragments());
       boolean i = this.b.size();
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          ScreenFragment screenFragme = this.b.get(i2);
          if (!this.f(screenFragme) && screenFragme.isAdded()) {
             this.c(screenFragme);
          }
          hashSet.remove(screenFragme);
       }
       if (!hashSet.isEmpty()) {
          Object[] objArray = hashSet.toArray();
          i = 0;
          while (i < objArray.length) {
             if (objArray[i] instanceof ScreenFragment && objArray[i].Ug().getContainer() == null) {
                this.c(objArray[i]);
             }
             i = i + 1;
          }
       }
       int i3 = this.b.size();
       i = 0;
       i2 = 0;
       while (i < i3) {
          if (this.f(this.b.get(i))) {
             i2 = i2 + 1;
          }
          i = i + 1;
       }
       i = (i2 > 1)? true: false;
       i2 = this.b.size();
       e uoe = null;
       for (; i1 < i2; i1 = i1 + 1) {
          ScreenFragment screenFragme1 = this.b.get(i1);
          boolean b = this.f(screenFragme1);
          if (b && !screenFragme1.isAdded()) {
             this.getOrCreateTransaction().f(this.getId(), screenFragme1);
             uoe = 1;
          }else if(b && uoe != null){
             e orCreateTran = this.getOrCreateTransaction();
             orCreateTran.u(screenFragme1);
             orCreateTran.f(this.getId(), screenFragme1);
          }
          screenFragme1.Ug().setTransitioning(i);
       }
       this.k();
       return;
    }
    public void i(){
       int i = this.b.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.b.get(i1).Ug().setContainer(null);
       }
       this.b.clear();
       this.g();
       return;
    }
    public void j(int p0){
       this.b.get(p0).Ug().setContainer(null);
       this.b.remove(p0);
       this.g();
    }
    public void k(){
       ScreenContainer td = this.d;
       if (td != null) {
          this.e = td;
          td.x(new ScreenContainer$c(this, td));
          this.d.m();
          this.d = null;
       }
       return;
    }
    public void l(){
       if (this.f != null && this.g != null) {
          ScreenContainer tc = this.c;
          if (tc != null) {
             this.f = false;
             tc.executePendingTransactions();
             this.h();
          }
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.g = true;
       this.f = true;
       boolean b = this;
       while (!(v1 = b instanceof ReactRootView) && (!b instanceof Screen && b.getParent() != null)) {
          b = b.getParent();
       }
       if (b instanceof Screen) {
          this.setFragmentManager(b.getFragment().getChildFragmentManager());
       }else if(v1){
          Context context = b.getContext();
          while (!(v1 = context instanceof FragmentActivity) && context instanceof ContextWrapper) {
             context = context.getBaseContext();
          }
          if (v1) {
             this.setFragmentManager(context.getSupportFragmentManager());
          }else {
             throw new IllegalStateException("In order to use RNScreens components your app\'s activity need to extend ReactFragmentActivity or ReactCompatActivity");
          }
       }else {
          throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
       }
       return;
    }
    public void onDetachedFromWindow(){
       ScreenContainer tc = this.c;
       if (tc != null && !tc.isDestroyed()) {
          e uoe = this.c.beginTransaction();
          Iterator iterator = this.c.getFragments().iterator();
          int i = 0;
          while (iterator.hasNext()) {
             Fragment uFragment = iterator.next();
             if (uFragment instanceof ScreenFragment && uFragment.b.getContainer() == this) {
                uoe.u(uFragment);
                i = 1;
             }
          }
          if (i) {
             uoe.o();
          }
          this.c.executePendingTransactions();
       }
       super.onDetachedFromWindow();
       this.g = false;
       this.removeAllViews();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int childCount = this.getChildCount();
       for (p2 = 0; p2 < childCount; p2++) {
          this.getChildAt(p2).layout(0, 0, this.getWidth(), this.getHeight());
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.getChildAt(i).measure(p0, p1);
       }
       return;
    }
    public void requestLayout(){
       super.requestLayout();
       if (this.h == null && this.j != null) {
          this.h = true;
          ReactChoreographer.a().d(ReactChoreographer$CallbackType.NATIVE_ANIMATED_MODULE, this.j);
       }
       return;
    }
    public final void setFragmentManager(c p0){
       this.c = p0;
       this.l();
    }
}
