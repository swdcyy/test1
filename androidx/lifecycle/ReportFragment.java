package androidx.lifecycle.ReportFragment;
import android.app.Fragment;
import android.app.Activity;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.LifecycleRegistryOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import android.app.FragmentManager;
import java.lang.String;
import android.os.Build$VERSION;
import androidx.lifecycle.ReportFragment$LifecycleCallbacks;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.FragmentTransaction;
import androidx.lifecycle.ReportFragment$ActivityInitializationListener;
import android.os.Bundle;

public class ReportFragment extends Fragment	// class@0007f4
{
    public ReportFragment$ActivityInitializationListener mProcessListener;

    public void ReportFragment(){
       super();
    }
    public static void dispatch(Activity p0,Lifecycle$Event p1){
       if (p0 instanceof LifecycleRegistryOwner) {
          p0.getLifecycle().handleLifecycleEvent(p1);
          return;
       }else if(p0 instanceof LifecycleOwner){
          Lifecycle lifecycle = p0.getLifecycle();
          if (lifecycle instanceof LifecycleRegistry) {
             lifecycle.handleLifecycleEvent(p1);
          }
       }
       return;
    }
    public static ReportFragment get(Activity p0){
       return p0.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }
    public static void injectIfNeededIn(Activity p0){
       if (Build$VERSION.SDK_INT >= 29) {
          p0.registerActivityLifecycleCallbacks(new ReportFragment$LifecycleCallbacks());
       }
       FragmentManager fragmentMana = p0.getFragmentManager();
       String str = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
       if (fragmentMana.findFragmentByTag(str) == null) {
          fragmentMana.beginTransaction().add(new ReportFragment(), str).commit();
          fragmentMana.executePendingTransactions();
       }
       return;
    }
    public final void dispatch(Lifecycle$Event p0){
       if (Build$VERSION.SDK_INT < 29) {
          ReportFragment.dispatch(this.getActivity(), p0);
       }
       return;
    }
    public final void dispatchCreate(ReportFragment$ActivityInitializationListener p0){
       if (p0 != null) {
          p0.onCreate();
       }
       return;
    }
    public final void dispatchResume(ReportFragment$ActivityInitializationListener p0){
       if (p0 != null) {
          p0.onResume();
       }
       return;
    }
    public final void dispatchStart(ReportFragment$ActivityInitializationListener p0){
       if (p0 != null) {
          p0.onStart();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       super.onActivityCreated(p0);
       this.dispatchCreate(this.mProcessListener);
       this.dispatch(Lifecycle$Event.ON_CREATE);
    }
    public void onDestroy(){
       super.onDestroy();
       this.dispatch(Lifecycle$Event.ON_DESTROY);
       this.mProcessListener = null;
    }
    public void onPause(){
       super.onPause();
       this.dispatch(Lifecycle$Event.ON_PAUSE);
    }
    public void onResume(){
       super.onResume();
       this.dispatchResume(this.mProcessListener);
       this.dispatch(Lifecycle$Event.ON_RESUME);
    }
    public void onStart(){
       super.onStart();
       this.dispatchStart(this.mProcessListener);
       this.dispatch(Lifecycle$Event.ON_START);
    }
    public void onStop(){
       super.onStop();
       this.dispatch(Lifecycle$Event.ON_STOP);
    }
    public void setProcessListener(ReportFragment$ActivityInitializationListener p0){
       this.mProcessListener = p0;
    }
}
