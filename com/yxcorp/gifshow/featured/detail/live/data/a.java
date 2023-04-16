package com.yxcorp.gifshow.featured.detail.live.data.a;
import qvb.f;
import java.lang.String;
import java.util.List;
import yqb.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import com.yxcorp.gifshow.featured.detail.live.data.FeatureLiveFeedsResponse;
import qvb.a;
import java.lang.Throwable;
import java.util.Objects;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import gea.a;
import cjd.e;
import erd.o;
import eea.a;
import erd.g;
import t45.d;
import brd.z;
import la6.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import kp.y1;

public class a extends f	// class@000f95
{
    public String p;
    public String q;
    public int r;
    public int s;
    public int t;

    public void a(String p0,String p1,List p2,k p3){
       super();
       this.p = p0;
       this.q = p1;
       this.r = p3.a;
       this.s = p3.b;
       this.t = p3.c;
       if (!p2.isEmpty() && !PatchProxy.applyVoidOneRefs(p2, this, a.class, "5")) {
          FeatureLiveFeedsResponse uFeatureLive = this.L0();
          if (uFeatureLive == null) {
             uFeatureLive = new FeatureLiveFeedsResponse();
             uFeatureLive.mItems = p2;
          }
          this.S1(uFeatureLive);
          this.b(p2);
       }
       return;
    }
    public static void h2(a p0,Throwable p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, a.class, "6")) {
       }else {
          ExceptionHandler.handleException(a.B, p1);
       }
       return;
    }
    public t I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       t ot = PatchProxy.apply(objArray, this, uoa, "2");
       if (ot != patchProxyRe) {
       }else {
          a tr = this.r;
          int i = 0x36cc0bcb;
          if (tr == 2) {
             ot = b.a(i).c(this.i2(), this.p, this.s, this.t).map(new e()).doOnError(new a(this));
          }else if(tr == 1){
             ot = b.a(i).b(this.i2(), this.p, this.q, this.s).map(new e()).doOnError(new a(this));
          }else {
             ot = b.a(i).a(this.i2(), this.p, this.s).map(new e()).doOnError(new a(this));
          }
       }
       return ot.subscribeOn(d.b).observeOn(d.a);
    }
    public void M1(Object p0,List p1){
       this.j2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.j2(p0, p1);
    }
    public boolean i(){
       return false;
    }
    public final String i2(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().mCursor;
       }
       return objArray;
    }
    public void j2(FeatureLiveFeedsResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(p1);
       super.d2(p0, p1);
       if (!PatchProxy.applyVoidTwoRefs(p1, uArrayList, this, a.class, "4")) {
          if (this.K()) {
             y1.a(Collections.emptyList(), p1);
          }else {
             y1.a(uArrayList, p1);
          }
       }
       return;
    }
}
