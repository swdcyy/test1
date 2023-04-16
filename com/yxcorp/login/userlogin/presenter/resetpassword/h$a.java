package com.yxcorp.login.userlogin.presenter.resetpassword.h$a;
import sfc.a;
import com.yxcorp.login.userlogin.presenter.resetpassword.h;
import android.content.Context;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h$a extends a	// class@001bde
{
    public final ProgressFragment c;
    public final h d;

    public void h$a(h p0,Context p1,ProgressFragment p2){
       this.d = p0;
       this.c = p2;
       super(p1);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       this.c.dismiss();
       super.b(p0);
       return;
    }
}
