package hn1.e0;
import yh3.a;
import androidx.lifecycle.LiveData;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import hn1.e0$h;
import hn1.e0$a;
import z0.a;
import androidx.lifecycle.Transformations;
import hn1.e0$b;
import hn1.e0$c;
import hn1.e0$d;
import hn1.e0$e;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import rh3.a;
import hn1.e0$f;
import brd.w;
import erd.c;
import hn1.e0$g;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import hn1.g;
import hn1.g$a;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import hn1.g$b;
import qrd.l1;
import hn1.d0$b;
import hn1.g$c;

public final class e0 extends a	// class@002727
{
    public final MutableLiveData a;
    public final f b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;
    public final LiveEvent i;
    public final LiveEvent j;
    public final LiveEvent k;
    public final b l;
    public final LiveData m;

    public void e0(LiveData p0,t p1){
       a.p(p0, "photoViewData");
       a.p(p1, "playerInfoObservable");
       super();
       this.m = p0;
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.FALSE);
       this.a = mutableLiveD;
       this.b = new e0$h();
       LiveData liveData = Transformations.map(p0, new e0$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.c = liveData;
       liveData = Transformations.map(p0, new e0$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.d = liveData;
       liveData = Transformations.map(p0, new e0$c());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.e = liveData;
       liveData = Transformations.map(p0, new e0$d());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.f = liveData;
       LiveData liveData1 = Transformations.distinctUntilChanged(mutableLiveD);
       a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
       this.g = liveData1;
       liveData1 = Transformations.map(p0, new e0$e());
       a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
       this.h = liveData1;
       c uoc = new c();
       this.p0(uoc);
       this.i = uoc;
       uoc = new c();
       this.p0(uoc);
       this.j = uoc;
       uoc = new c();
       this.p0(uoc);
       this.k = uoc;
       this.l = t.combineLatest(a.a(p0), p1, new e0$f(this)).subscribe(new e0$g(this));
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, e0.class, "2")) {
          return;
       }
       super.onCleared();
       this.l.dispose();
       return;
    }
    public final LiveEvent u0(){
       return this.i;
    }
    public void v0(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof g$a) {
          LiveHotSpotPhotoViewData value = this.m.getValue();
          if (value != null) {
             a.o(value, "it");
             this.s0(this.j).q(value);
          }
       }else if(p0 instanceof g$b){
          if (a.g(this.g.getValue(), Boolean.FALSE)) {
             this.s0(this.k).q(l1.a);
          }else {
             this.s0(this.i).q(d0$b.a);
          }
       }else if(p0 instanceof g$c){
          this.a.setValue(Boolean.valueOf(p0.a()));
       }
       return;
    }
}
