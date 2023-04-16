package com.yxcorp.gifshow.relation.explore.presenter.gallery.g$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.g;
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

public class g$d extends m	// class@001842
{
    public final g c;

    public void g$d(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$d.class, "1")) {
          return;
       }
       b.h("close", this.c.D);
       g$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, g.class, "11")) {
          tc.r.onNext(new z(tc.p, tc.q.get()));
       }
       return;
    }
}
