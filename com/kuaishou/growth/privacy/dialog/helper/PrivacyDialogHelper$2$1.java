package com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$2$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$2;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import tkd.b;
import tkd.d;
import ap5.a;

public class PrivacyDialogHelper$2$1 implements LifecycleObserver	// class@000709
{
    public final FragmentActivity b;
    public final PrivacyDialogHelper$2 c;

    public void PrivacyDialogHelper$2$1(PrivacyDialogHelper$2 p0,FragmentActivity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PrivacyDialogHelper$2$1.class, "1")) {
          return;
       }
       this.b.getLifecycle().removeObserver(this);
       d.a(-2061018968).bR(1, false);
       return;
    }
}
