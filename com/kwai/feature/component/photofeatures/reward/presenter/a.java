package com.kwai.feature.component.photofeatures.reward.presenter.a;
import android.view.View$OnClickListener;
import com.kwai.feature.component.photofeatures.reward.presenter.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Iterable;
import brd.t;
import com.kwai.feature.component.photofeatures.reward.presenter.b;
import erd.r;
import brd.a0;
import nz5.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a implements View$OnClickListener	// class@00125d
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, c.class, "9")) {
       }else {
          tb.X7(t.fromIterable(tb.B).all(b.b).Q(new d(tb)));
       }
       return;
    }
}
