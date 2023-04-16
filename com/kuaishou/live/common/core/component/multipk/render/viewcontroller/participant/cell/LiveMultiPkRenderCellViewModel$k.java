package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$k;
import zs1.d;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multipk.core.statemachine.MultiPkState;
import zs1.c;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkStatistic;
import com.kuaishou.live.common.core.component.multipk.core.LiveMultiPkStatisticUpdateType;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.d;
import java.util.Collection;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkEnd;
import com.kuaishou.live.livestage.basic.LayoutConfig;

public final class LiveMultiPkRenderCellViewModel$k implements d	// class@001691
{
    public final LiveMultiPkRenderCellViewModel a;

    public void LiveMultiPkRenderCellViewModel$k(LiveMultiPkRenderCellViewModel p0){
       this.a = p0;
       super();
    }
    public void a(MultiPkState p0,MultiPkState p1,Object p2){
       c.a(this, p0, p1, p2);
    }
    public void b(MultiPkState p0,MultiPkState p1,Object p2){
       c.f(this, p0, p1, p2);
    }
    public void c(SCLiveMultiPkStatistic p0,LiveMultiPkStatisticUpdateType p1){
       c.d(this, p0, p1);
    }
    public void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkRenderCellViewModel$k.class, "1")) {
          return;
       }
       a.p(p0, "muteUsers");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (a.g(obj.b(), this.a.getUserId())) {
             uArrayList.add(obj);
          }
       }
       LiveMultiPkRenderCellViewModel$k ta = this.a;
       ta.r0(ta.l).setValue(Boolean.valueOf((uArrayList.isEmpty() ^ 0x01)));
       return;
    }
    public void f(LiveMultiPkEnd p0,int p1){
       c.e(this, p0, p1);
    }
    public void h(LayoutConfig p0){
       c.b(this, p0);
    }
}
