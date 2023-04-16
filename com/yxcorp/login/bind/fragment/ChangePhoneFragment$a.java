package com.yxcorp.login.bind.fragment.ChangePhoneFragment$a;
import android.text.TextWatcher;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import com.yxcorp.utility.n;

public class ChangePhoneFragment$a implements TextWatcher	// class@001a49
{
    public final ChangePhoneFragment b;

    public void ChangePhoneFragment$a(ChangePhoneFragment p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneFragment$a.class, "1")) {
          return;
       }
       if (p0 != null && !TextUtils.isEmpty(p0.toString())) {
          n.Y(this.b.s, 0, true);
       }else {
          n.Y(this.b.s, 4, true);
       }
       this.b.eh();
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
