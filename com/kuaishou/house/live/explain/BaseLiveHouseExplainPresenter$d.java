package com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$d;
import mq5.h;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ju5.g;
import qrd.l1;

public final class BaseLiveHouseExplainPresenter$d implements h	// class@00077e
{
    public final BaseLiveHouseExplainPresenter b;

    public void BaseLiveHouseExplainPresenter$d(BaseLiveHouseExplainPresenter p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, BaseLiveHouseExplainPresenter$d.class, "1")) {
          return;
       }
       this.b.c9();
       BaseLiveHouseExplainPresenter$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, BaseLiveHouseExplainPresenter.class, "2")) {
          BaseLiveHouseExplainPresenter m = tb.M;
          _monitor_enter(m);
          Iterator iterator = tb.M.iterator();
          a.o(iterator, "mMiniPrograms.iterator\(\)");
          while (iterator.hasNext()) {
             Object[] objArray = iterator.next();
             Object obj = objArray;
             a.o(obj, "it");
             obj = (obj.length() > 0)? 1: null;
             if (!obj) {
                objArray = null;
             }
             if (objArray != null) {
                d.a(0x6ea0c3d0).Kw(objArray);
             }
             iterator.remove();
          }
          _monitor_exit(m);
       }
       return;
    }
}
