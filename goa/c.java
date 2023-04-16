package goa.c;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import goa.c$a;
import java.lang.String;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthNebulaActivityConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.invitecode.InviteSwitchUtil;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Boolean;
import wkd.b;
import goa.d;
import java.util.Objects;
import kotlin.jvm.internal.a;
import yma.a;
import yma.c;
import brd.t;
import cjd.e;
import erd.o;
import goa.h;
import goa.i;
import erd.g;
import crd.b;
import lnc.i3;
import com.yxcorp.gifshow.growth.invitecode.model.FissionExtraInfo;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CDialogModel;
import k2b.u1;
import java.lang.CharSequence;
import cra.w;
import q87.c;
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
import goa.c$b;
import qn.l;
import goa.c$c;
import zn.a;
import qrd.l1;

public final class c extends ConfigAutoParseJsonConsumer	// class@002b3a
{
    public static boolean e;
    public static final c f;

    static {
       c.f = new c();
    }
    public void c(){
       super("nebulaActivityConfig", c$a.b);
    }
    public static final void d(c p0,boolean p1){
       c.e = p1;
    }
    public void b(Object p0){
       this.e(p0);
    }
    public void e(GrowthNebulaActivityConfig p0){
       String tkBundleId;
       GrowthC2CDialogModel c2cDialog1;
       int i;
       GrowthC2CDialogModel c2cDialog2;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       Object[] objArray = null;
       Boolean uBoolean = PatchProxy.apply(objArray, objArray, InviteSwitchUtil.class, "1");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = InviteSwitchUtil.a.getValue();
       }
       if (uBoolean.booleanValue()) {
          d uod = b.a(0x56d4a121);
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoid(objArray, uod, d.class, "3")) {
             Object obj = b.a(-1257347683);
             a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
             obj.a().f(uod.b).map(new e()).subscribe(new h(uod), i.b);
          }
       }
       i3 oi3 = i3.f();
       if (p0 != null) {
          FissionExtraInfo fissionExtra = p0.getFissionExtraInfo();
          if (fissionExtra != null) {
             GrowthC2CDialogModel c2cDialog = fissionExtra.getC2cDialog();
             if (c2cDialog != null) {
                tkBundleId = c2cDialog.getTkBundleId();
             label_0083 :
                oi3.d("tkBundleId", tkBundleId);
                tkBundleId = "type";
                oi3.d(tkBundleId, "total");
                u1.R("receiveStartupC2CDialog", oi3.e(), 9);
                if (p0 != null) {
                   FissionExtraInfo fissionExtra1 = p0.getFissionExtraInfo();
                   if (fissionExtra1 != null) {
                      c2cDialog1 = fissionExtra1.getC2cDialog();
                   label_00a8 :
                      if (c2cDialog1 != null) {
                         String tkBundleId1 = p0.getFissionExtraInfo().getC2cDialog().getTkBundleId();
                         i = 0;
                         String str = 1;
                         w ow = (tkBundleId1 == null || !tkBundleId1.length())? 1: null;
                         if (!ow) {
                            Object[] objArray1 = new Object[i];
                            w.C().t("GrowthModule", "准备展示c2cDialog", objArray1);
                            Activity uActivity = f.a();
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
                                           uoa = objArray;
                                        }
                                        if (uoa != null && uoa.d() == 101) {
                                           Object[] objArray2 = new Object[i];
                                           w.C().t("GrowthModule", "当前队列中有c2cDialog，不再展示", objArray2);
                                           oi3 = i3.f();
                                           FissionExtraInfo fissionExtra2 = p0.getFissionExtraInfo();
                                           if (fissionExtra2 != null) {
                                              c2cDialog2 = fissionExtra2.getC2cDialog();
                                              if (c2cDialog2 != null) {
                                                 objArray = c2cDialog2.getTkBundleId();
                                              }
                                           }
                                           oi3.d("tkBundleId", objArray);
                                           oi3.d(tkBundleId, "intercepted");
                                           u1.R("receiveStartupC2CDialog", oi3.e(), 9);
                                           return;
                                        }
                                     }
                                  }
                               }
                            }
                            c2cDialog2 = p0.getFissionExtraInfo().getC2cDialog();
                            tkBundleId = c2cDialog2.getTkBundleId();
                            a.m(tkBundleId);
                            b uob = new b(tkBundleId, c2cDialog2);
                            uob.s(c2cDialog2.getTkMinVer());
                            uob.p(str);
                            uob.f(Integer.valueOf(101));
                            uob.i(g$c.a);
                            uob.g(str);
                            uob.k(new c$b());
                            uob.r(new c$c());
                            d.a(0x68d1816a).KI(uob);
                            c.e = str;
                         }
                      }
                      return;
                   }
                }
                c2cDialog1 = objArray;
                goto label_00a8 ;
             }
          }
       }
       tkBundleId = objArray;
       goto label_0083 ;
    }
}
