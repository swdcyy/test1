package kn1.i;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailNavigatorModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Long;
import crd.b;
import java.util.List;
import un1.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailNavigatorModel$RollHotspots;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import kn1.j;
import erd.g;

public final class i implements Observer	// class@002d75
{
    public final LiveHotSpotDetailBottomNavigatorViewModel b;

    public void i(LiveHotSpotDetailBottomNavigatorViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       i tb1;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          i tb = this.b;
          tb.r0(tb.u0()).setValue(Boolean.TRUE);
          LiveHotSpotDetailNavigatorModel navigationIc = p0.navigationIcon;
          if (navigationIc != null) {
             tb1 = this.b;
             tb1.r0(tb1.v0()).setValue(navigationIc);
          }
          navigationIc = p0.rollHotspots;
          if (navigationIc != null) {
             tb1 = this.b;
             long l = (long)p0.rollIntervalMillis;
             Objects.requireNonNull(tb1);
             p0 = LiveHotSpotDetailBottomNavigatorViewModel.class;
             if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidTwoRefs(navigationIc, Long.valueOf(l), tb1, p0, "3")) {
                p0 = tb1.h;
                if (p0 != null) {
                   p0.dispose();
                }
                if (!navigationIc.isEmpty() && l > 0) {
                   p0 = tb1.k.L0();
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = navigationIc.iterator();
                   while (iterator.hasNext()) {
                      Object obj = iterator.next();
                      i = a.g(obj.hotspotId, p0) ^ 0x01;
                      if (i) {
                         uArrayList.add(obj);
                      }
                   }
                   if (!uArrayList.isEmpty()) {
                      tb1.h = t.interval(l, TimeUnit.MILLISECONDS).startWith(Long.valueOf(0)).observeOn(d.a).subscribe(new j(tb1, uArrayList));
                   }
                }
             }
          }
       }
    label_00b3 :
       return;
    }
}
