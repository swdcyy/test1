package lt1.j;
import yh3.a;
import st1.a;
import ut1.d;
import zs1.b;
import ft1.b;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import lt1.j$a;
import z0.a;
import androidx.lifecycle.Transformations;
import cu1.d;
import lt1.j$b;
import bt1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.CountDownTimer;
import java.lang.Boolean;
import lt1.a;
import lt1.a$a;
import pu1.b;
import zh3.c;
import java.lang.Long;
import com.yxcorp.gifshow.util.DateUtils;

public final class j extends a	// class@003031
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public CountDownTimer e;
    public boolean f;
    public final j$b g;
    public final a h;
    public final d i;
    public final b j;
    public final b k;
    public final a l;

    public void j(a p0,d p1,b p2,b p3,a p4){
       a.p(p0, "multiPkLogDelegate");
       a.p(p1, "countDownModel");
       a.p(p2, "coreModel");
       a.p(p3, "gameModel");
       a.p(p4, "severTime");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.l = p4;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       LiveData liveData = Transformations.map(p2.l(), new j$a(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(d.a(liveData));
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.d = liveData;
       j$b uob = new j$b(this);
       this.g = uob;
       p3.i(uob);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       j te = this.e;
       if (te != null) {
          te.cancel();
       }
       this.r0(this.c).setValue(Boolean.FALSE);
       this.k.t(this.g);
       return;
    }
    public final LiveData u0(){
       return this.b;
    }
    public final LiveData v0(){
       return this.a;
    }
    public final LiveData w0(){
       return this.c;
    }
    public void x0(a p0){
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, "2")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof a$a && !PatchProxy.applyVoid(null, this, oj, "3")) {
          b.a.a(this.k.l(), this.k.k(), this.h);
       }
       return;
    }
    public final void y0(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "5")) {
          return;
       }
       this.i.a().setValue(Long.valueOf(p0));
       this.r0(this.b).setValue(DateUtils.v(p0));
       if (this.f != null && p0 - 0x36ee80 < 0) {
          this.r0(this.a).setValue(new Object());
          this.f = false;
       }
       return;
    }
}
