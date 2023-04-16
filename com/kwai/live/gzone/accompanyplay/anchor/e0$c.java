package com.kwai.live.gzone.accompanyplay.anchor.e0$c;
import erd.o;
import com.kwai.live.gzone.accompanyplay.anchor.e0;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import brd.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j37.b;
import j37.a;
import brd.t;
import cjd.e;
import com.kwai.live.gzone.accompanyplay.anchor.e0$c$a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;

public class e0$c implements o	// class@000b07
{
    public final e0 b;

    public void e0$c(e0 p0){
       this.b = p0;
       super();
    }
    public w a(LiveGzoneAccompanyFleetInfo p0){
       LiveGzoneAccompanyFleetInfo obj = PatchProxy.applyOneRefs(p0, this, e0$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mAccompanyStatus;
       if (obj == 5) {
          return a.b().j(false, this.b.w).map(new e()).map(new e0$c$a(this));
       }
       if (obj == 1) {
          obj = p0.mCreatingRoundId;
          if (obj - null > 0) {
             return t.just(String.valueOf(obj));
          }
       }
       b.B(LiveLogTag.LIVE_GZONE_ACCOMPANY, "accompany status error:"+a.a.q(p0));
       if (!SystemUtil.I()) {
          return t.just(p0.mRoundId);
       }else {
          throw new RuntimeException("accompany status error");
       }
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
