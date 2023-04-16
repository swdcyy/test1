package com.yxcorp.login.bind.presenter.p$b;
import android.view.View$OnFocusChangeListener;
import com.yxcorp.login.bind.presenter.p;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.utility.n;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;

public class p$b implements View$OnFocusChangeListener	// class@001a92
{
    public final p b;

    public void p$b(p p0){
       this.b = p0;
       super();
    }
    public void onFocusChange(View p0,boolean p1){
       if (PatchProxy.isSupport(p$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, p$b.class, "1")) {
          return;
       }
       if (!p1) {
          n.Y(this.b.u, 8, false);
          return;
       }else if(TextUtils.G(this.b.q).length() > 0){
          n.Y(this.b.u, false, true);
       }
       return;
    }
}
