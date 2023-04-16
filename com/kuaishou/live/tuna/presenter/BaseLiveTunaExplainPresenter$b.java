package com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$b;
import mq5.h;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter;
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

public final class BaseLiveTunaExplainPresenter$b implements h	// class@000fc0
{
    public final BaseLiveTunaExplainPresenter b;

    public void BaseLiveTunaExplainPresenter$b(BaseLiveTunaExplainPresenter p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, BaseLiveTunaExplainPresenter$b.class, "1")) {
          return;
       }
       this.b.a9();
       BaseLiveTunaExplainPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, BaseLiveTunaExplainPresenter.class, "2")) {
          BaseLiveTunaExplainPresenter d = tb.D;
          _monitor_enter(d);
          Iterator iterator = tb.D.iterator();
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
          _monitor_exit(d);
       }
       return;
    }
}
