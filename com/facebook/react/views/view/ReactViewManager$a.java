package com.facebook.react.views.view.ReactViewManager$a;
import android.view.View$OnClickListener;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import df.c;
import bg.e;
import df.b;

public class ReactViewManager$a implements View$OnClickListener	// class@00143d
{
    public final ReactViewGroup b;
    public final ReactViewManager c;

    public void ReactViewManager$a(ReactViewManager p0,ReactViewGroup p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewManager$a.class, "1")) {
          return;
       }
       this.b.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher().c(new e(this.b.getId()));
       return;
    }
}
