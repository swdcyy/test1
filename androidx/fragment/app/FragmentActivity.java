package androidx.fragment.app.FragmentActivity;
import androidx.core.app.a$c;
import androidx.core.app.a$e;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity$a;
import androidx.fragment.app.FragmentHostCallback;
import k2.b;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LifecycleOwner;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.fragment.app.c;
import androidx.lifecycle.Lifecycle$State;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.collection.SparseArrayCompat;
import java.lang.IllegalStateException;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import android.app.Activity;
import java.lang.System;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.app.Application;
import o2.a;
import android.content.Intent;
import androidx.core.app.a$d;
import androidx.core.app.a;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle$Event;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.app.g;
import android.content.IntentSender;

public class FragmentActivity extends ComponentActivity implements a$c, a$e	// class@000238
{
    public boolean mCreated;
    public final LifecycleRegistry mFragmentLifecycleRegistry;
    public final b mFragments;
    public int mNextCandidateRequestIndex;
    public SparseArrayCompat mPendingFragmentActivityResults;
    public boolean mRequestedPermissionsFromFragment;
    public boolean mResumed;
    public boolean mStartedActivityFromFragment;
    public boolean mStartedIntentSenderFromFragment;
    public boolean mStopped;

    public void FragmentActivity(){
       super();
       this.mFragments = b.b(new FragmentActivity$a(this));
       this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
       this.mStopped = true;
    }
    public void FragmentActivity(int p0){
       super(p0);
       this.mFragments = b.b(new FragmentActivity$a(this));
       this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
       this.mStopped = true;
    }
    public static void checkForValidRequestCode(int p0){
       if (!(p0 & 0xffff0000)) {
          return;
       }
       throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    public static boolean markState(c p0,Lifecycle$State p1){
       Iterator iterator = p0.getFragments().iterator();
       Fragment uFragment = null;
       while (iterator.hasNext()) {
          Fragment uFragment1 = iterator.next();
          if (uFragment1 == null) {
             continue ;
          }else if(uFragment1.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.STARTED)){
             uFragment1.mLifecycleRegistry.setCurrentState(p1);
             uFragment = 1;
          }
          if (uFragment1.getHost() != null) {
             uFragment = uFragment | FragmentActivity.markState(uFragment1.getChildFragmentManager(), p1);
          }
       }
       return uFragment;
    }
    public final int allocateRequestIndex(Fragment p0){
       if (this.mPendingFragmentActivityResults.size() >= 0xfffe) {
       label_002e :
          throw new IllegalStateException("Too many pending Fragment activity results.");
       }
       while (this.mPendingFragmentActivityResults.indexOfKey(this.mNextCandidateRequestIndex) >= 0) {
          int i = this.mNextCandidateRequestIndex + 1;
          i = i % 0xfffe;
          this.mNextCandidateRequestIndex = i;
       }
       FragmentActivity tmNextCandid = this.mNextCandidateRequestIndex;
       this.mPendingFragmentActivityResults.put(tmNextCandid, p0.mWho);
       this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 0xfffe;
       return tmNextCandid;
    }
    public final View dispatchFragmentsOnCreateView(View p0,String p1,Context p2,AttributeSet p3){
       return this.mFragments.w(p0, p1, p2, p3);
    }
    public void dump(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
       super.dump(p0, p1, p2, p3);
       p2.print(p0);
       p2.print("Local FragmentActivity ");
       p2.print(Integer.toHexString(System.identityHashCode(this)));
       p2.println(" State:");
       String str = p0+"  ";
       p2.print(str);
       p2.print("mCreated=");
       p2.print(this.mCreated);
       p2.print(" mResumed=");
       p2.print(this.mResumed);
       p2.print(" mStopped=");
       p2.print(this.mStopped);
       if (this.getApplication() != null) {
          a.c(this).b(str, p1, p2, p3);
       }
       this.mFragments.u().dump(p0, p1, p2, p3);
       return;
    }
    public c getSupportFragmentManager(){
       return this.mFragments.u();
    }
    public a getSupportLoaderManager(){
       return a.c(this);
    }
    public final void markFragmentsCreated(){
       do {
       } while (!FragmentActivity.markState(this.getSupportFragmentManager(), Lifecycle$State.CREATED));
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       this.mFragments.v();
       int i = p0 >> 16;
       if (i) {
          i = i - 1;
          String str = this.mPendingFragmentActivityResults.get(i);
          this.mPendingFragmentActivityResults.remove(i);
          if (str == null) {
             return;
          }
          Fragment uFragment = this.mFragments.t(str);
          if (uFragment != null) {
             uFragment.onActivityResult((p0 & 0xffff), p1, p2);
          }
          return;
       }else {
          a$d uod = a.c();
          if (uod != null && uod.onActivityResult(this, p0, p1, p2)) {
             return;
          }
          super.onActivityResult(p0, p1, p2);
          return;
       }
    }
    public void onAttachFragment(Fragment p0){
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       this.mFragments.v();
       this.mFragments.d(p0);
    }
    public void onCreate(Bundle p0){
       this.mFragments.a(null);
       int i = 0;
       if (p0 != null) {
          this.mFragments.x(p0.getParcelable("android:support:fragments"));
          String str = "android:support:next_request_index";
          if (p0.containsKey(str)) {
             this.mNextCandidateRequestIndex = p0.getInt(str);
             int[] intArray = p0.getIntArray("android:support:request_indicies");
             String[] stringArray = p0.getStringArray("android:support:request_fragment_who");
             if (intArray == null || (stringArray != null && intArray.length == stringArray.length)) {
                this.mPendingFragmentActivityResults = new SparseArrayCompat(intArray.length);
                for (int i1 = 0; i1 < intArray.length; i1 = i1 + 1) {
                   this.mPendingFragmentActivityResults.put(intArray[i1], stringArray[i1]);
                }
             }
          }
       }
       if (this.mPendingFragmentActivityResults == null) {
          this.mPendingFragmentActivityResults = new SparseArrayCompat();
          this.mNextCandidateRequestIndex = i;
       }
       super.onCreate(p0);
       this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_CREATE);
       this.mFragments.f();
       return;
    }
    public boolean onCreatePanelMenu(int p0,Menu p1){
       if (!p0) {
          return (super.onCreatePanelMenu(p0, p1) | this.mFragments.g(p1, this.getMenuInflater()));
       }
       return super.onCreatePanelMenu(p0, p1);
    }
    public View onCreateView(View p0,String p1,Context p2,AttributeSet p3){
       View view = this.dispatchFragmentsOnCreateView(p0, p1, p2, p3);
       if (view == null) {
          return super.onCreateView(p0, p1, p2, p3);
       }
       return view;
    }
    public View onCreateView(String p0,Context p1,AttributeSet p2){
       View view = this.dispatchFragmentsOnCreateView(null, p0, p1, p2);
       if (view == null) {
          return super.onCreateView(p0, p1, p2);
       }
       return view;
    }
    public void onDestroy(){
       super.onDestroy();
       this.mFragments.h();
       this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_DESTROY);
    }
    public void onLowMemory(){
       super.onLowMemory();
       this.mFragments.i();
    }
    public boolean onMenuItemSelected(int p0,MenuItem p1){
       if (super.onMenuItemSelected(p0, p1)) {
          return true;
       }
       if (!p0) {
          return this.mFragments.k(p1);
       }
       if (p0 != 6) {
          return false;
       }
       return this.mFragments.e(p1);
    }
    public void onMultiWindowModeChanged(boolean p0){
       this.mFragments.j(p0);
    }
    public void onNewIntent(Intent p0){
       super.onNewIntent(p0);
       this.mFragments.v();
    }
    public void onPanelClosed(int p0,Menu p1){
       if (p0) {
       }else {
          this.mFragments.l(p1);
       }
       super.onPanelClosed(p0, p1);
       return;
    }
    public void onPause(){
       super.onPause();
       this.mResumed = false;
       this.mFragments.m();
       this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_PAUSE);
    }
    public void onPictureInPictureModeChanged(boolean p0){
       this.mFragments.n(p0);
    }
    public void onPostResume(){
       super.onPostResume();
       this.onResumeFragments();
    }
    public boolean onPrepareOptionsPanel(View p0,Menu p1){
       return super.onPreparePanel(0, p0, p1);
    }
    public boolean onPreparePanel(int p0,View p1,Menu p2){
       if (!p0) {
          return (this.onPrepareOptionsPanel(p1, p2) | this.mFragments.o(p2));
       }
       return super.onPreparePanel(p0, p1, p2);
    }
    public void onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       this.mFragments.v();
       int i = (p0 >> 16) & 0xffff;
       if (i) {
          i = i - 1;
          String str = this.mPendingFragmentActivityResults.get(i);
          this.mPendingFragmentActivityResults.remove(i);
          if (str == null) {
             return;
          }else {
             Fragment uFragment = this.mFragments.t(str);
             if (uFragment != null) {
                uFragment.onRequestPermissionsResult((p0 & 0xffff), p1, p2);
             }
          }
       }
       return;
    }
    public void onResume(){
       super.onResume();
       this.mResumed = true;
       this.mFragments.v();
       this.mFragments.s();
    }
    public void onResumeFragments(){
       this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_RESUME);
       this.mFragments.p();
    }
    public void onSaveInstanceState(Bundle p0){
       super.onSaveInstanceState(p0);
       this.markFragmentsCreated();
       this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_STOP);
       Parcelable parcelable = this.mFragments.y();
       if (parcelable != null) {
          p0.putParcelable("android:support:fragments", parcelable);
       }
       if (this.mPendingFragmentActivityResults.size() > 0) {
          p0.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
          int[] ointArray = new int[this.mPendingFragmentActivityResults.size()];
          String[] stringArray = new String[this.mPendingFragmentActivityResults.size()];
          for (int i = 0; i < this.mPendingFragmentActivityResults.size(); i = i + 1) {
             ointArray[i] = this.mPendingFragmentActivityResults.keyAt(i);
             stringArray[i] = this.mPendingFragmentActivityResults.valueAt(i);
          }
          p0.putIntArray("android:support:request_indicies", ointArray);
          p0.putStringArray("android:support:request_fragment_who", stringArray);
       }
       return;
    }
    public void onStart(){
       super.onStart();
       this.mStopped = false;
       if (this.mCreated == null) {
          this.mCreated = true;
          this.mFragments.c();
       }
       this.mFragments.v();
       this.mFragments.s();
       this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_START);
       this.mFragments.q();
       return;
    }
    public void onStateNotSaved(){
       this.mFragments.v();
    }
    public void onStop(){
       super.onStop();
       this.mStopped = true;
       this.markFragmentsCreated();
       this.mFragments.r();
       this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle$Event.ON_STOP);
    }
    public void requestPermissionsFromFragment(Fragment p0,String[] p1,int p2){
       if (p2 == -1) {
          a.f(this, p1, p2);
          return;
       }else {
          FragmentActivity.checkForValidRequestCode(p2);
          this.mRequestedPermissionsFromFragment = true;
          a.f(this, p1, (((this.allocateRequestIndex(p0) + true) << 16) + (p2 & 0xffff)));
          this.mRequestedPermissionsFromFragment = false;
          return;
       }
    }
    public void setEnterSharedElementCallback(g p0){
       a.g(this, p0);
    }
    public void setExitSharedElementCallback(g p0){
       a.h(this, p0);
    }
    public void startActivityForResult(Intent p0,int p1){
       if (this.mStartedActivityFromFragment == null && p1 != -1) {
          FragmentActivity.checkForValidRequestCode(p1);
       }
       super.startActivityForResult(p0, p1);
       return;
    }
    public void startActivityForResult(Intent p0,int p1,Bundle p2){
       if (this.mStartedActivityFromFragment == null && p1 != -1) {
          FragmentActivity.checkForValidRequestCode(p1);
       }
       super.startActivityForResult(p0, p1, p2);
       return;
    }
    public void startActivityFromFragment(Fragment p0,Intent p1,int p2){
       this.startActivityFromFragment(p0, p1, p2, null);
    }
    public void startActivityFromFragment(Fragment p0,Intent p1,int p2,Bundle p3){
       boolean b = true;
       this.mStartedActivityFromFragment = b;
       if (p2 == -1) {
          a.j(this, p1, -1, p3);
          this.mStartedActivityFromFragment = false;
          return;
       }else {
          FragmentActivity.checkForValidRequestCode(p2);
          a.j(this, p1, (((this.allocateRequestIndex(p0) + b) << 16) + (p2 & 0xffff)), p3);
          this.mStartedActivityFromFragment = false;
          return;
       }
    }
    public void startIntentSenderForResult(IntentSender p0,int p1,Intent p2,int p3,int p4,int p5){
       if (this.mStartedIntentSenderFromFragment == null && p1 != -1) {
          FragmentActivity.checkForValidRequestCode(p1);
       }
       super.startIntentSenderForResult(p0, p1, p2, p3, p4, p5);
       return;
    }
    public void startIntentSenderForResult(IntentSender p0,int p1,Intent p2,int p3,int p4,int p5,Bundle p6){
       if (this.mStartedIntentSenderFromFragment == null && p1 != -1) {
          FragmentActivity.checkForValidRequestCode(p1);
       }
       super.startIntentSenderForResult(p0, p1, p2, p3, p4, p5, p6);
       return;
    }
    public void startIntentSenderFromFragment(Fragment p0,IntentSender p1,int p2,Intent p3,int p4,int p5,int p6,Bundle p7){
       int i = this;
       int i1 = p2;
       boolean b = true;
       i.mStartedIntentSenderFromFragment = b;
       if (i1 == -1) {
          a.k(this, p1, p2, p3, p4, p5, p6, p7);
          i.mStartedIntentSenderFromFragment = false;
          return;
       }else {
          FragmentActivity.checkForValidRequestCode(p2);
          a.k(this, p1, (((this.allocateRequestIndex(p0) + b) << 16) + (i1 & 0xffff)), p3, p4, p5, p6, p7);
          i.mStartedIntentSenderFromFragment = false;
          return;
       }
    }
    public void supportFinishAfterTransition(){
       a.b(this);
    }
    public void supportInvalidateOptionsMenu(){
       this.invalidateOptionsMenu();
    }
    public void supportPostponeEnterTransition(){
       a.d(this);
    }
    public void supportStartPostponedEnterTransition(){
       a.l(this);
    }
    public final void validateRequestPermissionsRequestCode(int p0){
       if (this.mRequestedPermissionsFromFragment == null && p0 != -1) {
          FragmentActivity.checkForValidRequestCode(p0);
       }
       return;
    }
}
