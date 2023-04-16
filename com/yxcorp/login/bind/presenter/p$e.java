package com.yxcorp.login.bind.presenter.p$e;
import erd.g;
import com.yxcorp.login.bind.presenter.p;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import android.app.Activity;
import android.content.Intent;
import v0d.j;
import ekd.j0;
import v0d.m$b;
import v0d.m;

public class p$e implements g	// class@001a95
{
    public final p b;

    public void p$e(p p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$e.class, "1")) {
       }else {
          p0 = this.b.r;
          if (p0 != null) {
             p0.setEnabled(false);
             p0 = this.b;
             p0.r.setTextColor(p0.l8().getColor(R.color.arg_RES_7f061eed));
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, p.class, "14")) {
                p0.y.b(j0.b(p0.getActivity().getIntent(), "count_down_number", j.a()), p0.B);
             }
          }
       }
       return;
    }
}
