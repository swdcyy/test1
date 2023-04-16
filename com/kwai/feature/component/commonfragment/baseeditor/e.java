package com.kwai.feature.component.commonfragment.baseeditor.e;
import android.view.View$OnClickListener;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$f;

public class e implements View$OnClickListener	// class@0011fe
{
    public final FloatEditorFragment b;

    public void e(FloatEditorFragment p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e tb = this.b;
       BaseEditorFragment d = tb.D;
       if (d != null) {
          if (d.a()) {
             this.b.ii();
          }
       }else {
          tb.ii();
       }
       return;
    }
}
