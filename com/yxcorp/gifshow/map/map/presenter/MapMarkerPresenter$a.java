package com.yxcorp.gifshow.map.map.presenter.MapMarkerPresenter$a;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MapMarkerPresenter;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import rvb.f;
import k6b.g;
import java.util.Objects;
import java.lang.Iterable;
import brd.t;
import t45.d;
import brd.z;
import j6b.w;
import j6b.x;
import j6b.y;
import j6b.z;
import erd.a;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class MapMarkerPresenter$a implements g	// class@001c9e
{
    public final MapMarkerPresenter b;

    public void MapMarkerPresenter$a(MapMarkerPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapMarkerPresenter$a.class, "1")) {
       }else {
          a.p(p0, "photos");
          this.b.C = g.a("requestFinishToFirstCardShow_", "requestFinishToFirstCardShow_", -1);
          MapMarkerPresenter$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, MapMarkerPresenter.class, "5")) {
             tb.y = 0;
             tb.X7(t.fromIterable(p0).subscribeOn(d.c).observeOn(d.a).subscribe(new w(tb), x.b, new y(tb), z.b));
          }
       }
       return;
    }
}
