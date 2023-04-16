package com.tachikoma.core.component.input.TKInput$c;
import android.view.View$OnFocusChangeListener;
import com.tachikoma.core.component.input.TKInput;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.tkruntime.v8.JsValueRef;
import java.util.HashMap;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class TKInput$c implements View$OnFocusChangeListener	// class@000d73
{
    public final TKInput b;

    public void TKInput$c(TKInput p0){
       this.b = p0;
       super();
    }
    public void onFocusChange(View p0,boolean p1){
       TKInput$c tb;
       if (PatchProxy.isSupport(TKInput$c.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKInput$c.class, "1")) {
          return;
       }
       if (p1) {
          tb = this.b;
          tb.onRefCall(tb.onfocusRef);
       }else {
          tb = this.b;
          tb.onRefCall(tb.onblurRef);
          String text = this.b.getText();
          if (text != null && !text.equals(this.b.mOnEditorActionText)) {
             this.b.mOnEditorActionText = text;
             HashMap hashMap = new HashMap();
             hashMap.put("value", text);
             HashMap hashMap1 = new HashMap();
             hashMap1.put("target", hashMap);
             hashMap1.put("type", "change");
             TKInput$c tb1 = this.b;
             tb1.onRefCallWithArgs(tb1.onchangeRef, hashMap1);
          }
       }
       TKInput onFocusRef = this.b.onFocusRef;
       if (onFocusRef == null || (onFocusRef.get() != null && y.a(this.b.onFocusRef.get()))) {
          Object[] objArray = new Object[]{Boolean.valueOf(p1)};
          this.b.onFocusRef.get().call(null, objArray);
       }
    label_00a4 :
       return;
    }
}
