package com.kuaishou.ark.rtx.widget.RTXInput$a;
import android.text.TextWatcher;
import com.kuaishou.ark.rtx.widget.RTXInput;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class RTXInput$a implements TextWatcher	// class@000f90
{
    public final RTXInput b;

    public void RTXInput$a(RTXInput p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RTXInput$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RTXInput$a.class, "1")) {
          return;
       }
       RTXInput textChangeCa = this.b.textChangeCallback;
       if (textChangeCa != null) {
          Object[] objArray = new Object[]{p0.toString()};
          textChangeCa.call(null, objArray);
       }
       return;
    }
}
