package com.yxcorp.login.bind.fragment.ChangePhoneFragment$e;
import sfc.a;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class ChangePhoneFragment$e extends a	// class@001a4d
{
    public final ChangePhoneFragment c;

    public void ChangePhoneFragment$e(ChangePhoneFragment p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneFragment$e.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.o.setEnabled(true);
       return;
    }
}
