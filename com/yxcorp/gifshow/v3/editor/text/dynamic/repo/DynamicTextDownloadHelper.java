package com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper;
import java.lang.String;
import hqc.i;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper$textDownloader$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper$costMap$2;
import nuc.c;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper$b;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper$c;
import erd.g;
import java.util.HashMap;
import eb7.a;
import java.lang.Integer;
import java.lang.Long;
import java.lang.System;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import k2b.u1;

public final class DynamicTextDownloadHelper	// class@0013dc
{
    public final p a;
    public final p b;
    public final String c;
    public final i d;

    public void DynamicTextDownloadHelper(String p0,i p1){
       a.p(p0, "customBizType");
       a.p(p1, "unzipFolderSupplier");
       super();
       this.c = p0;
       this.d = p1;
       this.a = s.c(DynamicTextDownloadHelper$textDownloader$2.INSTANCE);
       this.b = s.c(DynamicTextDownloadHelper$costMap$2.INSTANCE);
    }
    public final t a(c p0){
       z obj = PatchProxy.applyOneRefs(p0, this, DynamicTextDownloadHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dynamicViewData");
       Object[] objArray = new Object[0];
       a.D().s("DynamicTextDownloadHelper", "download: "+p0.b(), objArray);
       obj = d.c;
       t ot = t.create(new DynamicTextDownloadHelper$b(this, p0)).subscribeOn(obj).observeOn(obj);
       ot = ot.doOnError(DynamicTextDownloadHelper$c.b);
       a.o(ot, "Observable.create { emit¡­on: ${it.message}\"\)\n    }");
       return ot;
    }
    public final HashMap b(){
       Object obj = PatchProxy.apply(null, this, DynamicTextDownloadHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, DynamicTextDownloadHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void d(int p0,String p1){
       DynamicTextDownloadHelper uDynamicText = DynamicTextDownloadHelper.class;
       if (PatchProxy.isSupport(uDynamicText) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uDynamicText, "6")) {
          return;
       }
       Long longx = this.b().get(p1);
       long l = (longx == null)? 0: System.currentTimeMillis() - longx.longValue();
       ClientStat$CdnResourceLoadStatEvent uCdnResource = new ClientStat$CdnResourceLoadStatEvent();
       uCdnResource.resourceType = 39;
       uCdnResource.loadStatus = p0;
       uCdnResource.totalCost = l;
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.cdnResourceLoadStatEvent = uCdnResource;
       u1.j0(statPackage);
       Object[] objArray = new Object[0];
       a.D().s("DynamicTextDownloadHelper", "logDownloadEvent: "+p0+" cost: "+l, objArray);
       return;
    }
}
