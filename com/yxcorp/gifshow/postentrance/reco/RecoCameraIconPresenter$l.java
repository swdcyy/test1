package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$l;
import erd.o;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import vzb.a;
import brd.t;
import com.yxcorp.gifshow.widget.x;

public final class RecoCameraIconPresenter$l implements o	// class@001067
{
    public final CDNUrl[][] b;
    public final CDNUrl[] c;
    public final RecoCameraIconPresenter$d d;

    public void RecoCameraIconPresenter$l(CDNUrl[][] p0,CDNUrl[] p1,RecoCameraIconPresenter$d p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, RecoCameraIconPresenter$l.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          int i = 0;
          this.b[i] = p0;
          RecoCameraIconPresenter$l tc = this.c;
          if (this.d.a().b != 1) {
             i = true;
          }
          ot = x.b(p0, tc, i);
       }
       return ot;
    }
}
