package com.kuaishou.ark.rtx.widget.RTXInput;
import com.tachikoma.core.component.input.TKInput;
import gx4.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.ark.rtx.widget.RTXInput$a;
import android.view.View;
import com.tachikoma.core.component.e;
import com.tachikoma.core.component.input.MenuOptionEditText;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.kuaishou.ark.rtx.widget.RTXInput$b;
import java.lang.Runnable;
import iq8.x;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;

public class RTXInput extends TKInput	// class@000f92
{
    public boolean editable;
    public TextWatcher rtxTextWatcher;
    public V8Function textChangeCallback;
    public JsValueRef textChangeCallbackRef;
    public String value;

    public void RTXInput(f p0){
       super(p0);
       this.addRtxTextWatcher();
    }
    public void addRtxTextWatcher(){
       if (PatchProxy.applyVoid(null, this, RTXInput.class, "1")) {
          return;
       }
       this.rtxTextWatcher = new RTXInput$a(this);
       this.getView().addTextChangedListener(this.rtxTextWatcher);
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       RTXInput rTXInput = RTXInput.class;
       if (PatchProxy.isSupport(rTXInput) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, rTXInput, "5")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.getView().removeTextChangedListener(this.rtxTextWatcher);
       }else {
          x.f(new RTXInput$b(this));
       }
       return;
    }
    public void setEditable(boolean p0){
       RTXInput rTXInput = RTXInput.class;
       if (PatchProxy.isSupport(rTXInput) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXInput, "2")) {
          return;
       }
       this.getView().setFocusable(p0);
       this.getView().setFocusableInTouchMode(p0);
       return;
    }
    public void setTextChangeCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXInput.class, "4")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.textChangeCallbackRef);
       this.textChangeCallbackRef = jsValueRef;
       if (jsValueRef != null) {
          this.textChangeCallback = jsValueRef.get();
       }
       return;
    }
    public void setValue(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXInput.class, "3")) {
          return;
       }
       this.setText(p0);
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, RTXInput.class, "6")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.textChangeCallbackRef);
       return;
    }
}
