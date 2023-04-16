package com.yxcorp.login.bind.fragment.b;
import sfc.a;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.util.f;

public class b extends a	// class@001a5b
{
    public final ChangePhoneFragment c;

    public void b(ChangePhoneFragment p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.b(p0);
       f.a(p0);
       return;
    }
}
