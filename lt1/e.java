package lt1.e;
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
import lt1.e$a;
import bt1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.CountDownTimer;
import lt1.a;
import lt1.a$a;
import pu1.b;
import zh3.c;
import lt1.a$b;
import qrd.l1;
import java.lang.Long;
import com.yxcorp.gifshow.util.DateUtils;

public final class e extends a	// class@003027
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public CountDownTimer d;
    public final e$a e;
    public final a f;
    public final d g;
    public final b h;
    public final b i;
    public final a j;

    public void e(a p0,d p1,b p2,b p3,a p4){
       a.p(p0, "multiPkLogDelegate");
       a.p(p1, "countDownModel");
       a.p(p2, "coreModel");
       a.p(p3, "gameModel");
       a.p(p4, "severTime");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       e$a uoa = new e$a(this);
       this.e = uoa;
       p3.i(uoa);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e td = this.d;
       if (td != null) {
          td.cancel();
       }
       this.r0(this.c).setValue(new Object());
       this.i.t(this.e);
       return;
    }
    public final LiveData u0(){
       return this.a;
    }
    public final LiveData v0(){
       return this.c;
    }
    public final LiveData w0(){
       return this.b;
    }
    public void x0(a p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "2")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof a$a) {
          if (!PatchProxy.applyVoid(null, this, uoe, "3")) {
             b.a.a(this.i.l(), this.i.k(), this.f);
          }
       }else if(p0 instanceof a$b){
          this.i.p().q(l1.a);
       }
       return;
    }
    public final void y0(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "5")) {
          return;
       }
       this.g.a().setValue(Long.valueOf(p0));
       this.r0(this.a).setValue(DateUtils.v(p0));
       return;
    }
}
