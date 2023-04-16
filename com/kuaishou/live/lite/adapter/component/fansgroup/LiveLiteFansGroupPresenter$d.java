package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$d;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$a;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j73.j;
import xp5.g;
import kotlin.jvm.internal.a;
import crd.b;
import lnc.b9;
import brd.t;
import m95.a;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import j73.h;
import j73.i;
import erd.g;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteFansGroupPresenter$d implements LiveLiteFansGroupPresenter$a	// class@001d94
{
    public final LiveLiteFansGroupPresenter a;

    public void LiveLiteFansGroupPresenter$d(LiveLiteFansGroupPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFansGroupPresenter$d.class, str)) {
          return;
       }
       LiveLiteFansGroupPresenter$d ta = this.a;
       LiveLiteFansGroupPresenter n = ta.N;
       if (n != null) {
          if (!PatchProxy.applyVoid(objArray, n, j.class, str)) {
             String liveStreamId = n.n.getLiveStreamId();
             if (liveStreamId != null) {
                a.o(liveStreamId, "liveLiteAudienceInfoMana¡­bort\"\)\n      return\n    }");
                b9.a(n.k);
                n.k = a.b(liveStreamId).timeout(1, TimeUnit.SECONDS).map(new e()).subscribe(new h(n), new i(n));
             }else {
                b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(n.j), "showSharePanel: liveStreamId is null, abort");
             }
          }
       }else {
          LiveLiteLogTag lITE_FANS_GR = LiveLiteLogTag.LITE_FANS_GROUP;
          lITE_FANS_GR.appendTag(ta.v);
          LiveLiteLogTag liveLiteLogT = lITE_FANS_GR;
          b.P(liveLiteLogT, "showSharePanel: fansGroupShareViewController is null, abort");
       }
       return;
    }
}
