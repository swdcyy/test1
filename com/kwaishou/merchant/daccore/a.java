package com.kwaishou.merchant.daccore.a;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.String;
import d08.a;
import n08.a;
import com.kwaishou.merchant.daccore.pendant.extension.PendantExtension;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.Boolean;
import f08.f;
import java.util.Objects;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import java.lang.StringBuilder;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import java.util.Map;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import mv.a;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;
import nv.c;
import mv.e;
import com.kuaishou.bowl.event.utils.StageName;
import c08.a;
import q08.c;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import brd.t;
import t45.d;
import brd.z;
import a08.n;
import a08.e;
import crd.b;
import crd.a;
import l08.c;

public final class a implements g	// class@001308
{
    public final b b;
    public final String c;
    public final String d;
    public final a e;
    public final a f;
    public final PendantExtension g;
    public final String h;
    public final JsonObject i;

    public void a(b p0,String p1,String p2,a p3,a p4,PendantExtension p5,String p6,JsonObject p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final void accept(Object p0){
       a uoa1;
       a uoa2;
       a uoa3;
       a uoa = this;
       a b = uoa.b;
       a c = uoa.c;
       a d = uoa.d;
       a e = uoa.e;
       a f = uoa.f;
       a g = uoa.g;
       a h = uoa.h;
       a i = uoa.i;
       Boolean uBoolean = p0;
       b l = b.l;
       boolean b1 = uBoolean.booleanValue();
       Objects.requireNonNull(f.a);
       String str = "shouldShow result:";
       if (b1) {
          uoa1 = i;
          uoa2 = h;
          uoa3 = g;
          DyTroubleShooting.f(l, c, DACKeyNode.COMPONENT_SHOULD_SHOW, str+b1, DyTroubleShooting.c.m(), 1, null, null, 192, 0);
       }else {
          uoa1 = i;
          uoa2 = h;
          uoa3 = g;
          DyTroubleShooting.f(l, c, DACKeyNode.COMPONENT_SHOULD_SHOW, str+b1, DyTroubleShooting.c.m(), 0, 0, (b1 ^ 0x01), 96, 0);
       }
       a uoa4 = a.a();
       long l1 = System.currentTimeMillis();
       Objects.requireNonNull(uoa4);
       a uoa5 = a.class;
       if (!PatchProxy.isSupport(uoa5) || (!PatchProxy.applyVoidTwoRefs(d, Long.valueOf(l1), uoa4, uoa5, "7") && !TextUtils.isEmpty(d))) {
          c.f("p1: "+l1);
          uoa4.f(d).b = l1;
       }
       if (uBoolean.booleanValue()) {
          c.a(StageName.pendant_should_show, e, b.e);
          uoa4 = null;
          if (f != null) {
             PendantMountInfo pendantMount = f.e();
             if (pendantMount != null) {
                boolean unfixedConfi = pendantMount.getUnfixedConfig();
             }
          }
          if (uoa4) {
             b.i.c(uoa3.j(b.e, uoa2, e.g(), f.e(), uoa1, c).observeOn(d.a).subscribe(new n(b, e), new e(b, c, e)));
          }else {
             b.l(b.b(e, null));
          }
       }
       return;
    }
}
