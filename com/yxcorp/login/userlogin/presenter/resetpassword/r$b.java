package com.yxcorp.login.userlogin.presenter.resetpassword.r$b;
import android.view.View$OnFocusChangeListener;
import com.yxcorp.login.userlogin.presenter.resetpassword.r;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.EditText;

public class r$b implements View$OnFocusChangeListener	// class@001beb
{
    public final r b;

    public void r$b(r p0){
       this.b = p0;
       super();
    }
    public void onFocusChange(View p0,boolean p1){
       if (PatchProxy.isSupport(r$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, r$b.class, "1")) {
          return;
       }
       this.b.S8(p0, p1);
       return;
    }
}