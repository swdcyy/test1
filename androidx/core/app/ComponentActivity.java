package androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import a2.h$a;
import android.app.Activity;
import androidx.collection.SimpleArrayMap;
import androidx.lifecycle.LifecycleRegistry;
import android.view.KeyEvent;
import android.view.Window;
import android.view.View;
import a2.h;
import android.view.Window$Callback;
import java.lang.Class;
import androidx.core.app.ComponentActivity$a;
import java.lang.Object;
import androidx.lifecycle.Lifecycle;
import android.os.Bundle;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.Lifecycle$State;

public class ComponentActivity extends Activity implements LifecycleOwner, h$a	// class@000215
{
    public SimpleArrayMap mExtraDataMap;
    public LifecycleRegistry mLifecycleRegistry;

    public void ComponentActivity(){
       super();
       this.mExtraDataMap = new SimpleArrayMap();
       this.mLifecycleRegistry = new LifecycleRegistry(this);
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       View decorView = this.getWindow().getDecorView();
       if (decorView != null && h.d(decorView, p0)) {
          return true;
       }
       return h.e(this, decorView, this, p0);
    }
    public boolean dispatchKeyShortcutEvent(KeyEvent p0){
       View decorView = this.getWindow().getDecorView();
       if (decorView != null && h.d(decorView, p0)) {
          return true;
       }
       return super.dispatchKeyShortcutEvent(p0);
    }
    public ComponentActivity$a getExtraData(Class p0){
       return this.mExtraDataMap.get(p0);
    }
    public Lifecycle getLifecycle(){
       return this.mLifecycleRegistry;
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       ReportFragment.injectIfNeededIn(this);
    }
    public void onSaveInstanceState(Bundle p0){
       this.mLifecycleRegistry.markState(Lifecycle$State.CREATED);
       super.onSaveInstanceState(p0);
    }
    public void putExtraData(ComponentActivity$a p0){
       this.mExtraDataMap.put(p0.getClass(), p0);
    }
    public boolean superDispatchKeyEvent(KeyEvent p0){
       return super.dispatchKeyEvent(p0);
    }
}
