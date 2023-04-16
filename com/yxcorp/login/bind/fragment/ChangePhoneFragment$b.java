package com.yxcorp.login.bind.fragment.ChangePhoneFragment$b;
import android.text.TextWatcher;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;

public class ChangePhoneFragment$b implements TextWatcher	// class@001a4a
{
    public final ChangePhoneFragment b;

    public void ChangePhoneFragment$b(ChangePhoneFragment p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneFragment$b.class, "1")) {
          return;
       }
       this.b.eh();
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
