package com.yxcorp.login.bind.presenter.i$b;
import android.view.View$OnFocusChangeListener;
import com.yxcorp.login.bind.presenter.i;
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

public class i$b implements View$OnFocusChangeListener	// class@001a76
{
    public final i b;

    public void i$b(i p0){
       this.b = p0;
       super();
    }
    public void onFocusChange(View p0,boolean p1){
       if (PatchProxy.isSupport(i$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, i$b.class, "1")) {
          return;
       }
       if (!p1) {
          n.Y(this.b.q, 8, false);
          return;
       }else if(TextUtils.G(this.b.p).length() > 0){
          n.Y(this.b.q, false, true);
       }
       return;
    }
}
