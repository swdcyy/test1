package com.yxcorp.gifshow.share.widget.BottomSheetFixedDialog$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.share.widget.BottomSheetFixedDialog;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import android.view.Window;

public class BottomSheetFixedDialog$1 implements DefaultLifecycleObserver	// class@001cae
{
    public final BottomSheetFixedDialog b;

    public void BottomSheetFixedDialog$1(BottomSheetFixedDialog p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetFixedDialog$1.class, "2")) {
          return;
       }
       this.b.h();
       return;
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetFixedDialog$1.class, "1")) {
          return;
       }
       if (this.b.isShowing()) {
          this.b.getWindow().setWindowAnimations(R.style.arg_RES_7f1103dc);
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
