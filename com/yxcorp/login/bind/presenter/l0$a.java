package com.yxcorp.login.bind.presenter.l0$a;
import android.text.TextWatcher;
import com.yxcorp.login.bind.presenter.l0;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;

public class l0$a implements TextWatcher	// class@001a83
{
    public final l0 b;

    public void l0$a(l0 p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$a.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
