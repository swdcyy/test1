package com.yxcorp.gifshow.relation.explore.presenter.gallery.d$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gbc.b;
import java.util.Objects;
import iac.z;
import y8c.d;
import com.kwai.framework.model.user.RecoUser;
import io.reactivex.subjects.PublishSubject;

public class d$b extends m	// class@001838
{
    public final d c;

    public void d$b(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       b.h("close", this.c.D);
       d$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, d.class, "10")) {
          tc.r.onNext(new z(tc.p, tc.q.get()));
       }
       return;
    }
}
