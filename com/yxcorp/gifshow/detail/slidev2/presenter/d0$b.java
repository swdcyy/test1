package com.yxcorp.gifshow.detail.slidev2.presenter.d0$b;
import jta.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.d0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import b8a.i2;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import k2b.n;
import jta.b;

public class d0$b implements c	// class@0018f6
{
    public final d0 a;

    public void d0$b(d0 p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       d0$b uob = d0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.a.q.c() && (!p0 - null && this.a.r.getUser().mVerifiedDetail != null)) {
          n.a(this.a.t, new i2(this));
       }
    label_003c :
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
    }
    public void d(float p0){
    }
}
