package com.yxcorp.login.userlogin.presenter.resetpassword.r$e;
import erd.g;
import com.yxcorp.login.userlogin.presenter.resetpassword.r;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.widget.TextView;
import v0d.j;
import com.yxcorp.login.userlogin.presenter.resetpassword.s;
import v0d.m$b;
import v0d.m;

public class r$e implements g	// class@001bee
{
    public final r b;

    public void r$e(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$e.class, "1")) {
       }else if(!this.b.x.isAdded() || this.b.x.isDetached()){
          this.b.q.setEnabled(false);
          this.b.A.b(j.a(), new s(this));
       }
       return;
    }
}
