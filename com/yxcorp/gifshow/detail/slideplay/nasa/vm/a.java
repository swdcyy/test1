package com.yxcorp.gifshow.detail.slideplay.nasa.vm.a;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import v6a.o0;
import v6a.z7;
import v6a.m0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le5.a;
import v6a.n0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a$a;
import uw9.l0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a$b;
import f4a.v;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import xf6.l;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import p5a.e;
import de5.a;
import tkd.b;
import tkd.d;
import h4a.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import ok.x;
import com.kwai.framework.player.core.b;
import f4a.b0;
import a16.a;
import u06.g;
import ry4.c;
import java.lang.StringBuilder;
import java.util.UUID;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a$c;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a$d;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a$e;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a$f;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a$g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a$h;

public class a	// class@0017f1
{

    public void a(){
       super();
    }
    public static m0 a(Activity p0,BaseFragment p1,PhotoDetailParam p2,NasaBizParam p3,o0 p4,z7 p5){
       m0 obj;
       PlcEntryStyleInfo plcEntryStyl;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       int i = 0;
       if (PatchProxy.isSupport2(a.class, "1")) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,oobject5};
          obj = PatchProxy.apply(objArray, null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new m0();
       obj.a = oobject;
       obj.b = oobject1;
       obj.c = oobject2;
       obj.h = oobject3;
       obj.j = oobject5.b;
       obj.k = oobject4.b;
       obj.W = oobject4.c;
       obj.l = oobject4.M1;
       obj.m = oobject4.N1;
       obj.n = oobject4.L;
       obj.i = oobject4.i;
       obj.o = oobject5.c;
       obj.p = new n0(oobject5);
       obj.r = oobject4.G1;
       obj.s = oobject4.F;
       obj.d = oobject4.D;
       obj.e = oobject4.d2;
       obj.f = oobject4.X1;
       obj.g = oobject4.n2;
       obj.t = oobject4.s1;
       obj.u = new a$a(oobject4);
       obj.A = oobject4.Z0;
       o0 e = oobject4.E;
       obj.v = e;
       obj.w = oobject4.Y0;
       obj.B = oobject4.z2;
       obj.q = oobject4.E2;
       obj.C = oobject4.g;
       obj.D = oobject4.x1;
       obj.r0 = oobject4.Q3;
       obj.E = oobject4.y1;
       obj.F = oobject4.L1;
       obj.G = oobject4.u;
       obj.H = oobject4.K2;
       obj.I = e.Z;
       obj.J = oobject4.W2;
       obj.K = oobject4.X2;
       obj.L = oobject4.Y2;
       obj.M = oobject4.N2;
       obj.N = oobject4.O2;
       obj.O = oobject4.Q2;
       obj.P = oobject4.R2;
       obj.Q = new a$b(oobject4);
       String str = "5";
       if (!PatchProxy.applyVoidOneRefsWithListener(obj, null, a.class, str)) {
          plcEntryStyl = v.b().c(obj.c.mPhoto);
          if (plcEntryStyl != null) {
             obj.c.mPhoto.setPlcEntryStyleInfo(plcEntryStyl);
          }
          if (l.c("test_switch_tuna_plc_mock_dynamic", i)) {
             PhotoDetailParam mPhoto = obj.c.mPhoto;
          }
          PatchProxy.onMethodExit(a.class, str);
       }
       str = "6";
       PLCLogHelper pLCLogHelper = PatchProxy.applyOneRefsWithListener(obj, null, a.class, str);
       if (pLCLogHelper != PatchProxyResult.class) {
       }else {
          pLCLogHelper = new PLCLogHelper();
          PlcEntryStyleInfo$PageType pageType = PlcEntryStyleInfo$PageType.SINGLE;
          pLCLogHelper.j(obj.a, obj.c.mPhoto, obj.p, obj.j.getPlayer(), obj.b, d.a(0x10c9d447), pageType);
          pLCLogHelper.h().O(pageType);
          PatchProxy.onMethodExit(a.class, str);
       }
       obj.R = pLCLogHelper;
       str = "2";
       a uoa = PatchProxy.applyOneRefsWithListener(obj, null, a.class, str);
       if (uoa != PatchProxyResult.class) {
       }else {
          plcEntryStyl = obj.c.mPhoto.getPlcEntryStyleInfo();
          a uoa1 = d.a(0x565dccdc).aF();
          if (plcEntryStyl != null && uoa1 != null) {
             uoa1.c();
             i = c.e(1, obj.c.mPhoto, plcEntryStyl);
             uoa1.e(plcEntryStyl, (i ^ 0x01), (i ^ 0x01));
          }
          obj.T = i;
          PatchProxy.onMethodExit(a.class, str);
          uoa = uoa1;
       }
       obj.S = uoa;
       str = "4";
       String str1 = PatchProxy.applyOneRefsWithListener(oobject2, null, a.class, str);
       if (str1 != PatchProxyResult.class) {
       }else {
          str1 = oobject2.mPhotoId+"_"+UUID.randomUUID();
          PatchProxy.onMethodExit(a.class, str);
       }
       obj.U = str1;
       obj.x = new a$c(oobject4);
       obj.y = new a$d(oobject4);
       obj.z = new a$e(oobject4);
       obj.V = new a$f(oobject4);
       obj.X = oobject4.o1;
       obj.Y = oobject4.p1;
       obj.Z = oobject4.b3;
       obj.a0 = oobject4.c3;
       obj.b0 = new a$g(oobject4);
       obj.c0 = oobject4.n3;
       obj.d0 = oobject4.o3;
       obj.e0 = oobject4.r3;
       obj.f0 = oobject4.s3;
       obj.g0 = oobject4.u3;
       obj.h0 = oobject4.v3;
       obj.i0 = oobject4.w3;
       obj.j0 = oobject4.p3;
       obj.p0 = oobject4.N3;
       obj.o0 = oobject4.E.u2;
       obj.k0 = oobject4.y3;
       obj.l0 = oobject4.z3;
       obj.n0 = oobject4.K3;
       obj.z0 = oobject4.V;
       obj.q0 = oobject4.j;
       obj.s0 = oobject4.C3;
       obj.t0 = oobject4.E3;
       obj.u0 = oobject4.H3;
       obj.v0 = oobject4.H2;
       obj.w0 = oobject4.a2;
       obj.x0 = oobject4.X3;
       obj.y0 = oobject4.Y3;
       obj.B0 = oobject4.a4;
       obj.C0 = oobject4.b4;
       obj.D0 = oobject4.c4;
       obj.E0 = oobject4.d4;
       obj.A0 = new a$h(oobject4);
       PatchProxy.onMethodExit(a.class, "1");
       return obj;
    }
}
