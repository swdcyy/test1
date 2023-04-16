package aec.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sx5.i;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.helper.h;
import com.kwai.feature.api.social.reminder.push.SocialPushKt;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.yxcorp.gifshow.util.rx.RxBus;
import qx5.b;
import brd.t;
import aec.j$a;
import erd.g;
import crd.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import aec.j$b;
import erd.r;
import aec.j$c;
import qrd.l1;
import sx5.g;

public final class j extends PresenterV2	// class@000107
{
    public i p;
    public TabHostFragment q;
    public t r;
    public g s;

    public void j(){
       super();
    }
    public static final i P8(j p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("pushData");
       }
       return p0;
    }
    public static final TabHostFragment R8(j p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("tabHost");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "2")) {
          return;
       }
       if (!h.a()) {
          j tp = this.p;
          if (tp == null) {
             a.S("pushData");
          }
          if (SocialPushKt.b(tp)) {
             Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
             uBooleanRef = new Ref$BooleanRef();
             this.X7(RxBus.f.f(b.class).subscribe(new j$a(uBooleanRef)));
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = objArray;
             j tq = this.q;
             if (tq == null) {
                a.S("tabHost");
             }
             b uob = tq.Vg().l().delay(500, TimeUnit.MILLISECONDS, d.c).filter(new j$b(this, uBooleanRef)).subscribe(new j$c(this, objectRef, uBooleanRef));
             this.X7(uob);
             objectRef.element = uob;
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       j ts = this.s;
       if (ts != null) {
          ts.b();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       Object obj = this.q8(i.class);
       a.o(obj, "inject\(SocialPushData::class.java\)");
       this.p = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.q = obj;
       obj = this.r8("ReminderTabChangeObservable");
       a.o(obj, "inject\(\"ReminderTabChangeObservable\"\)");
       this.r = obj;
       return;
    }
}
