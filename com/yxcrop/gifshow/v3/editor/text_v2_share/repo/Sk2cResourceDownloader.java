package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader$textDownloader$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader$costMap$2;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import eb7.a;
import java.lang.Integer;
import java.lang.Long;
import java.lang.System;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import k2b.u1;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;

public final class Sk2cResourceDownloader	// class@000bda
{
    public final p a;
    public final p b;

    public void Sk2cResourceDownloader(){
       super();
       this.a = s.c(Sk2cResourceDownloader$textDownloader$2.INSTANCE);
       this.b = s.c(Sk2cResourceDownloader$costMap$2.INSTANCE);
    }
    public final HashMap a(){
       Object obj = PatchProxy.apply(null, this, Sk2cResourceDownloader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, Sk2cResourceDownloader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void c(int p0,String p1){
       Sk2cResourceDownloader sk2cResource = Sk2cResourceDownloader.class;
       if (PatchProxy.isSupport(sk2cResource) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, sk2cResource, "6")) {
          return;
       }
       Long longx = this.a().get(p1);
       long l = (longx == null)? 0: System.currentTimeMillis() - longx.longValue();
       ClientStat$CdnResourceLoadStatEvent uCdnResource = new ClientStat$CdnResourceLoadStatEvent();
       uCdnResource.resourceType = 39;
       uCdnResource.loadStatus = p0;
       uCdnResource.totalCost = l;
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.cdnResourceLoadStatEvent = uCdnResource;
       u1.j0(statPackage);
       Object[] objArray = new Object[0];
       a.D().s("Sk2cResourceDownloader", "logDownloadEvent: "+p0+" cost: "+l, objArray);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, Sk2cResourceDownloader.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("Sk2cResourceDownloader", "stop", objArray);
       this.b().c();
       return;
    }
}
