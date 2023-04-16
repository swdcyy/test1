package com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$a;
import nsd.u;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$Companion$fontIdPathMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$costMap$2;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$fontDownloader$2;
import d0c.a;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$c;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$d;
import erd.g;
import java.util.List;
import e0c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import d0c.d;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$b;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import eb7.a;
import e0c.c;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import java.lang.CharSequence;
import java.io.File;
import java.lang.Long;
import java.lang.System;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import k2b.u1;

public final class FontDownloadHelper	// class@0010a1
{
    public final p a;
    public final p b;
    public static final p c;
    public static final FontDownloadHelper$a d;

    static {
       FontDownloadHelper.d = new FontDownloadHelper$a(null);
       FontDownloadHelper.c = s.c(FontDownloadHelper$Companion$fontIdPathMap$2.INSTANCE);
    }
    public void FontDownloadHelper(){
       super();
       this.a = s.c(FontDownloadHelper$costMap$2.INSTANCE);
       this.b = s.c(FontDownloadHelper$fontDownloader$2.INSTANCE);
    }
    public final t a(a p0){
       z obj = PatchProxy.applyOneRefs(p0, this, FontDownloadHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fontData");
       Log.b("FontBIZ", "download: "+p0.c());
       obj = d.c;
       t ot = t.create(new FontDownloadHelper$c(this, p0)).subscribeOn(obj).observeOn(obj);
       ot = ot.doOnError(FontDownloadHelper$d.b);
       a.o(ot, "Observable.create { emit¡­on: ${it.message}\"\)\n    }");
       return ot;
    }
    public final void b(List p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FontDownloadHelper.class, "4")) {
          return;
       }
       a.p(p0, "fontDataList");
       Log.b("FontBIZ", "download: "+p0);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          FontDownloadHelper$b uob = new FontDownloadHelper$b(this, iterator.next());
          uArrayList.add(uob.getId());
          boolean b = false;
          if (p1 && !PatchProxy.applyVoidOneRefs(uArrayList, p1, a.class, "1")) {
             a.p(uArrayList, "ids");
             if (!uArrayList.isEmpty()) {
                p1.c = uArrayList;
                p1.d.clear();
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   p1.d.put(iterator1.next(), Integer.valueOf(b));
                }
             }
          }
          if (p1) {
             p1.a = b;
             p1.b = b;
          }
          if (PatchProxy.applyVoidTwoRefs(uob, p1, this, FontDownloadHelper.class, "8")) {
             continue ;
          }
          Log.b("FontBIZ", "innerDownload: "+uob.a().c());
          this.d().d(uob, new c(this, uob, p1));
       }
       return;
    }
    public final HashMap c(){
       Object obj = PatchProxy.apply(null, this, FontDownloadHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final a d(){
       Object obj = PatchProxy.apply(null, this, FontDownloadHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final String e(String p0){
       FontDownloadHelper$a obj = PatchProxy.applyOneRefs(p0, this, FontDownloadHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "id");
       obj = FontDownloadHelper.d;
       String str = obj.a().get(p0);
       File uFile = (str == null || !str.length())? 1: null;
       if (uFile) {
          return null;
       }else if(!new File(str).exists()){
          obj.a().remove(p0);
          return null;
       }else {
          return str;
       }
    }
    public final void f(int p0,String p1){
       FontDownloadHelper uFontDownloa = FontDownloadHelper.class;
       if (PatchProxy.isSupport(uFontDownloa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uFontDownloa, "9")) {
          return;
       }
       Long longx = this.c().get(p1);
       long l = (longx == null)? 0: System.currentTimeMillis() - longx.longValue();
       ClientStat$CdnResourceLoadStatEvent uCdnResource = new ClientStat$CdnResourceLoadStatEvent();
       uCdnResource.resourceType = 36;
       uCdnResource.loadStatus = p0;
       uCdnResource.totalCost = l;
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.cdnResourceLoadStatEvent = uCdnResource;
       u1.j0(statPackage);
       Log.b("FontBIZ", "logDownloadEvent: "+p0+" cost: "+l);
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, FontDownloadHelper.class, "5")) {
          return;
       }
       this.d().c();
       return;
    }
}
