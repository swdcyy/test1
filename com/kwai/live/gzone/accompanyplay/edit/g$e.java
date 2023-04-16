package com.kwai.live.gzone.accompanyplay.edit.g$e;
import erd.o;
import com.kwai.live.gzone.accompanyplay.edit.g;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyCurrentAccompanyInfo;
import brd.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import mrd.a;
import java.lang.Boolean;
import brd.t;
import j37.b;
import j37.a;
import k37.p1;
import fq5.b;
import cjd.e;
import com.kwai.live.gzone.accompanyplay.edit.g$e$a;

public class g$e implements o	// class@000beb
{
    public final g b;

    public void g$e(g p0){
       this.b = p0;
       super();
    }
    public w a(LiveGzoneAccompanyCurrentAccompanyInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.isInitState()) {
          return a.b().l(p0.mAccompanyId, this.b.m.a.getLiveStreamId()).map(new e()).flatMap(new g$e$a(this));
       }
       this.b.k.onNext(Integer.valueOf(0));
       return t.just(Boolean.FALSE);
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
