package hn1.c0;
import yh3.a;
import androidx.lifecycle.LiveData;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import androidx.lifecycle.Transformations;
import hn1.c0$a;
import z0.a;
import hn1.c0$b;
import hn1.c0$c;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import rh3.a;
import hn1.c0$d;
import brd.w;
import erd.c;
import hn1.c0$e;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import hn1.g;
import hn1.g$c;
import hn1.g$a;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;

public final class c0 extends a	// class@002717
{
    public final MutableLiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveEvent f;
    public final LiveEvent g;
    public final b h;
    public final LiveData i;

    public void c0(LiveData p0,t p1){
       a.p(p0, "liveViewData");
       a.p(p1, "playInfoObservable");
       super();
       this.i = p0;
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.TRUE);
       this.a = mutableLiveD;
       LiveData liveData = Transformations.distinctUntilChanged(mutableLiveD);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.b = liveData;
       liveData = Transformations.map(p0, new c0$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.c = liveData;
       liveData = Transformations.map(p0, new c0$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.d = liveData;
       liveData = Transformations.map(p0, new c0$c());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.e = liveData;
       c uoc = new c();
       this.p0(uoc);
       this.f = uoc;
       uoc = new c();
       this.p0(uoc);
       this.g = uoc;
       this.h = t.combineLatest(a.a(p0), p1, c0$d.a).subscribe(new c0$e(this));
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, c0.class, "2")) {
          return;
       }
       super.onCleared();
       this.h.dispose();
       return;
    }
    public final LiveEvent u0(){
       return this.g;
    }
    public void v0(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof g$c) {
          this.a.setValue(Boolean.valueOf((p0.a() ^ 0x01)));
       }else if(p0 instanceof g$a){
          LiveHotSpotLiveViewData value = this.i.getValue();
          if (value != null) {
             a.o(value, "it");
             this.s0(this.f).q(value);
          }
       }
       return;
    }
}
