package androidx.fragment.app.d;
import h3.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment$SavedState;
import androidx.lifecycle.Lifecycle$State;
import android.view.View;
import android.os.Parcelable;
import java.lang.ClassLoader;
import android.os.Bundle;
import java.lang.String;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;

public abstract class d extends a	// class@0007a7
{
    public final c d;
    public final int e;
    public e f;
    public ArrayList g;
    public ArrayList h;
    public Fragment i;
    public static final int j;

    public void d(c p0){
       super(p0, 0);
    }
    public void d(c p0,int p1){
       super();
       this.f = null;
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.i = null;
       this.d = p0;
       this.e = p1;
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (this.f == null) {
          this.f = this.d.beginTransaction();
       }
       while (this.g.size() <= p1) {
          this.g.add(null);
       }
       d tg = this.g;
       Fragment$SavedState savedState = (p2.isAdded())? this.d.saveFragmentInstanceState(p2): null;
       tg.set(p1, savedState);
       this.h.set(p1, null);
       this.f.u(p2);
       if (p2 == this.i) {
          this.i = null;
       }
       return;
    }
    public void i(ViewGroup p0){
       d tf = this.f;
       if (tf != null) {
          tf.o();
          this.f = null;
       }
       return;
    }
    public Object o(ViewGroup p0,int p1){
       Fragment uFragment;
       if (this.h.size() > p1) {
          uFragment = this.h.get(p1);
          if (uFragment != null) {
             return uFragment;
          }
       }
       if (this.f == null) {
          this.f = this.d.beginTransaction();
       }
       uFragment = this.z(p1);
       if (this.g.size() > p1) {
          Fragment$SavedState savedState = this.g.get(p1);
          if (savedState != null) {
             uFragment.setInitialSavedState(savedState);
          }
       }
       while (this.h.size() <= p1) {
          this.h.add(null);
       }
       boolean b = false;
       uFragment.setMenuVisibility(b);
       if (this.e == null) {
          uFragment.setUserVisibleHint(b);
       }
       this.h.set(p1, uFragment);
       this.f.f(p0.getId(), uFragment);
       if (this.e == 1) {
          this.f.A(uFragment, Lifecycle$State.STARTED);
       }
       return uFragment;
    }
    public boolean p(View p0,Object p1){
       boolean b = (p1.getView() == p0)? true: false;
       return b;
    }
    public void s(Parcelable p0,ClassLoader p1){
       if (p0 != null) {
          p0.setClassLoader(p1);
          Parcelable[] parcelableAr = p0.getParcelableArray("states");
          this.g.clear();
          this.h.clear();
          if (parcelableAr != null) {
             for (int i = 0; i < parcelableAr.length; i = i + 1) {
                this.g.add(parcelableAr[i]);
             }
          }
          Iterator iterator = p0.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (str.startsWith("f")) {
                int i1 = Integer.parseInt(str.substring(1));
                Fragment fragment = this.d.getFragment(p0, str);
                if (fragment != null) {
                   while (this.h.size() <= i1) {
                      this.h.add(null);
                   }
                   fragment.setMenuVisibility(false);
                   this.h.set(i1, fragment);
                }
             }
          }
       }
       return;
    }
    public Parcelable u(){
       Bundle uBundle;
       if (this.g.size() > 0) {
          uBundle = new Bundle();
          Fragment$SavedState[] savedStateAr = new Fragment$SavedState[this.g.size()];
          this.g.toArray(savedStateAr);
          uBundle.putParcelableArray("states", savedStateAr);
       }else {
          uBundle = null;
       }
       int i = 0;
       while (i < this.h.size()) {
          Fragment uFragment = this.h.get(i);
          if (uFragment != null && uFragment.isAdded()) {
             if (uBundle == null) {
                uBundle = new Bundle();
             }
             this.d.putFragment(uBundle, "f"+i, uFragment);
          }
          i = i + 1;
       }
       return uBundle;
    }
    public void v(ViewGroup p0,int p1,Object p2){
       d ti = this.i;
       if (p2 != ti) {
          boolean b = true;
          if (ti != null) {
             boolean b1 = false;
             ti.setMenuVisibility(b1);
             if (this.e == b) {
                if (this.f == null) {
                   this.f = this.d.beginTransaction();
                }
                this.f.A(this.i, Lifecycle$State.STARTED);
             }else {
                this.i.setUserVisibleHint(b1);
             }
          }
          p2.setMenuVisibility(b);
          if (this.e == b) {
             if (this.f == null) {
                this.f = this.d.beginTransaction();
             }
             this.f.A(p2, Lifecycle$State.RESUMED);
          }else {
             p2.setUserVisibleHint(b);
          }
          this.i = p2;
       }
       return;
    }
    public void x(ViewGroup p0){
       if (p0.getId() != -1) {
          return;
       }
       throw new IllegalStateException("ViewPager with adapter "+this+" requires a view id");
    }
    public abstract Fragment z(int p0);
}
