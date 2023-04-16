package androidx.fragment.app.FragmentManagerImpl;
import android.view.LayoutInflater$Factory2;
import androidx.fragment.app.c;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import androidx.fragment.app.FragmentManagerImpl$a;
import java.util.concurrent.CopyOnWriteArrayList;
import androidx.fragment.app.FragmentManagerImpl$b;
import java.lang.Object;
import androidx.fragment.app.a;
import java.lang.Boolean;
import androidx.fragment.app.FragmentManagerImpl$g;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.collection.ArraySet;
import java.lang.Math;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import androidx.fragment.app.c$c;
import k2.d;
import java.lang.Integer;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManagerImpl$h;
import androidx.fragment.app.FragmentManagerImpl$c;
import android.view.animation.Animation$AnimationListener;
import android.animation.Animator;
import androidx.fragment.app.FragmentManagerImpl$d;
import android.animation.Animator$AnimatorListener;
import androidx.fragment.app.FragmentHostCallback;
import k2.a;
import o0.c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import o0.b;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.fragment.app.e;
import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import java.util.Iterator;
import androidx.fragment.app.f;
import androidx.fragment.app.FragmentManagerImpl$e;
import android.content.res.Configuration;
import android.view.MenuItem;
import android.view.Menu;
import android.view.MenuInflater;
import android.os.Bundle;
import androidx.fragment.app.FragmentManagerImpl$i;
import androidx.fragment.app.c$b;
import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.System;
import java.util.Arrays;
import androidx.fragment.app.FragmentManagerImpl$k;
import android.os.Looper;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManagerImpl$m;
import java.lang.Runnable;
import java.util.List;
import androidx.fragment.app.c$a;
import java.lang.RuntimeException;
import androidx.fragment.app.b;
import androidx.fragment.app.FragmentManagerImpl$f;
import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.animation.AnimatorInflater;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Enum;
import java.lang.ClassLoader;
import android.util.SparseArray;
import java.lang.IllegalArgumentException;
import androidx.lifecycle.MutableLiveData;
import android.app.Activity;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentManagerImpl$j;
import android.content.res.TypedArray;
import androidx.fragment.app.FragmentManagerImpl$l;
import androidx.fragment.app.Fragment$e;
import android.os.Parcelable;
import k2.c;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.BackStackState;
import z1.c;
import java.io.Writer;
import androidx.fragment.app.Fragment$SavedState;
import z1.b;

public final class FragmentManagerImpl extends c implements LayoutInflater$Factory2	// class@000791
{
    public final HashMap mActive;
    public final ArrayList mAdded;
    public ArrayList mAvailBackStackIndices;
    public ArrayList mBackStack;
    public ArrayList mBackStackChangeListeners;
    public ArrayList mBackStackIndices;
    public a mContainer;
    public ArrayList mCreatedMenus;
    public int mCurState;
    public boolean mDestroyed;
    public Runnable mExecCommit;
    public boolean mExecutingActions;
    public boolean mHavePendingDeferredStart;
    public FragmentHostCallback mHost;
    public final CopyOnWriteArrayList mLifecycleCallbacks;
    public boolean mNeedMenuInvalidate;
    public int mNextFragmentIndex;
    public d mNonConfig;
    public final b mOnBackPressedCallback;
    public OnBackPressedDispatcher mOnBackPressedDispatcher;
    public Fragment mParent;
    public ArrayList mPendingActions;
    public ArrayList mPostponedTransactions;
    public Fragment mPrimaryNav;
    public SparseArray mStateArray;
    public Bundle mStateBundle;
    public boolean mStateSaved;
    public boolean mStopped;
    public ArrayList mTmpAddedFragments;
    public ArrayList mTmpIsPop;
    public ArrayList mTmpRecords;
    public static boolean DEBUG;
    public static final Interpolator DECELERATE_CUBIC;
    public static final Interpolator DECELERATE_QUINT;

    static {
       FragmentManagerImpl.DECELERATE_QUINT = new DecelerateInterpolator(2.50f);
       FragmentManagerImpl.DECELERATE_CUBIC = new DecelerateInterpolator(0x3fc00000);
    }
    public void FragmentManagerImpl(){
       super();
       this.mNextFragmentIndex = 0;
       this.mAdded = new ArrayList();
       this.mActive = new HashMap();
       this.mOnBackPressedCallback = new FragmentManagerImpl$a(this, 0);
       this.mLifecycleCallbacks = new CopyOnWriteArrayList();
       this.mCurState = 0;
       this.mStateBundle = null;
       this.mStateArray = null;
       this.mExecCommit = new FragmentManagerImpl$b(this);
    }
    public static void executeOps(ArrayList p0,ArrayList p1,int p2,int p3){
       while (p2 < p3) {
          a uoa = p0.get(p2);
          boolean b = true;
          if (p1.get(p2).booleanValue()) {
             uoa.F(-1);
             int i = p3 - 1;
             if (p2 != i) {
                b = false;
             }
             uoa.K(b);
          }else {
             uoa.F(b);
             uoa.J();
          }
          p2++;
       }
       return;
    }
    public static FragmentManagerImpl$g makeFadeAnimation(float p0,float p1){
       AlphaAnimation uAlphaAnimat = new AlphaAnimation(p0, p1);
       uAlphaAnimat.setInterpolator(FragmentManagerImpl.DECELERATE_CUBIC);
       uAlphaAnimat.setDuration(220);
       return new FragmentManagerImpl$g(uAlphaAnimat);
    }
    public static FragmentManagerImpl$g makeOpenCloseAnimation(float p0,float p1,float p2,float p3){
       AnimationSet uAnimationSe = new AnimationSet(false);
       ScaleAnimation scaleAnimati = new ScaleAnimation(p0, p1, p0, p1, 1, 0x3f000000, 1, 0x3f000000);
       v1.setInterpolator(FragmentManagerImpl.DECELERATE_QUINT);
       v1.setDuration(220);
       uAnimationSe.addAnimation(v1);
       AlphaAnimation uAlphaAnimat = new AlphaAnimation(p2, p3);
       uAlphaAnimat.setInterpolator(FragmentManagerImpl.DECELERATE_CUBIC);
       uAlphaAnimat.setDuration(220);
       uAnimationSe.addAnimation(uAlphaAnimat);
       return new FragmentManagerImpl$g(uAnimationSe);
    }
    public static int reverseTransit(int p0){
       int i = 8194;
       if (p0 != 4097) {
          if (p0 != 4099) {
             i = (p0 != i)? 0: 4097;
          }else {
             i = 4099;
          }
       }
       return i;
    }
    public static int transitToStyleIndex(int p0,boolean p1){
       if (p0 != 4097) {
          if (p0 != 4099) {
             if (p0 != 8194) {
                p0 = -1;
             }else if(p1){
                p0 = 3;
             }else {
                p0 = 4;
             }
          }else if(p1){
             p0 = 5;
          }else {
             p0 = 6;
          }
       }else if(p1){
          p0 = 1;
       }else {
          p0 = 2;
       }
       return p0;
    }
    public final void addAddedFragments(ArraySet p0){
       FragmentManagerImpl tmCurState = this.mCurState;
       if (tmCurState < 1) {
          return;
       }
       int i = Math.min(tmCurState, 3);
       int i1 = this.mAdded.size();
       int i2 = 0;
       while (i2 < i1) {
          Object obj = this.mAdded.get(i2);
          if (obj.mState < i) {
             this.moveToState(obj, i, obj.getNextAnim(), obj.getNextTransition(), false);
             if (obj.mView != null && (obj.mHidden == null && obj.mIsNewlyAdded != null)) {
                p0.add(obj);
             }
          }
          i2 = i2 + 1;
       }
       return;
    }
    public void addBackStackState(a p0){
       if (this.mBackStack == null) {
          this.mBackStack = new ArrayList();
       }
       this.mBackStack.add(p0);
       return;
    }
    public void addFragment(Fragment p0,boolean p1){
       if (FragmentManagerImpl.DEBUG) {
          StringBuilder str = "add: "+p0;
       }
       this.makeActive(p0);
       if (p0.mDetached == null) {
          if (!this.mAdded.contains(p0)) {
             FragmentManagerImpl tmAdded = this.mAdded;
             _monitor_enter(tmAdded);
             this.mAdded.add(p0);
             _monitor_exit(tmAdded);
             p0.mAdded = true;
             boolean b = false;
             p0.mRemoving = b;
             if (p0.mView == null) {
                p0.mHiddenChanged = b;
             }
             if (this.isMenuAvailable(p0)) {
                this.mNeedMenuInvalidate = true;
             }
             if (p1) {
                this.moveToState(p0);
             }
          }else {
             throw new IllegalStateException("Fragment already added: "+p0);
          }
       }
       return;
    }
    public void addOnBackStackChangedListener(c$c p0){
       if (this.mBackStackChangeListeners == null) {
          this.mBackStackChangeListeners = new ArrayList();
       }
       this.mBackStackChangeListeners.add(p0);
       return;
    }
    public void addRetainedFragment(Fragment p0){
       if (this.isStateSaved()) {
          return;
       }
       if (this.mNonConfig.o0(p0) && FragmentManagerImpl.DEBUG) {
          "Updating retained Fragments: Added "+p0;
       }
       return;
    }
    public int allocBackStackIndex(a p0){
       int i;
       StringBuilder str;
       _monitor_enter(this);
       FragmentManagerImpl tmAvailBackS = this.mAvailBackStackIndices;
       if (tmAvailBackS == null || tmAvailBackS.size() <= 0) {
          if (this.mBackStackIndices == null) {
             this.mBackStackIndices = new ArrayList();
          }
          i = this.mBackStackIndices.size();
          if (FragmentManagerImpl.DEBUG) {
             str = "Setting back stack index "+i+" to "+p0;
          }
          this.mBackStackIndices.add(p0);
          _monitor_exit(this);
          return i;
       }else {
          tmAvailBackS = this.mAvailBackStackIndices;
          i = tmAvailBackS.remove((tmAvailBackS.size() - 1)).intValue();
          if (FragmentManagerImpl.DEBUG) {
             str = "Adding back stack index "+i+" with "+p0;
          }
          this.mBackStackIndices.set(i, p0);
          _monitor_exit(this);
          return i;
       }
    }
    public final void animateRemoveFragment(Fragment p0,FragmentManagerImpl$g p1,int p2){
       Fragment mView = p0.mView;
       Fragment mContainer = p0.mContainer;
       mContainer.startViewTransition(mView);
       p0.setStateAfterAnimating(p2);
       if (p1.a != null) {
          FragmentManagerImpl$h oh = new FragmentManagerImpl$h(p1.a, mContainer, mView);
          p0.setAnimatingAway(p0.mView);
          oh.setAnimationListener(new FragmentManagerImpl$c(this, mContainer, p0));
          p0.mView.startAnimation(oh);
       }else {
          p1 = p1.b;
          p0.setAnimator(p1);
          p1.addListener(new FragmentManagerImpl$d(this, mContainer, mView, p0));
          p1.setTarget(p0.mView);
          p1.start();
       }
       return;
    }
    public void attachController(FragmentHostCallback p0,a p1,Fragment p2){
       if (this.mHost != null) {
          throw new IllegalStateException("Already attached");
       }
       this.mHost = p0;
       this.mContainer = p1;
       this.mParent = p2;
       if (p2 != null) {
          this.updateOnBackPressedCallbackEnabled();
       }
       if (p0 instanceof c) {
          c uoc = p0;
          OnBackPressedDispatcher onBackPresse = uoc.getOnBackPressedDispatcher();
          this.mOnBackPressedDispatcher = onBackPresse;
          if (p2 != null) {
             uoc = p2;
          }
          onBackPresse.a(uoc, this.mOnBackPressedCallback);
       }
       if (p2 != null) {
          this.mNonConfig = p2.mFragmentManager.getChildNonConfig(p2);
       }else if(p0 instanceof ViewModelStoreOwner){
          this.mNonConfig = d.r0(p0.getViewModelStore());
       }else {
          this.mNonConfig = new d(false);
       }
       return;
    }
    public void attachFragment(Fragment p0){
       StringBuilder str;
       if (FragmentManagerImpl.DEBUG) {
          str = "attach: "+p0;
       }
       if (p0.mDetached != null) {
          p0.mDetached = false;
          if (p0.mAdded == null) {
             if (!this.mAdded.contains(p0)) {
                if (FragmentManagerImpl.DEBUG) {
                   str = "add from attach: "+p0;
                }
                FragmentManagerImpl tmAdded = this.mAdded;
                _monitor_enter(tmAdded);
                this.mAdded.add(p0);
                _monitor_exit(tmAdded);
                p0.mAdded = true;
                if (this.isMenuAvailable(p0)) {
                   this.mNeedMenuInvalidate = true;
                }
             }else {
                throw new IllegalStateException("Fragment already added: "+p0);
             }
          }
       }
       return;
    }
    public e beginTransaction(){
       return new a(this);
    }
    public final void burpActive(){
       this.mActive.values().removeAll(Collections.singleton(null));
    }
    public boolean checkForMenus(){
       Iterator iterator = this.mActive.values().iterator();
       boolean b = false;
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          Fragment uFragment = iterator.next();
          if (uFragment != null) {
             b = this.isMenuAvailable(uFragment);
          }
          if (b) {
             break ;
          }
       }
       return true;
    }
    public final void checkStateLoss(){
       if (!this.isStateSaved()) {
          return;
       }
       throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    public final void cleanupExec(){
       this.mExecutingActions = false;
       this.mTmpIsPop.clear();
       this.mTmpRecords.clear();
    }
    public void completeExecute(a p0,boolean p1,boolean p2,boolean p3){
       if (p1) {
          p0.K(p3);
       }else {
          p0.J();
       }
       ArrayList uArrayList = new ArrayList(1);
       ArrayList uArrayList1 = new ArrayList(1);
       uArrayList.add(p0);
       uArrayList1.add(Boolean.valueOf(p1));
       if (p2) {
          f.C(this, uArrayList, uArrayList1, 0, 1, true);
       }
       if (p3) {
          this.moveToState(this.mCurState, 1);
       }
       Iterator iterator = this.mActive.values().iterator();
       while (iterator.hasNext()) {
          Fragment uFragment = iterator.next();
          if (uFragment != null && (uFragment.mView != null && (uFragment.mIsNewlyAdded != null && p0.M(uFragment.mContainerId)))) {
             Fragment mPostponedAl = uFragment.mPostponedAlpha;
             if (mPostponedAl > 0) {
                uFragment.mView.setAlpha(mPostponedAl);
             }
             if (p3) {
                uFragment.mPostponedAlpha = 0;
             }else {
                uFragment.mPostponedAlpha = 0xbf800000;
                uFragment.mIsNewlyAdded = false;
             }
          }
       }
       return;
    }
    public void completeShowHideFragment(Fragment p0){
       if (p0.mView != null) {
          FragmentManagerImpl$g og = this.loadAnimation(p0, p0.getNextTransition(), (p0.mHidden ^ 1), p0.getNextTransitionStyle());
          if (og != null) {
             FragmentManagerImpl$g b = og.b;
             if (b != null) {
                b.setTarget(p0.mView);
                if (p0.mHidden != null) {
                   if (p0.isHideReplaced()) {
                      p0.setHideReplaced(false);
                   }else {
                      Fragment mContainer = p0.mContainer;
                      Fragment mView = p0.mView;
                      mContainer.startViewTransition(mView);
                      og.b.addListener(new FragmentManagerImpl$e(this, mContainer, mView, p0));
                   }
                }else {
                   p0.mView.setVisibility(false);
                }
                og.b.start();
             }
          }
          if (og != null) {
             p0.mView.startAnimation(og.a);
             og.a.start();
          }
          int i = (p0.mHidden != null && !p0.isHideReplaced())? 8: 0;
          p0.mView.setVisibility(i);
          if (p0.isHideReplaced()) {
             p0.setHideReplaced(false);
          }
       }
       if (p0.mAdded != null && this.isMenuAvailable(p0)) {
          this.mNeedMenuInvalidate = true;
       }
       p0.mHiddenChanged = false;
       p0.onHiddenChanged(p0.mHidden);
       return;
    }
    public void detachFragment(Fragment p0){
       if (FragmentManagerImpl.DEBUG) {
          StringBuilder str = "detach: "+p0;
       }
       if (p0.mDetached == null) {
          boolean b = true;
          p0.mDetached = b;
          if (p0.mAdded != null) {
             if (FragmentManagerImpl.DEBUG) {
                StringBuilder str1 = "remove from detach: "+p0;
             }
             FragmentManagerImpl tmAdded = this.mAdded;
             _monitor_enter(tmAdded);
             this.mAdded.remove(p0);
             _monitor_exit(tmAdded);
             if (this.isMenuAvailable(p0)) {
                this.mNeedMenuInvalidate = b;
             }
             p0.mAdded = false;
          }
       }
       return;
    }
    public void dispatchActivityCreated(){
       this.mStateSaved = false;
       this.mStopped = false;
       this.dispatchStateChange(2);
    }
    public void dispatchConfigurationChanged(Configuration p0){
       int i = 0;
       while (i < this.mAdded.size()) {
          Fragment uFragment = this.mAdded.get(i);
          if (uFragment != null) {
             uFragment.performConfigurationChanged(p0);
          }
          i = i + 1;
       }
       return;
    }
    public boolean dispatchContextItemSelected(MenuItem p0){
       if (this.mCurState < true) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= this.mAdded.size()) {
             return false;
          }
          Fragment uFragment = this.mAdded.get(i);
          if (uFragment != null && uFragment.performContextItemSelected(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void dispatchCreate(){
       this.mStateSaved = false;
       this.mStopped = false;
       this.dispatchStateChange(1);
    }
    public boolean dispatchCreateOptionsMenu(Menu p0,MenuInflater p1){
       boolean b = false;
       if (this.mCurState < 1) {
          return b;
       }
       ArrayList uArrayList = null;
       int i = 0;
       boolean b1 = false;
       while (i < this.mAdded.size()) {
          Fragment uFragment = this.mAdded.get(i);
          if (uFragment != null && uFragment.performCreateOptionsMenu(p0, p1)) {
             if (uArrayList == null) {
                uArrayList = new ArrayList();
             }
             uArrayList.add(uFragment);
             b1 = true;
          }
          i = i + 1;
       }
       if (this.mCreatedMenus != null) {
          while (b < this.mCreatedMenus.size()) {
             Fragment uFragment1 = this.mCreatedMenus.get(b);
             if (uArrayList == null || !uArrayList.contains(uFragment1)) {
                uFragment1.onDestroyOptionsMenu();
             }
             b = b + 1;
          }
       }
       this.mCreatedMenus = uArrayList;
       return b1;
    }
    public void dispatchDestroy(){
       this.mDestroyed = true;
       this.execPendingActions();
       this.dispatchStateChange(0);
       this.mHost = null;
       this.mContainer = null;
       this.mParent = null;
       if (this.mOnBackPressedDispatcher != null) {
          this.mOnBackPressedCallback.d();
          this.mOnBackPressedDispatcher = null;
       }
       return;
    }
    public void dispatchDestroyView(){
       this.dispatchStateChange(1);
    }
    public void dispatchLowMemory(){
       int i = 0;
       while (i < this.mAdded.size()) {
          Fragment uFragment = this.mAdded.get(i);
          if (uFragment != null) {
             uFragment.performLowMemory();
          }
          i = i + 1;
       }
       return;
    }
    public void dispatchMultiWindowModeChanged(boolean p0){
       int i = this.mAdded.size() - 1;
       while (i >= 0) {
          Fragment uFragment = this.mAdded.get(i);
          if (uFragment != null) {
             uFragment.performMultiWindowModeChanged(p0);
          }
          i = i - 1;
       }
       return;
    }
    public void dispatchOnFragmentActivityCreated(Fragment p0,Bundle p1,boolean p2){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentActivityCreated(p0, p1, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p2 || oi.b != null) {
             oi.a.a(this, p0, p1);
          }
       }
       return;
    }
    public void dispatchOnFragmentAttached(Fragment p0,Context p1,boolean p2){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentAttached(p0, p1, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p2 || oi.b != null) {
             oi.a.b(this, p0, p1);
          }
       }
       return;
    }
    public void dispatchOnFragmentCreated(Fragment p0,Bundle p1,boolean p2){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentCreated(p0, p1, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p2 || oi.b != null) {
             oi.a.c(this, p0, p1);
          }
       }
       return;
    }
    public void dispatchOnFragmentDestroyed(Fragment p0,boolean p1){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentDestroyed(p0, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p1 || oi.b != null) {
             oi.a.d(this, p0);
          }
       }
       return;
    }
    public void dispatchOnFragmentDetached(Fragment p0,boolean p1){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentDetached(p0, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p1 || oi.b != null) {
             oi.a.e(this, p0);
          }
       }
       return;
    }
    public void dispatchOnFragmentPaused(Fragment p0,boolean p1){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentPaused(p0, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p1 || oi.b != null) {
             oi.a.f(this, p0);
          }
       }
       return;
    }
    public void dispatchOnFragmentPreAttached(Fragment p0,Context p1,boolean p2){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentPreAttached(p0, p1, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p2 || oi.b != null) {
             oi.a.g(this, p0, p1);
          }
       }
       return;
    }
    public void dispatchOnFragmentPreCreated(Fragment p0,Bundle p1,boolean p2){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentPreCreated(p0, p1, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p2 || oi.b != null) {
             oi.a.h(this, p0, p1);
          }
       }
       return;
    }
    public void dispatchOnFragmentResumed(Fragment p0,boolean p1){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentResumed(p0, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p1 || oi.b != null) {
             oi.a.i(this, p0);
          }
       }
       return;
    }
    public void dispatchOnFragmentSaveInstanceState(Fragment p0,Bundle p1,boolean p2){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentSaveInstanceState(p0, p1, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p2 || oi.b != null) {
             oi.a.j(this, p0, p1);
          }
       }
       return;
    }
    public void dispatchOnFragmentStarted(Fragment p0,boolean p1){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentStarted(p0, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p1 || oi.b != null) {
             oi.a.k(this, p0);
          }
       }
       return;
    }
    public void dispatchOnFragmentStopped(Fragment p0,boolean p1){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentStopped(p0, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p1 || oi.b != null) {
             oi.a.l(this, p0);
          }
       }
       return;
    }
    public void dispatchOnFragmentViewCreated(Fragment p0,View p1,Bundle p2,boolean p3){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentViewCreated(p0, p1, p2, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p3 || oi.b != null) {
             oi.a.m(this, p0, p1, p2);
          }
       }
       return;
    }
    public void dispatchOnFragmentViewDestroyed(Fragment p0,boolean p1){
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          c fragmentMana = tmParent.getFragmentManager();
          if (fragmentMana instanceof FragmentManagerImpl) {
             fragmentMana.dispatchOnFragmentViewDestroyed(p0, true);
          }
       }
       Iterator iterator = this.mLifecycleCallbacks.iterator();
       while (iterator.hasNext()) {
          FragmentManagerImpl$i oi = iterator.next();
          if (!p1 || oi.b != null) {
             oi.a.n(this, p0);
          }
       }
       return;
    }
    public boolean dispatchOptionsItemSelected(MenuItem p0){
       if (this.mCurState < true) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= this.mAdded.size()) {
             return false;
          }
          Fragment uFragment = this.mAdded.get(i);
          if (uFragment != null && uFragment.performOptionsItemSelected(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void dispatchOptionsMenuClosed(Menu p0){
       if (this.mCurState < 1) {
          return;
       }
       int i = 0;
       while (i < this.mAdded.size()) {
          Fragment uFragment = this.mAdded.get(i);
          if (uFragment != null) {
             uFragment.performOptionsMenuClosed(p0);
          }
          i = i + 1;
       }
       return;
    }
    public final void dispatchParentPrimaryNavigationFragmentChanged(Fragment p0){
       if (p0 != null && this.mActive.get(p0.mWho) == p0) {
          p0.performPrimaryNavigationFragmentChanged();
       }
       return;
    }
    public void dispatchPause(){
       this.dispatchStateChange(3);
    }
    public void dispatchPictureInPictureModeChanged(boolean p0){
       int i = this.mAdded.size() - 1;
       while (i >= 0) {
          Fragment uFragment = this.mAdded.get(i);
          if (uFragment != null) {
             uFragment.performPictureInPictureModeChanged(p0);
          }
          i = i - 1;
       }
       return;
    }
    public boolean dispatchPrepareOptionsMenu(Menu p0){
       boolean b = false;
       if (this.mCurState < 1) {
          return b;
       }
       boolean b1 = false;
       while (b < this.mAdded.size()) {
          Fragment uFragment = this.mAdded.get(b);
          if (uFragment != null && uFragment.performPrepareOptionsMenu(p0)) {
             b1 = true;
          }
          b = b + 1;
       }
       return b1;
    }
    public void dispatchPrimaryNavigationFragmentChanged(){
       this.updateOnBackPressedCallbackEnabled();
       this.dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }
    public void dispatchResume(){
       this.mStateSaved = false;
       this.mStopped = false;
       this.dispatchStateChange(4);
    }
    public void dispatchStart(){
       this.mStateSaved = false;
       this.mStopped = false;
       this.dispatchStateChange(3);
    }
    public final void dispatchStateChange(int p0){
       this.mExecutingActions = true;
       this.moveToState(p0, false);
       this.mExecutingActions = false;
       this.execPendingActions();
    }
    public void dispatchStop(){
       this.mStopped = true;
       this.dispatchStateChange(2);
    }
    public void doPendingDeferredStart(){
       if (this.mHavePendingDeferredStart != null) {
          this.mHavePendingDeferredStart = false;
          this.startPendingDeferredFragments();
       }
       return;
    }
    public void dump(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
       int i2;
       String str = p0+"    ";
       if (!this.mActive.isEmpty()) {
          p2.print(p0);
          p2.print("Active Fragments in ");
          p2.print(Integer.toHexString(System.identityHashCode(this)));
          p2.println(":");
          Iterator iterator = this.mActive.values().iterator();
          while (iterator.hasNext()) {
             Fragment uFragment = iterator.next();
             p2.print(p0);
             p2.println(uFragment);
             if (uFragment != null) {
                uFragment.dump(str, p1, p2, p3);
             }
          }
       }
       int i = this.mAdded.size();
       int i1 = 0;
       if (i > 0) {
          p2.print(p0);
          p2.println("Added Fragments:");
          for (i2 = 0; i2 < i; i2 = i2 + 1) {
             p2.print(p0);
             p2.print("  #");
             p2.print(i2);
             p2.print(": ");
             p2.println(this.mAdded.get(i2).toString());
          }
       }
       FragmentManagerImpl tmCreatedMen = this.mCreatedMenus;
       if (tmCreatedMen != null) {
          i = tmCreatedMen.size();
          if (i > 0) {
             p2.print(p0);
             p2.println("Fragments Created Menus:");
             for (i2 = 0; i2 < i; i2 = i2 + 1) {
                p2.print(p0);
                p2.print("  #");
                p2.print(i2);
                p2.print(": ");
                p2.println(this.mCreatedMenus.get(i2).toString());
             }
          }
       }
       tmCreatedMen = this.mBackStack;
       if (tmCreatedMen != null) {
          i = tmCreatedMen.size();
          if (i > 0) {
             p2.print(p0);
             p2.println("Back Stack:");
             for (i2 = 0; i2 < i; i2 = i2 + 1) {
                a uoa = this.mBackStack.get(i2);
                p2.print(p0);
                p2.print("  #");
                p2.print(i2);
                p2.print(": ");
                p2.println(uoa.toString());
                uoa.H(str, p2);
             }
          }
       }
       _monitor_enter(this);
       tmCreatedMen = this.mBackStackIndices;
       if (tmCreatedMen != null) {
          i = tmCreatedMen.size();
          if (i > 0) {
             p2.print(p0);
             p2.println("Back Stack Indices:");
             for (int i3 = 0; i3 < i; i3 = i3 + 1) {
                p2.print(p0);
                p2.print("  #");
                p2.print(i3);
                p2.print(": ");
                p2.println(this.mBackStackIndices.get(i3));
             }
          }
       }
       tmCreatedMen = this.mAvailBackStackIndices;
       if (tmCreatedMen != null && tmCreatedMen.size() > 0) {
          p2.print(p0);
          p2.print("mAvailBackStackIndices: ");
          p2.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
       }
       _monitor_exit(this);
       tmCreatedMen = this.mPendingActions;
       if (tmCreatedMen != null) {
          i = tmCreatedMen.size();
          if (i > 0) {
             p2.print(p0);
             p2.println("Pending Actions:");
             for (; i1 < i; i1++) {
                p2.print(p0);
                p2.print("  #");
                p2.print(i1);
                p2.print(": ");
                p2.println(this.mPendingActions.get(i1));
             }
          }
       }
       p2.print(p0);
       p2.println("FragmentManager misc state:");
       p2.print(p0);
       p2.print("  mHost=");
       p2.println(this.mHost);
       p2.print(p0);
       p2.print("  mContainer=");
       p2.println(this.mContainer);
       if (this.mParent != null) {
          p2.print(p0);
          p2.print("  mParent=");
          p2.println(this.mParent);
       }
       p2.print(p0);
       p2.print("  mCurState=");
       p2.print(this.mCurState);
       p2.print(" mStateSaved=");
       p2.print(this.mStateSaved);
       p2.print(" mStopped=");
       p2.print(this.mStopped);
       p2.print(" mDestroyed=");
       p2.println(this.mDestroyed);
       if (this.mNeedMenuInvalidate != null) {
          p2.print(p0);
          p2.print("  mNeedMenuInvalidate=");
          p2.println(this.mNeedMenuInvalidate);
       }
       return;
    }
    public final void endAnimatingAwayFragments(){
       Iterator iterator = this.mActive.values().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj != null) {
             if (obj.getAnimatingAway() != null) {
                int stateAfterAn = obj.getStateAfterAnimating();
                View animatingAwa = obj.getAnimatingAway();
                Animation animation = animatingAwa.getAnimation();
                if (animation != null) {
                   animation.cancel();
                   animatingAwa.clearAnimation();
                }
                obj.setAnimatingAway(null);
                this.moveToState(obj, stateAfterAn, 0, 0, false);
             }else if(obj.getAnimator() != null){
                obj.getAnimator().end();
             }
          }
       }
       return;
    }
    public void enqueueAction(FragmentManagerImpl$k p0,boolean p1){
       if (!p1) {
          this.checkStateLoss();
       }
       _monitor_enter(this);
       if (this.mDestroyed != null || this.mHost == null) {
          if (p1) {
             _monitor_exit(this);
             return;
          }else {
             throw new IllegalStateException("Activity has been destroyed");
          }
       }else if(this.mPendingActions == null){
          this.mPendingActions = new ArrayList();
       }
       this.mPendingActions.add(p0);
       this.scheduleCommit();
       _monitor_exit(this);
       return;
    }
    public final void ensureExecReady(boolean p0){
       if (this.mExecutingActions != null) {
          throw new IllegalStateException("FragmentManager is already executing transactions");
       }
       if (this.mHost == null) {
          throw new IllegalStateException("Fragment host has been destroyed");
       }
       if (Looper.myLooper() != this.mHost.getHandler().getLooper()) {
          throw new IllegalStateException("Must be called from main thread of fragment host");
       }
       if (!p0) {
          this.checkStateLoss();
       }
       if (this.mTmpRecords == null) {
          this.mTmpRecords = new ArrayList();
          this.mTmpIsPop = new ArrayList();
       }
       this.mExecutingActions = true;
       this.executePostponedTransaction(null, null);
       this.mExecutingActions = false;
       return;
    }
    public void ensureInflatedFragmentView(Fragment p0){
       if (p0.mFromLayout != null && p0.mPerformedCreateView == null) {
          ViewGroup viewGroup = null;
          p0.performCreateView(p0.performGetLayoutInflater(p0.mSavedFragmentState), viewGroup, p0.mSavedFragmentState);
          Fragment mView = p0.mView;
          if (mView != null) {
             p0.mInnerView = mView;
             mView.setSaveFromParentEnabled(false);
             if (p0.mHidden != null) {
                p0.mView.setVisibility(8);
             }
             p0.onViewCreated(p0.mView, p0.mSavedFragmentState);
             this.dispatchOnFragmentViewCreated(p0, p0.mView, p0.mSavedFragmentState, false);
          }else {
             p0.mInnerView = viewGroup;
          }
       }
       return;
    }
    public boolean execPendingActions(){
       this.ensureExecReady(true);
       FragmentManagerImpl uFragmentMan = null;
       while (this.generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
          this.mExecutingActions = true;
          this.removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
          this.cleanupExec();
          uFragmentMan = true;
       }
       this.updateOnBackPressedCallbackEnabled();
       this.doPendingDeferredStart();
       this.burpActive();
       return uFragmentMan;
    }
    public void execSingleAction(FragmentManagerImpl$k p0,boolean p1){
       if (p1 && (this.mHost == null || this.mDestroyed != null)) {
          return;
       }
       this.ensureExecReady(p1);
       if (p0.e(this.mTmpRecords, this.mTmpIsPop)) {
          this.mExecutingActions = true;
          this.removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
          this.cleanupExec();
       }
       this.updateOnBackPressedCallbackEnabled();
       this.doPendingDeferredStart();
       this.burpActive();
       return;
    }
    public final void executeOpsTogether(ArrayList p0,ArrayList p1,int p2,int p3){
       int i4;
       FragmentManagerImpl uFragmentMan = this;
       ArrayList uArrayList = p0;
       ArrayList uArrayList1 = p1;
       int i = p2;
       int i1 = p3;
       e q = uArrayList.get(i).q;
       FragmentManagerImpl mTmpAddedFra = uFragmentMan.mTmpAddedFragments;
       if (mTmpAddedFra == null) {
          uFragmentMan.mTmpAddedFragments = new ArrayList();
       }else {
          mTmpAddedFra.clear();
       }
       uFragmentMan.mTmpAddedFragments.addAll(uFragmentMan.mAdded);
       Fragment primaryNavig = this.getPrimaryNavigationFragment();
       int i2 = i;
       int i3 = 0;
       while (i2 < i1) {
          a uoa = uArrayList.get(i2);
          primaryNavig = (!uArrayList1.get(i2).booleanValue())? uoa.L(uFragmentMan.mTmpAddedFragments, primaryNavig): uoa.S(uFragmentMan.mTmpAddedFragments, primaryNavig);
          i3 = (i3 || uoa.h != null)? 1: 0;
          i2 = i2 + 1;
       }
       uFragmentMan.mTmpAddedFragments.clear();
       if (q == null) {
          f.C(this, p0, p1, p2, p3, false);
       }
       FragmentManagerImpl.executeOps(p0, p1, p2, p3);
       if (q != null) {
          ArraySet uArraySet = new ArraySet();
          this.addAddedFragments(uArraySet);
          this.makeRemovedFragmentsInvisible(uArraySet);
          i4 = this.postponePostponableTransactions(p0, p1, p2, p3, uArraySet);
       }else {
          i4 = i1;
       }
       if (i4 != i && q != null) {
          f.C(this, p0, p1, p2, i4, true);
          this.moveToState(uFragmentMan.mCurState, true);
       }
       while (i < i1) {
          a uoa1 = uArrayList.get(i);
          if (uArrayList1.get(i).booleanValue()) {
             a u = uoa1.u;
             if (u >= null) {
                this.freeBackStackIndex(u);
                uoa1.u = -1;
             }
          }
          uoa1.Q();
          i = i + 1;
       }
       if (i3) {
          this.reportBackStackChanged();
       }
       return;
    }
    public boolean executePendingTransactions(){
       this.forcePostponedTransactions();
       return this.execPendingActions();
    }
    public final void executePostponedTransaction(ArrayList p0,ArrayList p1){
       FragmentManagerImpl tmPostponedT = this.mPostponedTransactions;
       int i = (tmPostponedT == null)? 0: tmPostponedT.size();
       int i1 = 0;
       while (i1 < i) {
          FragmentManagerImpl$m om = this.mPostponedTransactions.get(i1);
          FragmentManagerImpl uFragmentMan = -1;
          if (p0 != null && om.a == null) {
             int i2 = p0.indexOf(om.b);
             if (i2 != uFragmentMan && p1.get(i2).booleanValue()) {
                this.mPostponedTransactions.remove(i1);
                i1 = i1 - 1;
                i = i - 1;
                om.c();
             }else if(om.e() || (p0 != null && om.b.N(p0, 0, p0.size()))){
                this.mPostponedTransactions.remove(i1);
                i1 = i1 - 1;
                i = i - 1;
                if (p0 != null && om.a == null) {
                   i2 = p0.indexOf(om.b);
                   if (i2 != uFragmentMan && p1.get(i2).booleanValue()) {
                      om.c();
                   }
                }
                om.d();
             }
          }else {
             goto label_003e ;
          }
          i1 = i1 + 1;
       }
       return;
    }
    public Fragment findFragmentById(int p0){
       Fragment uFragment;
       int i = this.mAdded.size() - 1;
       while (true) {
          if (i >= 0) {
             uFragment = this.mAdded.get(i);
             if (uFragment != null && uFragment.mFragmentId == p0) {
                break ;
             }else {
                i = i - 1;
             }
          }else {
             Iterator iterator = this.mActive.values().iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   return null;
                }
                uFragment = iterator.next();
                if (uFragment != null && uFragment.mFragmentId == p0) {
                   return uFragment;
                }
                continue ;
             }
          }
       }
       return uFragment;
    }
    public Fragment findFragmentByTag(String p0){
       Fragment uFragment;
       if (p0 != null) {
          int i = this.mAdded.size() - 1;
          while (true) {
             if (i >= 0) {
                uFragment = this.mAdded.get(i);
                if (uFragment != null && p0.equals(uFragment.mTag)) {
                   return uFragment;
                }else {
                   i = i - 1;
                }
             }
          }
       }
       if (p0 != null) {
          Iterator iterator = this.mActive.values().iterator();
          while (iterator.hasNext()) {
             uFragment = iterator.next();
             if (uFragment != null && p0.equals(uFragment.mTag)) {
                return uFragment;
             }else {
                continue ;
             }
          }
       }
       return null;
    }
    public Fragment findFragmentByWho(String p0){
       Fragment uFragment;
       Iterator iterator = this.mActive.values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uFragment = iterator.next();
          if (uFragment != null) {
             uFragment = uFragment.findFragmentByWho(p0);
             if (uFragment != null) {
                break ;
             }
          }
       }
       return uFragment;
    }
    public final Fragment findFragmentUnder(Fragment p0){
       Fragment mContainer = p0.mContainer;
       Fragment mView = p0.mView;
       if (mContainer != null && mView != null) {
          int i = this.mAdded.indexOf(p0) - 1;
          while (i >= 0) {
             mView = this.mAdded.get(i);
             if (mView.mContainer == mContainer && mView.mView != null) {
                return mView;
             }
             i--;
          }
       }
       return null;
    }
    public final void forcePostponedTransactions(){
       if (this.mPostponedTransactions != null) {
          while (!this.mPostponedTransactions.isEmpty()) {
             this.mPostponedTransactions.remove(0).d();
          }
       }
       return;
    }
    public void freeBackStackIndex(int p0){
       _monitor_enter(this);
       this.mBackStackIndices.set(p0, null);
       if (this.mAvailBackStackIndices == null) {
          this.mAvailBackStackIndices = new ArrayList();
       }
       this.mAvailBackStackIndices.add(Integer.valueOf(p0));
       _monitor_exit(this);
       return;
    }
    public final boolean generateOpsForPendingActions(ArrayList p0,ArrayList p1){
       _monitor_enter(this);
       FragmentManagerImpl tmPendingAct = this.mPendingActions;
       boolean b = false;
       if (tmPendingAct == null || !tmPendingAct.size()) {
          _monitor_exit(this);
          return b;
       }else {
          int i = this.mPendingActions.size();
          int i1 = 0;
          for (; b < i; b = b + 1) {
             i1 = i1 | this.mPendingActions.get(b).e(p0, p1);
          }
          this.mPendingActions.clear();
          this.mHost.getHandler().removeCallbacks(this.mExecCommit);
          _monitor_exit(this);
          return i1;
       }
    }
    public int getActiveFragmentCount(){
       return this.mActive.size();
    }
    public List getActiveFragments(){
       return new ArrayList(this.mActive.values());
    }
    public c$a getBackStackEntryAt(int p0){
       return this.mBackStack.get(p0);
    }
    public int getBackStackEntryCount(){
       FragmentManagerImpl tmBackStack = this.mBackStack;
       int i = (tmBackStack != null)? tmBackStack.size(): 0;
       return i;
    }
    public d getChildNonConfig(Fragment p0){
       return this.mNonConfig.q0(p0);
    }
    public Fragment getFragment(Bundle p0,String p1){
       String str = p0.getString(p1);
       if (str == null) {
          return null;
       }
       Fragment uFragment = this.mActive.get(str);
       if (uFragment == null) {
          this.throwException(new IllegalStateException("Fragment no longer exists for key "+p1+": unique id "+str));
       }
       return uFragment;
    }
    public b getFragmentFactory(){
       if (super.getFragmentFactory() == c.DEFAULT_FACTORY) {
          FragmentManagerImpl tmParent = this.mParent;
          if (tmParent != null) {
             return tmParent.mFragmentManager.getFragmentFactory();
          }else {
             this.setFragmentFactory(new FragmentManagerImpl$f(this));
          }
       }
       return super.getFragmentFactory();
    }
    public List getFragments(){
       if (this.mAdded.isEmpty()) {
          return Collections.emptyList();
       }
       FragmentManagerImpl tmAdded = this.mAdded;
       _monitor_enter(tmAdded);
       _monitor_exit(tmAdded);
       return this.mAdded.clone();
    }
    public LayoutInflater$Factory2 getLayoutInflaterFactory(){
       return this;
    }
    public Fragment getPrimaryNavigationFragment(){
       return this.mPrimaryNav;
    }
    public ViewModelStore getViewModelStore(Fragment p0){
       return this.mNonConfig.u0(p0);
    }
    public void handleOnBackPressed(){
       this.execPendingActions();
       if (this.mOnBackPressedCallback.c()) {
          this.popBackStackImmediate();
       }else {
          this.mOnBackPressedDispatcher.d();
       }
       return;
    }
    public void hideFragment(Fragment p0){
       if (FragmentManagerImpl.DEBUG) {
          StringBuilder str = "hide: "+p0;
       }
       if (p0.mHidden == null) {
          p0.mHidden = true;
          p0.mHiddenChanged = true ^ p0.mHiddenChanged;
       }
       return;
    }
    public boolean isDestroyed(){
       return this.mDestroyed;
    }
    public final boolean isMenuAvailable(Fragment p0){
       boolean b = (p0.mHasMenu == null || (p0.mMenuVisible != null || p0.mChildFragmentManager.checkForMenus()))? true: false;
       return b;
    }
    public boolean isPrimaryNavigation(Fragment p0){
       boolean b = true;
       if (p0 == null) {
          return b;
       }
       Fragment mFragmentMan = p0.mFragmentManager;
       if (p0 != mFragmentMan.getPrimaryNavigationFragment() || !this.isPrimaryNavigation(mFragmentMan.mParent)) {
          b = false;
       }
       return b;
    }
    public boolean isStateAtLeast(int p0){
       boolean b = (this.mCurState >= p0)? true: false;
       return b;
    }
    public boolean isStateSaved(){
       boolean b = (this.mStateSaved != null || this.mStopped != null)? true: false;
       return b;
    }
    public FragmentManagerImpl$g loadAnimation(Fragment p0,int p1,boolean p2,int p3){
       Animator uAnimator1;
       Animation uAnimation1;
       int i1;
       int nextAnim = p0.getNextAnim();
       int i = 0;
       p0.setNextAnim(i);
       Fragment mContainer = p0.mContainer;
       if (mContainer != null && mContainer.getLayoutTransition() != null) {
          return null;
       }
       Animation uAnimation = p0.onCreateAnimation(p1, p2, nextAnim);
       if (uAnimation != null) {
          return new FragmentManagerImpl$g(uAnimation);
       }
       Animator uAnimator = p0.onCreateAnimator(p1, p2, nextAnim);
       if (uAnimator != null) {
          return new FragmentManagerImpl$g(uAnimator);
       }
       if (nextAnim) {
          if (("anim").equals(this.mHost.getContext().getResources().getResourceTypeName(nextAnim))) {
             try{
                uAnimation = AnimationUtils.loadAnimation(this.mHost.getContext(), nextAnim);
                if (uAnimation != null) {
                   return new FragmentManagerImpl$g(uAnimation);
                }else {
                   i = 1;
                }
             }catch(android.content.res.Resources$NotFoundException e6){
                throw e6;
             }catch(java.lang.RuntimeException e0){
             }
          }
       }
    }
    public void makeActive(Fragment p0){
       if (this.mActive.get(p0.mWho) != null) {
          return;
       }
       this.mActive.put(p0.mWho, p0);
       if (p0.mRetainInstanceChangedWhileDetached != null) {
          if (p0.mRetainInstance != null) {
             this.addRetainedFragment(p0);
          }else {
             this.removeRetainedFragment(p0);
          }
          p0.mRetainInstanceChangedWhileDetached = false;
       }
       if (FragmentManagerImpl.DEBUG) {
          "Added fragment to active set "+p0;
       }
       return;
    }
    public void makeInactive(Fragment p0){
       if (this.mActive.get(p0.mWho) == null) {
          return;
       }
       if (FragmentManagerImpl.DEBUG) {
          StringBuilder str = "Removed fragment from active set "+p0;
       }
       Iterator iterator = this.mActive.values().iterator();
       while (iterator.hasNext()) {
          Fragment uFragment = iterator.next();
          if (uFragment != null && (p0.mWho).equals(uFragment.mTargetWho)) {
             uFragment.mTarget = p0;
             uFragment.mTargetWho = null;
          }
       }
       this.mActive.put(p0.mWho, null);
       this.removeRetainedFragment(p0);
       Fragment mTargetWho = p0.mTargetWho;
       if (mTargetWho != null) {
          p0.mTarget = this.mActive.get(mTargetWho);
       }
       p0.initState();
       return;
    }
    public final void makeRemovedFragmentsInvisible(ArraySet p0){
       int i = p0.size();
       int i1 = 0;
       while (i1 < i) {
          Fragment uFragment = p0.valueAt(i1);
          if (uFragment.mAdded == null) {
             View view = uFragment.requireView();
             uFragment.mPostponedAlpha = view.getAlpha();
             view.setAlpha(0);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void moveFragmentToExpectedState(Fragment p0){
       if (p0 == null) {
          return;
       }
       if (!this.mActive.containsKey(p0.mWho)) {
          if (FragmentManagerImpl.DEBUG) {
             "Ignoring moving "+p0+" to state "+this.mCurState+"since it is not added to "+this;
          }
          return;
       }else {
          FragmentManagerImpl tmCurState = this.mCurState;
          int i = 1;
          if (p0.mRemoving != null) {
             tmCurState = (p0.isInBackStack())? Math.min(tmCurState, i): Math.min(tmCurState, false);
          }
       label_0048 :
          this.moveToState(p0, tmCurState, p0.getNextTransition(), p0.getNextTransitionStyle(), false);
          if (p0.mView != null) {
             Fragment uFragment = this.findFragmentUnder(p0);
             if (uFragment != null) {
                Fragment mContainer = p0.mContainer;
                int i1 = mContainer.indexOfChild(uFragment.mView);
                int i2 = mContainer.indexOfChild(p0.mView);
                if (i2 < i1) {
                   mContainer.removeViewAt(i2);
                   mContainer.addView(p0.mView, i1);
                }
             }
             if (p0.mIsNewlyAdded != null && p0.mContainer != null) {
                uFragment = p0.mPostponedAlpha;
                float f = 0;
                if (uFragment - f > 0) {
                   p0.mView.setAlpha(uFragment);
                }
                p0.mPostponedAlpha = f;
                p0.mIsNewlyAdded = false;
                FragmentManagerImpl$g og = this.loadAnimation(p0, p0.getNextTransition(), i, p0.getNextTransitionStyle());
                if (og != null) {
                   FragmentManagerImpl$g a = og.a;
                   if (a != null) {
                      p0.mView.startAnimation(a);
                   }else {
                      og.b.setTarget(p0.mView);
                      og.b.start();
                   }
                }
             }
          }
       label_00b5 :
          if (p0.mHiddenChanged != null) {
             this.completeShowHideFragment(p0);
          }
          return;
       }
    }
    public void moveToState(int p0,boolean p1){
       if (this.mHost == null && p0) {
          throw new IllegalStateException("No activity");
       }
       if (!p1 && p0 == this.mCurState) {
          return;
       }
       this.mCurState = p0;
       p0 = this.mAdded.size();
       for (int i = 0; i < p0; i = i + 1) {
          this.moveFragmentToExpectedState(this.mAdded.get(i));
       }
       Iterator iterator = this.mActive.values().iterator();
       while (iterator.hasNext()) {
          Fragment uFragment = iterator.next();
          if (uFragment != null && (uFragment.mRemoving != null || (uFragment.mDetached != null && uFragment.mIsNewlyAdded == null))) {
             this.moveFragmentToExpectedState(uFragment);
          }
       }
       this.startPendingDeferredFragments();
       if (this.mNeedMenuInvalidate != null) {
          FragmentManagerImpl tmHost = this.mHost;
          if (tmHost != null && this.mCurState == 4) {
             tmHost.onSupportInvalidateOptionsMenu();
             this.mNeedMenuInvalidate = false;
          }
       }
       return;
    }
    public void moveToState(Fragment p0){
       this.moveToState(p0, this.mCurState, 0, 0, false);
    }
    public void moveToState(Fragment p0,int p1,int p2,int p3,boolean p4){
       int i1;
       Fragment mState;
       StringBuilder i1;
       String resourceName;
       FragmentManagerImpl mState11;
       FragmentManagerImpl mParent;
       String str1;
       FragmentHostCallback mState11;
       View mState12;
       FragmentManagerImpl uFragmentMan = this;
       Fragment uFragment = p0;
       int i = 1;
       if (uFragment.mAdded == null || uFragment.mDetached != null) {
          i1 = p1;
          if (i1 > i) {
             i1 = true;
          }
       }else {
          i1 = p1;
       }
       if (uFragment.mRemoving != null) {
          mState = uFragment.mState;
          if (i1 > mState) {
             i1 = (mState == null && p0.isInBackStack())? true: uFragment.mState;
          }
       }
       int i2 = 3;
       if (uFragment.mDeferStart != null && (uFragment.mState < i2 && i1 > 2)) {
          i1 = 2;
       }
    label_0037 :
       mState = uFragment.mMaxState;
       i1 = (mState == Lifecycle$State.CREATED)? Math.min(i1, i): Math.min(i1, mState.ordinal());
       int i3 = i1;
       ViewGroup Fragment mState1 = uFragment.mState;
       if (mState1 <= i3) {
          if (uFragment.mFromLayout != null && uFragment.mInLayout == null) {
             return;
          }else if(p0.getAnimatingAway() != null || p0.getAnimator() != null){
             uFragment.setAnimatingAway(null);
             uFragment.setAnimator(null);
             this.moveToState(p0, p0.getStateAfterAnimating(), 0, 0, true);
          }
          mState1 = uFragment.mState;
          if (mState1 != null) {
             if (mState1 != i) {
                if (mState1 != 2) {
                   if (mState1 == i2) {
                   label_0086 :
                      i1 = 3;
                      if (i3 > i1) {
                         if (FragmentManagerImpl.DEBUG) {
                            i1 = "moveto RESUMED: "+uFragment;
                         }
                         p0.performResume();
                         uFragmentMan.dispatchOnFragmentResumed(uFragment, false);
                         uFragment.mSavedFragmentState = null;
                         uFragment.mSavedViewState = null;
                      }
                   }
                }else if(i3 > 2){
                   if (FragmentManagerImpl.DEBUG) {
                      i1 = "moveto STARTED: "+uFragment;
                   }
                   p0.performStart();
                   uFragmentMan.dispatchOnFragmentStarted(uFragment, false);
                   goto label_0086 ;
                }else {
                   goto label_0086 ;
                }
             }
          }else if(i3 > 0){
             if (FragmentManagerImpl.DEBUG) {
                i1 = "moveto CREATED: "+uFragment;
             }
             mState1 = uFragment.mSavedFragmentState;
             if (mState1 != null) {
                mState1.setClassLoader(uFragmentMan.mHost.getContext().getClassLoader());
                uFragment.mSavedViewState = uFragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                mState1 = uFragmentMan.getFragment(uFragment.mSavedFragmentState, "android:target_state");
                mState1 = (mState1 != null)? mState1.mWho: null;
                uFragment.mTargetWho = mState1;
                if (mState1 != null) {
                   uFragment.mTargetRequestCode = uFragment.mSavedFragmentState.getInt("android:target_req_state", false);
                }
                mState1 = uFragment.mSavedUserVisibleHint;
                if (mState1 != null) {
                   uFragment.mUserVisibleHint = mState1.booleanValue();
                   uFragment.mSavedUserVisibleHint = null;
                }else {
                   uFragment.mUserVisibleHint = uFragment.mSavedFragmentState.getBoolean("android:user_visible_hint", i);
                }
                if (uFragment.mUserVisibleHint == null) {
                   uFragment.mDeferStart = i;
                   if (i3 > 2) {
                      i3 = 2;
                   }
                }
             }
          label_00f3 :
             mState11 = uFragmentMan.mHost;
             uFragment.mHost = mState11;
             mParent = uFragmentMan.mParent;
             uFragment.mParentFragment = mParent;
             mState1 = (mParent != null)? mParent.mChildFragmentManager: mState11.mFragmentManager;
             uFragment.mFragmentManager = mState1;
             mState1 = uFragment.mTarget;
             String str = "Fragment ";
             if (mState1 != null) {
                mState = uFragment.mTarget;
                if (uFragmentMan.mActive.get(mState1.mWho) == mState) {
                   if (mState.mState < i) {
                      str1 = str;
                      this.moveToState(mState, 1, 0, 0, 1);
                   }else {
                      str1 = str;
                   }
                   uFragment.mTargetWho = uFragment.mTarget.mWho;
                   uFragment.mTarget = null;
                }else {
                   throw new IllegalStateException(str+uFragment+" declared target fragment "+uFragment.mTarget+" that does not belong to this FragmentManager!");
                }
             }else {
                str1 = str;
             }
             mState1 = uFragment.mTargetWho;
             if (mState1 != null) {
                Object obj = uFragmentMan.mActive.get(mState1);
                if (obj != null) {
                   if (obj.mState < i) {
                      this.moveToState(obj, 1, 0, 0, true);
                   }
                }else {
                   throw new IllegalStateException(str1+uFragment+" declared target fragment "+uFragment.mTargetWho+" that does not belong to this FragmentManager!");
                }
             }
             uFragmentMan.dispatchOnFragmentPreAttached(uFragment, uFragmentMan.mHost.getContext(), false);
             p0.performAttach();
             mState1 = uFragment.mParentFragment;
             if (mState1 == null) {
                uFragmentMan.mHost.onAttachFragment(uFragment);
             }else {
                mState1.onAttachFragment(uFragment);
             }
             uFragmentMan.dispatchOnFragmentAttached(uFragment, uFragmentMan.mHost.getContext(), false);
             if (uFragment.mIsCreated == null) {
                uFragmentMan.dispatchOnFragmentPreCreated(uFragment, uFragment.mSavedFragmentState, false);
                uFragment.performCreate(uFragment.mSavedFragmentState);
                uFragmentMan.dispatchOnFragmentCreated(uFragment, uFragment.mSavedFragmentState, false);
             }else {
                uFragment.restoreChildFragmentState(uFragment.mSavedFragmentState);
                uFragment.mState = i;
             }
          }
          if (i3 > 0) {
             this.ensureInflatedFragmentView(p0);
          }
          if (i3 > i) {
             if (FragmentManagerImpl.DEBUG) {
                i1 = "moveto ACTIVITY_CREATED: "+uFragment;
             }
             if (uFragment.mFromLayout == null) {
                mState1 = uFragment.mContainerId;
                if (mState1 != null) {
                   if (mState1 == -1) {
                      uFragmentMan.throwException(new IllegalArgumentException("Cannot create fragment "+uFragment+" for a container view with no id"));
                   }
                   mState1 = uFragmentMan.mContainer.onFindViewById(uFragment.mContainerId);
                   if (mState1 == null && uFragment.mRestored == null) {
                      try{
                         resourceName = p0.getResources().getResourceName(uFragment.mContainerId);
                      }catch(android.content.res.Resources$NotFoundException e0){
                         resourceName = "unknown";
                      }
                      uFragmentMan.throwException(new IllegalArgumentException("No view found for id 0x"+Integer.toHexString(uFragment.mContainerId)+" \("+resourceName+"\) for fragment "+uFragment));
                   }
                }else {
                   mState1 = null;
                }
                uFragment.mContainer = e0;
                uFragment.performCreateView(uFragment.performGetLayoutInflater(uFragment.mSavedFragmentState), e0, uFragment.mSavedFragmentState);
                mState = uFragment.mView;
                if (mState != null) {
                   uFragment.mInnerView = mState;
                   mState.setSaveFromParentEnabled(false);
                   if (e0 != null) {
                      e0.addView(uFragment.mView);
                   }
                   if (uFragment.mHidden != null) {
                      uFragment.mView.setVisibility(8);
                   }
                   uFragment.onViewCreated(uFragment.mView, uFragment.mSavedFragmentState);
                   uFragmentMan.dispatchOnFragmentViewCreated(uFragment, uFragment.mView, uFragment.mSavedFragmentState, false);
                   if (uFragment.mView.getVisibility() || uFragment.mContainer == null) {
                      i = false;
                   }
                   uFragment.mIsNewlyAdded = i;
                }else {
                   uFragment.mInnerView = null;
                }
             }
             uFragment.performActivityCreated(uFragment.mSavedFragmentState);
             uFragmentMan.dispatchOnFragmentActivityCreated(uFragment, uFragment.mSavedFragmentState, false);
             if (uFragment.mView != null) {
                uFragment.restoreViewState(uFragment.mSavedFragmentState);
             }
             uFragment.mSavedFragmentState = null;
             goto label_02bf ;
          }else {
             goto label_02bf ;
          }
       }else if(mState1 > i3){
          if (mState1 != i) {
             if (mState1 != 2) {
                if (mState1 != 3) {
                   resourceName = 4;
                   if (mState1 == resourceName) {
                      if (i3 < resourceName) {
                         if (FragmentManagerImpl.DEBUG) {
                            i1 = "movefrom RESUMED: "+uFragment;
                         }
                         p0.performPause();
                         uFragmentMan.dispatchOnFragmentPaused(uFragment, false);
                      }
                   }
                }
                if (i3 < 3) {
                   if (FragmentManagerImpl.DEBUG) {
                      i1 = "movefrom STARTED: "+uFragment;
                   }
                   p0.performStop();
                   uFragmentMan.dispatchOnFragmentStopped(uFragment, false);
                }
             }
             if (i3 < 2) {
                if (FragmentManagerImpl.DEBUG) {
                   i1 = "movefrom ACTIVITY_CREATED: "+uFragment;
                }
                if (uFragment.mView != null && (uFragmentMan.mHost.onShouldSaveFragmentState(uFragment) && uFragment.mSavedViewState == null)) {
                   this.saveFragmentViewState(p0);
                }
             label_0360 :
                p0.performDestroyView();
                uFragmentMan.dispatchOnFragmentViewDestroyed(uFragment, false);
                mState1 = uFragment.mView;
                if (mState1 != null) {
                   mState = uFragment.mContainer;
                   if (mState != null) {
                      mState.endViewTransition(mState1);
                      uFragment.mView.clearAnimation();
                      if (p0.getParentFragment() == null || p0.getParentFragment().mRemoving == null) {
                         float f = 0;
                         FragmentManagerImpl$g og = (uFragmentMan.mCurState > null && (uFragmentMan.mDestroyed == null && (!uFragment.mView.getVisibility() && uFragment.mPostponedAlpha - f >= 0)))? uFragmentMan.loadAnimation(uFragment, p2, false, p3): null;
                         uFragment.mPostponedAlpha = f;
                         if (og != null) {
                            uFragmentMan.animateRemoveFragment(uFragment, og, i3);
                         }
                         uFragment.mContainer.removeView(uFragment.mView);
                      }
                   }
                }
                uFragment.mContainer = null;
                uFragment.mView = null;
                uFragment.mViewLifecycleOwner = null;
                uFragment.mViewLifecycleOwnerLiveData.setValue(null);
                uFragment.mInnerView = null;
                uFragment.mInLayout = false;
             }
          }
          if (i3 < i) {
             if (uFragmentMan.mDestroyed != null) {
                if (p0.getAnimatingAway() != null) {
                   uFragment.setAnimatingAway(null);
                   p0.getAnimatingAway().clearAnimation();
                }else if(p0.getAnimator() != null){
                   uFragment.setAnimator(null);
                   p0.getAnimator().cancel();
                }
             }
             if (p0.getAnimatingAway() != null || p0.getAnimator() != null) {
                uFragment.setStateAfterAnimating(i3);
             label_048d :
                if (uFragment.mState != i) {
                   "moveToState: Fragment state for "+uFragment+" not updated inline; expected state "+i+" found "+uFragment.mState;
                   uFragment.mState = i;
                }
                return;
             }else if(FragmentManagerImpl.DEBUG){
                i1 = "movefrom CREATED: "+uFragment;
             }
             mState11 = (uFragment.mRemoving != null && !p0.isInBackStack())? 1: null;
             if (mState11 || uFragmentMan.mNonConfig.y0(uFragment)) {
                mParent = uFragmentMan.mHost;
                if (mParent instanceof ViewModelStoreOwner) {
                   i = uFragmentMan.mNonConfig.v0();
                }else if(mParent.getContext() instanceof Activity){
                   i = i ^ uFragmentMan.mHost.getContext().isChangingConfigurations();
                }
                if (mState11 || i) {
                   uFragmentMan.mNonConfig.p0(uFragment);
                }
                p0.performDestroy();
                uFragmentMan.dispatchOnFragmentDestroyed(uFragment, false);
             }else {
                uFragment.mState = 0;
             }
             p0.performDetach();
             uFragmentMan.dispatchOnFragmentDetached(uFragment, false);
             if (!p4) {
                if (mState11 || uFragmentMan.mNonConfig.y0(uFragment)) {
                   this.makeInactive(p0);
                }else {
                   uFragment.mHost = null;
                   uFragment.mParentFragment = null;
                   uFragment.mFragmentManager = null;
                   mState1 = uFragment.mTargetWho;
                   if (mState1 != null) {
                      mState1 = uFragmentMan.mActive.get(mState1);
                      if (mState1 != null && mState1.getRetainInstance()) {
                         uFragment.mTarget = mState1;
                      }
                   }
                }
             }
          }
       }
    label_048c :
       i = i3;
       goto label_048d ;
    }
    public void noteStateNotSaved(){
       boolean b = false;
       this.mStateSaved = b;
       this.mStopped = b;
       int i = this.mAdded.size();
       while (b < i) {
          Fragment uFragment = this.mAdded.get(b);
          if (uFragment != null) {
             uFragment.noteStateNotSaved();
          }
          b = b + 1;
       }
       return;
    }
    public View onCreateView(View p0,String p1,Context p2,AttributeSet p3){
       FragmentManagerImpl tmHost;
       Fragment this;
       View view = null;
       if (!("fragment").equals(p1)) {
          return view;
       }
       String attributeVal = p3.getAttributeValue(view, "class");
       TypedArray typedArray = p2.obtainStyledAttributes(p3, FragmentManagerImpl$j.a);
       int i = 0;
       if (attributeVal == null) {
          attributeVal = typedArray.getString(i);
       }
       String str = attributeVal;
       int i1 = 1;
       int i2 = -1;
       int resourceId = typedArray.getResourceId(i1, i2);
       String str1 = typedArray.getString(2);
       typedArray.recycle();
       if (str == null || !b.b(p2.getClassLoader(), str)) {
          return view;
       }else if(p0 != null){
          i = p0.getId();
       }
       if (i == i2 && (resourceId != i2 || str1 != null)) {
          if (resourceId != i2) {
             view = this.findFragmentById(resourceId);
          }
          if (view == null && str1 != null) {
             view = this.findFragmentByTag(str1);
          }
          if (view == null && i != i2) {
             view = this.findFragmentById(i);
          }
          if (FragmentManagerImpl.DEBUG) {
             StringBuilder str2 = "onCreateView: id=0x"+Integer.toHexString(resourceId)+" fname="+str+" existing="+view;
          }
          if (view == null) {
             view = this.getFragmentFactory().a(p2.getClassLoader(), str);
             view.mFromLayout = i1;
             int i3 = (resourceId)? resourceId: i;
             view.mFragmentId = i3;
             view.mContainerId = i;
             view.mTag = str1;
             view.mInLayout = i1;
             view.mFragmentManager = this;
             tmHost = this.mHost;
             view.mHost = tmHost;
             view.onInflate(tmHost.getContext(), p3, view.mSavedFragmentState);
             this.addFragment(view, i1);
          }else if(view.mInLayout == null){
             view.mInLayout = i1;
             tmHost = this.mHost;
             view.mHost = tmHost;
             view.onInflate(tmHost.getContext(), p3, view.mSavedFragmentState);
          }else {
             throw new IllegalArgumentException(p3.getPositionDescription()+": Duplicate id 0x"+Integer.toHexString(resourceId)+", tag "+str1+", or parent id 0x"+Integer.toHexString(i)+" with another fragment for "+str);
          }
          View view1 = view;
          if (this.mCurState < i1 && view1.mFromLayout != null) {
             this.moveToState(view1, 1, 0, 0, false);
          }else {
             this.moveToState(view1);
          }
          this = view1.mView;
          if (this != null) {
             if (resourceId) {
                this.setId(resourceId);
             }
             if (view1.mView.getTag() == null) {
                view1.mView.setTag(str1);
             }
             return view1.mView;
          }else {
             throw super("Fragment "+str+" did not create a view.");
          }
       }else {
          throw new IllegalArgumentException(p3.getPositionDescription()+": Must specify unique android:id, android:tag, or have a parent with an id for "+str);
       }
    }
    public View onCreateView(String p0,Context p1,AttributeSet p2){
       return this.onCreateView(null, p0, p1, p2);
    }
    public void performPendingDeferredStart(Fragment p0){
       if (p0.mDeferStart != null) {
          if (this.mExecutingActions != null) {
             this.mHavePendingDeferredStart = true;
             return;
          }else {
             p0.mDeferStart = false;
             this.moveToState(p0, this.mCurState, 0, 0, false);
          }
       }
       return;
    }
    public void popBackStack(){
       this.enqueueAction(new FragmentManagerImpl$l(this, null, -1, 0), 0);
    }
    public void popBackStack(int p0,int p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("Bad id: "+p0);
       }
       this.enqueueAction(new FragmentManagerImpl$l(this, null, p0, p1), false);
       return;
    }
    public void popBackStack(String p0,int p1){
       this.enqueueAction(new FragmentManagerImpl$l(this, p0, -1, p1), false);
    }
    public boolean popBackStackImmediate(){
       this.checkStateLoss();
       return this.popBackStackImmediate(null, -1, 0);
    }
    public boolean popBackStackImmediate(int p0,int p1){
       this.checkStateLoss();
       this.execPendingActions();
       if (p0 >= 0) {
          return this.popBackStackImmediate(null, p0, p1);
       }
       throw new IllegalArgumentException("Bad id: "+p0);
    }
    public boolean popBackStackImmediate(String p0,int p1){
       this.checkStateLoss();
       return this.popBackStackImmediate(p0, -1, p1);
    }
    public final boolean popBackStackImmediate(String p0,int p1,int p2){
       this.execPendingActions();
       this.ensureExecReady(true);
       FragmentManagerImpl tmPrimaryNav = this.mPrimaryNav;
       if (tmPrimaryNav != null && (p1 < 0 && (p0 == null && tmPrimaryNav.getChildFragmentManager().popBackStackImmediate()))) {
          return true;
       }
       boolean b = this.popBackStackState(this.mTmpRecords, this.mTmpIsPop, p0, p1, p2);
       if (b) {
          this.mExecutingActions = true;
          this.removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
          this.cleanupExec();
       }
       this.updateOnBackPressedCallbackEnabled();
       this.doPendingDeferredStart();
       this.burpActive();
       return b;
    }
    public boolean popBackStackState(ArrayList p0,ArrayList p1,String p2,int p3,int p4){
       int i;
       FragmentManagerImpl tmBackStack = this.mBackStack;
       if (tmBackStack == null) {
          return false;
       }
       if (p2 == null && (p3 < 0 && !(p4 & 0x01))) {
          i = tmBackStack.size() - 1;
          if (i < 0) {
             return false;
          }else {
             p0.add(this.mBackStack.remove(i));
             p1.add(Boolean.TRUE);
          }
       }else if(p2 != null || p3 >= 0){
          int i1 = tmBackStack.size() - 1;
          while (i1 >= 0) {
             a uoa = this.mBackStack.get(i1);
             if (p2 != null && (p2.equals(uoa.getName()) || (p3 >= 0 && p3 == uoa.u))) {
                break ;
             }
             i1 = i1 - 1;
          }
          if (i1 < 0) {
             return false;
          }else if(p4 & 1){
             i1 = i1 - 1;
             while (i1 >= 0) {
                a uoa1 = this.mBackStack.get(i1);
                if (p2 == null || (p2.equals(uoa1.getName()) || (p3 >= 0 && p3 == uoa1.u))) {
                }
             }
          }
          i = i1;
       }else {
          i = -1;
       }
       if (i == (this.mBackStack.size() - 1)) {
          return false;
       }else {
          p3 = this.mBackStack.size() - 1;
          while (p3 > i) {
             p0.add(this.mBackStack.remove(p3));
             p1.add(Boolean.TRUE);
             p3--;
          }
       }
       return 1;
    }
    public final int postponePostponableTransactions(ArrayList p0,ArrayList p1,int p2,int p3,ArraySet p4){
       FragmentManagerImpl uFragmentMan;
       int i = p3 - 1;
       int i1 = p3;
       while (i >= p2) {
          a uoa = p0.get(i);
          boolean b = p1.get(i).booleanValue();
          if (uoa.P()) {
             int i2 = i + 1;
             if (!uoa.N(p0, i2, p3)) {
                uFragmentMan = 1;
             label_0027 :
                if (uFragmentMan) {
                   if (this.mPostponedTransactions == null) {
                      this.mPostponedTransactions = new ArrayList();
                   }
                   FragmentManagerImpl$m om = new FragmentManagerImpl$m(uoa, b);
                   this.mPostponedTransactions.add(om);
                   uoa.R(om);
                   if (b) {
                      uoa.J();
                   }else {
                      uoa.K(false);
                   }
                   i1 = i1 - 1;
                   if (i != i1) {
                      p0.remove(i);
                      p0.add(i1, uoa);
                   }
                   this.addAddedFragments(p4);
                }
                i = i - 1;
             }
          }
          uFragmentMan = null;
          goto label_0027 ;
       }
       return i1;
    }
    public void putFragment(Bundle p0,String p1,Fragment p2){
       if (p2.mFragmentManager != this) {
          this.throwException(new IllegalStateException("Fragment "+p2+" is not currently in the FragmentManager"));
       }
       p0.putString(p1, p2.mWho);
       return;
    }
    public void registerFragmentLifecycleCallbacks(c$b p0,boolean p1){
       this.mLifecycleCallbacks.add(new FragmentManagerImpl$i(p0, p1));
    }
    public void removeFragment(Fragment p0){
       if (FragmentManagerImpl.DEBUG) {
          StringBuilder str = "remove: "+p0+" nesting="+p0.mBackStackNesting;
       }
       int i = p0.isInBackStack() ^ 1;
       if (p0.mDetached == null || i) {
          FragmentManagerImpl tmAdded = this.mAdded;
          _monitor_enter(tmAdded);
          this.mAdded.remove(p0);
          _monitor_exit(tmAdded);
          if (this.isMenuAvailable(p0)) {
             this.mNeedMenuInvalidate = true;
          }
          p0.mAdded = false;
          p0.mRemoving = true;
       }
       return;
    }
    public void removeOnBackStackChangedListener(c$c p0){
       FragmentManagerImpl tmBackStackC = this.mBackStackChangeListeners;
       if (tmBackStackC != null) {
          tmBackStackC.remove(p0);
       }
       return;
    }
    public final void removeRedundantOperationsAndExecute(ArrayList p0,ArrayList p1){
       if (p0 == null || p0.isEmpty()) {
          return;
       }
       if (p1 == null || p0.size() != p1.size()) {
          throw new IllegalStateException("Internal error with the back stack records");
       }
       this.executePostponedTransaction(p0, p1);
       int i = p0.size();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          if (p0.get(i1).q == null) {
             if (i2 != i1) {
                this.executeOpsTogether(p0, p1, i2, i1);
             }
             i2 = i1 + 1;
             if (p1.get(i1).booleanValue()) {
                while (i2 < i && (p1.get(i2).booleanValue() && p0.get(i2).q == null)) {
                   i2 = i2 + 1;
                }
             }
             this.executeOpsTogether(p0, p1, i1, i2);
             i1 = i2 - 1;
          }
          i1 = i1 + 1;
       }
       if (i2 != i) {
          this.executeOpsTogether(p0, p1, i2, i);
       }
       return;
    }
    public void removeRetainedFragment(Fragment p0){
       if (this.isStateSaved()) {
          return;
       }
       if (this.mNonConfig.w0(p0) && FragmentManagerImpl.DEBUG) {
          "Updating retained Fragments: Removed "+p0;
       }
       return;
    }
    public void reportBackStackChanged(){
       if (this.mBackStackChangeListeners != null) {
          for (int i = 0; i < this.mBackStackChangeListeners.size(); i = i + 1) {
             this.mBackStackChangeListeners.get(i).a();
          }
       }
       return;
    }
    public void restoreAllState(Parcelable p0,c p1){
       if (this.mHost instanceof ViewModelStoreOwner) {
          this.throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
       }
       this.mNonConfig.x0(p1);
       this.restoreSaveState(p0);
       return;
    }
    public void restoreSaveState(Parcelable p0){
       FragmentState uFragmentSta;
       Fragment uFragment2;
       StringBuilder str4;
       if (p0 == null) {
          return;
       }
       if (p0.b == null) {
          return;
       }
       Iterator iterator = this.mNonConfig.s0().iterator();
       boolean b = true;
       boolean b1 = false;
       String str = null;
       while (iterator.hasNext()) {
          Fragment uFragment = iterator.next();
          if (FragmentManagerImpl.DEBUG) {
             StringBuilder str1 = "restoreSaveState: re-attaching retained "+uFragment;
          }
          Iterator iterator1 = p0.b.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                uFragmentSta = iterator1.next();
                if (!(uFragmentSta.c).equals(uFragment.mWho)) {
                   continue ;
                }
             }else {
                uFragmentSta = str;
             }
             if (uFragmentSta == null) {
                if (FragmentManagerImpl.DEBUG) {
                   StringBuilder str2 = "Discarding retained Fragment "+uFragment+" that was not found in the set of active Fragments "+p0.b;
                }
                int i = 0;
                FragmentManagerImpl uFragmentMan = this;
                Fragment uFragment1 = uFragment;
                uFragmentMan.moveToState(uFragment1, 1, i, 0, false);
                uFragment.mRemoving = b;
                uFragmentMan.moveToState(uFragment1, 0, i, 0, false);
             }else {
                uFragmentSta.o = uFragment;
                uFragment.mSavedViewState = str;
                uFragment.mBackStackNesting = b1;
                uFragment.mInLayout = b1;
                uFragment.mAdded = b1;
                Fragment mTarget = uFragment.mTarget;
                mTarget = (mTarget != null)? mTarget.mWho: str;
                uFragment.mTargetWho = mTarget;
                uFragment.mTarget = str;
                FragmentState n = uFragmentSta.n;
                if (n != null) {
                   n.setClassLoader(this.mHost.getContext().getClassLoader());
                   uFragment.mSavedViewState = uFragmentSta.n.getSparseParcelableArray("android:view_state");
                   uFragment.mSavedFragmentState = uFragmentSta.n;
                   continue ;
                }else {
                   continue ;
                }
             }
          }
       }
       this.mActive.clear();
       iterator = p0.b.iterator();
       while (iterator.hasNext()) {
          FragmentState uFragmentSta1 = iterator.next();
          if (uFragmentSta1 != null) {
             uFragment2 = uFragmentSta1.a(this.mHost.getContext().getClassLoader(), this.getFragmentFactory());
             uFragment2.mFragmentManager = this;
             if (FragmentManagerImpl.DEBUG) {
                str4 = "restoreSaveState: active \("+uFragment2.mWho+"\): "+uFragment2;
             }
             this.mActive.put(uFragment2.mWho, uFragment2);
             uFragmentSta1.o = str;
          }
       }
       this.mAdded.clear();
       FragmentManagerState c = p0.c;
       if (c != null) {
          iterator = c.iterator();
          while (true) {
             if (iterator.hasNext()) {
                String str5 = iterator.next();
                uFragment2 = this.mActive.get(str5);
                if (uFragment2 == null) {
                   this.throwException(new IllegalStateException("No instantiated fragment for \("+str5+"\)"));
                }
                uFragment2.mAdded = b;
                if (FragmentManagerImpl.DEBUG) {
                   str4 = "restoreSaveState: added \("+str5+"\): "+uFragment2;
                }
                if (!this.mAdded.contains(uFragment2)) {
                   FragmentManagerImpl tmAdded = this.mAdded;
                   _monitor_enter(tmAdded);
                   this.mAdded.add(uFragment2);
                   _monitor_exit(tmAdded);
                }else {
                   throw new IllegalStateException("Already added "+uFragment2);
                }
             }
          }
       }
       if (p0.d != null) {
          this.mBackStack = new ArrayList(p0.d.length);
          int i1 = 0;
          FragmentManagerState d = p0.d;
          while (i1 < d.length) {
             a uoa = d[i1].a(this);
             if (FragmentManagerImpl.DEBUG) {
                StringBuilder str3 = "restoreAllState: back stack #"+i1+" \(index "+uoa.u+"\): "+uoa;
                PrintWriter printWriter = new PrintWriter(new c("FragmentManager"));
                uoa.I("  ", printWriter, b1);
                printWriter.close();
             }
             this.mBackStack.add(uoa);
             a u = uoa.u;
             if (u >= null) {
                this.setBackStackIndex(u, uoa);
             }
             i1 = i1 + 1;
          }
       }else {
          this.mBackStack = str;
       }
       c = p0.e;
       if (c != null) {
          Fragment uFragment3 = this.mActive.get(c);
          this.mPrimaryNav = uFragment3;
          this.dispatchParentPrimaryNavigationFragmentChanged(uFragment3);
       }
       this.mNextFragmentIndex = p0.f;
       return;
    }
    public c retainNonConfig(){
       if (this.mHost instanceof ViewModelStoreOwner) {
          this.throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
       }
       return this.mNonConfig.t0();
    }
    public Parcelable saveAllState(){
       ArrayList uArrayList1;
       this.forcePostponedTransactions();
       this.endAnimatingAwayFragments();
       this.execPendingActions();
       this.mStateSaved = true;
       Parcelable parcelable = null;
       if (this.mActive.isEmpty()) {
          return parcelable;
       }
       ArrayList uArrayList = new ArrayList(this.mActive.size());
       Iterator iterator = this.mActive.values().iterator();
       int i = 0;
       Fragment uFragment = null;
       StringBuilder str = " was removed from the FragmentManager";
       String str1 = "Failure saving state: active ";
       while (iterator.hasNext()) {
          Fragment uFragment1 = iterator.next();
          if (uFragment1 != null) {
             if (uFragment1.mFragmentManager != this) {
                this.throwException(new IllegalStateException(str1+uFragment1+str));
             }
             FragmentState uFragmentSta = new FragmentState(uFragment1);
             uArrayList.add(uFragmentSta);
             if (uFragment1.mState > null && uFragmentSta.n == null) {
                uFragmentSta.n = this.saveFragmentBasicState(uFragment1);
                Fragment mTargetWho = uFragment1.mTargetWho;
                if (mTargetWho != null) {
                   mTargetWho = this.mActive.get(mTargetWho);
                   if (mTargetWho == null) {
                      this.throwException(new IllegalStateException("Failure saving state: "+uFragment1+" has target not in fragment manager: "+uFragment1.mTargetWho));
                   }
                   if (uFragmentSta.n == null) {
                      uFragmentSta.n = new Bundle();
                   }
                   this.putFragment(uFragmentSta.n, "android:target_state", mTargetWho);
                   mTargetWho = uFragment1.mTargetRequestCode;
                   if (mTargetWho != null) {
                      uFragmentSta.n.putInt("android:target_req_state", mTargetWho);
                   }
                }
             }else {
                uFragmentSta.n = uFragment1.mSavedFragmentState;
             }
             if (FragmentManagerImpl.DEBUG) {
                str = "Saved state of "+uFragment1+": "+uFragmentSta.n;
             }
             uFragment = 1;
          }
       }
       if (uFragment == null) {
          return parcelable;
       }
       int i1 = this.mAdded.size();
       if (i1 > 0) {
          uArrayList1 = new ArrayList(i1);
          Iterator iterator1 = this.mAdded.iterator();
          while (iterator1.hasNext()) {
             uFragment = iterator1.next();
             uArrayList1.add(uFragment.mWho);
             if (uFragment.mFragmentManager != this) {
                this.throwException(new IllegalStateException(str1+uFragment+str));
             }
             if (FragmentManagerImpl.DEBUG) {
                StringBuilder str2 = "saveAllState: adding fragment \("+uFragment.mWho+"\): "+uFragment;
             }
          }
       }else {
          uArrayList1 = parcelable;
       }
       FragmentManagerImpl tmBackStack = this.mBackStack;
       if (tmBackStack != null) {
          i1 = tmBackStack.size();
          if (i1 > 0) {
             parcelable = new BackStackState[i1];
             while (i < i1) {
                parcelable[i] = new BackStackState(this.mBackStack.get(i));
                if (FragmentManagerImpl.DEBUG) {
                   StringBuilder str3 = "saveAllState: adding back stack #"+i+": "+this.mBackStack.get(i);
                }
                i = i + 1;
             }
          }
       }
       FragmentManagerState uFragmentMan = new FragmentManagerState();
       uFragmentMan.b = uArrayList;
       uFragmentMan.c = uArrayList1;
       uFragmentMan.d = parcelable;
       FragmentManagerImpl tmPrimaryNav = this.mPrimaryNav;
       if (tmPrimaryNav != null) {
          uFragmentMan.e = tmPrimaryNav.mWho;
       }
       uFragmentMan.f = this.mNextFragmentIndex;
       return uFragmentMan;
    }
    public Bundle saveFragmentBasicState(Fragment p0){
       if (this.mStateBundle == null) {
          this.mStateBundle = new Bundle();
       }
       p0.performSaveInstanceState(this.mStateBundle);
       this.dispatchOnFragmentSaveInstanceState(p0, this.mStateBundle, false);
       Bundle uBundle = null;
       if (!this.mStateBundle.isEmpty()) {
          FragmentManagerImpl tmStateBundl = this.mStateBundle;
          this.mStateBundle = uBundle;
          uBundle = tmStateBundl;
       }
       if (p0.mView != null) {
          this.saveFragmentViewState(p0);
       }
       if (p0.mSavedViewState != null) {
          if (uBundle == null) {
             uBundle = new Bundle();
          }
          uBundle.putSparseParcelableArray("android:view_state", p0.mSavedViewState);
       }
       if (p0.mUserVisibleHint == null) {
          if (uBundle == null) {
             uBundle = new Bundle();
          }
          uBundle.putBoolean("android:user_visible_hint", p0.mUserVisibleHint);
       }
       return uBundle;
    }
    public Fragment$SavedState saveFragmentInstanceState(Fragment p0){
       if (p0.mFragmentManager != this) {
          this.throwException(new IllegalStateException("Fragment "+p0+" is not currently in the FragmentManager"));
       }
       Fragment$SavedState savedState = null;
       if (p0.mState > null) {
          Bundle uBundle = this.saveFragmentBasicState(p0);
          if (uBundle != null) {
             savedState = new Fragment$SavedState(uBundle);
          }
       }
       return savedState;
    }
    public void saveFragmentViewState(Fragment p0){
       if (p0.mInnerView == null) {
          return;
       }
       FragmentManagerImpl tmStateArray = this.mStateArray;
       if (tmStateArray == null) {
          this.mStateArray = new SparseArray();
       }else {
          tmStateArray.clear();
       }
       p0.mInnerView.saveHierarchyState(this.mStateArray);
       if (this.mStateArray.size() > 0) {
          p0.mSavedViewState = this.mStateArray;
          this.mStateArray = null;
       }
       return;
    }
    public void scheduleCommit(){
       _monitor_enter(this);
       FragmentManagerImpl tmPostponedT = this.mPostponedTransactions;
       FragmentManagerImpl uFragmentMan = null;
       tmPostponedT = (tmPostponedT != null && !tmPostponedT.isEmpty())? 1: null;
       FragmentManagerImpl tmPendingAct = this.mPendingActions;
       if (tmPendingAct != null && tmPendingAct.size() == 1) {
          uFragmentMan = 1;
       }
       if (tmPostponedT || uFragmentMan) {
          this.mHost.getHandler().removeCallbacks(this.mExecCommit);
          this.mHost.getHandler().post(this.mExecCommit);
          this.updateOnBackPressedCallbackEnabled();
       }
       _monitor_exit(this);
       return;
    }
    public void setBackStackIndex(int p0,a p1){
       _monitor_enter(this);
       if (this.mBackStackIndices == null) {
          this.mBackStackIndices = new ArrayList();
       }
       int i = this.mBackStackIndices.size();
       if (p0 < i) {
          if (FragmentManagerImpl.DEBUG) {
             StringBuilder str = "Setting back stack index "+p0+" to "+p1;
          }
          this.mBackStackIndices.set(p0, p1);
       }else {
          for (; i < p0; i = i + 1) {
             this.mBackStackIndices.add(null);
             if (this.mAvailBackStackIndices == null) {
                this.mAvailBackStackIndices = new ArrayList();
             }
             this.mAvailBackStackIndices.add(Integer.valueOf(i));
          }
          if (FragmentManagerImpl.DEBUG) {
             "Adding back stack index "+p0+" with "+p1;
          }
          this.mBackStackIndices.add(p1);
       }
       _monitor_exit(this);
       return;
    }
    public void setMaxLifecycle(Fragment p0,Lifecycle$State p1){
       if (this.mActive.get(p0.mWho) != p0 || (p0.mHost != null && p0.getFragmentManager() != this)) {
          throw new IllegalArgumentException("Fragment "+p0+" is not an active fragment of FragmentManager "+this);
       }
       p0.mMaxState = p1;
       return;
    }
    public void setPrimaryNavigationFragment(Fragment p0){
       if (p0 != null && (this.mActive.get(p0.mWho) != p0 || (p0.mHost != null && p0.getFragmentManager() != this))) {
          throw new IllegalArgumentException("Fragment "+p0+" is not an active fragment of FragmentManager "+this);
       }
       FragmentManagerImpl tmPrimaryNav = this.mPrimaryNav;
       this.mPrimaryNav = p0;
       this.dispatchParentPrimaryNavigationFragmentChanged(tmPrimaryNav);
       this.dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
       return;
    }
    public void showFragment(Fragment p0){
       if (FragmentManagerImpl.DEBUG) {
          StringBuilder str = "show: "+p0;
       }
       if (p0.mHidden != null) {
          p0.mHidden = false;
          p0.mHiddenChanged = p0.mHiddenChanged ^ 0x01;
       }
       return;
    }
    public void startPendingDeferredFragments(){
       Iterator iterator = this.mActive.values().iterator();
       while (iterator.hasNext()) {
          Fragment uFragment = iterator.next();
          if (uFragment != null) {
             this.performPendingDeferredStart(uFragment);
          }
       }
       return;
    }
    public final void throwException(RuntimeException p0){
       try{
          p0.getMessage();
          PrintWriter printWriter = new PrintWriter(new c("FragmentManager"));
          FragmentManagerImpl tmHost = this.mHost;
          int i = 0;
          if (tmHost != null) {
             String[] stringArray = new String[i];
             tmHost.onDump("  ", null, printWriter, stringArray);
          }else {
             String[] stringArray1 = new String[i];
             this.dump("  ", null, printWriter, stringArray1);
          }
          throw p0;
       }catch(java.lang.Exception e0){
       }
    }
    public String toString(){
       StringBuilder str = new StringBuilder(128)+"FragmentManager{"+Integer.toHexString(System.identityHashCode(this))+" in ";
       FragmentManagerImpl tmParent = this.mParent;
       if (tmParent != null) {
          b.a(tmParent, str);
       }else {
          b.a(this.mHost, str);
       }
       return str+"}}";
    }
    public void unregisterFragmentLifecycleCallbacks(c$b p0){
       FragmentManagerImpl tmLifecycleC = this.mLifecycleCallbacks;
       _monitor_enter(tmLifecycleC);
       int i = 0;
       int i1 = this.mLifecycleCallbacks.size();
       while (i < i1) {
          if (this.mLifecycleCallbacks.get(i).a == p0) {
             this.mLifecycleCallbacks.remove(i);
             break ;
          }else {
             i = i + 1;
          }
       }
       _monitor_exit(tmLifecycleC);
       return;
    }
    public final void updateOnBackPressedCallbackEnabled(){
       FragmentManagerImpl tmPendingAct = this.mPendingActions;
       boolean b = true;
       if (tmPendingAct != null && !tmPendingAct.isEmpty()) {
          this.mOnBackPressedCallback.f(b);
          return;
       }else {
          tmPendingAct = this.mOnBackPressedCallback;
          if (this.getBackStackEntryCount() <= 0 || !this.isPrimaryNavigation(this.mParent)) {
             b = false;
          }
          tmPendingAct.f(b);
          return;
       }
    }
}
