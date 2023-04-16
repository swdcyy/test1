package com.yxcorp.gifshow.ad.detail.presenter.side.k$b;
import jta.c;
import com.yxcorp.gifshow.ad.detail.presenter.side.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import g19.h0;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import k2b.n;
import jta.b;

public class k$b implements c	// class@0016b1
{
    public final k a;

    public void k$b(k p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.a.q.c() && (!p0 - null && this.a.r.getUser().mVerifiedDetail != null)) {
          n.a(this.a.t, new h0(this));
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
