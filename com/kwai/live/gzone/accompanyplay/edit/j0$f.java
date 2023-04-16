package com.kwai.live.gzone.accompanyplay.edit.j0$f;
import erd.o;
import com.kwai.live.gzone.accompanyplay.edit.j0;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyCurrentAccompanyInfo;
import brd.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j37.b;
import j37.a;
import brd.t;
import cjd.e;

public class j0$f implements o	// class@000bff
{
    public final j0 b;

    public void j0$f(j0 p0){
       this.b = p0;
       super();
    }
    public w a(LiveGzoneAccompanyCurrentAccompanyInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j0$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isCreatingState()) {
          return a.b().t(p0.mAccompanyId).map(new e());
       }
       return t.empty();
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
