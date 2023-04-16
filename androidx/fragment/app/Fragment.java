package androidx.fragment.app.Fragment;
import android.content.ComponentCallbacks;
import android.view.View$OnCreateContextMenuListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import y2.b;
import java.lang.Object;
import java.util.UUID;
import java.lang.String;
import androidx.fragment.app.FragmentManagerImpl;
import androidx.fragment.app.Fragment$a;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.MutableLiveData;
import android.content.Context;
import android.os.Bundle;
import java.lang.ClassLoader;
import java.lang.Class;
import androidx.fragment.app.b;
import java.lang.reflect.Constructor;
import androidx.fragment.app.Fragment$InstantiationException;
import java.lang.StringBuilder;
import java.lang.Exception;
import androidx.fragment.app.Fragment$d;
import androidx.fragment.app.Fragment$e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.Integer;
import android.view.View;
import o2.a;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentHostCallback;
import java.lang.Boolean;
import android.animation.Animator;
import androidx.fragment.app.c;
import java.lang.IllegalStateException;
import androidx.core.app.g;
import android.view.LayoutInflater;
import android.view.LayoutInflater$Factory2;
import a2.m;
import androidx.lifecycle.Lifecycle;
import android.content.res.Resources;
import androidx.savedstate.SavedStateRegistry;
import y2.a;
import java.util.HashMap;
import java.lang.CharSequence;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.LifecycleRegistry;
import androidx.fragment.app.Fragment$2;
import androidx.lifecycle.LifecycleObserver;
import android.os.IBinder;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.ContextMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.ViewGroup;
import ag6.a;
import android.util.AttributeSet;
import androidx.fragment.app.SuperNotCalledException;
import androidx.fragment.app.Fragment$c;
import k2.a;
import androidx.lifecycle.Lifecycle$Event;
import k2.g;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import android.util.SparseArray;
import androidx.fragment.app.Fragment$SavedState;
import java.lang.IllegalArgumentException;
import android.content.IntentSender;
import androidx.fragment.app.Fragment$b;
import z1.b;

public class Fragment implements ComponentCallbacks, View$OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, b	// class@00077f
{
    public boolean mAdded;
    public Fragment$d mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mCalled;
    public FragmentManagerImpl mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManagerImpl mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public FragmentHostCallback mHost;
    public boolean mInLayout;
    public View mInnerView;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public LifecycleRegistry mLifecycleRegistry;
    public Lifecycle$State mMaxState;
    public boolean mMenuVisible;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public a mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public SparseArray mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public g mViewLifecycleOwner;
    public MutableLiveData mViewLifecycleOwnerLiveData;
    public String mWho;
    public static final Object USE_DEFAULT_TRANSITION;

    static {
       Fragment.USE_DEFAULT_TRANSITION = new Object();
    }
    public void Fragment(){
       super();
       this.mState = 0;
       this.mWho = UUID.randomUUID().toString();
       this.mTargetWho = null;
       this.mIsPrimaryNavigationFragment = null;
       this.mChildFragmentManager = new FragmentManagerImpl();
       this.mMenuVisible = true;
       this.mUserVisibleHint = true;
       this.mPostponedDurationRunnable = new Fragment$a(this);
       this.mMaxState = Lifecycle$State.RESUMED;
       this.mViewLifecycleOwnerLiveData = new MutableLiveData();
       this.initLifecycle();
    }
    public void Fragment(int p0){
       super();
       this.mContentLayoutId = p0;
    }
    public static Fragment instantiate(Context p0,String p1){
       return Fragment.instantiate(p0, p1, null);
    }
    public static Fragment instantiate(Context p0,String p1,Bundle p2){
       String str = "Unable to instantiate fragment ";
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          Fragment uFragment = b.d(p0.getClassLoader(), p1).getConstructor(uClassArray).newInstance(objArray);
          if (p2 != null) {
             p2.setClassLoader(uFragment.getClass().getClassLoader());
             uFragment.setArguments(p2);
          }
          return uFragment;
       }catch(java.lang.InstantiationException e4){
          throw new Fragment$InstantiationException(str+p1+": make sure class name exists, is public, and has an empty constructor that is public", e4);
       }catch(java.lang.IllegalAccessException e4){
          throw new Fragment$InstantiationException(str+p1+": make sure class name exists, is public, and has an empty constructor that is public", e4);
       }catch(java.lang.NoSuchMethodException e4){
          throw new Fragment$InstantiationException(str+p1+": could not find Fragment constructor", e4);
       }catch(java.lang.reflect.InvocationTargetException e4){
          throw new Fragment$InstantiationException(str+p1+": calling Fragment constructor caused an exception", e4);
       }
    }
    public void callStartTransitionListener(){
       Fragment tmAnimationI = this.mAnimationInfo;
       Fragment$e uoe = null;
       if (tmAnimationI == null) {
       }else {
          tmAnimationI.q = false;
          Fragment$d r = tmAnimationI.r;
          tmAnimationI.r = uoe;
          uoe = r;
       }
       if (uoe != null) {
          uoe.b();
       }
       return;
    }
    public void dump(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
       p2.print(p0);
       p2.print("mFragmentId=#");
       p2.print(Integer.toHexString(this.mFragmentId));
       p2.print(" mContainerId=#");
       p2.print(Integer.toHexString(this.mContainerId));
       p2.print(" mTag=");
       p2.println(this.mTag);
       p2.print(p0);
       p2.print("mState=");
       p2.print(this.mState);
       p2.print(" mWho=");
       p2.print(this.mWho);
       p2.print(" mBackStackNesting=");
       p2.println(this.mBackStackNesting);
       p2.print(p0);
       p2.print("mAdded=");
       p2.print(this.mAdded);
       p2.print(" mRemoving=");
       p2.print(this.mRemoving);
       p2.print(" mFromLayout=");
       p2.print(this.mFromLayout);
       p2.print(" mInLayout=");
       p2.println(this.mInLayout);
       p2.print(p0);
       p2.print("mHidden=");
       p2.print(this.mHidden);
       p2.print(" mDetached=");
       p2.print(this.mDetached);
       p2.print(" mMenuVisible=");
       p2.print(this.mMenuVisible);
       p2.print(" mHasMenu=");
       p2.println(this.mHasMenu);
       p2.print(p0);
       p2.print("mRetainInstance=");
       p2.print(this.mRetainInstance);
       p2.print(" mUserVisibleHint=");
       p2.println(this.mUserVisibleHint);
       if (this.mFragmentManager != null) {
          p2.print(p0);
          p2.print("mFragmentManager=");
          p2.println(this.mFragmentManager);
       }
       if (this.mHost != null) {
          p2.print(p0);
          p2.print("mHost=");
          p2.println(this.mHost);
       }
       if (this.mParentFragment != null) {
          p2.print(p0);
          p2.print("mParentFragment=");
          p2.println(this.mParentFragment);
       }
       if (this.mArguments != null) {
          p2.print(p0);
          p2.print("mArguments=");
          p2.println(this.mArguments);
       }
       if (this.mSavedFragmentState != null) {
          p2.print(p0);
          p2.print("mSavedFragmentState=");
          p2.println(this.mSavedFragmentState);
       }
       if (this.mSavedViewState != null) {
          p2.print(p0);
          p2.print("mSavedViewState=");
          p2.println(this.mSavedViewState);
       }
       Fragment tarFragment = this.getTargetFragment();
       if (tarFragment != null) {
          p2.print(p0);
          p2.print("mTarget=");
          p2.print(tarFragment);
          p2.print(" mTargetRequestCode=");
          p2.println(this.mTargetRequestCode);
       }
       if (this.getNextAnim()) {
          p2.print(p0);
          p2.print("mNextAnim=");
          p2.println(this.getNextAnim());
       }
       if (this.mContainer != null) {
          p2.print(p0);
          p2.print("mContainer=");
          p2.println(this.mContainer);
       }
       if (this.mView != null) {
          p2.print(p0);
          p2.print("mView=");
          p2.println(this.mView);
       }
       if (this.mInnerView != null) {
          p2.print(p0);
          p2.print("mInnerView=");
          p2.println(this.mView);
       }
       if (this.getAnimatingAway() != null) {
          p2.print(p0);
          p2.print("mAnimatingAway=");
          p2.println(this.getAnimatingAway());
          p2.print(p0);
          p2.print("mStateAfterAnimating=");
          p2.println(this.getStateAfterAnimating());
       }
       if (this.getContext() != null) {
          a.c(this).b(p0, p1, p2, p3);
       }
       p2.print(p0);
       p2.println("Child "+this.mChildFragmentManager+":");
       this.mChildFragmentManager.dump(p0+"  ", p1, p2, p3);
       return;
    }
    public final Fragment$d ensureAnimationInfo(){
       if (this.mAnimationInfo == null) {
          this.mAnimationInfo = new Fragment$d();
       }
       return this.mAnimationInfo;
    }
    public final boolean equals(Object p0){
       return super.equals(p0);
    }
    public Fragment findFragmentByWho(String p0){
       if (p0.equals(this.mWho)) {
          return this;
       }
       return this.mChildFragmentManager.findFragmentByWho(p0);
    }
    public Activity getActivity(){
       return this.getActivity();
    }
    public final FragmentActivity getActivity(){
       Fragment tmHost = this.mHost;
       FragmentActivity uFragmentAct = (tmHost == null)? null: tmHost.getActivity();
       return uFragmentAct;
    }
    public boolean getAllowEnterTransitionOverlap(){
       boolean b;
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI != null) {
          Fragment$d n = tmAnimationI.n;
          if (n != null) {
             b = n.booleanValue();
          label_000f :
             return b;
          }
       }
       b = true;
       goto label_000f ;
    }
    public boolean getAllowReturnTransitionOverlap(){
       boolean b;
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI != null) {
          Fragment$d m = tmAnimationI.m;
          if (m != null) {
             b = m.booleanValue();
          label_000f :
             return b;
          }
       }
       b = true;
       goto label_000f ;
    }
    public View getAnimatingAway(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       return tmAnimationI.a;
    }
    public Animator getAnimator(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       return tmAnimationI.b;
    }
    public final Bundle getArguments(){
       return this.mArguments;
    }
    public final c getChildFragmentManager(){
       if (this.mHost != null) {
          return this.mChildFragmentManager;
       }
       throw new IllegalStateException("Fragment "+this+" has not been attached yet.");
    }
    public Context getContext(){
       Fragment tmHost = this.mHost;
       Context uContext = (tmHost == null)? null: tmHost.getContext();
       return uContext;
    }
    public Object getEnterTransition(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       return tmAnimationI.g;
    }
    public g getEnterTransitionCallback(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       return tmAnimationI.o;
    }
    public Object getExitTransition(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       return tmAnimationI.i;
    }
    public g getExitTransitionCallback(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       return tmAnimationI.p;
    }
    public final c getFragmentManager(){
       return this.mFragmentManager;
    }
    public final Object getHost(){
       Fragment tmHost = this.mHost;
       Object obj = (tmHost == null)? null: tmHost.onGetHost();
       return obj;
    }
    public final int getId(){
       return this.mFragmentId;
    }
    public final LayoutInflater getLayoutInflater(){
       Fragment tmLayoutInfl = this.mLayoutInflater;
       if (tmLayoutInfl == null) {
          tmLayoutInfl = this.performGetLayoutInflater(null);
       }
       return tmLayoutInfl;
    }
    public LayoutInflater getLayoutInflater(Bundle p0){
       Fragment tmHost = this.mHost;
       if (tmHost == null) {
          throw new IllegalStateException("onGetLayoutInflater\(\) cannot be executed until the Fragment is attached to the FragmentManager.");
       }
       LayoutInflater layoutInflat = tmHost.onGetLayoutInflater();
       m.b(layoutInflat, this.mChildFragmentManager.getLayoutInflaterFactory());
       return layoutInflat;
    }
    public Lifecycle getLifecycle(){
       return this.mLifecycleRegistry;
    }
    public a getLoaderManager(){
       return a.c(this);
    }
    public int getNextAnim(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return 0;
       }
       return tmAnimationI.d;
    }
    public int getNextTransition(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return 0;
       }
       return tmAnimationI.e;
    }
    public int getNextTransitionStyle(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return 0;
       }
       return tmAnimationI.f;
    }
    public final Fragment getParentFragment(){
       return this.mParentFragment;
    }
    public Object getReenterTransition(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       Fragment$d j = tmAnimationI.j;
       if (j == Fragment.USE_DEFAULT_TRANSITION) {
          j = this.getExitTransition();
       }
       return j;
    }
    public final Resources getResources(){
       return this.requireContext().getResources();
    }
    public final boolean getRetainInstance(){
       return this.mRetainInstance;
    }
    public Object getReturnTransition(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       Fragment$d h = tmAnimationI.h;
       if (h == Fragment.USE_DEFAULT_TRANSITION) {
          h = this.getEnterTransition();
       }
       return h;
    }
    public final SavedStateRegistry getSavedStateRegistry(){
       return this.mSavedStateRegistryController.b();
    }
    public Object getSharedElementEnterTransition(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       return tmAnimationI.k;
    }
    public Object getSharedElementReturnTransition(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return null;
       }
       Fragment$d l = tmAnimationI.l;
       if (l == Fragment.USE_DEFAULT_TRANSITION) {
          l = this.getSharedElementEnterTransition();
       }
       return l;
    }
    public int getStateAfterAnimating(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return 0;
       }
       return tmAnimationI.c;
    }
    public final String getString(int p0){
       return this.getResources().getString(p0);
    }
    public final String getString(int p0,Object[] p1){
       return this.getResources().getString(p0, p1);
    }
    public final String getTag(){
       return this.mTag;
    }
    public final Fragment getTargetFragment(){
       Fragment tmTarget = this.mTarget;
       if (tmTarget != null) {
          return tmTarget;
       }
       tmTarget = this.mFragmentManager;
       if (tmTarget != null) {
          Fragment tmTargetWho = this.mTargetWho;
          if (tmTargetWho != null) {
             return tmTarget.mActive.get(tmTargetWho);
          }
       }
       return null;
    }
    public final int getTargetRequestCode(){
       return this.mTargetRequestCode;
    }
    public final CharSequence getText(int p0){
       return this.getResources().getText(p0);
    }
    public boolean getUserVisibleHint(){
       return this.mUserVisibleHint;
    }
    public View getView(){
       return this.mView;
    }
    public LifecycleOwner getViewLifecycleOwner(){
       Fragment tmViewLifecy = this.mViewLifecycleOwner;
       if (tmViewLifecy != null) {
          return tmViewLifecy;
       }
       throw new IllegalStateException("Can\'t access the Fragment View\'s LifecycleOwner when getView\(\) is null i.e., before onCreateView\(\) or after onDestroyView\(\)");
    }
    public LiveData getViewLifecycleOwnerLiveData(){
       return this.mViewLifecycleOwnerLiveData;
    }
    public ViewModelStore getViewModelStore(){
       Fragment tmFragmentMa = this.mFragmentManager;
       if (tmFragmentMa != null) {
          return tmFragmentMa.getViewModelStore(this);
       }
       throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
    }
    public final boolean hasOptionsMenu(){
       return this.mHasMenu;
    }
    public final int hashCode(){
       return super.hashCode();
    }
    public final void initLifecycle(){
       this.mLifecycleRegistry = new LifecycleRegistry(this);
       this.mSavedStateRegistryController = a.a(this);
       this.mLifecycleRegistry.addObserver(new Fragment$2(this));
    }
    public void initState(){
       this.initLifecycle();
       this.mWho = UUID.randomUUID().toString();
       this.mAdded = false;
       this.mRemoving = false;
       this.mFromLayout = false;
       this.mInLayout = false;
       this.mRestored = false;
       this.mBackStackNesting = 0;
       this.mFragmentManager = null;
       this.mChildFragmentManager = new FragmentManagerImpl();
       this.mHost = null;
       this.mFragmentId = 0;
       this.mContainerId = 0;
       this.mTag = null;
       this.mHidden = false;
       this.mDetached = false;
    }
    public final boolean isAdded(){
       boolean b = (this.mHost != null && this.mAdded != null)? true: false;
       return b;
    }
    public final boolean isDetached(){
       return this.mDetached;
    }
    public final boolean isHidden(){
       return this.mHidden;
    }
    public boolean isHideReplaced(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return false;
       }
       return tmAnimationI.s;
    }
    public final boolean isInBackStack(){
       boolean b = (this.mBackStackNesting > null)? true: false;
       return b;
    }
    public final boolean isInLayout(){
       return this.mInLayout;
    }
    public final boolean isMenuVisible(){
       return this.mMenuVisible;
    }
    public boolean isPostponed(){
       Fragment tmAnimationI = this.mAnimationInfo;
       if (tmAnimationI == null) {
          return false;
       }
       return tmAnimationI.q;
    }
    public final boolean isRemoving(){
       return this.mRemoving;
    }
    public final boolean isResumed(){
       boolean b = (this.mState >= 4)? true: false;
       return b;
    }
    public final boolean isStateSaved(){
       Fragment tmFragmentMa = this.mFragmentManager;
       if (tmFragmentMa == null) {
          return false;
       }
       return tmFragmentMa.isStateSaved();
    }
    public final boolean isVisible(){
       boolean b;
       if (this.isAdded() && !this.isHidden()) {
          Fragment tmView = this.mView;
          if (tmView != null && (tmView.getWindowToken() != null && !this.mView.getVisibility())) {
             b = true;
          label_0021 :
             return b;
          }
       }
    label_0020 :
       b = false;
       goto label_0021 ;
    }
    public void noteStateNotSaved(){
       this.mChildFragmentManager.noteStateNotSaved();
    }
    public void onActivityCreated(Bundle p0){
       this.mCalled = true;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
    }
    public void onAttach(Activity p0){
       this.mCalled = true;
    }
    public void onAttach(Context p0){
       this.mCalled = true;
       Fragment tmHost = this.mHost;
       Activity uActivity = (tmHost == null)? null: tmHost.getActivity();
       if (uActivity != null) {
          this.mCalled = false;
          this.onAttach(uActivity);
       }
       return;
    }
    public void onAttachFragment(Fragment p0){
    }
    public void onConfigurationChanged(Configuration p0){
       this.mCalled = true;
    }
    public boolean onContextItemSelected(MenuItem p0){
       return false;
    }
    public void onCreate(Bundle p0){
       this.mCalled = true;
       this.restoreChildFragmentState(p0);
       if (!this.mChildFragmentManager.isStateAtLeast(true)) {
          this.mChildFragmentManager.dispatchCreate();
       }
       return;
    }
    public Animation onCreateAnimation(int p0,boolean p1,int p2){
       return null;
    }
    public Animator onCreateAnimator(int p0,boolean p1,int p2){
       return null;
    }
    public void onCreateContextMenu(ContextMenu p0,View p1,ContextMenu$ContextMenuInfo p2){
       this.requireActivity().onCreateContextMenu(p0, p1, p2);
    }
    public void onCreateOptionsMenu(Menu p0,MenuInflater p1){
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Fragment tmContentLay = this.mContentLayoutId;
       if (tmContentLay != null) {
          return a.c(p0, tmContentLay, p1, false);
       }
       return null;
    }
    public void onDestroy(){
       this.mCalled = true;
    }
    public void onDestroyOptionsMenu(){
    }
    public void onDestroyView(){
       this.mCalled = true;
    }
    public void onDetach(){
       this.mCalled = true;
    }
    public LayoutInflater onGetLayoutInflater(Bundle p0){
       return this.getLayoutInflater(p0);
    }
    public void onHiddenChanged(boolean p0){
    }
    public void onInflate(Activity p0,AttributeSet p1,Bundle p2){
       this.mCalled = true;
    }
    public void onInflate(Context p0,AttributeSet p1,Bundle p2){
       this.mCalled = true;
       Fragment tmHost = this.mHost;
       Activity uActivity = (tmHost == null)? null: tmHost.getActivity();
       if (uActivity != null) {
          this.mCalled = false;
          this.onInflate(uActivity, p1, p2);
       }
       return;
    }
    public void onLowMemory(){
       this.mCalled = true;
    }
    public void onMultiWindowModeChanged(boolean p0){
    }
    public boolean onOptionsItemSelected(MenuItem p0){
       return false;
    }
    public void onOptionsMenuClosed(Menu p0){
    }
    public void onPause(){
       this.mCalled = true;
    }
    public void onPictureInPictureModeChanged(boolean p0){
    }
    public void onPrepareOptionsMenu(Menu p0){
    }
    public void onPrimaryNavigationFragmentChanged(boolean p0){
    }
    public void onRequestPermissionsResult(int p0,String[] p1,int[] p2){
    }
    public void onResume(){
       this.mCalled = true;
    }
    public void onSaveInstanceState(Bundle p0){
    }
    public void onStart(){
       this.mCalled = true;
    }
    public void onStop(){
       this.mCalled = true;
    }
    public void onViewCreated(View p0,Bundle p1){
    }
    public void onViewStateRestored(Bundle p0){
       this.mCalled = true;
    }
    public void performActivityCreated(Bundle p0){
       this.mChildFragmentManager.noteStateNotSaved();
       this.mState = 2;
       this.mCalled = false;
       this.onActivityCreated(p0);
       if (this.mCalled == null) {
          throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onActivityCreated\(\)");
       }
       this.mChildFragmentManager.dispatchActivityCreated();
       return;
    }
    public void performAttach(){
       this.mChildFragmentManager.attachController(this.mHost, new Fragment$c(this), this);
       this.mCalled = false;
       this.onAttach(this.mHost.getContext());
       if (this.mCalled != null) {
          return;
       }
       throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onAttach\(\)");
    }
    public void performConfigurationChanged(Configuration p0){
       this.onConfigurationChanged(p0);
       this.mChildFragmentManager.dispatchConfigurationChanged(p0);
    }
    public boolean performContextItemSelected(MenuItem p0){
       if (this.mHidden == null) {
          if (this.onContextItemSelected(p0)) {
             return true;
          }else if(this.mChildFragmentManager.dispatchContextItemSelected(p0)){
             return true;
          }
       }
       return false;
    }
    public void performCreate(Bundle p0){
       this.mChildFragmentManager.noteStateNotSaved();
       int i = 1;
       this.mState = i;
       this.mCalled = false;
       this.mSavedStateRegistryController.c(p0);
       this.onCreate(p0);
       this.mIsCreated = i;
       if (this.mCalled == null) {
          throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onCreate\(\)");
       }
       this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_CREATE);
       return;
    }
    public boolean performCreateOptionsMenu(Menu p0,MenuInflater p1){
       int i = 0;
       if (this.mHidden == null) {
          if (this.mHasMenu != null && this.mMenuVisible != null) {
             i = 1;
             this.onCreateOptionsMenu(p0, p1);
          }
          i = i | this.mChildFragmentManager.dispatchCreateOptionsMenu(p0, p1);
       }
       return i;
    }
    public void performCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       this.mChildFragmentManager.noteStateNotSaved();
       this.mPerformedCreateView = true;
       this.mViewLifecycleOwner = new g();
       View view = this.onCreateView(p0, p1, p2);
       this.mView = view;
       if (view != null) {
          this.mViewLifecycleOwner.b();
          this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
       }else if(!this.mViewLifecycleOwner.c()){
          this.mViewLifecycleOwner = null;
       }else {
          throw new IllegalStateException("Called getViewLifecycleOwner\(\) but onCreateView\(\) returned null");
       }
       return;
    }
    public void performDestroy(){
       this.mChildFragmentManager.dispatchDestroy();
       this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_DESTROY);
       this.mState = 0;
       this.mCalled = false;
       this.mIsCreated = false;
       this.onDestroy();
       if (this.mCalled != null) {
          return;
       }
       throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onDestroy\(\)");
    }
    public void performDestroyView(){
       this.mChildFragmentManager.dispatchDestroyView();
       if (this.mView != null) {
          this.mViewLifecycleOwner.a(Lifecycle$Event.ON_DESTROY);
       }
       this.mState = 1;
       boolean b = false;
       this.mCalled = b;
       this.onDestroyView();
       if (this.mCalled != null) {
          a.c(this).f();
          this.mPerformedCreateView = b;
          return;
       }else {
          throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onDestroyView\(\)");
       }
    }
    public void performDetach(){
       this.mCalled = false;
       this.onDetach();
       this.mLayoutInflater = null;
       if (this.mCalled == null) {
          throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onDetach\(\)");
       }
       if (!this.mChildFragmentManager.isDestroyed()) {
          this.mChildFragmentManager.dispatchDestroy();
          this.mChildFragmentManager = new FragmentManagerImpl();
       }
       return;
    }
    public LayoutInflater performGetLayoutInflater(Bundle p0){
       LayoutInflater layoutInflat = this.onGetLayoutInflater(p0);
       this.mLayoutInflater = layoutInflat;
       return layoutInflat;
    }
    public void performLowMemory(){
       this.onLowMemory();
       this.mChildFragmentManager.dispatchLowMemory();
    }
    public void performMultiWindowModeChanged(boolean p0){
       this.onMultiWindowModeChanged(p0);
       this.mChildFragmentManager.dispatchMultiWindowModeChanged(p0);
    }
    public boolean performOptionsItemSelected(MenuItem p0){
       if (this.mHidden == null) {
          if (this.mHasMenu != null && (this.mMenuVisible != null && this.onOptionsItemSelected(p0))) {
             return true;
          }else if(this.mChildFragmentManager.dispatchOptionsItemSelected(p0)){
             return true;
          }
       }
       return false;
    }
    public void performOptionsMenuClosed(Menu p0){
       if (this.mHidden == null) {
          if (this.mHasMenu != null && this.mMenuVisible != null) {
             this.onOptionsMenuClosed(p0);
          }
          this.mChildFragmentManager.dispatchOptionsMenuClosed(p0);
       }
       return;
    }
    public void performPause(){
       this.mChildFragmentManager.dispatchPause();
       if (this.mView != null) {
          this.mViewLifecycleOwner.a(Lifecycle$Event.ON_PAUSE);
       }
       this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_PAUSE);
       this.mState = 3;
       this.mCalled = false;
       this.onPause();
       if (this.mCalled != null) {
          return;
       }else {
          throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onPause\(\)");
       }
    }
    public void performPictureInPictureModeChanged(boolean p0){
       this.onPictureInPictureModeChanged(p0);
       this.mChildFragmentManager.dispatchPictureInPictureModeChanged(p0);
    }
    public boolean performPrepareOptionsMenu(Menu p0){
       int i = 0;
       if (this.mHidden == null) {
          if (this.mHasMenu != null && this.mMenuVisible != null) {
             i = 1;
             this.onPrepareOptionsMenu(p0);
          }
          i = i | this.mChildFragmentManager.dispatchPrepareOptionsMenu(p0);
       }
       return i;
    }
    public void performPrimaryNavigationFragmentChanged(){
       boolean b = this.mFragmentManager.isPrimaryNavigation(this);
       Fragment tmIsPrimaryN = this.mIsPrimaryNavigationFragment;
       if (tmIsPrimaryN == null || tmIsPrimaryN.booleanValue() != b) {
          this.mIsPrimaryNavigationFragment = Boolean.valueOf(b);
          this.onPrimaryNavigationFragmentChanged(b);
          this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
       }
       return;
    }
    public void performResume(){
       this.mChildFragmentManager.noteStateNotSaved();
       this.mChildFragmentManager.execPendingActions();
       this.mState = 4;
       this.mCalled = false;
       this.onResume();
       if (this.mCalled == null) {
          throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onResume\(\)");
       }
       Lifecycle$Event oN_RESUME = Lifecycle$Event.ON_RESUME;
       this.mLifecycleRegistry.handleLifecycleEvent(oN_RESUME);
       if (this.mView != null) {
          this.mViewLifecycleOwner.a(oN_RESUME);
       }
       this.mChildFragmentManager.dispatchResume();
       this.mChildFragmentManager.execPendingActions();
       return;
    }
    public void performSaveInstanceState(Bundle p0){
       this.onSaveInstanceState(p0);
       this.mSavedStateRegistryController.d(p0);
       Parcelable parcelable = this.mChildFragmentManager.saveAllState();
       if (parcelable != null) {
          p0.putParcelable("android:support:fragments", parcelable);
       }
       return;
    }
    public void performStart(){
       this.mChildFragmentManager.noteStateNotSaved();
       this.mChildFragmentManager.execPendingActions();
       this.mState = 3;
       this.mCalled = false;
       this.onStart();
       if (this.mCalled == null) {
          throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onStart\(\)");
       }
       Lifecycle$Event oN_START = Lifecycle$Event.ON_START;
       this.mLifecycleRegistry.handleLifecycleEvent(oN_START);
       if (this.mView != null) {
          this.mViewLifecycleOwner.a(oN_START);
       }
       this.mChildFragmentManager.dispatchStart();
       return;
    }
    public void performStop(){
       this.mChildFragmentManager.dispatchStop();
       if (this.mView != null) {
          this.mViewLifecycleOwner.a(Lifecycle$Event.ON_STOP);
       }
       this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_STOP);
       this.mState = 2;
       this.mCalled = false;
       this.onStop();
       if (this.mCalled != null) {
          return;
       }else {
          throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onStop\(\)");
       }
    }
    public void postponeEnterTransition(){
       this.ensureAnimationInfo().q = true;
    }
    public final void postponeEnterTransition(long p0,TimeUnit p1){
       this.ensureAnimationInfo().q = true;
       Fragment tmFragmentMa = this.mFragmentManager;
       Handler handler = (tmFragmentMa != null)? tmFragmentMa.mHost.getHandler(): new Handler(Looper.getMainLooper());
       handler.removeCallbacks(this.mPostponedDurationRunnable);
       handler.postDelayed(this.mPostponedDurationRunnable, p1.toMillis(p0));
       return;
    }
    public void registerForContextMenu(View p0){
       p0.setOnCreateContextMenuListener(this);
    }
    public final void requestPermissions(String[] p0,int p1){
       Fragment tmHost = this.mHost;
       if (tmHost == null) {
          throw new IllegalStateException("Fragment "+this+" not attached to Activity");
       }
       tmHost.onRequestPermissionsFromFragment(this, p0, p1);
       return;
    }
    public final FragmentActivity requireActivity(){
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          return activity;
       }
       throw new IllegalStateException("Fragment "+this+" not attached to an activity.");
    }
    public final Bundle requireArguments(){
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          return arguments;
       }
       throw new IllegalStateException("Fragment "+this+" does not have any arguments.");
    }
    public final Context requireContext(){
       Context context = this.getContext();
       if (context != null) {
          return context;
       }
       throw new IllegalStateException("Fragment "+this+" not attached to a context.");
    }
    public final c requireFragmentManager(){
       c fragmentMana = this.getFragmentManager();
       if (fragmentMana != null) {
          return fragmentMana;
       }
       throw new IllegalStateException("Fragment "+this+" not associated with a fragment manager.");
    }
    public final Object requireHost(){
       Object host = this.getHost();
       if (host != null) {
          return host;
       }
       throw new IllegalStateException("Fragment "+this+" not attached to a host.");
    }
    public final Fragment requireParentFragment(){
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme != null) {
          return parentFragme;
       }
       String str = "Fragment ";
       if (this.getContext() == null) {
          throw new IllegalStateException(str+this+" is not attached to any Fragment or host");
       }
       throw new IllegalStateException(str+this+" is not a child Fragment, it is directly attached to "+this.getContext());
    }
    public final View requireView(){
       View view = this.getView();
       if (view != null) {
          return view;
       }
       throw new IllegalStateException("Fragment "+this+" did not return a View from onCreateView\(\) or this was called before onCreateView\(\).");
    }
    public void restoreChildFragmentState(Bundle p0){
       if (p0 != null) {
          Parcelable parcelable = p0.getParcelable("android:support:fragments");
          if (parcelable != null) {
             this.mChildFragmentManager.restoreSaveState(parcelable);
             this.mChildFragmentManager.dispatchCreate();
          }
       }
       return;
    }
    public final void restoreViewState(Bundle p0){
       Fragment tmSavedViewS = this.mSavedViewState;
       if (tmSavedViewS != null) {
          this.mInnerView.restoreHierarchyState(tmSavedViewS);
          this.mSavedViewState = null;
       }
       this.mCalled = false;
       this.onViewStateRestored(p0);
       if (this.mCalled != null) {
          if (this.mView != null) {
             this.mViewLifecycleOwner.a(Lifecycle$Event.ON_CREATE);
          }
          return;
       }else {
          throw new SuperNotCalledException("Fragment "+this+" did not call through to super.onViewStateRestored\(\)");
       }
    }
    public void setAllowEnterTransitionOverlap(boolean p0){
       this.ensureAnimationInfo().n = Boolean.valueOf(p0);
    }
    public void setAllowReturnTransitionOverlap(boolean p0){
       this.ensureAnimationInfo().m = Boolean.valueOf(p0);
    }
    public void setAnimatingAway(View p0){
       this.ensureAnimationInfo().a = p0;
    }
    public void setAnimator(Animator p0){
       this.ensureAnimationInfo().b = p0;
    }
    public void setArguments(Bundle p0){
       if (this.mFragmentManager != null && this.isStateSaved()) {
          throw new IllegalStateException("Fragment already added and state has been saved");
       }
       this.mArguments = p0;
       return;
    }
    public void setEnterSharedElementCallback(g p0){
       this.ensureAnimationInfo().o = p0;
    }
    public void setEnterTransition(Object p0){
       this.ensureAnimationInfo().g = p0;
    }
    public void setExitSharedElementCallback(g p0){
       this.ensureAnimationInfo().p = p0;
    }
    public void setExitTransition(Object p0){
       this.ensureAnimationInfo().i = p0;
    }
    public void setHasOptionsMenu(boolean p0){
       if (this.mHasMenu != p0) {
          this.mHasMenu = p0;
          if (this.isAdded() && !this.isHidden()) {
             this.mHost.onSupportInvalidateOptionsMenu();
          }
       }
       return;
    }
    public void setHideReplaced(boolean p0){
       this.ensureAnimationInfo().s = p0;
    }
    public void setInitialSavedState(Fragment$SavedState p0){
       if (this.mFragmentManager != null) {
          throw new IllegalStateException("Fragment already added");
       }
       if (p0 != null) {
          p0 = p0.b;
          if (p0 != null) {
          label_000c :
             this.mSavedFragmentState = p0;
             return;
          }
       }
       Bundle uBundle = null;
       goto label_000c ;
    }
    public void setMenuVisibility(boolean p0){
       if (this.mMenuVisible != p0) {
          this.mMenuVisible = p0;
          if (this.mHasMenu != null && (this.isAdded() && !this.isHidden())) {
             this.mHost.onSupportInvalidateOptionsMenu();
          }
       }
       return;
    }
    public void setNextAnim(int p0){
       if (this.mAnimationInfo == null && !p0) {
          return;
       }
       this.ensureAnimationInfo().d = p0;
       return;
    }
    public void setNextTransition(int p0,int p1){
       if (this.mAnimationInfo == null && (!p0 && !p1)) {
          return;
       }
       this.ensureAnimationInfo();
       Fragment tmAnimationI = this.mAnimationInfo;
       tmAnimationI.e = p0;
       tmAnimationI.f = p1;
       return;
    }
    public void setOnStartEnterTransitionListener(Fragment$e p0){
       this.ensureAnimationInfo();
       Fragment tmAnimationI = this.mAnimationInfo;
       Fragment$d r = tmAnimationI.r;
       if (p0 == r) {
          return;
       }
       if (p0 != null && r != null) {
          throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on "+this);
       }
       if (tmAnimationI.q != null) {
          tmAnimationI.r = p0;
       }
       if (p0 != null) {
          p0.a();
       }
       return;
    }
    public void setReenterTransition(Object p0){
       this.ensureAnimationInfo().j = p0;
    }
    public void setRetainInstance(boolean p0){
       this.mRetainInstance = p0;
       Fragment tmFragmentMa = this.mFragmentManager;
       if (tmFragmentMa != null) {
          if (p0) {
             tmFragmentMa.addRetainedFragment(this);
          }else {
             tmFragmentMa.removeRetainedFragment(this);
          }
       }else {
          this.mRetainInstanceChangedWhileDetached = true;
       }
       return;
    }
    public void setReturnTransition(Object p0){
       this.ensureAnimationInfo().h = p0;
    }
    public void setSharedElementEnterTransition(Object p0){
       this.ensureAnimationInfo().k = p0;
    }
    public void setSharedElementReturnTransition(Object p0){
       this.ensureAnimationInfo().l = p0;
    }
    public void setStateAfterAnimating(int p0){
       this.ensureAnimationInfo().c = p0;
    }
    public void setTargetFragment(Fragment p0,int p1){
       c fragmentMana = this.getFragmentManager();
       String str = null;
       c fragmentMana1 = (p0 != null)? p0.getFragmentManager(): str;
       if (fragmentMana != null && (fragmentMana1 == null || fragmentMana == fragmentMana1)) {
          Fragment uFragment = p0;
          while (true) {
             if (uFragment != null) {
                if (uFragment != this) {
                   uFragment = uFragment.getTargetFragment();
                }else {
                   throw new IllegalArgumentException("Setting "+p0+" as the target of "+this+" would create a target cycle");
                }
             }else if(p0 == null){
                this.mTargetWho = str;
                this.mTarget = str;
                break ;
             }else if(this.mFragmentManager != null && p0.mFragmentManager != null){
                this.mTargetWho = p0.mWho;
                this.mTarget = str;
                break ;
             }else {
                this.mTargetWho = str;
                this.mTarget = p0;
                break ;
             }
          }
          this.mTargetRequestCode = p1;
          return;
       }else {
          throw new IllegalArgumentException("Fragment "+p0+" must share the same FragmentManager to be set as a target fragment");
       }
    }
    public void setUserVisibleHint(boolean p0){
       if (this.mUserVisibleHint == null && (p0 && (this.mState < 3 && (this.mFragmentManager != null && (this.isAdded() && this.mIsCreated != null))))) {
          this.mFragmentManager.performPendingDeferredStart(this);
       }
    label_001e :
       this.mUserVisibleHint = p0;
       boolean b = (this.mState < 3 && !p0)? true: false;
       this.mDeferStart = b;
       if (this.mSavedFragmentState != null) {
          this.mSavedUserVisibleHint = Boolean.valueOf(p0);
       }
       return;
    }
    public boolean shouldShowRequestPermissionRationale(String p0){
       Fragment tmHost = this.mHost;
       if (tmHost != null) {
          return tmHost.onShouldShowRequestPermissionRationale(p0);
       }
       return false;
    }
    public void startActivity(Intent p0){
       this.startActivity(p0, null);
    }
    public void startActivity(Intent p0,Bundle p1){
       Fragment tmHost = this.mHost;
       if (tmHost == null) {
          throw new IllegalStateException("Fragment "+this+" not attached to Activity");
       }
       tmHost.onStartActivityFromFragment(this, p0, -1, p1);
       return;
    }
    public void startActivityForResult(Intent p0,int p1){
       this.startActivityForResult(p0, p1, null);
    }
    public void startActivityForResult(Intent p0,int p1,Bundle p2){
       Fragment tmHost = this.mHost;
       if (tmHost == null) {
          throw new IllegalStateException("Fragment "+this+" not attached to Activity");
       }
       tmHost.onStartActivityFromFragment(this, p0, p1, p2);
       return;
    }
    public void startIntentSenderForResult(IntentSender p0,int p1,Intent p2,int p3,int p4,int p5,Bundle p6){
       Fragment mHost = this.mHost;
       if (mHost == null) {
          throw new IllegalStateException("Fragment "+this+" not attached to Activity");
       }
       mHost.onStartIntentSenderFromFragment(this, p0, p1, p2, p3, p4, p5, p6);
       return;
    }
    public void startPostponedEnterTransition(){
       Fragment tmFragmentMa = this.mFragmentManager;
       if (tmFragmentMa == null || tmFragmentMa.mHost == null) {
          this.ensureAnimationInfo().q = false;
       }else if(Looper.myLooper() != this.mFragmentManager.mHost.getHandler().getLooper()){
          this.mFragmentManager.mHost.getHandler().postAtFrontOfQueue(new Fragment$b(this));
       }else {
          this.callStartTransitionListener();
       }
       return;
    }
    public String toString(){
       StringBuilder str = new StringBuilder(128);
       b.a(this, str);
       str = str+" \("+this.mWho+"\)";
       if (this.mFragmentId != null) {
          str = str+" id=0x"+Integer.toHexString(this.mFragmentId);
       }
       if (this.mTag != null) {
          str = str+" "+this.mTag;
       }
       return str+'}';
    }
    public void unregisterForContextMenu(View p0){
       p0.setOnCreateContextMenuListener(null);
    }
}
