package com.kwai.framework.location.CurrentLocationCityManager$b;
import tk7.d;
import com.kwai.framework.location.CurrentLocationCityManager;
import tk7.b;
import v96.b;
import java.lang.String;
import android.app.Activity;
import brd.g;
import q96.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q96.a;
import p96.a;
import q87.c;
import e66.e;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;
import com.kwai.framework.location.k;
import o96.r;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import java.lang.StringBuilder;

public class CurrentLocationCityManager$b implements d	// class@001627
{
    public final b a;
    public final boolean b;
    public final b c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Activity h;
    public final boolean i;
    public final g j;
    public final d k;
    public final boolean l;
    public final String m;
    public final String n;
    public final boolean o;
    public final CurrentLocationCityManager p;

    public void CurrentLocationCityManager$b(CurrentLocationCityManager p0,b p1,boolean p2,b p3,String p4,String p5,String p6,String p7,Activity p8,boolean p9,g p10,d p11,boolean p12,String p13,String p14,boolean p15){
       int i = this;
       i.p = p0;
       i.a = p1;
       i.b = p2;
       i.c = p3;
       i.d = p4;
       i.e = p5;
       i.f = p6;
       i.g = p7;
       i.h = p8;
       i.i = p9;
       i.j = p10;
       i.k = p11;
       i.l = p12;
       i.m = p13;
       i.n = p14;
       i.o = p15;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CurrentLocationCityManager$b.class, "5")) {
          return;
       }
       this.p.handleRequestLocationError(this.d, 0x271e, this.j, "need cooldown", this.k);
       this.p.mIKLocationStat.f(this.d, this.f, this.n, this.e, 0x21ab2, this.b, this.o, this.c.c());
       Object[] objArray = new Object[0];
       a.C().s("ks.location.log:SDK", "requestPermissionFromUser need coolDown", objArray);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, CurrentLocationCityManager$b.class, "1")) {
          return;
       }
       a uoa = (this.a == null && (this.b == null && !e.a()))? 1: null;
       int i = -1;
       if (uoa) {
          i = a.t().a("KSLKPopupOptimizeSwitch", i);
       }
       this.c.c = i;
       return;
    }
    public void c(String p0,int p1){
       CurrentLocationCityManager$b uob = this;
       CurrentLocationCityManager$b uob1 = CurrentLocationCityManager$b.class;
       if (PatchProxy.isSupport(uob1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob1, "3")) {
          return;
       }
       k.g(uob.d, true);
       r or = new r(this, uob.h, uob.d, uob.g, uob.i, uob.j, uob.e, uob.f, uob.k, uob.l, uob.m, uob.c);
       c.k(v14);
       uob.p.mIKLocationStat.c(uob.d, uob.f, uob.n, uob.e, p1, uob.b, uob.o, uob.c.c());
       Object[] objArray = new Object[0];
       a.C().s("ks.location.log:SDK", "requestPermissionFromUser success type = "+p1, objArray);
       return;
    }
    public void d(String p0,int p1){
       CurrentLocationCityManager$b uob = CurrentLocationCityManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "4")) {
          return;
       }
       boolean b = false;
       k.g(this.d, b);
       p0 = (p1 == 0x21ab1)? 1: null;
       int i = (p0)? 0x271d: p1;
       p0 = (p0)? "user refuse": "privacy control";
       this.p.handleRequestLocationError(this.d, i, this.j, p0, this.k);
       this.p.mIKLocationStat.f(this.d, this.f, this.n, this.e, p1, this.b, this.o, this.c.c());
       Object[] objArray = new Object[b];
       a.C().s("ks.location.log:SDK", "requestPermissionFromUser denied type = "+p1, objArray);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, CurrentLocationCityManager$b.class, "2")) {
          return;
       }
       int i = this.c.c();
       if (i == 1) {
          return;
       }
       String str = (i == 2)? "BANNER": "BUSINESS";
       this.p.mIKLocationStat.a(this.d, str, this.e, this.f, this.g, i);
       return;
    }
}
