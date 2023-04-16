package com.yxcorp.gifshow.detail.slidev2.presenter.h$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slidev2.presenter.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import w85.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import io.reactivex.subjects.PublishSubject;
import d6a.e;

public class h$c extends m	// class@0019b6
{
    public final h c;

    public void h$c(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
          return;
       }
       h$c tc = this.c;
       Objects.requireNonNull(tc);
       Object obj = PatchProxy.apply(null, tc, h.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tc.D.g() && tc.A.b1() - null){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          return;
       }else if(this.c.A.C() && this.c.F.d()){
          this.c.S8("more_btn");
          this.c.F.onNext(new e(true, -1, true));
       }
       return;
    }
}
