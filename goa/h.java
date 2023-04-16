package goa.h;
import erd.g;
import goa.d;
import java.lang.Object;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CPopupResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.i3;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CPopupModel;
import k2b.u1;
import java.lang.CharSequence;
import android.app.Activity;
import o56.f;
import kzc.e;
import cg6.b;
import java.util.List;
import com.yxcorp.gifshow.widget.popup.c;
import java.util.Iterator;
import java.lang.Iterable;
import u07.t;
import u07.t$a;
import kzc.d;
import tkd.b;
import tkd.d;
import mp5.a;
import zn.b;
import java.lang.Integer;
import rn.b;
import rn.g$c;
import rn.g;
import goa.h$a;
import qn.l;
import goa.h$b;
import zn.a;
import qrd.l1;

public final class h implements g	// class@002b46
{
    public final d b;

    public void h(d p0){
       this.b = p0;
       super();
    }
    public final void a(GrowthC2CPopupResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "data");
       i3 oi3 = i3.f();
       GrowthC2CPopupResponse popup = p0.popup;
       String str = null;
       String tkBundleId = (popup != null)? popup.getTkBundleId(): str;
       oi3.d("tkBundleId", tkBundleId);
       tkBundleId = "type";
       oi3.d(tkBundleId, "total");
       u1.R("receiveFissionPopups", oi3.e(), 9);
       GrowthC2CPopupResponse popup1 = p0.popup;
       if (popup1 != null) {
          String tkBundleId1 = popup1.getTkBundleId();
          Activity uActivity = (tkBundleId1 == null || !tkBundleId1.length())? 1: null;
          if (!uActivity) {
             uActivity = f.a();
             if (uActivity != null) {
                List list = b.b().l(uActivity);
                if (list != null) {
                   Iterator iterator = list.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         t ot = iterator.next();
                         a.o(ot, "it");
                         t$a uoa = ot.b0();
                         if (!uoa instanceof d) {
                            uoa = str;
                         }
                         if (uoa != null && uoa.d() == 101) {
                            oi3 = i3.f();
                            p0 = p0.popup;
                            if (p0 != null) {
                               str = p0.getTkBundleId();
                            }
                            oi3.d("tkBundleId", str);
                            oi3.d(tkBundleId, "intercepted");
                            u1.R("receiveFissionPopups", oi3.e(), 9);
                            return;
                         }
                      }
                   }
                }
             }
             p0 = p0.popup;
             if (p0 != null) {
                str = p0.getTkBundleId();
                a.m(str);
                b uob = new b(str, p0);
                uob.s(p0.getTkMinVer());
                uob.p(true);
                uob.f(Integer.valueOf(101));
                uob.i(g$c.a);
                uob.g(true);
                uob.k(new h$a(p0, this));
                uob.r(new h$b(p0, this));
                d.a(0x68d1816a).KI(uob);
                p0.a = true;
             }
          }
       }
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
