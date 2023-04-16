package dw2.j;
import yh3.a;
import dw2.j$b;
import nsd.u;
import hf3.a;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wa1.h;
import dw2.i$b;
import dw2.j$d;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import dw2.j$a;
import com.kuaishou.livestream.message.nano.SCTheaterEpisodeSwitchToast;
import java.lang.Class;
import lf3.g;
import op2.j;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import dw2.i;
import dw2.j$c;
import java.lang.Runnable;

public final class j extends a	// class@0025c0
{
    public final h a;
    public i b;
    public final j$d c;
    public final LiveData d;
    public final LiveData e;
    public final AudienceTheaterManager f;
    public static final j$b g;

    static {
       j.g = new j$b(null);
    }
    public void j(a p0,AudienceTheaterManager p1){
       a.p(p0, "liveLongConnection");
       a.p(p1, "theaterManager");
       super();
       this.f = p1;
       h oh = new h(p0);
       this.a = oh;
       this.b = i$b.d;
       j$d uod = new j$d(this);
       this.c = uod;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       mutableLiveD = new MutableLiveData(Boolean.FALSE);
       this.o0(mutableLiveD);
       this.e = mutableLiveD;
       oh.a(634, SCTheaterEpisodeSwitchToast.class, new j$a(this));
       p1.a(uod);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.a.b();
       this.f.o(this.c);
       k1.n(this);
       return;
    }
    public final LiveData u0(){
       return this.d;
    }
    public final LiveData v0(){
       return this.e;
    }
    public final void w0(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       i value = this.d.getValue();
       if (value == null || value.a() != true) {
          this.r0(this.d).setValue(p0);
          if (p0.a()) {
             k1.s(new j$c(this), this, 3000);
          }
       }else {
          this.b = p0;
       }
       return;
    }
}
