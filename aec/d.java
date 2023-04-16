package aec.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.helper.h;
import kotlin.jvm.internal.a;
import sx5.i;
import com.kwai.feature.api.social.reminder.push.SocialPushKt;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import wkd.b;
import sx5.d;
import aec.a;
import erd.o;
import aec.b;
import erd.g;
import aec.d$a;
import erd.r;
import aec.d$b;
import aec.d$c;
import aec.d$d;
import crd.b;
import android.view.View;
import com.yxcorp.utility.n;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;

public final class d extends PresenterV2	// class@0000fe
{
    public i p;
    public TabHostFragment q;
    public t r;
    public View s;
    public TextView t;
    public OpenServiceBarResponse u;
    public b v;
    public b w;

    public void d(){
       super();
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       if (!h.a()) {
          d tp = this.p;
          if (tp == null) {
             a.S("pushData");
          }
          if (SocialPushKt.a(tp) && this.s != null) {
             t ot = PatchProxy.apply(objArray, this, uod, "5");
             if (ot != PatchProxyResult.class) {
             }else {
                uod = this.u;
                if (uod != null) {
                   ot = t.just(uod);
                   if (ot == null) {
                   }
                }else {
                }
             }
             b uob = ot.filter(d$a.b).flatMap(new d$b(this)).subscribe(new d$c(this), d$d.b);
             this.v = uob;
             this.X7(uob);
          }
       }
    label_0079 :
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       d tv = this.v;
       if (tv != null) {
          tv.dispose();
       }
       this.v = null;
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       n.W(this.s, 8, 150);
       d tw = this.w;
       if (tw != null) {
          tw.dispose();
          this.w = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3596);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
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
