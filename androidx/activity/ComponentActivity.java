package androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStoreOwner;
import y2.b;
import o0.c;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LifecycleOwner;
import y2.a;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.ComponentActivity$a;
import java.lang.Runnable;
import androidx.lifecycle.Lifecycle;
import android.os.Build$VERSION;
import androidx.activity.ComponentActivity$2;
import androidx.lifecycle.LifecycleObserver;
import androidx.activity.ComponentActivity$3;
import androidx.activity.ImmLeaksCleaner;
import android.app.Activity;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Object;
import androidx.activity.ComponentActivity$b;
import androidx.savedstate.SavedStateRegistry;
import androidx.lifecycle.ViewModelStore;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.Lifecycle$State;

public class ComponentActivity extends ComponentActivity implements ViewModelStoreOwner, b, c	// class@000209
{
    public int mContentLayoutId;
    public final LifecycleRegistry mLifecycleRegistry;
    public final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final a mSavedStateRegistryController;
    public ViewModelStore mViewModelStore;

    public void ComponentActivity(){
       super();
       this.mLifecycleRegistry = new LifecycleRegistry(this);
       this.mSavedStateRegistryController = a.a(this);
       this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new ComponentActivity$a(this));
       if (this.getLifecycle() == null) {
          throw new IllegalStateException("getLifecycle\(\) returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle\(\) rather than relying on field initialization.");
       }
       this.getLifecycle().addObserver(new ComponentActivity$2(this));
       this.getLifecycle().addObserver(new ComponentActivity$3(this));
       if (Build$VERSION.SDK_INT <= 23) {
          this.getLifecycle().addObserver(new ImmLeaksCleaner(this));
       }
       return;
    }
    public void ComponentActivity(int p0){
       super();
       this.mContentLayoutId = p0;
    }
    public static void access$001(ComponentActivity p0){
       super.onBackPressed();
    }
    public Object getLastCustomNonConfigurationInstance(){
       ComponentActivity$b lastNonConfi = this.getLastNonConfigurationInstance();
       lastNonConfi = (lastNonConfi != null)? lastNonConfi.a: null;
       return lastNonConfi;
    }
    public Lifecycle getLifecycle(){
       return this.mLifecycleRegistry;
    }
    public final OnBackPressedDispatcher getOnBackPressedDispatcher(){
       return this.mOnBackPressedDispatcher;
    }
    public final SavedStateRegistry getSavedStateRegistry(){
       return this.mSavedStateRegistryController.b();
    }
    public ViewModelStore getViewModelStore(){
       if (this.getApplication() == null) {
          throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call.");
       }
       if (this.mViewModelStore == null) {
          ComponentActivity$b lastNonConfi = this.getLastNonConfigurationInstance();
          if (lastNonConfi != null) {
             this.mViewModelStore = lastNonConfi.b;
          }
          if (this.mViewModelStore == null) {
             this.mViewModelStore = new ViewModelStore();
          }
       }
       return this.mViewModelStore;
    }
    public void onBackPressed(){
       this.mOnBackPressedDispatcher.d();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.mSavedStateRegistryController.c(p0);
       ReportFragment.injectIfNeededIn(this);
       ComponentActivity tmContentLay = this.mContentLayoutId;
       if (tmContentLay != null) {
          this.setContentView(tmContentLay);
       }
       return;
    }
    public Object onRetainCustomNonConfigurationInstance(){
       return null;
    }
    public final Object onRetainNonConfigurationInstance(){
       ComponentActivity$b lastNonConfi;
       Object obj = this.onRetainCustomNonConfigurationInstance();
       ComponentActivity tmViewModelS = this.mViewModelStore;
       if (tmViewModelS == null) {
          lastNonConfi = this.getLastNonConfigurationInstance();
          if (lastNonConfi != null) {
             tmViewModelS = lastNonConfi.b;
          }
       }
       if (tmViewModelS == null && obj == null) {
          return null;
       }else {
          lastNonConfi = new ComponentActivity$b();
          lastNonConfi.a = obj;
          lastNonConfi.b = tmViewModelS;
          return lastNonConfi;
       }
    }
    public void onSaveInstanceState(Bundle p0){
       Lifecycle lifecycle = this.getLifecycle();
       if (lifecycle instanceof LifecycleRegistry) {
          lifecycle.setCurrentState(Lifecycle$State.CREATED);
       }
       super.onSaveInstanceState(p0);
       this.mSavedStateRegistryController.d(p0);
       return;
    }
}
