package com.yxcorp.login.bind.presenter.l0$b;
import android.text.TextWatcher;
import com.yxcorp.login.bind.presenter.l0;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;

public class l0$b implements TextWatcher	// class@001a84
{
    public final l0 b;

    public void l0$b(l0 p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$b.class, "1")) {
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
