package com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.Fragment;

public final class ReEditTextFragment$a extends m	// class@000b51
{
    public final ReEditTextFragment c;

    public void ReEditTextFragment$a(ReEditTextFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditTextFragment$a.class, "1")) {
          return;
       }
       BaseEditor uBaseEditor = this.c.t.P(EditorItemFunc.TEXT_V2);
       if (uBaseEditor != null) {
          ReEditTextFragment$a tc = this.c;
          uBaseEditor.E(tc.t, tc.getView());
       }
       return;
    }
}
