package com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$a;
import android.content.DialogInterface$OnKeyListener;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;

public class BaseEditorFragment$a implements DialogInterface$OnKeyListener	// class@0011e4
{
    public final BaseEditorFragment b;

    public void BaseEditorFragment$a(BaseEditorFragment p0){
       this.b = p0;
       super();
    }
    public boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(BaseEditorFragment$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, BaseEditorFragment$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p2.getKeyCode() == 4) {
          BaseEditorFragment$a tb = this.b;
          if (tb.M.mCancelWhenKeyboardHidden != null) {
             tb.cancel();
             return true;
          }
       }
       return false;
    }
}
