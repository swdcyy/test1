package com.kuaishou.gifshow.kuaishan.logic.m1;
import t36.f;
import java.lang.String;
import k2b.u1;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.m1$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import x80.a;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import com.kuaishou.gifshow.kuaishan.logic.p0;
import java.util.Objects;
import com.yxcorp.gifshow.util.PostBaseInfoManager;
import java.util.Collection;
import ekd.q;
import java.io.File;
import g26.d;
import ekd.j;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import x80.w0;
import java.util.List;
import ok.h;
import java.util.Iterator;
import x80.a1;
import java.lang.Runnable;
import t45.c;
import x80.b1;
import crd.b;
import s66.a;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.StringBuilder;
import w46.b;
import java.lang.System;
import java.lang.Integer;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.gifshow.kuaishan.logic.j1;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.i1;
import com.kuaishou.gifshow.kuaishan.logic.k1;

public final class m1 extends f	// class@001a5f
{
    public o1 d;
    public KSTemplateDetailInfo e;
    public String f;
    public String g;
    public final a h;
    public boolean i;
    public final ClipTemplateDownloadService j;
    public b k;
    public static final m1 l;

    static {
       m1.l = new m1();
    }
    public void m1(){
       super();
       this.f = u1.f();
       this.g = "";
       this.h = KSDownloadHelperX.l();
       this.i = false;
       this.j = new m1$a(this);
       this.r0();
    }
    public static m1 w0(){
       return m1.l;
    }
    public void a(){
       PostBaseInfoManager e;
       if (PatchProxy.applyVoid(null, this, m1.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "KuaiShanManager";
       e.D().w(str, "clearData\(\) called", objArray);
       this.u0();
       if (this.e != null) {
          KSResourceDownloader.d().i();
          this.h.b();
          this.h.c(this.e, str);
          h1.b(this.e.mTemplateId, str);
          this.e = null;
       }
       p0 op0 = p0.j();
       Objects.requireNonNull(op0);
       if (!PatchProxy.applyVoid(null, op0, p0.class, "16") && !q.f(op0.c)) {
          File uFile = d.a();
          if (!uFile.isDirectory() || j.h(uFile.list())) {
             Object[] objArray1 = new Object[i];
             e.D().w("KuaiShanTemplateInfoManager", "empty template resource folder", objArray1);
          }else {
             ArrayList uArrayList = Lists.e(uFile.list());
             ArrayList uArrayList1 = Lists.b();
             uArrayList.remove("kuaishan_template_data");
             if (!q.f(uArrayList)) {
                List list = Lists.h(op0.c, new w0(uArrayList1));
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   String str1 = iterator.next();
                   File uFile1 = new File(uFile, str1);
                   if (!list.contains(str1)) {
                      c.a(new a1(uFile1));
                   }else {
                      Iterator iterator1 = Lists.e(uFile1.list()).iterator();
                      while (iterator1.hasNext()) {
                         String str2 = iterator1.next();
                         if (!uArrayList1.contains(str2)) {
                            c.a(new b1(new File(uFile1, str2)));
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       op0 = p0.j();
       e = op0.e;
       if (e != null) {
          e.dispose();
          op0.e = null;
       }
       op0.d = null;
       this.g = "";
       return;
    }
    public final void u0(){
       if (PatchProxy.applyVoid(null, this, m1.class, "5")) {
          return;
       }
       m1 tk = this.k;
       if (tk != null && !tk.isDisposed()) {
          this.k.dispose();
          this.k = null;
       }
       if (this.e != null) {
          a.e("KuaiShanTemplateId");
       }
       return;
    }
    public o1 v0(){
       return this.d;
    }
    public void x0(KSTemplateDetailInfo p0){
       m1 om1 = m1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om1, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KuaiShanManager", "prepareKuaiShanProject\(\) called with: info = ["+p0+"]", objArray);
       this.e = p0;
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, this, om1, "4")) {
          om1 = this.e;
          if (om1 == null) {
             Object[] objArray2 = new Object[0];
             e.D().t("KuaiShanManager", "prepareKuaiShanProject: mCurrentDetailInfo is null", objArray2);
          }else {
             this.u0();
             a.d("KuaiShanTemplateId", this.e.mTemplateId);
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(Integer.valueOf(0));
             i1 oi1 = new i1(this, System.currentTimeMillis(), om1, uArrayList);
             this.k = h1.e("KuaiShan", om1, objArray1, true).distinct().observeOn(d.a).doOnSubscribe(new j1(this, om1)).subscribe(v1, new k1(this, om1));
          }
       }
       return;
    }
    public void y0(o1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m1.class, "7")) {
          return;
       }
       e uoe = e.D();
       StringBuilder str = "setCurrentProject\(\) invoked, project == null? -- ";
       String str1 = (p0 == null)? "yes": "no";
       Object[] objArray = new Object[0];
       uoe.w("KuaiShanManager", str+str1, objArray);
       this.d = p0;
       return;
    }
}
