package com.facebook.react.views.checkbox.ReactCheckBoxManager$a;
import android.widget.CompoundButton$OnCheckedChangeListener;
import java.lang.Object;
import android.widget.CompoundButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import w0.u;
import android.content.ContextWrapper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import df.c;
import lf.a;
import df.b;

public final class ReactCheckBoxManager$a implements CompoundButton$OnCheckedChangeListener	// class@00139f
{

    public void ReactCheckBoxManager$a(){
       super();
    }
    public void onCheckedChanged(CompoundButton p0,boolean p1){
       if (PatchProxy.isSupport(ReactCheckBoxManager$a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ReactCheckBoxManager$a.class, "1")) {
          return;
       }
       ReactContext reactContext = PatchProxy.applyOneRefs(p0, this, ReactCheckBoxManager$a.class, "2");
       if (reactContext != PatchProxyResult.class) {
       }else {
          Context context = p0.getContext();
          reactContext = (context instanceof u)? context.getBaseContext(): p0.getContext();
       }
       reactContext.getNativeModule(UIManagerModule.class).getEventDispatcher().c(new a(p0.getId(), p1));
       return;
    }
}
