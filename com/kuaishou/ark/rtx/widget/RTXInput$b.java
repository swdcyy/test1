package com.kuaishou.ark.rtx.widget.RTXInput$b;
import java.lang.Runnable;
import com.kuaishou.ark.rtx.widget.RTXInput;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.tachikoma.core.component.e;
import com.tachikoma.core.component.input.MenuOptionEditText;
import android.text.TextWatcher;
import android.widget.EditText;

public class RTXInput$b implements Runnable	// class@000f91
{
    public final RTXInput b;

    public void RTXInput$b(RTXInput p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, RTXInput$b.class, "1")) {
          return;
       }
       this.b.getView().removeTextChangedListener(this.b.rtxTextWatcher);
       return;
    }
}
