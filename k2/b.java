package k2.b;
import androidx.fragment.app.FragmentHostCallback;
import java.lang.Object;
import z1.h;
import androidx.fragment.app.Fragment;
import k2.a;
import androidx.fragment.app.FragmentManagerImpl;
import android.content.res.Configuration;
import android.view.MenuItem;
import android.view.Menu;
import android.view.MenuInflater;
import java.lang.String;
import androidx.fragment.app.c;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.IllegalStateException;

public class b	// class@002457
{
    public final FragmentHostCallback a;

    public void b(FragmentHostCallback p0){
       super();
       this.a = p0;
    }
    public static b b(FragmentHostCallback p0){
       h.h(p0, "callbacks == null");
       return new b(p0);
    }
    public void a(Fragment p0){
       b ta = this.a;
       ta.mFragmentManager.attachController(ta, ta, null);
    }
    public void c(){
       this.a.mFragmentManager.dispatchActivityCreated();
    }
    public void d(Configuration p0){
       this.a.mFragmentManager.dispatchConfigurationChanged(p0);
    }
    public boolean e(MenuItem p0){
       return this.a.mFragmentManager.dispatchContextItemSelected(p0);
    }
    public void f(){
       this.a.mFragmentManager.dispatchCreate();
    }
    public boolean g(Menu p0,MenuInflater p1){
       return this.a.mFragmentManager.dispatchCreateOptionsMenu(p0, p1);
    }
    public void h(){
       this.a.mFragmentManager.dispatchDestroy();
    }
    public void i(){
       this.a.mFragmentManager.dispatchLowMemory();
    }
    public void j(boolean p0){
       this.a.mFragmentManager.dispatchMultiWindowModeChanged(p0);
    }
    public boolean k(MenuItem p0){
       return this.a.mFragmentManager.dispatchOptionsItemSelected(p0);
    }
    public void l(Menu p0){
       this.a.mFragmentManager.dispatchOptionsMenuClosed(p0);
    }
    public void m(){
       this.a.mFragmentManager.dispatchPause();
    }
    public void n(boolean p0){
       this.a.mFragmentManager.dispatchPictureInPictureModeChanged(p0);
    }
    public boolean o(Menu p0){
       return this.a.mFragmentManager.dispatchPrepareOptionsMenu(p0);
    }
    public void p(){
       this.a.mFragmentManager.dispatchResume();
    }
    public void q(){
       this.a.mFragmentManager.dispatchStart();
    }
    public void r(){
       this.a.mFragmentManager.dispatchStop();
    }
    public boolean s(){
       return this.a.mFragmentManager.execPendingActions();
    }
    public Fragment t(String p0){
       return this.a.mFragmentManager.findFragmentByWho(p0);
    }
    public c u(){
       return this.a.mFragmentManager;
    }
    public void v(){
       this.a.mFragmentManager.noteStateNotSaved();
    }
    public View w(View p0,String p1,Context p2,AttributeSet p3){
       return this.a.mFragmentManager.onCreateView(p0, p1, p2, p3);
    }
    public void x(Parcelable p0){
       b ta = this.a;
       if (!ta instanceof ViewModelStoreOwner) {
          throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState\(\). Call restoreAllState\(\)  if you\'re still using retainNestedNonConfig\(\).");
       }
       ta.mFragmentManager.restoreSaveState(p0);
       return;
    }
    public Parcelable y(){
       return this.a.mFragmentManager.saveAllState();
    }
}
