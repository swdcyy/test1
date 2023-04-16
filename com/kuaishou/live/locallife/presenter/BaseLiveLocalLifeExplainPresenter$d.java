package com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$d;
import mq5.h;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter;
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

public final class BaseLiveLocalLifeExplainPresenter$d implements h	// class@000c42
{
    public final BaseLiveLocalLifeExplainPresenter b;

    public void BaseLiveLocalLifeExplainPresenter$d(BaseLiveLocalLifeExplainPresenter p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, BaseLiveLocalLifeExplainPresenter$d.class, "1")) {
          return;
       }
       this.b.e9();
       BaseLiveLocalLifeExplainPresenter$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, BaseLiveLocalLifeExplainPresenter.class, "2")) {
          BaseLiveLocalLifeExplainPresenter m = tb.M;
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
