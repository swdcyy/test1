package kt1.h;
import yh3.a;
import kt1.h$a;
import nsd.u;
import kt1.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import kt1.h$b;
import androidx.lifecycle.Observer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kt1.a;
import kt1.a$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kt1.b;
import trd.j;
import msd.a;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pu1.d;
import pp.c;
import com.kuaishou.android.live.log.b;
import kt1.e;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimType;
import qrd.l1;

public final class h extends a	// class@002dfb
{
    public final LiveData a;
    public final LiveData b;
    public boolean c;
    public final Observer d;
    public final d e;
    public static final h$a f;

    static {
       h.f = new h$a(null);
    }
    public void h(d p0){
       a.p(p0, "animModel");
       super();
       this.e = p0;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       h$b uob = new h$b(this);
       this.d = uob;
       p0.a().observeForever(uob);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.e.a().removeObserver(this.d);
       return;
    }
    public void u0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof a$a) {
          this.c = false;
          this.v0();
       }
       return;
    }
    public final void v0(){
       b c;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, h.class, str)) {
          return;
       }
       h te = this.e;
       Objects.requireNonNull(te);
       Object[] objArray1 = PatchProxy.apply(objArray, te, d.class, str);
       if (objArray1 != PatchProxyResult.class) {
       }else {
          b uob = te.a.F();
          if (uob != null) {
             c = uob.c;
             if (c != null && c.invoke().booleanValue() == true) {
                objArray1 = objArray;
             }
          }
          c = uob;
       }
       if (objArray1 != null) {
          LiveCommonLogTag mULTI_PK = LiveCommonLogTag.MULTI_PK;
          b.c0(mULTI_PK, "LiveMultiPkGameAnimViewModel showNextAnim", "anim", objArray1.b());
          this.c = true;
          e uoe = objArray1.a();
          if (uoe != null) {
             objArray = uoe.a;
          }
          if (objArray == LiveMultiPkGameAnimType.WITH_BOTTOM_AREA) {
             this.r0(this.b).setValue(objArray1);
          }else {
             this.r0(this.a).setValue(objArray1);
          }
          b.Z(mULTI_PK, "LiveMultiPkGameAnimViewModel no nextAnim");
       }
       return;
    }
}
