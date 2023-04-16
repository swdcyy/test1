package com.kwai.live.gzone.accompanyplay.edit.g$h;
import erd.o;
import com.kwai.live.gzone.accompanyplay.edit.g;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
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
import com.kwai.live.gzone.accompanyplay.edit.g$h$a;

public class g$h implements o	// class@000bef
{
    public final LiveGzoneAccompanyGameInfo b;
    public final LiveGzoneAccompanyFleetSetting c;
    public final g d;

    public void g$h(g p0,LiveGzoneAccompanyGameInfo p1,LiveGzoneAccompanyFleetSetting p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public w a(LiveGzoneAccompanyCurrentAccompanyInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isCreatingState()) {
          return a.b().t(p0.mAccompanyId).map(new e()).flatMap(new g$h$a(this));
       }
       return this.d.j(this.b, this.c);
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
