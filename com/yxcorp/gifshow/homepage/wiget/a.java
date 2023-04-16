package com.yxcorp.gifshow.homepage.wiget.a;
import java.lang.Object;
import java.util.LinkedList;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.b;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import rua.b;
import erd.g;
import crd.b;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VisitDetailPackage;
import java.lang.System;
import java.util.List;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchVisitDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Double;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;

public class a	// class@001812
{
    public final List a;
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
       this.a = new LinkedList();
       RxBus.f.f(b.class).observeOn(d.a).subscribe(new b(this));
    }
    public static a b(){
       return a.b;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       ClientContent$VisitDetailPackage visitDetailP = new ClientContent$VisitDetailPackage();
       visitDetailP.url = p0;
       visitDetailP.clientTimestamp = System.currentTimeMillis();
       int i = 0;
       while (true) {
          if (i < this.a.size()) {
             if (p0.equals(this.a.get(i).url)) {
                this.a.remove(i);
                this.a.add(visitDetailP);
                return;
             }else {
                i = i + 1;
             }
          }else if(this.a.size() >= 5){
             this.a.remove(0);
             break ;
          }
          break ;
       }
       this.a.add(visitDetailP);
       return;
    }
    public void c(int p0,String p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       this.d(p0, p1, 0, "", false);
       return;
    }
    public void d(int p0,String p1,int p2,String p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       ClientContent$BatchVisitDetailPackage uBatchVisitD = new ClientContent$BatchVisitDetailPackage();
       a ta = this.a;
       ClientContent$VisitDetailPackage[] visitDetailP = new ClientContent$VisitDetailPackage[ta.size()];
       uBatchVisitD.visitDetailPackage = ta.toArray(visitDetailP);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.batchVisitDetailPackage = uBatchVisitD;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = p0;
       uElementPack.name = TextUtils.k(p1);
       if (TextUtils.x(p3)) {
          p3 = "0";
       }
       uElementPack.value = Double.valueOf(p3).doubleValue();
       uElementPack.index = p4;
       if (p2 > 0) {
          uElementPack.value = (double)p2;
       }
       uElementPack.type = 1;
       ClientEvent$UrlPackage urlPackage = u1.k();
       if (urlPackage != null) {
          urlPackage.page = 46;
          urlPackage.page2 = "MENU";
       }
       u1.A(urlPackage, "", 1, uElementPack, uContentPack);
       return;
    }
}
