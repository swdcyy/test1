package com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;

public class ScreenShotShareDialog$1 implements DefaultLifecycleObserver	// class@001c4b
{
    public final ScreenShotShareDialog b;

    public void ScreenShotShareDialog$1(ScreenShotShareDialog p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreenShotShareDialog$1.class, "1")) {
          return;
       }
       Dialog dialog = this.b.getDialog();
       if (dialog == null) {
          return;
       }
       Window window = dialog.getWindow();
       if (window == null) {
          return;
       }
       if (dialog.isShowing()) {
          window.setWindowAnimations(R.style.arg_RES_7f1103dc);
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
