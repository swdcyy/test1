package androidx.fragment.app.a;
import androidx.fragment.app.c$a;
import androidx.fragment.app.FragmentManagerImpl$k;
import androidx.fragment.app.e;
import androidx.fragment.app.FragmentManagerImpl;
import androidx.fragment.app.e$a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.util.ArrayList;
import z1.c;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.Integer;
import java.lang.Runnable;
import androidx.fragment.app.Fragment$e;
import java.lang.CharSequence;
import android.content.Context;
import androidx.fragment.app.FragmentHostCallback;
import java.lang.Boolean;
import java.lang.System;

public final class a extends e implements c$a, FragmentManagerImpl$k	// class@0007a1
{
    public final FragmentManagerImpl s;
    public boolean t;
    public int u;

    public void a(FragmentManagerImpl p0){
       super();
       this.u = -1;
       this.s = p0;
    }
    public static boolean O(e$a p0){
       p0 = p0.b;
       boolean b = (p0 != null && (p0.mAdded != null && (p0.mView != null && (p0.mDetached == null && (p0.mHidden == null && p0.isPostponed())))))? true: false;
       return b;
    }
    public e A(Fragment p0,Lifecycle$State p1){
       if (p0.mFragmentManager != this.s) {
          throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager "+this.s);
       }
       Lifecycle$State cREATED = Lifecycle$State.CREATED;
       if (!p1.isAtLeast(cREATED)) {
          throw new IllegalArgumentException("Cannot set maximum Lifecycle below "+cREATED);
       }
       super.A(p0, p1);
       return this;
    }
    public e B(Fragment p0){
       Fragment mFragmentMan = p0.mFragmentManager;
       if (mFragmentMan != null && mFragmentMan != this.s) {
          throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment "+p0.toString()+" is already attached to a FragmentManager.");
       }
       super.B(p0);
       return this;
    }
    public e E(Fragment p0){
       Fragment mFragmentMan = p0.mFragmentManager;
       if (mFragmentMan != null && mFragmentMan != this.s) {
          throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment "+p0.toString()+" is already attached to a FragmentManager.");
       }
       super.E(p0);
       return this;
    }
    public void F(int p0){
       if (this.h == null) {
          return;
       }
       if (FragmentManagerImpl.DEBUG) {
          StringBuilder str = "Bump nesting in "+this+" by "+p0;
       }
       int i = this.a.size();
       int i1 = 0;
       while (i1 < i) {
          e$a uoa = this.a.get(i1);
          e$a b = uoa.b;
          if (b != null) {
             int i2 = b.mBackStackNesting + p0;
             b.mBackStackNesting = i2;
             if (FragmentManagerImpl.DEBUG) {
                StringBuilder str1 = "Bump nesting of "+uoa.b+" to "+uoa.b.mBackStackNesting;
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public int G(boolean p0){
       if (this.t != null) {
          throw new IllegalStateException("commit already called");
       }
       if (FragmentManagerImpl.DEBUG) {
          StringBuilder str = "Commit: "+this;
          PrintWriter printWriter = new PrintWriter(new c("FragmentManager"));
          this.H("  ", printWriter);
          printWriter.close();
       }
       this.t = true;
       this.u = (this.h != null)? this.s.allocBackStackIndex(this): -1;
       this.s.enqueueAction(this, p0);
       return this.u;
    }
    public void H(String p0,PrintWriter p1){
       this.I(p0, p1, true);
    }
    public void I(String p0,PrintWriter p1,boolean p2){
       String str;
       if (p2) {
          p1.print(p0);
          p1.print("mName=");
          p1.print(this.j);
          p1.print(" mIndex=");
          p1.print(this.u);
          p1.print(" mCommitted=");
          p1.println(this.t);
          if (this.f != null) {
             p1.print(p0);
             p1.print("mTransition=#");
             p1.print(Integer.toHexString(this.f));
             p1.print(" mTransitionStyle=#");
             p1.println(Integer.toHexString(this.g));
          }
          if (this.b != null || this.c != null) {
             p1.print(p0);
             p1.print("mEnterAnim=#");
             p1.print(Integer.toHexString(this.b));
             p1.print(" mExitAnim=#");
             p1.println(Integer.toHexString(this.c));
          }
          if (this.d != null || this.e != null) {
             p1.print(p0);
             p1.print("mPopEnterAnim=#");
             p1.print(Integer.toHexString(this.d));
             p1.print(" mPopExitAnim=#");
             p1.println(Integer.toHexString(this.e));
          }
          if (this.k != null || this.l != null) {
             p1.print(p0);
             p1.print("mBreadCrumbTitleRes=#");
             p1.print(Integer.toHexString(this.k));
             p1.print(" mBreadCrumbTitleText=");
             p1.println(this.l);
          }
          if (this.m != null || this.n != null) {
             p1.print(p0);
             p1.print("mBreadCrumbShortTitleRes=#");
             p1.print(Integer.toHexString(this.m));
             p1.print(" mBreadCrumbShortTitleText=");
             p1.println(this.n);
          }
       }
       if (!this.a.isEmpty()) {
          p1.print(p0);
          p1.println("Operations:");
          int i = this.a.size();
          int i1 = 0;
          while (i1 < i) {
             e$a uoa = this.a.get(i1);
             switch (uoa.a){
                 case 0:
                   str = "NULL";
                   break;
                 case 1:
                   str = "ADD";
                   break;
                 case 2:
                   str = "REPLACE";
                   break;
                 case 3:
                   str = "REMOVE";
                   break;
                 case 4:
                   str = "HIDE";
                   break;
                 case 5:
                   str = "SHOW";
                   break;
                 case 6:
                   str = "DETACH";
                   break;
                 case 7:
                   str = "ATTACH";
                   break;
                 case 8:
                   str = "SET_PRIMARY_NAV";
                   break;
                 case 9:
                   str = "UNSET_PRIMARY_NAV";
                   break;
                 case 10:
                   str = "OP_SET_MAX_LIFECYCLE";
                   break;
                 default:
                   str = "cmd="+uoa.a;
             }
             p1.print(p0);
             p1.print("  Op #");
             p1.print(i1);
             p1.print(": ");
             p1.print(str);
             p1.print(" ");
             p1.println(uoa.b);
             if (p2) {
                if (uoa.c != null || uoa.d != null) {
                   p1.print(p0);
                   p1.print("enterAnim=#");
                   p1.print(Integer.toHexString(uoa.c));
                   p1.print(" exitAnim=#");
                   p1.println(Integer.toHexString(uoa.d));
                }
                if (uoa.e != null || uoa.f != null) {
                   p1.print(p0);
                   p1.print("popEnterAnim=#");
                   p1.print(Integer.toHexString(uoa.e));
                   p1.print(" popExitAnim=#");
                   p1.println(Integer.toHexString(uoa.f));
                }
             }
             i1 = i1 + 1;
          }
       }
       return;
    }
    public void J(){
       int i = this.a.size();
       boolean b = false;
       int i1 = 0;
       while (true) {
          a uoa = 1;
          if (i1 < i) {
             e$a uoa1 = this.a.get(i1);
             e$a b1 = uoa1.b;
             if (b1 != null) {
                b1.setNextTransition(this.f, this.g);
             }
             switch (uoa1.a){
                 case 1:
                   b1.setNextAnim(uoa1.c);
                   this.s.addFragment(b1, b);
                label_0092 :
                   if (this.q == null && (uoa1.a != uoa && b1 != null)) {
                      this.s.moveFragmentToExpectedState(b1);
                   }
                   break;
                 case 3:
                   b1.setNextAnim(uoa1.d);
                   this.s.removeFragment(b1);
                   goto label_0092 ;
                   break;
                 case 4:
                   b1.setNextAnim(uoa1.d);
                   this.s.hideFragment(b1);
                   goto label_0092 ;
                   break;
                 case 5:
                   b1.setNextAnim(uoa1.c);
                   this.s.showFragment(b1);
                   goto label_0092 ;
                   break;
                 case 6:
                   b1.setNextAnim(uoa1.d);
                   this.s.detachFragment(b1);
                   goto label_0092 ;
                   break;
                 case 7:
                   b1.setNextAnim(uoa1.c);
                   this.s.attachFragment(b1);
                   goto label_0092 ;
                   break;
                 case 8:
                   this.s.setPrimaryNavigationFragment(b1);
                   goto label_0092 ;
                   break;
                 case 9:
                   this.s.setPrimaryNavigationFragment(null);
                   goto label_0092 ;
                   break;
                 case 10:
                   this.s.setMaxLifecycle(b1, uoa1.h);
                   goto label_0092 ;
                   break;
                 default:
                label_0023 :
                   throw new IllegalArgumentException("Unknown cmd: "+uoa1.a);
             }
             i1 = i1 + 1;
          }else if(this.q == null){
             a ts = this.s;
             ts.moveToState(ts.mCurState, uoa);
          }
          return;
       }
    }
    public void K(boolean p0){
       int i = 1;
       int i1 = this.a.size() - i;
       while (true) {
          if (i1 >= 0) {
             e$a uoa = this.a.get(i1);
             e$a b = uoa.b;
             if (b != null) {
                b.setNextTransition(FragmentManagerImpl.reverseTransit(this.f), this.g);
             }
             switch (uoa.a){
                 case 1:
                   b.setNextAnim(uoa.f);
                   this.s.removeFragment(b);
                label_0096 :
                   if (this.q == null && (uoa.a != 3 && b != null)) {
                      this.s.moveFragmentToExpectedState(b);
                   }
                   break;
                 case 3:
                   b.setNextAnim(uoa.e);
                   this.s.addFragment(b, false);
                   goto label_0096 ;
                   break;
                 case 4:
                   b.setNextAnim(uoa.e);
                   this.s.showFragment(b);
                   goto label_0096 ;
                   break;
                 case 5:
                   b.setNextAnim(uoa.f);
                   this.s.hideFragment(b);
                   goto label_0096 ;
                   break;
                 case 6:
                   b.setNextAnim(uoa.e);
                   this.s.attachFragment(b);
                   goto label_0096 ;
                   break;
                 case 7:
                   b.setNextAnim(uoa.f);
                   this.s.detachFragment(b);
                   goto label_0096 ;
                   break;
                 case 8:
                   this.s.setPrimaryNavigationFragment(null);
                   goto label_0096 ;
                   break;
                 case 9:
                   this.s.setPrimaryNavigationFragment(b);
                   goto label_0096 ;
                   break;
                 case 10:
                   this.s.setMaxLifecycle(b, uoa.g);
                   goto label_0096 ;
                   break;
                 default:
                label_0026 :
                   throw new IllegalArgumentException("Unknown cmd: "+uoa.a);
             }
             i1 = i1 - 1;
          }else if(this.q == null && p0){
             a ts = this.s;
             ts.moveToState(ts.mCurState, i);
          }
          return;
       }
    }
    public Fragment L(ArrayList p0,Fragment p1){
       e uoe = this;
       ArrayList uArrayList = p0;
       Fragment uFragment = p1;
       int i = 0;
       while (i < uoe.a.size()) {
          e$a uoa = uoe.a.get(i);
          e$a a = uoa.a;
          int i1 = 0;
          if (a != 1) {
             if (a != 2) {
                if (a != 3 && a != 6) {
                   if (a != 7) {
                      if (a == 8) {
                         uoe.a.add(i, new e$a(9, uFragment));
                         i = i + 1;
                         uFragment = uoa.b;
                      }
                   }else {
                   label_00b2 :
                      uArrayList.add(uoa.b);
                   }
                }else {
                   uArrayList.remove(uoa.b);
                   uoa = uoa.b;
                   if (uoa == uFragment) {
                      uoe.a.add(i, new e$a(9, uoa));
                      i = i + 1;
                      uFragment = i1;
                   }
                }
             }else {
                a = uoa.b;
                Fragment mContainerId = a.mContainerId;
                int i2 = p0.size() - 1;
                int i3 = 0;
                while (i2 >= 0) {
                   Fragment uFragment1 = uArrayList.get(i2);
                   if (uFragment1.mContainerId == mContainerId) {
                      if (uFragment1 == a) {
                         i3 = 1;
                      }else if(uFragment1 == uFragment){
                         uoe.a.add(i, new e$a(9, uFragment1));
                         i = i + 1;
                         uFragment = i1;
                      }
                      e$a uoa1 = new e$a(3, uFragment1);
                      uoa1.c = uoa.c;
                      uoa1.e = uoa.e;
                      uoa1.d = uoa.d;
                      uoa1.f = uoa.f;
                      uoe.a.add(i, uoa1);
                      uArrayList.remove(uFragment1);
                      i = i + 1;
                   }
                   i2 = i2 - 1;
                }
                if (i3) {
                   uoe.a.remove(i);
                   i = i - 1;
                }else {
                   uoa.a = 1;
                   uArrayList.add(a);
                }
             }
          }else {
             goto label_00b2 ;
          }
          i = i + 1;
       }
       return uFragment;
    }
    public boolean M(int p0){
       int i = this.a.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          e$a b = this.a.get(i1).b;
          Fragment mContainerId = (b != null)? b.mContainerId: null;
          if (mContainerId != null && mContainerId == p0) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
    public boolean N(ArrayList p0,int p1,int p2){
       if (p2 == p1) {
          return false;
       }
       int i = this.a.size();
       int i1 = -1;
       int i2 = 0;
       while (true) {
          if (i2 >= i) {
             return false;
          }
          e$a b = this.a.get(i2).b;
          Fragment mContainerId = (b != null)? b.mContainerId: null;
          if (mContainerId != null && mContainerId != i1) {
             i1 = p1;
             while (true) {
                if (i1 < p2) {
                   a uoa = p0.get(i1);
                   int i3 = uoa.a.size();
                   int i4 = 0;
                   while (true) {
                      if (i4 < i3) {
                         e$a b1 = uoa.a.get(i4).b;
                         Fragment mContainerId1 = (b1 != null)? b1.mContainerId: null;
                         if (mContainerId1 == mContainerId) {
                            break ;
                         }else {
                            i4 = i4 + 1;
                         }
                      }else {
                         i1 = i1 + 1;
                      }
                   }
                   return true;
                }else {
                   i1 = mContainerId;
                }
             }
          }
          i2 = i2 + 1;
       }
    }
    public boolean P(){
       boolean b = false;
       int i = 0;
       while (true) {
          if (i >= this.a.size()) {
             return b;
          }
          if (a.O(this.a.get(i))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void Q(){
       if (this.r != null) {
          for (int i = 0; i < this.r.size(); i = i + 1) {
             this.r.get(i).run();
          }
          this.r = null;
       }
       return;
    }
    public void R(Fragment$e p0){
       int i = 0;
       while (i < this.a.size()) {
          e$a uoa = this.a.get(i);
          if (a.O(uoa)) {
             uoa.b.setOnStartEnterTransitionListener(p0);
          }
          i = i + 1;
       }
       return;
    }
    public Fragment S(ArrayList p0,Fragment p1){
       e$a uoa1;
       int i = this.a.size() - 1;
       while (i >= 0) {
          e$a uoa = this.a.get(i);
          e$a a = uoa.a;
          if (a != 1) {
             if (a != 3) {
                switch (a){
                    case 6:
                      break;
                    case 7:
                      p0.remove(uoa.b);
                      break;
                    case 8:
                      uoa1 = null;
                      break;
                    case 9:
                      uoa1 = uoa.b;
                      break;
                    case 10:
                      uoa.h = uoa.g;
                      break;
                    default:
                }
             }
             p0.add(uoa.b);
          }else {
             goto label_002d ;
          }
          i = i - 1;
       }
       return p1;
    }
    public CharSequence a(){
       if (this.m != null) {
          return this.s.mHost.getContext().getText(this.m);
       }
       return this.n;
    }
    public CharSequence b(){
       if (this.k != null) {
          return this.s.mHost.getContext().getText(this.k);
       }
       return this.l;
    }
    public int c(){
       return this.m;
    }
    public int d(){
       return this.k;
    }
    public boolean e(ArrayList p0,ArrayList p1){
       if (FragmentManagerImpl.DEBUG) {
          "Run: "+this;
       }
       p0.add(this);
       p1.add(Boolean.FALSE);
       if (this.h != null) {
          this.s.addBackStackState(this);
       }
       return true;
    }
    public int getId(){
       return this.u;
    }
    public String getName(){
       return this.j;
    }
    public int l(){
       return this.G(false);
    }
    public int m(){
       return this.G(true);
    }
    public void n(){
       this.q();
       this.s.execSingleAction(this, false);
    }
    public void o(){
       this.q();
       this.s.execSingleAction(this, true);
    }
    public e p(Fragment p0){
       Fragment mFragmentMan = p0.mFragmentManager;
       if (mFragmentMan != null && mFragmentMan != this.s) {
          throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment "+p0.toString()+" is already attached to a FragmentManager.");
       }
       super.p(p0);
       return this;
    }
    public void r(int p0,Fragment p1,String p2,int p3){
       super.r(p0, p1, p2, p3);
       p1.mFragmentManager = this.s;
    }
    public e s(Fragment p0){
       Fragment mFragmentMan = p0.mFragmentManager;
       if (mFragmentMan != null && mFragmentMan != this.s) {
          throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment "+p0.toString()+" is already attached to a FragmentManager.");
       }
       super.s(p0);
       return this;
    }
    public boolean t(){
       return this.a.isEmpty();
    }
    public String toString(){
       StringBuilder str = new StringBuilder(128)+"BackStackEntry{"+Integer.toHexString(System.identityHashCode(this));
       if (this.u >= null) {
          str = str+" #"+this.u;
       }
       if (this.j != null) {
          str = str+" "+this.j;
       }
       return str+"}";
    }
    public e u(Fragment p0){
       Fragment mFragmentMan = p0.mFragmentManager;
       if (mFragmentMan != null && mFragmentMan != this.s) {
          throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment "+p0.toString()+" is already attached to a FragmentManager.");
       }
       super.u(p0);
       return this;
    }
}
