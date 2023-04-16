package com.yxcorp.gifshow.detail.slidev2.presenter.h$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slidev2.presenter.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class h$d extends m	// class@0019b7
{
    public final h c;

    public void h$d(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "1")) {
          return;
       }
       this.c.S8("small_window");
       RxBus.f.b(new e(this.c.getActivity(), false, true));
       return;
    }
}
