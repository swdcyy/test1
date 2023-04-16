package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$o;
import erd.g;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import java.lang.Object;
import vzb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$d;

public final class RecoCameraIconPresenter$o implements g	// class@00106a
{
    public final RecoCameraIconPresenter b;

    public void RecoCameraIconPresenter$o(RecoCameraIconPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCameraIconPresenter$o.class, "1")) {
       }else {
          RecoCameraIconPresenter$o tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, RecoCameraIconPresenter.class, "9")) {
             a.p(p0, "data");
             Object[] objArray = new Object[0];
             g.C().w("RecoCameraIconPresenter", "handleRecoCameraIconData "+p0, objArray);
             tb.S8(new RecoCameraIconPresenter$d(p0));
          }
       }
       return;
    }
}
