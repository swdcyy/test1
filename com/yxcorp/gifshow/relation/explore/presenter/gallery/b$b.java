package com.yxcorp.gifshow.relation.explore.presenter.gallery.b$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import gbc.b;
import java.util.Objects;
import iac.z;
import y8c.d;
import com.kwai.framework.model.user.RecoUser;
import io.reactivex.subjects.PublishSubject;

public class b$b extends m	// class@001834
{
    public final b c;

    public void b$b(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b tc = this.c;
       b.f("close", tc.C, tc.D);
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, b.class, "5")) {
          tc.s.onNext(new z(tc.q, tc.r.get()));
       }
       return;
    }
}
