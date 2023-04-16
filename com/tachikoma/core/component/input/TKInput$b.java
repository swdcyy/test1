package com.tachikoma.core.component.input.TKInput$b;
import android.view.View$OnKeyListener;
import com.tachikoma.core.component.input.TKInput;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.tachikoma.core.component.e;
import com.tachikoma.core.component.input.MenuOptionEditText;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tachikoma.core.component.input.b;
import sp8.b$a;
import ap8.f;

public class TKInput$b implements View$OnKeyListener	// class@000d72
{
    public final TKInput b;

    public void TKInput$b(TKInput p0){
       this.b = p0;
       super();
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(TKInput$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, TKInput$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 67 && !p2.getAction()) {
          if (this.b.getView() != null && TextUtils.isEmpty(this.b.getView().getText())) {
             this.b.dispatchEvent("input", b.a);
          }
       }else if(p1 == 66 && !p2.getAction()){
          this.b.dispatchEvent("input", new f(this));
       }
       return false;
    }
}
