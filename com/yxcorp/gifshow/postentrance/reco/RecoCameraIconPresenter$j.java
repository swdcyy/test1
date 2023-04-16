package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$j;
import erd.o;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$d;
import java.lang.Object;
import g26.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import vzb.a;
import brd.t;

public final class RecoCameraIconPresenter$j implements o	// class@001065
{
    public final RecoCameraIconPresenter$d b;

    public void RecoCameraIconPresenter$j(RecoCameraIconPresenter$d p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, RecoCameraIconPresenter$j.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = p0.sP(this.b.a().a);
       }
       return ot;
    }
}
