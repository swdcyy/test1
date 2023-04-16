package com.kwai.feature.component.commonfragment.baseeditor.a;
import android.widget.TextView$OnEditorActionListener;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;

public class a implements TextView$OnEditorActionListener	// class@0011f8
{
    public final FloatEditorFragment a;

    public void a(FloatEditorFragment p0){
       this.a = p0;
       super();
    }
    public boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       a ta = this.a;
       if (p1 == ta.M.mImeOptions) {
          ta.ki(false);
          return true;
       }else {
          return false;
       }
    }
}
