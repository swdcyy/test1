package com.yxcorp.gifshow.relation.explore.presenter.v$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.v;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import gbc.b;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class v$a extends m	// class@001864
{
    public final v c;

    public void v$a(v p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
          return;
       }
       v$a tc = this.c;
       b.f("close", tc.y, tc.v);
       this.c.s.onNext(Integer.valueOf(2));
       return;
    }
}
