package com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$e;
import cc9.i;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.a;
import java.util.Objects;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.assistant.a$a;
import com.yxcorp.gifshow.camera.record.base.d;
import rd9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import zb9.j;
import dc9.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import q2b.h$b;
import k2b.e0;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ce9.l;
import tkd.b;
import tkd.d;
import uyb.c;
import kd9.s;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.f;
import android.content.Context;
import kd9.t;
import java.util.List;
import java.util.Collection;
import ec9.f1;
import cc9.c;
import sa6.a;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import kzc.d;
import android.app.Activity;
import java.lang.CharSequence;
import u07.t$a;
import zb9.i0;
import u07.u;
import zb9.j0;
import zb9.k0;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import u07.a;
import zb9.l0;
import w07.l;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import ec9.j;
import cc9.e;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import zb9.z;
import java.lang.Runnable;
import yb7.p;

public final class AssistantModeController$e implements i	// class@001cea
{
    public final AssistantModeController a;

    public void AssistantModeController$e(AssistantModeController p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantModeController$e.class, "1")) {
       }else {
          a.p(p0, "newState");
          this.a.v2();
          if (this.a.o2().C() || this.a.o2().y()) {
             this.a.w = p0;
             if (p0.e()) {
                AssistantModeController$e ta = this.a;
                Objects.requireNonNull(ta);
                AssistantModeController uAssistantMo = AssistantModeController.class;
                if (!PatchProxy.applyVoidOneRefs(p0, ta, uAssistantMo, "14") && !ta.Q.D()) {
                   Object[] objArray = new Object[0];
                   String str = "CameraAssist";
                   a.D().w(str, "openAssistantMode ", objArray);
                   ta.Q.J(a.I.b());
                   ta.d.m(new a());
                   Objects.requireNonNull(ta.Q);
                   boolean b = true;
                   ta.Q.L(b);
                   ta.d.m(new j(b));
                   c uoc = ta.Q.h();
                   p0 = ta.y;
                   AssistantModeController z = ta.z;
                   d d = ta.d;
                   a.o(d, "mCallerContext");
                   BaseFragment uBaseFragmen = d.f();
                   a.o(uBaseFragmen, "mCallerContext.fragment");
                   Objects.requireNonNull(uoc);
                   if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(z), uBaseFragmen, uoc, c.class, "1")) {
                      a.p(uBaseFragmen, "page");
                      String str1 = "ENTER_AI_RECORD";
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = str1;
                      JsonObject jsonObject = new JsonObject();
                      String str2 = "enter_type";
                      if (p0 != null) {
                         jsonObject.c0(str2, "auto");
                      }else {
                         jsonObject.c0(str2, "click");
                      }
                      boolean b1 = (z != null || p0 != null)? true: false;
                      jsonObject.H("is_enter_bubble", Boolean.valueOf(b1));
                      uElementPack.params = jsonObject.toString();
                      b1 = h$b.e(b, str1);
                      b1.k(uElementPack);
                      u1.p0("", uBaseFragmen, b1);
                   }
                   ta.y = false;
                   p0 = ta.z;
                   ta.z = false;
                   Object[] objArray1 = null;
                   MagicEmoji$MagicFace magicFace = PatchProxy.apply(objArray1, ta, uAssistantMo, "16");
                   if (magicFace != PatchProxyResult.class) {
                   }else {
                      l obj = ta.d.d(l.i);
                      a.o(obj, "mCallerContext.getData\(MagicData.sDefaultValue\)");
                      obj = obj.b;
                      if (obj != null) {
                         magicFace = d.a(-314635782).ZS(obj);
                         if (magicFace == null) {
                         }
                      }else {
                      }
                   }
                   ta.x = magicFace;
                   ta.M = ta.d.d(s.g).e;
                   RxBus.f.b(new f(objArray1, ta.e));
                   ta.d.m(new t(b));
                   List list = ta.Q.k();
                   if (list != null && (list.isEmpty() ^ b)) {
                      ta.Q.r().w0(new c(5));
                   }
                   ta.v2();
                   AssistantUtils d1 = AssistantUtils.d;
                   if (d1.j()) {
                      AssistantUtils uAssistantUt = AssistantUtils.class;
                      if (!PatchProxy.isSupport(uAssistantUt) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, d1, uAssistantUt, "17")) {
                         SharedPreferences$Editor uEditor = a.a.edit();
                         uEditor.putBoolean("need_show_assistant_dialog", 0);
                         g.a(uEditor);
                      }
                      AssistantModeController q = ta.Q;
                      if (!q.u() || p0 == null) {
                         b = false;
                      }
                      q.O(b);
                      if (!PatchProxy.applyVoid(objArray1, ta, uAssistantMo, "37")) {
                         p0 = new d(ta.e);
                         p0.X0(d1.l(R.string.arg_RES_7f100238));
                         p0.z0(d1.l(R.string.arg_RES_7f100237));
                         p0.B0(R.drawable.arg_RES_7f08010d);
                         p0.T0(d1.l(R.string.arg_RES_7f100236));
                         p0.u0(new i0(ta));
                         p0.s0(new j0(ta));
                         p0.J(new k0(ta));
                         p0 = a.b(p0);
                         p0.a0(l0.a);
                         p0.b0().Z();
                         ta.Q.P(0);
                      }
                   }else {
                      List list1 = ta.Q.k();
                      if (list1 == null || list1.isEmpty()) {
                         objArray = new Object[0];
                         a.D().w(str, "handle detect start action when openAssistantMode", objArray);
                         j oj = ta.Q.g();
                         d d2 = ta.d;
                         a.o(d2, "mCallerContext");
                         str = d1.m(d2);
                         if (ta.Q.u() && p0 != null) {
                            objArray1 = ta.Q.t();
                         }
                         oj.w0(new e(str, 0, 0, objArray1));
                         ta.Q.O(0);
                      }
                   }
                   p.d(new z(ta));
                }
             }else {
                this.a.l2(0);
             }
          }
       }
       return;
    }
}
