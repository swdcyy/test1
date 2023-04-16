package com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup$a;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;

public class ReactModalHostView$DialogRootViewGroup$a extends GuardedRunnable	// class@0013ca
{
    public final int b;
    public final ReactModalHostView$DialogRootViewGroup c;

    public void ReactModalHostView$DialogRootViewGroup$a(ReactModalHostView$DialogRootViewGroup p0,ReactContext p1,int p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void runGuarded(){
       if (PatchProxy.applyVoid(null, this, ReactModalHostView$DialogRootViewGroup$a.class, "1")) {
          return;
       }
       ReactModalHostView$DialogRootViewGroup$a tc = this.c;
       this.c.getReactContext().getNativeModule(UIManagerModule.class).updateNodeSize(this.b, tc.c, tc.d);
       return;
    }
}
