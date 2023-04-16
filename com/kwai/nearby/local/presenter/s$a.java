package com.kwai.nearby.local.presenter.s$a;
import com.kwai.library.slide.base.widget.a$a;
import com.kwai.nearby.local.presenter.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Collection;
import ekd.q;
import rw5.a;
import java.lang.Integer;
import com.yxcorp.gifshow.nearby.common.rubas.LocalDetailStageRubasHelper;

public class s$a implements a$a	// class@000fc8
{
    public final s b;

    public void s$a(s p0){
       this.b = p0;
       super();
    }
    public void b(){
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, s$a.class, "1")) {
          return;
       }
       s s = this.b.s;
       if (s != null && (!q.f(s.e0()) && this.b.s.e0().size() > 1)) {
          LocalDetailStageRubasHelper.a(a.d.intValue());
       }else {
          LocalDetailStageRubasHelper.a(a.c.intValue());
       }
       return;
    }
}
