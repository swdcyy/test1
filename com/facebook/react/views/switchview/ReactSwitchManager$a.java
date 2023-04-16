package com.facebook.react.views.switchview.ReactSwitchManager$a;
import android.widget.CompoundButton$OnCheckedChangeListener;
import java.lang.Object;
import android.widget.CompoundButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import df.c;
import xf.a;
import df.b;

public final class ReactSwitchManager$a implements CompoundButton$OnCheckedChangeListener	// class@001400
{

    public void ReactSwitchManager$a(){
       super();
    }
    public void onCheckedChanged(CompoundButton p0,boolean p1){
       if (PatchProxy.isSupport(ReactSwitchManager$a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ReactSwitchManager$a.class, "1")) {
          return;
       }
       p0.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher().c(new a(p0.getId(), p1));
       return;
    }
}
