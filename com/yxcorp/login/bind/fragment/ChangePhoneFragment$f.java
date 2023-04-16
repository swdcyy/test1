package com.yxcorp.login.bind.fragment.ChangePhoneFragment$f;
import erd.g;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import v0d.j;
import com.yxcorp.login.bind.fragment.c;
import v0d.m$b;
import v0d.m;

public class ChangePhoneFragment$f implements g	// class@001a4e
{
    public final ChangePhoneFragment b;

    public void ChangePhoneFragment$f(ChangePhoneFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneFragment$f.class, "1")) {
       }else {
          this.b.o.setEnabled(false);
          this.b.z.b(j.a(), new c(this));
       }
       return;
    }
}
