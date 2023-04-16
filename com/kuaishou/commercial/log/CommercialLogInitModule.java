package com.kuaishou.commercial.log.CommercialLogInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import tkd.b;
import tkd.d;
import lm9.a;
import ada.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import mxb.j0;
import mxb.i0;
import com.kuaishou.commercial.log.n;
import l66.c;
import wca.r;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import yx.h;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.c;
import brd.t;
import t45.d;
import brd.z;
import yx.i;
import org.greenrobot.eventbus.a;
import dda.h;
import com.kuaishou.commercial.log.h;
import dda.c;
import yx.f0;
import kb5.a;
import yx.g;
import va5.b;
import yx.d0;
import lnc.x0;
import yx.e0;
import ujc.a;
import com.kuaishou.commercial.log.d;
import ujc.b;
import com.kuaishou.commercial.log.b;
import ujc.c;
import com.kuaishou.commercial.log.c;
import ujc.f;
import com.kuaishou.commercial.log.e;
import ujc.h;
import com.kuaishou.commercial.log.m;
import ujc.i;
import com.kuaishou.commercial.log.i;
import ujc.j;
import com.kuaishou.commercial.log.f;
import ujc.k;
import yx.c0;
import ujc.l;
import com.kuaishou.commercial.log.g;
import dda.b;
import yx.s;
import dda.k;
import yx.g0;
import dda.l;
import com.kuaishou.commercial.log.l;
import dda.m;
import yx.f;
import wkd.b;
import l66.a;
import yx.h0;

public class CommercialLogInitModule extends a	// class@0014f4
{

    public void CommercialLogInitModule(){
       super();
    }
    public int f0(){
       return 6;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, CommercialLogInitModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialLogInitModule.class, "3")) {
          return;
       }
       d.a(-1638991736).init();
       return;
    }
    public void l0(c p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialLogInitModule.class, "4")) {
          return;
       }
       c a = p0.a;
       PhotoAdvertisement$AdGroup[] obj = PatchProxy.applyOneRefs(a, this, CommercialLogInitModule.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          QPhoto qPhoto1 = new QPhoto(a);
          if (k.B(qPhoto1) == null) {
             PlcEntryStyleInfo plcEntryStyl = qPhoto1.getPlcEntryStyleInfo();
             if (plcEntryStyl == null || !plcEntryStyl.needReportAdLogByPlcData()) {
                b = false;
             }
          }
          b = true;
       }
       if (!b) {
          return;
       }else {
          QPhoto qPhoto = new QPhoto(p0.a);
          if (!qPhoto.isLiveStream() && k.B(qPhoto) != null) {
             obj = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.FANS_TOP};
             if (k.B(qPhoto).isAdGroup(obj)) {
                i0.a().t(28, qPhoto.mEntity);
             }
          }
          return;
       }
    }
    public void n(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, CommercialLogInitModule.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, CommercialLogInitModule.class, "2")) {
          n on = new n();
          if (!PatchProxy.applyVoid(objArray, on, n.class, str)) {
             RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
             c.a().c(r.class, mAIN, new h(on));
             RxBus.f.f(c.class).observeOn(d.a).subscribe(new i(on));
             if (!a.d().i(on)) {
                a.d().p(on);
             }
             c.a().c(h.class, mAIN, new h(on));
             c.a().c(c.class, mAIN, new f0(on));
             c.a().c(a.class, mAIN, new g(on));
             c.a().c(b.class, mAIN, new d0(on));
             c.a().c(x0.class, mAIN, new e0(on));
             c.a().c(a.class, mAIN, new d(on));
             c.a().c(b.class, mAIN, new b(on));
             c.a().c(c.class, mAIN, new c(on));
             c.a().c(f.class, mAIN, new e(on));
             c.a().c(h.class, mAIN, new m(on));
             c.a().c(i.class, mAIN, new i(on));
             c.a().c(j.class, mAIN, new f(on));
             c.a().c(k.class, mAIN, new c0(on));
             c.a().c(l.class, mAIN, new g(on));
             c.a().c(b.class, mAIN, new s(on));
             c.a().c(k.class, mAIN, new g0(on));
             c.a().c(l.class, mAIN, new l(on));
             c.a().c(m.class, mAIN, new f(on));
          }
          a uoa = b.a(0x6d2a4fdd);
          if (uoa != null) {
             uoa.a(on);
          }
          RxBus.f.f(c.class).observeOn(d.a).subscribe(new h0(this));
       }
       return;
    }
}
