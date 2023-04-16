package com.yxcorp.plugin.setting.presenter.m$b;
import oj0.a;
import com.yxcorp.plugin.setting.presenter.m;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import zw5.a;
import brd.t;
import tgd.y;
import sfc.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import agd.j;

public class m$b implements a	// class@0008e5
{
    public final m b;

    public void m$b(m p0){
       this.b = p0;
       super();
    }
    public void W(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$b.class, "1")) {
          return;
       }
       List list = p0.get("selectedUIds");
       boolean b = p0.get("needRequestChangePrivacy").booleanValue();
       m$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(3), list, Boolean.valueOf(b), tb, m.class, "16")) {
          if (b) {
             tb.X7(d.a(0x2001f24e).r8(3, list).subscribe(new y(tb, 3, list), new a()));
          }else {
             tb.V8(3, list);
          }
       }
       m$b tb1 = this.b;
       tb1.y.J0(tb1.R8(tb1.r));
       return;
    }
}
