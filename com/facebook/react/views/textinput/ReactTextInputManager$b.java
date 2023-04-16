package com.facebook.react.views.textinput.ReactTextInputManager$b;
import android.view.View$OnFocusChangeListener;
import com.facebook.react.views.textinput.ReactTextInputManager;
import ze.n0;
import com.facebook.react.views.textinput.ReactEditText;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import df.c;
import ag.h;
import android.widget.EditText;
import df.b;
import ag.e;
import ag.f;
import android.text.Editable;

public class ReactTextInputManager$b implements View$OnFocusChangeListener	// class@001429
{
    public final n0 b;
    public final ReactEditText c;
    public final ReactTextInputManager d;

    public void ReactTextInputManager$b(ReactTextInputManager p0,n0 p1,ReactEditText p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onFocusChange(View p0,boolean p1){
       if (PatchProxy.isSupport(ReactTextInputManager$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ReactTextInputManager$b.class, "1")) {
          return;
       }
       c eventDispatc = this.b.getNativeModule(UIManagerModule.class).getEventDispatcher();
       if (p1) {
          eventDispatc.c(new h(this.c.getId()));
       }else {
          eventDispatc.c(new e(this.c.getId()));
          eventDispatc.c(new f(this.c.getId(), this.c.getText().toString()));
       }
       return;
    }
}
