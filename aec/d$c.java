package aec.d$c;
import erd.g;
import aec.d;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.reminder.push.OpenServiceBarResponse;
import java.lang.Boolean;
import android.view.ViewStub;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import tkd.b;
import tkd.d;
import rx5.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import aec.f;
import sx5.i;
import android.view.View$OnClickListener;
import aec.g;
import java.lang.CharSequence;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import aec.h;
import erd.r;
import aec.i;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qrd.l1;

public final class d$c implements g	// class@0000fc
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
       }else {
          d$c tb = this.b;
          d p = tb.p;
          if (p == null) {
             a.S("pushData");
          }
          String first = p0.getFirst();
          a.o(first, "it.first");
          Object obj = first;
          p0 = p0.getSecond();
          a.o(p0, "it.second");
          boolean b = p0.booleanValue();
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(p, obj, Boolean.valueOf(b), tb, d.class, "4")) {
             if (b) {
                if (!PatchProxy.applyVoidTwoRefs(p, obj, tb, d.class, "7")) {
                   b = tb.s;
                   if (!b instanceof ViewStub) {
                      b = null;
                   }
                   first = "tabHost";
                   if (b != null) {
                      b.setLayoutResource(R.layout.arg_RES_7f0d12fa);
                      b = b.inflate();
                      tb.s = b;
                      tb.t = m1.f(b, 0x7f0a359a);
                      b = d.a(0x77cfa10c);
                      d q = tb.q;
                      if (q == null) {
                         a.S(first);
                      }
                      View[] viewArray = new View[]{tb.s};
                      b.Qa(q, viewArray);
                      b = tb.s;
                      if (b != null) {
                         b = b.findViewById(R.id.reminder_push_guide_close);
                         if (b != null) {
                            b.setOnClickListener(new f(tb, p, obj));
                         }
                      }
                      b = tb.s;
                      if (b != null) {
                         b.setOnClickListener(new g(tb, p, obj));
                      }
                   }
                   b = tb.t;
                   if (b != null) {
                      b.setText(obj.pushAuthorityGuideBarText);
                   }
                   n.W(tb.s, 0, 150);
                   if (tb.w == null) {
                      b = tb.q;
                      if (b == null) {
                         a.S(first);
                      }
                      b = b.Vg().l().filter(h.b).subscribe(new i(tb));
                      tb.X7(b);
                      tb.w = b;
                   }
                }
             }else {
                tb.R8();
             }
          }
       }
    label_00f8 :
       return;
    }
}
