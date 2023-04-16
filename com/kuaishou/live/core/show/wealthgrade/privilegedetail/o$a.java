package com.kuaishou.live.core.show.wealthgrade.privilegedetail.o$a;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.p$a;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o;
import java.lang.Object;
import qm2.d0;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import qm2.a;
import pm2.a;
import o02.e;
import t02.a0;
import p91.m;
import qm2.w;
import erd.g;
import qm2.x;
import erd.o;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.SharedPreferences$Editor;
import oe6.g;
import u07.t$a;
import u07.f;
import w07.l;
import android.view.ViewGroup;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class o$a implements p$a	// class@001279
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void a(){
       d0.a(this);
    }
    public t b(boolean p0){
       a obj;
       t ot;
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.B.c;
       if (obj == null) {
          return t.just(Boolean.valueOf((p0 ^ 0x01)));
       }else if(p0){
          ot = e.q().d(obj.Z2.getLiveStreamId());
       }else {
          ot = e.q().a(obj.Z2.getLiveStreamId());
       }
       return ot.doOnNext(new w(obj, p0)).map(new x(p0));
    }
    public t c(){
       Object[] objArray = null;
       SharedPreferences obj = PatchProxy.apply(objArray, this, o$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a;
       String str = "user";
       if (!obj.getBoolean(b.d(str)+"hasShowPrivilegeHideTipsDialog", false)) {
          o$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, o.class, "12") && ta.getActivity() != null) {
             SharedPreferences$Editor uEditor = obj.edit();
             uEditor.putBoolean(b.d(str)+"hasShowPrivilegeHideTipsDialog", true);
             g.a(uEditor);
             t$a uoa = new t$a(ta.getActivity());
             uoa.W0(R.string.arg_RES_7f103ffc);
             uoa.S0(R.string.arg_RES_7f1012a9);
             uoa.y0(R.string.arg_RES_7f102ec2);
             uoa = f.e(uoa);
             uoa.a0(ta.D);
             uoa.C(ta.p);
             uoa.Y(PopupInterface.a);
          }
       }
       return t.just(Boolean.TRUE);
    }
}
