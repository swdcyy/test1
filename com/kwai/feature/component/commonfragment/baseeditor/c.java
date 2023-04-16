package com.kwai.feature.component.commonfragment.baseeditor.c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.EditText;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public class c implements BaseEditorFragment$b	// class@0011fc
{
    public final FloatEditorFragment a;

    public void c(FloatEditorFragment p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       this.a.W0.setText(p1);
       this.a.ki(true);
       BaseEditorFragment i = this.a.I;
       if (i != null) {
          i.a(p0, p1);
       }
       return;
    }
    public void b(int p0,String p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1")) {
          return;
       }
       BaseEditorFragment i = this.a.I;
       if (i != null) {
          i.b(p0, p1);
       }
       return;
    }
}
